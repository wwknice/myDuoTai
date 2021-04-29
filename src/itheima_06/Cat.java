package itheima_06;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String s) {
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
