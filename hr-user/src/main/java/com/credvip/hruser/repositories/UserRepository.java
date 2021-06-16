package com.credvip.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credvip.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	//Busca por usuário
	User findByEmail(String email);//Olhar a documentação para saber mais

}
