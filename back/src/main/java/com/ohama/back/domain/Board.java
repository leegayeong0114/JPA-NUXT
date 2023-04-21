package com.ohama.back.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "BOARD")
@Entity(name = "BOARD")
public class Board implements Serializable {
  
  private static final long serialVersionUID = 1L; // ?

  @Id // primary key
  @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
  @Column(
    name = "BOARD_NO",
    length = 10
  )
  private Long boardNo;

  @Column(
    name = "TITLE", 
    length = 100
  )
  private String title;

  @Column(
    name = "CONTENTS",
    length = 4000
  )
  private String contents;

  @Builder
  public Board(Long boardNo, String title, String contents) {
    this.boardNo = boardNo;
    this.title = title;
    this.contents = contents;
  }

}
