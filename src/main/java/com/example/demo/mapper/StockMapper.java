package com.example.demo.mapper;

import com.example.demo.bean.StockBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
public interface StockMapper {
    List<StockBean> select();
}
