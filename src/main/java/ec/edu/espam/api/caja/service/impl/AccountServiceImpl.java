package ec.edu.espam.api.caja.service.impl;

import ec.edu.espam.api.caja.domain.Account;
import ec.edu.espam.api.caja.exeption.ResourceNotFoundException;
import ec.edu.espam.api.caja.repository.AccountRepository;
import ec.edu.espam.api.caja.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }
    @Override
    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }

    @Override
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account edictAccount(Long idAccount, Account account) throws ResourceNotFoundException {
        Optional<Account> accountOptional = accountRepository.findById(idAccount);
        if (accountOptional.isPresent()){
            Account accountO = accountOptional.get();
            accountO.setAccountTypeEnum(account.getAccountTypeEnum());
            accountO.setNumber(account.getNumber());
            accountO.setInitialBalance(account.getInitialBalance());
            accountO.setBalance(account.getBalance());
            accountO.setState(account.getState());
            return accountRepository.save(accountO);
        }else {
            throw new ResourceNotFoundException("Cuenta no encontrada");
        }

    }
}
