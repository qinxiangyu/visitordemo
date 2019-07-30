package com.guahao.visitor;

/**
 * Created by qinxy on 2019/7/23.
 */
public class Fish extends Element {

    public Fish(int weight){
        this();
        this.weight = weight;
        this.price = price * weight;
    }

    public Fish(){
        this.name="鱼";
        this.price=20;
        this.weight=1;
    }

    @Override
    void feed(Visitor visitor) {
        visitor.orderDishes(this);
    }
}
