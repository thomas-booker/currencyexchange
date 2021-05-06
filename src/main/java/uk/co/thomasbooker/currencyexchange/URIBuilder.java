package uk.co.thomasbooker.currencyexchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static uk.co.thomasbooker.currencyexchange.URIs.*;

@Component
public class URIBuilder {

    @Autowired
    PropertiesLoader propertiesLoader;

    public URIBuilder() {
    }

    public String getLatestRatesBeautify() throws IOException {
        return LATEST_BASE + BEAUTIFY + KEY + propertiesLoader.getApiKey();
    }
}
