package com.in28minutes.springboot.microservice.example.currencyconversion;

import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.springboot.microservice.example.currencyconversion.controller.CurrencyConversionController;
import com.in28minutes.springboot.microservice.example.currencyconversion.controller.CurrencyExchangeServiceProxy;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestclassCurrencyConversion {

	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	
	@Test
	public void testControllerClass() {
		CurrencyConversionController ccc=new CurrencyConversionController();
		assertNotNull(ccc.convertCurrency("USD", "INR", new BigDecimal(100)));
	}
	
	@Test
	public void testControllerClassFeign() {
		CurrencyConversionController ccc=new CurrencyConversionController(proxy);
		assertNotNull(ccc.convertCurrencyFeign("USD", "INR", new BigDecimal(100)));
	}
}
