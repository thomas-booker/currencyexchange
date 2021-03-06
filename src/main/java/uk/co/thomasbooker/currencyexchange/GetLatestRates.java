package uk.co.thomasbooker.currencyexchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class GetLatestRates {

    @Autowired
    CurrencyExchangeConnector currencyExchangeConnector;

    @Autowired
    URIBuilder uriBuilder;

    public Object getLatestRatesTest() throws IOException {

        String currency = CurrencyCodes.GBP;
        return currencyExchangeConnector.restTemplateExecute(uriBuilder.getLatestRates(currency));
    }
}
