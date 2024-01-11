package ec.edu.espam.api.caja.service;

import ec.edu.espam.api.caja.domain.Account;
import ec.edu.espam.api.caja.exeption.ResourceNotFoundException;

import java.util.List;

public interface AccountService {
    List<Account> getAllAccount();
    Account saveAccount(Account account);
    Account edictAccount(Long idAccount, Account account) throws ResourceNotFoundException;
}
