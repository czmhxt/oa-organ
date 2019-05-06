package com.zhss.oa.organ.designPattern;

public class Context {
    private  DiscountCalculator discountCalculator;


    public void setDiscountCalculator(DiscountCalculator discountCalculator){
        this.discountCalculator=discountCalculator;
    }
    public DiscountCalculator getDiscountCalculator(){
        return this.discountCalculator;
    }

    public void  calculate(){
        discountCalculator.calculate();
    }

}
