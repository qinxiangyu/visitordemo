package com.guahao.visitor;

/**
 * Created by qinxy on 2019/7/23.
 */
public class BraisedChicken extends Element {

    public BraisedChicken(int weight){
        this();
        this.weight = weight;
        this.price = price * weight;
    }

    public BraisedChicken(){
        this.name = "黄焖鸡";
        this.price = 100;
        this.weight =1 ;
    }
    @Override
    void feed(Visitor visitor) {
        visitor.orderDishes(this);
    }
}
