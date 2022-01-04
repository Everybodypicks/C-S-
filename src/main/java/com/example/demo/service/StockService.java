package com.example.demo.service;

import com.example.demo.bean.StockBean;

import java.util.List;


public interface StockService {
    List<StockBean> select();
    List<Integer> average(List<StockBean> stockBeans);
}
