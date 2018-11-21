package com.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.dao.AccountRepository;
import com.data.entities.AccountDetails;
import com.data.exception.ExceptionController;
import com.data.exception.UserDefiendException;

@Service	
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public void saveAccounting(AccountDetails accountDetails) {
		 accountRepository.save(accountDetails);
	}

	@Override
	public List<AccountDetails> retrieveAccountDtls() {
		return accountRepository.findAll();
	}

	@Override
	public List<AccountDetails> retriveAccountByPeriod(Integer period) throws UserDefiendException{
		if(period>0) {
			throw new UserDefiendException("No Data found");
		}else {
			return null;
		}
		
		
	}

}
