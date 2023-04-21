package com.ohama.back.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohama.back.domain.Board;
import com.ohama.back.repository.BoardRepository;

@Service
public class BoardService {
  
  @Autowired
  private BoardRepository boardRepository;

  public List<Board> selectAll() {
    return boardRepository.findAll();
  }

  public Board selectOne(Long boardNo) {
    Optional<Board> board = boardRepository.findById(boardNo);
    return board.get();
  }

  public Board insertBoard(Board board) {
    return boardRepository.save(board);
  }

  public void updateBoard(Long boardNo, Board board) {

    Optional<Board> e = boardRepository.findById(boardNo);

    if(e.isPresent()) {
      e.get().setBoardNo(boardNo);
      e.get().setTitle(board.getTitle());
      e.get().setContents(board.getContents());
      boardRepository.save(board);
    }
  }

  public void deleteBoard(Long boardNo) {
    boardRepository.deleteById(boardNo);
  }
}
