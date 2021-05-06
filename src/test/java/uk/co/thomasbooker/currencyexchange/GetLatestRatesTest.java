package uk.co.thomasbooker.currencyexchange;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
public class GetLatestRatesTest {

    @Mock
    RestTemplate restTemplate;

    @Mock
    CurrencyExchangeConnector currencyExchangeConnector;

    @Mock
    URIBuilder uriBuilder;

    @InjectMocks
    GetLatestRates testSubject = new GetLatestRates();

    @Test
    public void shouldReturnRestTemplate() throws IOException {
        // Given
        String currency = CurrencyCodes.GBP;
        Mockito.when(uriBuilder.getLatestRates(currency)).thenReturn("any");
        Mockito.when(currencyExchangeConnector.restTemplateExecute(anyString())).thenReturn(new ResponseEntity(HttpStatus.ACCEPTED));

        // When
        Object result = testSubject.getLatestRatesTest();

        // Then
        assertThat(result).isNotNull();
        assertThat(result).isInstanceOf(ResponseEntity.class);
    }
}
