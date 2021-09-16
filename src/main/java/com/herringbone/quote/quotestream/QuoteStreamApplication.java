package com.herringbone.quote.quotestream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.dataflow.server.EnableDataFlowServer;

@SpringBootApplication
@EnableDataFlowServer
public class QuoteStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuoteStreamApplication.class, args);
	}
}
