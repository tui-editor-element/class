package org.yunai.online_class;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.yunai.online_class.mapper")
public class OnlineClassApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineClassApplication.class, args);
	}

}
