package com.micro.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.JsonbHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfiguration {
//    @Bean
//	public JsonbHttpMessageConverter messageConvertor() {
//		return new JsonbHttpMessageConverter();
//	}
//    @Bean
//    public RestTemplate mytemplate() {
//    	RestTemplate temple = new RestTemplate();
//    	temple.setMessageConverters(List.of(messageConvertor()));
//    	return temple;
//    }
}
