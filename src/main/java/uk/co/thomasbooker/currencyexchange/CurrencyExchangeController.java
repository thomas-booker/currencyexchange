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
    GetLatestRates getLatestRates;

    @RequestMapping("/")
    public String currencyExchangeRoot() {
        return "index";
    }

    @RequestMapping("/getratestest")
    public String getRatesTest(Model model) throws IOException {
        JSONObject latestRates = new JSONObject(getLatestRates.getLatestRatesTest());
        Map<String, Object> map = latestRates.getJSONObject("body").getJSONObject("rates").toMap();

        model.addAttribute("rates", map);

        return "ratestest";
    }
}
