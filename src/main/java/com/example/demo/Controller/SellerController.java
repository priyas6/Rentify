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

@RestController
@CrossOrigin("*")
public class SellerController 
{
	@Autowired
    private ProprtyRepository prpRepository;

@PostMapping("/getMyProperties")
public List<Property> getProperties(@RequestBody User user)
{
	List<Property> properties=prpRepository.findByUserId(user.getUserId());
	return properties;
}
@PostMapping("/AddProperty")
public void AddProperty(@RequestBody Property property)
{
	prpRepository.save(property);
}
}