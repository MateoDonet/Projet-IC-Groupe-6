package com.IC.ProjetICBackEnd.restServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.IC.ProjetICBackEnd.restServices.model.Client;
import com.IC.ProjetICBackEnd.restServices.model.PieceDetache;

@RestController
public class ClientController {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@PostMapping(path= "/client/login", consumes = "application/json", produces = "application/json")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody Client client) {
		String sql = "insert into piece_detache (pd_libelle, pd_prix) values (?, ?)";
		return jdbcTemplate.update(sql, client.getCli_username(), client.getCli_password());
	}
	
}
