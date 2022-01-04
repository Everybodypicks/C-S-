package com.example.demo.bean;

public class StockBean {

    private final String code = "600000.SH";
    private final String name = "浦发银行";

    private String date;
    private String opening_price;//开盘价
    private String max_price;
    private String min_price;
    private String close_price;
    private String PE;

    public String getPE() {
        return PE;
    }

    public void setPE(String PE) {
        this.PE = PE;
    }


    @Override
    public String toString() {
        return "StockBean{}";
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOpening_price() {
        return opening_price;
    }

    public void setOpening_price(String opening_price) {
        this.opening_price = opening_price;
    }

    public String getMax_price() {
        return max_price;
    }

    public void setMax_price(String max_price) {
        this.max_price = max_price;
    }

    public String getMin_price() {
        return min_price;
    }

    public void setMin_price(String min_price) {
        this.min_price = min_price;
    }

    public String getClose_price() {
        return close_price;
    }

    public void setClose_price(String close_price) {
        this.close_price = close_price;
    }

}
