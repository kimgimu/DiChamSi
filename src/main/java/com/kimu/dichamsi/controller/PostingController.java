package com.kimu.dichamsi.controller;

import com.kimu.dichamsi.service.PostingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/posting")
@Controller
public class PostingController {

    private final PostingService postingService;

    public PostingController(PostingService postingService) {
        this.postingService = postingService;
    }

    @GetMapping("/board")
    public String postingBoardPage(){

        return "postingBoardPage";
    }
}
