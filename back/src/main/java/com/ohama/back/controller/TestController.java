package com.ohama.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ohama.back.domain.Board;
import com.ohama.back.service.BoardService;

@RestController
@RequestMapping(value = "/api")
public class TestController {

  @Autowired
  private BoardService boardService;

  /**
   * <pre>
   * jpa select test1
   * 
   * [수정이력]
   * </pre>
   *
   * @author 이가영
   * @date 2023/04/13
   * @return
   */
  @GetMapping(value = "/board-select-all")
  public ResponseEntity<List<Board>> selectAll() {
    List<Board> boardList = boardService.selectAll();
    return new ResponseEntity<List<Board>>(boardList, HttpStatus.OK);
  }
  
  /**
   * <pre>
   * jpa select test2
   * 
   * [수정이력]
   * </pre>
   *
   * @author 이가영
   * @date 2023/04/13
   * @return
   */
  @GetMapping(value = "/board-select-one")
  public ResponseEntity<Board> selectOne(
    @RequestParam(name = "boardNo") Long boardNo
  ) {
    Board board = boardService.selectOne(boardNo);
    return new ResponseEntity<Board>(board, HttpStatus.OK);
  }

  /**
   * <pre>
   * jpa insert test
   * 
   * [수정이력]
   * </pre>
   *
   * @author 이가영
   * @date 2023/04/13
   * @return
   *
   */
  @PostMapping(value = "/save-board")
  public ResponseEntity<Board> insertBoard(
    @RequestBody Board board
  ) {
    return new ResponseEntity<Board>(boardService.insertBoard(board), HttpStatus.OK);
  }

  /**
   * <pre>
   * jpa update test
   * 
   * [수정이력]
   * </pre>
   *
   * @author 이가영
   * @date 2023/04/13
   * @return
   * 
   */
  @PostMapping(value = "/update-board/{boardNo}")
  public ResponseEntity<Board> updateBoard(
    @PathVariable(name = "boardNo") Long boardNo,
    Board board
  ) {
    boardService.updateBoard(boardNo, board);
    return new ResponseEntity<Board>(board, HttpStatus.OK);
  }

  /**
   * <pre>
   * jpa delete test
   * 
   * [수정이력]
   * </pre>
   *
   * @author 이가영
   * @date 2023/04/13
   * @return
   */
  @DeleteMapping(value = "/delete-board")
  public ResponseEntity<Void> deleteBoard(
    @RequestParam(name = "boardNo") Long boardNo
  ) {
    boardService.deleteBoard(boardNo);
    return new ResponseEntity<Void>(HttpStatus.OK);
  }

}
