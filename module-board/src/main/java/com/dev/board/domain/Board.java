package com.dev.board.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Comment;

@Data
@Entity
@Comment("게시판")
public class Board {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_seq")
    @Comment("게시판 일련번호")
    Long id;

}
