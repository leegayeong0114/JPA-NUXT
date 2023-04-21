package com.ohama.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ohama.back.domain.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> { // <객체, id>

}
