package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Property;

@Repository
public interface ProprtyRepository extends JpaRepository<Property,Long>{

	List<Property> findByUserId(long userId);
}
