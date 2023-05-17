package com.pickpick.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rank")
@Slf4j
public class RankingController {

    @GetMapping("/ranking")
    public String replyPage(){
        log.info("하이루 랭킹페이지 들어옴");
        return "rank/ranking";
    }

}
