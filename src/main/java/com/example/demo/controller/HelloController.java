package com.example.demo.controller;

import com.example.demo.bean.StockBean;
import com.example.demo.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class HelloController {
    @Autowired
    private StockService stockService;

    @RequestMapping("/getAll")
    public List<StockBean> sayHello(){
        return stockService.select();
    }

    @RequestMapping("/PE")
    public List<Integer> PE(){
        return stockService.average(stockService.select());
    }
}