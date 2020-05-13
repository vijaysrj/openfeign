package com.springboot.openfeign;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestConsumer {

	@Autowired
	private PersonClient client;

	@GetMapping("/getAllPersons")
	public List<Person> getAllPersons() {

		String username = "admin";
		String password = "admin";

		byte[] encodedBytes = Base64Utils.encode((username + ":" + password).getBytes());

		String authHeader = "Basic " + new String(encodedBytes);

		return client.getPersons(authHeader);
	}
}
