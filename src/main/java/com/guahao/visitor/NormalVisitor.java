package com.guahao.visitor;

/**
 * Created by qinxy on 2019/7/23.
 * 普通客户
 */
public class NormalVisitor implements Visitor{
    @Override
    public void orderDishes(Element element) {
        System.out.println("普通客户点了：" + element.getName() +" "+ element.weight + "份  " + element.getPrice() +"元");
    }
}
