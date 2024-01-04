package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	public static org.slf4j.Logger log=LoggerFactory.getLogger(DemoApplicationTests.class);
	

	@Test
	Pvoid contextLoads() {
		log.info("testing started............");
		
		assertEquals(true,true);
	}

}
