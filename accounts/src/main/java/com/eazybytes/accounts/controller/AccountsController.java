/**
 * 
 */
package com.eazybytes.accounts.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eazybytes.accounts.model.Accounts;
import com.eazybytes.accounts.model.Customer;
import com.eazybytes.accounts.repository.AccountsRepository;

/**
 * @author Eazy Bytes
 *
 */

@RestController
public class AccountsController {
	
	@Autowired
	private AccountsRepository accountsRepository;

	@PostMapping("/myAccount")
	public Accounts getAccountDetails(@RequestBody Customer customer) {

		Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId());
		if (accounts != null) {
			return accounts;
		} else {
			return null;
		}

	}
	
	@GetMapping(path="/findAll")
	public ResponseEntity<?> getAll(){
		List<Accounts> accountNo=(List<Accounts>) accountsRepository.findAll();
		
		  List<Long> l1= accountNo.stream().map(e->e.getAccountNumber()).skip(1).limit(2).collect(Collectors.toList());
	Optional<Accounts> acc=	 accountNo.parallelStream().findAny();
		return new ResponseEntity<>(l1,HttpStatus.OK);
		
		
	}
	
//	@PostMapping(path="/save")
//	public Account saveAccountDetail(@RequestBody)
	

}
