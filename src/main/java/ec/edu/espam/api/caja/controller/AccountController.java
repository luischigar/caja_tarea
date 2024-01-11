package ec.edu.espam.api.caja.controller;

import ec.edu.espam.api.caja.domain.Account;
import ec.edu.espam.api.caja.exeption.ResourceNotFoundException;
import ec.edu.espam.api.caja.service.AccountService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;
    @GetMapping()
    public ResponseEntity<List<Account>> getAllAccount() {
        return new ResponseEntity<>(accountService.getAllAccount(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Account> saveAccount(@RequestBody @Valid Account account) {
        return new ResponseEntity<>(accountService.saveAccount(account), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Account> edictAccount(@PathVariable(value = "id") Long idAccount, @RequestBody @Valid Account account) throws ResourceNotFoundException {
        return new ResponseEntity<>(accountService.edictAccount(idAccount,account),HttpStatus.OK);
    }
}
