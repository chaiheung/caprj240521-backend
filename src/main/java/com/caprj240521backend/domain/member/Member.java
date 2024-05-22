package com.caprj240521backend.domain.member;

import lombok.Data;

@Data
public class Member {
    private String email;
    private String password;
    private String nickName;
}
