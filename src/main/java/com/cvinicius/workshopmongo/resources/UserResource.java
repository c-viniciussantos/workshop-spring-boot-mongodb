package com.cvinicius.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cvinicius.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User carlos = new User("1", "Carlos Vinicius", "carlos.vinicius@ccee.org.br");
		User vini = new User("2", "Vinicius", "c.viniciussantos@outlook.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(carlos, vini));
		return ResponseEntity.ok().body(list);
	}
}
