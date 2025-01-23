//// BoardService.java
//package com.dev.board.service;
//
//import com.dev.board.domain.Board;
//import com.dev.board.repository.BoardRepository;
//import com.example.board.domain.Post;
//import com.example.board.repository.PostRepository;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//@Service
//public class BoardService {
//
//    private final BoardRepository postRepository;
//
//    public BoardService(BoardRepository postRepository) {
//        this.postRepository = postRepository;
//    }
//
//    public List<Board> listPosts() {
//        return postRepository.findAll();
//    }
//}