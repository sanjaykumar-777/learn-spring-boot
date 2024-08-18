package com.example.sanjay_kumar777.learn_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyServiceController {

    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;

    @GetMapping("/currency-configuartion")
    public CurrencyServiceConfiguration getCurrency(){
        return currencyServiceConfiguration;
    }
}
