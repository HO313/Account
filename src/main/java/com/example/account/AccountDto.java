package com.example.account;

import lombok.*;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;


// Delombok 기능도 사용해보기
@Getter
@Setter
@ToString // 객체가 갖고있는 값을 쉽게 출력 할 수 있게
@AllArgsConstructor
//@Data // 통합 슈퍼어노테이션 - 보안취약 주의해서 사용해야함
@Slf4j

public class AccountDto {
    private String accountNumber;
    private String nickname;
    private LocalDate registeredAt;

    public void log(){
        log.error("error is occurred.");
    }
}
