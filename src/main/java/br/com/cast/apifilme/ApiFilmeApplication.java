package br.com.cast.apifilme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiFilmeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiFilmeApplication.class, args);
	}
	
	/*public WebMvcConfigurer configCors() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://127.0.0.1:5500").allowedMethods("GET", "CONNECT");
			}
		};
	
	}*/
}
