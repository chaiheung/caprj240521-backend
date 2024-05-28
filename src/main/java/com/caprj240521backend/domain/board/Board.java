package com.caprj240521backend.domain.board;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Board {
    private Integer id;
    private String title;
    private String content;
    private String writer; // 작성자 nickName
    private Integer memberId;
    private LocalDateTime inserted;
    private Integer numberOfImages;
}
