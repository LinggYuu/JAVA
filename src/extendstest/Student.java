package extendstest;

public class Student extends Person{
    String sex;
    public Student(){

    }
    public Student(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void study(){
        System.out.println("我爱学习");
    }
}
