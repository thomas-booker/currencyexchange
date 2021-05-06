package uk.co.thomasbooker.currencyexchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class GetRates {

    @Autowired
    CurrencyExchangeConnector currencyExchangeConnector;

    @Autowired
    URIBuilder uriBuilder;

    public Object getRates(String currency) throws IOException {
        return currencyExchangeConnector.restTemplateExecute(uriBuilder.getLatestRates(currency));
    }

    public Object getRates(String fromCurrency, String toCurrency, String amount) throws IOException {
        return currencyExchangeConnector.restTemplateExecute(
                uriBuilder.getConversionFromCurrencyToCurrency(fromCurrency, toCurrency, amount));
    }

}
