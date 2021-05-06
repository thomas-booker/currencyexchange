package uk.co.thomasbooker.currencyexchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static uk.co.thomasbooker.currencyexchange.URIs.*;

@Component
public class URIBuilder {

    @Autowired
    PropertiesLoader propertiesLoader;

    public String getLatestRates(String currency) throws IOException {
        System.out.println(BASE + propertiesLoader.getApiKey() + LATEST);
        return BASE + propertiesLoader.getApiKey() + LATEST + currency;
    }

    public String getConversionFromCurrencyToCurrency(String fromCurrency, String toCurrency, String amount) throws IOException {
        return BASE + propertiesLoader.getApiKey() +
                PAIR + fromCurrency + toCurrency + amount;
    }

    public String getRateFromCurrencyToCurrency(String fromCurrency, String toCurrency) throws IOException {
        return BASE + propertiesLoader.getApiKey() +
                PAIR + fromCurrency + toCurrency;
    }
}
