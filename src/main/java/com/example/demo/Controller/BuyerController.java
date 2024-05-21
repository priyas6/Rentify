package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Property;
import com.example.demo.Model.User;
import com.example.demo.Repository.ProprtyRepository;
import com.example.demo.Repository.UserRepository;

@RestController
@CrossOrigin("*")
public class BuyerController {
	@Autowired
    private ProprtyRepository prpRepository;
	@Autowired
	private UserRepository userrepo;


@GetMapping("/GetProperty")
public List<Property> GetProperty()
{
	return prpRepository.findAll();
}
@PostMapping("/getOwner")
public List<User> getOwnerDetails(@RequestBody User user)
{
	System.out.println(user.getUserId());
	return userrepo.findByUserId(1);
	}
    

}
