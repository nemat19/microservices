package com.easybytes.accounts.service.impl;

import com.easybytes.accounts.dto.CustomerDto;
import com.easybytes.accounts.entity.Customer;
import com.easybytes.accounts.mapper.CustomerMapper;
import com.easybytes.accounts.repo.AccountsRepo;
import com.easybytes.accounts.repo.CustomerRepo;
import com.easybytes.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountSrviceImpl implements IAccountsService {

    private AccountsRepo accountsRepo;
    private CustomerRepo customerRepo;

    /**
     *
     * @param customerDto
     */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
