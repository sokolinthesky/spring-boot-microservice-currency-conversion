package springbootmicroservicecurrencyconversion;

import com.forexservice.client.exchange.ForexClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(clients = {CurrencyExchangeServiceProxy.class, ForexClient.class})
@EnableDiscoveryClient
public class SpringBootMicroserviceCurrencyConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceCurrencyConversionApplication.class, args);
	}
}
