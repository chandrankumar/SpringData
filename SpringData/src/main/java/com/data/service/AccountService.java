package com.data.service;

import java.util.List;

import com.data.entities.AccountDetails;

public interface AccountService {

	public void saveAccounting(AccountDetails accountDetails);

	public List<AccountDetails> retrieveAccountDtls();

}
