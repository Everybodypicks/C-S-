package com.example.demo.serviceImpl;

import com.example.demo.bean.StockBean;
import com.example.demo.mapper.StockMapper;
import com.example.demo.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockServiceImpl implements StockService {
    @Autowired
    private StockMapper stockMapper;

    @Override
    public List<StockBean> select() {
        return stockMapper.select();
    }

    @Override
    public List<Integer> average(List<StockBean> stockBeans){
        List<Integer> re=new ArrayList<>();
        int t;
        for(int i=0;i<10;i++)
            re.add(0);
        for(StockBean s :stockBeans){
            t= (int) (Double.parseDouble(s.getPE())/10);
            re.set(t,re.get(t)+1);
        }
        return re;
    }
}
