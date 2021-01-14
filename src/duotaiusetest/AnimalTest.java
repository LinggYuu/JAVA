package duotaiusetest;

public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest aa = new AnimalTest();
        aa.func(new Dog());
        aa.func(new Cat());
    }




    public void func(Animal aa){
        aa.eat();
        aa.shout();
    }

}


class Animal{

    public void eat(){
        System.out.println("动物吃");
    }
    public void shout(){
        System.out.println("动物叫");
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃");
    }

    @Override
    public void shout() {
        System.out.println("汪");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃");
    }

    @Override
    public void shout() {
        System.out.println("喵");
    }
}