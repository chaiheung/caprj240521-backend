package com.caprj240521backend.controller.comment;

import com.caprj240521backend.domain.comment.Comment;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/comment")
public class CommentController {
    @PostMapping("add")
    public void addComment(@RequestBody Comment comment) {
        System.out.println("comment: " + comment);
    }
}
