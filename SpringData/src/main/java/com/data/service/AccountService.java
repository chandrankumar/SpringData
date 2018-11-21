package com.data.service;

import java.util.List;

import com.data.entities.AccountDetails;
import com.data.exception.UserDefiendException;

public interface AccountService {

	public void saveAccounting(AccountDetails accountDetails);

	public List<AccountDetails> retrieveAccountDtls();

	public List<AccountDetails> retriveAccountByPeriod(Integer period) throws UserDefiendException;

}
