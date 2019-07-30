package com.guahao.visitor;

/**
 * Created by qinxy on 2019/7/23.
 * VIP客户
 */
public class VipVisitor implements Visitor{
    @Override
    public void orderDishes(Element element) {
        System.out.println("会员客户：" +element.getName() +" "+ element.weight + "份  " + (0.8 * element.getPrice()) +"元");

    }
}
