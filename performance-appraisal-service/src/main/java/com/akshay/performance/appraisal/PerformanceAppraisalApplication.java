package com.akshay.performance.appraisal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author akshay
 *
 */
@SpringBootApplication
@MapperScan({ "com.akshay.performance.appraisal.repository" })
public class PerformanceAppraisalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PerformanceAppraisalApplication.class, args);
	}

}
