package uk.co.thomasbooker.currencyexchange;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.*;

@Controller
public class CurrencyExchangeController {

    @Autowired
    GetRates getRates;

    @RequestMapping("/")
    public String currencyExchangeRoot() {
        return "index";
    }

    @RequestMapping("/getlatestrates")
    public String getLatestRates(Model model) throws IOException {
        String currency = CurrencyCodes.GBP;
        JSONObject latestRates = new JSONObject(getRates.getRates(currency));
        Map<String, Object> map = latestRates.getJSONObject("body").toMap();

        model.addAttribute("rates", map);

        return "ratestest";
    }

    @RequestMapping("/conversion")
    public String getConversionFromCurrencyToCurrency(Model model) throws IOException {
        String from = CurrencyCodes.USD;
        String to = CurrencyCodes.GBP;
        String amount = "150";

        JSONObject convertedRate = new JSONObject(getRates.getRates(from, to, amount));
        Map<String, Object> map = convertedRate.getJSONObject("body").toMap();

        model.addAttribute("rates", map);

        return "conversion";
    }
}
