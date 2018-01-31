package com.example.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author Viet Quoc Tran
 * on 1/31/18.
 * www.zeroexception.com
 */


@RestController
@RequestMapping("/")
public class MatchController {


    @PostMapping("/match")
    public String getMatchResult(@RequestBody String text, @RequestParam("pattern") String pattern) {

        return "";
    }
}
