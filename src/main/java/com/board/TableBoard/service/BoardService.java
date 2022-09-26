package com.board.TableBoard.service;

import com.board.TableBoard.entity.Board;
import com.board.TableBoard.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public void writeBoard(Board board){

        boardRepository.save(board);
    }
}
