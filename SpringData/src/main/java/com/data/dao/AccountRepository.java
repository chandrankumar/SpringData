package com.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.entities.AccountDetails;

@Repository
public interface AccountRepository extends JpaRepository<AccountDetails, Long>{

}
