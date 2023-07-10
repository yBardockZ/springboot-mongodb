package com.nelioalves.workshopmongo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.workshopmongo.domain.User;
import com.nelioalves.workshopmongo.dto.UserDTO;
import com.nelioalves.workshopmongo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<UserDTO> findAll() {
		
		List<User> listUser = repository.findAll();
		List<UserDTO> listDTO = new ArrayList<>();
		for (User x : listUser) {
			listDTO.add(new UserDTO(x));
		}
		return listDTO;
		
	}
	
}
