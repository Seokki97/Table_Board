package com.board.TableBoard.controller;

import com.board.TableBoard.entity.Board;
import com.board.TableBoard.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write") // localhost:8080/board/write
    public String boardWriteForm(){

        return "boardwrite";
    }


    @PostMapping("board/writepro")
    public String boardWritePro(Board board){
        boardService.writeBoard(board);
        return"";
    }
}
