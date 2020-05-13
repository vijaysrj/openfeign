package com.springboot.openfeign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "personclient", url = "http://localhost:8090/")
public interface PersonClient {

	@RequestMapping(method = RequestMethod.GET, value = "/persons")
	List<Person> getPersons(@RequestHeader("Authorization") String header);
}
