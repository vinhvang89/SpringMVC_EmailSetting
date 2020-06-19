package com.controller;

import com.model.EmailSetting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class EmailSettingController {
    @GetMapping("/")
    public String edit(Model model){
        EmailSetting emailSetting = new EmailSetting();
        model.addAttribute("emailSetting",emailSetting);
        return "edit";
    }
    @PostMapping("/update")
    public String update(EmailSetting emailSetting,Model model){
        model.addAttribute("emailSetting",emailSetting);
        return "inform";
    }
}
