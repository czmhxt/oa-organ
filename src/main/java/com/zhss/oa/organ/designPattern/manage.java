package com.zhss.oa.organ.designPattern;

public class manage {
    public static void main(String[] args) {
        int desi=2;
        DiscountCalculator discountCalculator=factory.getDiscountCalculator(desi);
        discountCalculator.calculate();
//        Context context=new Context();
//        context.setDiscountCalculator(discountCalculator);
//        context.calculate();
    }
}
