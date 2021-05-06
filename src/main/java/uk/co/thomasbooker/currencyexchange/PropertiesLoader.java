package uk.co.thomasbooker.currencyexchange;

import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

@Component
public class PropertiesLoader {

    public PropertiesLoader() {}

    public String getApiKey() throws IOException {
        return getPropertiesFile(URIs.CURRENCY_EXCHANGE_PROPERTIES).getProperty("API_KEY");
    }

    public Properties getPropertiesFile(String propertiesFileLocation) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(propertiesFileLocation));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }
}
