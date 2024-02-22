package com.expleo.partyService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.expleo.partyService.entity.Party;

@RestController
public class MyRestController {
	
	@GetMapping("/showParty")
	public String getParty() {
		Party p = new Party();
		p.setDate("18-02-2024");
		p.setTime("12:01 pm");
		p.setVenue("Wakad Paan shop");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/expleo", "root", "root123")){
			Statement st = con.createStatement();
			String str = "SELECT name from emp order by salary desc limit 1";
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
