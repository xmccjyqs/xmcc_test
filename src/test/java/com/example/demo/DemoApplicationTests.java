package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j

public class DemoApplicationTests {

//	private final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Test
	public void contextLoads() {

//		logger.debug("debug ->{}","我是debug级别的日志");
//		logger.info("info ->{}","我是info级别的日志");
//		logger.error("error ->{}","我是error级别的日志");

		//lombok
		log.debug("log debug ->{}","我是debug级别的日志1");
		log.info(" log   info ->{}","我是info级别的日志1");
		log.error("log error ->{}","我是error级别的日志1");


	}

}
