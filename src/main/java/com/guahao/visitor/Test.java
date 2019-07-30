package com.guahao.visitor;

/**
 * Created by qinxy on 2019/7/23.
 */
public class Test {
    public static void main(String[] args) {
        NormalVisitor normalVisitor = new NormalVisitor();
        Soup soup = new Soup();

        soup.feed(normalVisitor);



        VipVisitor vipVisitor = new VipVisitor();
        Fish fish = new Fish();

        fish.feed(vipVisitor);
        BraisedChicken braisedChicken = new BraisedChicken(2);

        braisedChicken.feed(vipVisitor);

    }
}
