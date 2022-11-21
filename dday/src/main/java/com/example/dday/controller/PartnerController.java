package com.example.dday.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/partner/*")
public class PartnerController {
    @GetMapping("/partner_change_info")
    public void myPage(){}

    @GetMapping("/partner_main")
    public void partner_main(){}

    @GetMapping("/partner_management")
    public void partner_management(){}

    @GetMapping("/partner_registration")
    public void partner_registration(){}

    @GetMapping("/partner_shipping")
    public void partner_shipping(){}

    @GetMapping("/partnerProductChange")
    public void partnerProductChange(){}

}
