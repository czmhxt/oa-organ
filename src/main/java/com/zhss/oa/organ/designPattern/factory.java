package com.zhss.oa.organ.designPattern;

public class factory {
    public static DiscountCalculator getDiscountCalculator(int type){
        if(type==1){
            return new DiscountCalA();
        }else if (type==2){
            return  new DiscountCalB();
        }else if(type==3){
            return  new DiscountCalC();
        }else {
            return  new DiscountCalDefault();
        }
    }
}
