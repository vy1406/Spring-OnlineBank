package com.userFront.dao;

import org.springframework.data.repository.CrudRepository;

import com.userFront.domain.User;

// we wont implement the interface like we did with the UserService.
// spring boot is smart enought to help us to generate the entity class based on the interface, but i will define 2 methods.
public interface UserDao extends CrudRepository<User, Long>{
	User findByUsername(String username);
	User findByEmail(String email);
	// Spring boot is smart enought to recognize the methods that we wrote, according to findBy and 'fieldname'
	// and it will generate, during the init(), will help us to 
}
