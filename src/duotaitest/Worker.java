package duotaitest;

public class Worker extends Person{
    boolean isWorking;
    public void work(){
        System.out.println("打工人都是人上人");
    }

    @Override
    public void eat() {
        System.out.println("打工人不配吃饭");
    }

    @Override
    public void walk() {
        System.out.println("打工人:走路");
    }
}
