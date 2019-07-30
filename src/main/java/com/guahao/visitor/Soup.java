package com.guahao.visitor;

/**
 * Created by qinxy on 2019/7/23.
 */
public class Soup extends Element {

    public Soup(int weight){
        this();
        this.weight = weight;
        this.price = weight * price;
    }

    public Soup(){
        this.name="汤";
        this.price=10;
        this.weight=1;

    }

    @Override
    void feed(Visitor visitor) {
        visitor.orderDishes(this);
    }
}
