package com.board.TableBoard.controller;

import com.board.TableBoard.entity.Board;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BoardController {

    @GetMapping("/board/write") // localhost:8080/board/write
    public String boardWriteForm(){

        return "boardwrite";
    }


    @PostMapping("board/writepro")
    public String boardWritePro(Board board){
        System.out.println(board.getTitle());
        return"";
    }
}
