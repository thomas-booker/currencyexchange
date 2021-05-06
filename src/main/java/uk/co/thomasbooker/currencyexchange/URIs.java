package uk.co.thomasbooker.currencyexchange;

import java.util.Properties;

public interface URIs {
    String BASE = "https://v6.exchangerate-api.com/v6/";
    String KEY = "?access_key=";
    String LATEST = "latest/";
    String CONVERT = "convert";
    String FROM = "&from=";
    String TO = "&to=";
    String AMOUNT = "amount/";
    String PAIR = "pair/";


    String CURRENCY_EXCHANGE_PROPERTIES = "src/main/resources/currencyexchange.properties";
}
