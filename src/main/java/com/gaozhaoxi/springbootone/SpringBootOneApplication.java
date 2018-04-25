package com.gaozhaoxi.springbootone;

import com.gaozhaoxi.springbootone.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootOneApplication {
	@Value(value="${book.author}")
	private String author;
	@Value(value="${book.name}")
	private String name;
	@Value(value="${book.pinyin}")
	private String pinyin;



	//自动装配
	@Autowired
	private Book book;

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
		return "Hello Spring Boot!"+"\n"
				+"Hello Spring Boot! The BookName is "+name+";and Book Author is"+author
				+";and Book pinyin is "+pinyin;
	}

	@RequestMapping(value="/book")
	public String book(){
		return "Hello Spring Boot!"+"\n"
				+"Hello Spring Boot! The BookName is "+book.getName()+";and Book Author is"+book.getAuthor()
				+";and Book price is "+book.getPrice();
	}



}
