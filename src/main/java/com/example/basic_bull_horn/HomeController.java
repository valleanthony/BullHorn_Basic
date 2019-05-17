package com.example.basic_bull_horn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    TweetRepo tweetRepo;


    @GetMapping("/add")
    public String courseForm(Model model){
        model.addAttribute("tweet",new Tweet());
        return "form";
    }

    @PostMapping("/process")
    public String processForm(@Valid Tweet tweet, BindingResult result){
        if (result.hasErrors()){
            return "courseform";
        }
        tweetRepo.save(tweet);
        return "redirect:/";
    }


}
