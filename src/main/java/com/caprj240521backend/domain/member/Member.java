package com.caprj240521backend.domain.member;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class Member {
    private Integer id;
    private String email;
    private String password;
    private String oldPassword;
    private String nickName;
    private LocalDateTime inserted;

    public String getSignupDateAndTime() {
        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        return inserted.format(formatter);
    }

}
