package com.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.entities.AccountDetails;
import com.data.exception.UserDefiendException;
import com.data.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@PostMapping("/saving")
	public void saveAccount(@RequestBody AccountDetails accountDetails) {
		accountService.saveAccounting(accountDetails);
	}

	@GetMapping("/retrieve")
	public List<AccountDetails> retrieveAccountDtls() {
		return accountService.retrieveAccountDtls();

	}
	
	@GetMapping("/retrieve/{period}")
	public List<AccountDetails> getAccounts(@PathVariable Integer period) throws UserDefiendException{
		
		return accountService.retriveAccountByPeriod(period);

	}

}
