package uk.co.thomasbooker.currencyexchange;

import java.util.Properties;

public interface URIs {
    String LATEST_BASE = "https://v2.api.forex/rates/latest.json?";
    String KEY = "&key=";
    String BEAUTIFY = "beautify=true";
    String CURRENCY_EXCHANGE_PROPERTIES = "src/main/resources/currencyexchange.properties";
}
