package supertest;

public class Student extends Person{
    String id="174";//学号
    public Student(){

    }
    //此时内存中有两个id，一个是身份证号一个是学号
//    通常在开发中不会出现子父类有同名属性
    public Student(String id){
        this.id = id;

    }

    @Override
    public void eat() {
        super.eat();
        this.study();
        System.out.println("学生吃");
    }
    public void study(){
        System.out.println("学生学习");
    }
    public void show(){
        System.out.println("身份证号:"+super.id);
        System.out.println("学号:"+this.id);
    }
}
