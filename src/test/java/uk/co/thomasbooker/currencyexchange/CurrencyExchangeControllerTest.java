package uk.co.thomasbooker.currencyexchange;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class CurrencyExchangeControllerTest {

    private static final String LOCALHOST = "http://localhost:";

    private static final String ROOT = "/";

    private static final String LATEST_RATES_TEST = "/getratestest";

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void rootShouldReturnWelcomeMessage() {
        assertThat(this.restTemplate.getForObject(LOCALHOST + port + ROOT, String.class))
                .doesNotContain("error", "404");
    }

    @Test
    public void latestRestTestShouldBeNotNull() {
        assertThat(this.restTemplate.getForObject(LOCALHOST + port + LATEST_RATES_TEST, String.class))
                .doesNotContain("error", "404");
    }
}
