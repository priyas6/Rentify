package com.example.demo.Controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;

@CrossOrigin("*")
@RestController
public class UserController {
	
	@Autowired
	private UserRepository userrep;
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		System.out.print(user);
		return userrep.save(user);
	}
	@PostMapping("/login")
	public List<String> loginUser(@RequestBody User user)
	{
		System.out.print(user);
		String pwd=user.getPassword();
		List<String> list=new ArrayList<String>();
		User userdetails=userrep.findByEmail(user.getEmail());
		if(userdetails.getPassword().equals(pwd))
		{
			list.add(String.valueOf(userdetails.getUserId()));
			list.add(String.valueOf(userdetails.getUserType()));
			
		}
		return list;
		
	}
}



