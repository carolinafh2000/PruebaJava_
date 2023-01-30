package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
@Sql({"/V1.1.data.sql"})
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
