package net.javaguides.bankingapp.service;
import net.javaguides.bankingapp.dto.AccountDto;
import java.util.List;

public interface AccountService {

     AccountDto createAccount(AccountDto accountDto);

     AccountDto getAccountbyId(Long id);

     AccountDto deposit (Long id, double amount );

     AccountDto withdraw(long id, double amount);

     List<AccountDto> getAllAccounts();

     void deleteAccount(Long id);
}
