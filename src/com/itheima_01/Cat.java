package com.itheima_01;

public class Cat extends Animal{

    @Override
    public void eat() {
        super.eat();
        System.out.println("猫吃鱼");
    }

}
