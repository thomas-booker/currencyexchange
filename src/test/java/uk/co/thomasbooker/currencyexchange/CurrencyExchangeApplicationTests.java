package uk.co.thomasbooker.currencyexchange;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CurrencyExchangeApplicationTests {

	@Autowired
	private CurrencyExchangeController currencyExchangeController;

	@Test
	void contextLoads() {
		assertThat(currencyExchangeController).isNotNull();
	}

}
