package com.luv2code.springboot.demosecurity.controller;

import com.luv2code.springboot.demosecurity.entity.FeedBack;
import com.luv2code.springboot.demosecurity.service.FeedBackService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DemoController {
    private FeedBackService feedBackService;

    public DemoController(FeedBackService theFeedBackService){
        feedBackService=theFeedBackService;
    }
    @GetMapping("/")
    public String showHome() {

        return "home";
    }

    // add a request mapping for /leaders

    @GetMapping("/leaders")
    public String showLeaders() {

        return "leaders";
    }

    // add request mapping for /systems

    @GetMapping("/systems")
    public String showSystems() {

        return "systems";
    }

    @GetMapping("/feedBack")
    public String ShowFeedBackForm(Model theModel){
        FeedBack theFeedBack=new FeedBack();
        theModel.addAttribute("feed",theFeedBack);
        return "feedBack";
    }

    @PostMapping("/save")
    public String saveFeed(@ModelAttribute("feed") FeedBack theFeedBack){
        feedBackService.save(theFeedBack);
        return "redirect:/";
    }

}









