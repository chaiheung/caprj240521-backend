package com.caprj240521backend.mapper.comment;

import com.caprj240521backend.domain.comment.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommentMapper {

    @Insert("""
            INSERT INTO comment
            (board_id, member_id, comment)
            VALUES (#{boardId}, #{memberId}, #{comment})
            """)
    public int insert(Comment comment);

    @Select("""
            SELECT *
            FROM comment
            WHERE board_id = #{boardId}
            ORDER BY id
            """)
    List<Comment> selectAllByBoardId(Integer boardId);
}
