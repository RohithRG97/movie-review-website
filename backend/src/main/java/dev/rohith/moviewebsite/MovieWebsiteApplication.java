package dev.rohith.moviewebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MovieWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieWebsiteApplication.class, args);
	}

	@GetMapping("/root")
	public ResponseEntity<String> apiRoot() {
		return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
	}
}
