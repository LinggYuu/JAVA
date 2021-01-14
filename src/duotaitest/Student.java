package duotaitest;

public class Student extends Person{
    boolean isStudying;

    public void study(){
        System.out.println("学生:学习");
    }

    @Override
    public void eat() {
        System.out.println("学生:吃食堂");
    }

    @Override
    public void walk() {
        System.out.println("学生:走路");
    }
}
