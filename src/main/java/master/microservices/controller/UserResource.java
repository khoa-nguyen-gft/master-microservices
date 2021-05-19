package master.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import master.microservices.bean.UserBean;
import master.microservices.services.UserDaoService;

@RestController
public class UserResource {


	@Autowired
	private UserDaoService service;

	@GetMapping("/users")
	public List<UserBean> retrieveAllUsers() {
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public UserBean retrieveUser(@PathVariable int id) {
		return service.findOne(id);
	}
	
	@PostMapping("/users")
	public UserBean retrieveUser(UserBean user) {
		return service.save(user);
	}
}
