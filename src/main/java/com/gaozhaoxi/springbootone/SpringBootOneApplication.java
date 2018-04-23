package com.gaozhaoxi.springbootone;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOneApplication.class, args);
		/***
		 *
		 *
		 * @author Leon
		 * @date 2018/4/23 19:06
		 * @param [args]
		 * @return void

		SpringApplicationBuilder builder =new SpringApplicationBuilder(SpringBootOneApplication.class);
		//修改Banner的模式为OFF
		builder.bannerMode(Banner.Mode.OFF).run(args);
		 */
	}
	@RequestMapping(value="/hello",produces = "text/plain;charset=UTF-8")
	String index(){
		return "Hello Spring Boot!";
	}


}
