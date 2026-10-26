package in.strikes.filterDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilterDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilterDemoApplication.class, args);

	}
}
//FILTER IN SPRING BOOT
//1.Logging Purpose
//2.Authentication
//3.Request ID(new requestId - ReqId response)
//4.Request time
//5.Error Response to client