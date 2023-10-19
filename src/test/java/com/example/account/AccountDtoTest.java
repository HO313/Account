package com.example.account;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AccountDtoTest {
    @Test
    void accountDto() {
        AccountDto accountDto = new AccountDto(
                "AccountNumber",
                "Summer",
                LocalDate.now()
        );

        System.out.println(accountDto.getAccountNumber());
        System.out.println(accountDto.toString());
        //given
        //when
        //then
    }
}