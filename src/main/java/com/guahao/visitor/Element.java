package com.guahao.visitor;

/**
 * Created by qinxy on 2019/7/23.
 * 菜的抽象父类
 */
public abstract class Element {

    protected String name;

    protected int price;

    protected int weight;



    //供给
    abstract void feed(Visitor visitor);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
