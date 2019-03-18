package vacation.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import vacation.beans.Destination;
import vacation.beans.Duration;

@Configuration
public class BeanConfig {

	@Bean
	public Destination destination() {
		Destination bean = new Destination();
		return bean;
	}
	
	@Bean
	public Duration duration() {
		Duration bean = new Duration();
		return bean;
	}
	
}
