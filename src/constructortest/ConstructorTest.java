package constructortest;

public class ConstructorTest {
    public static void main(String[] args) {
        Person ap = new Person("asd",22);
        ap.eat();

    }
}




class Person{

    private String name;
    private int age;
    //自己设置一个构造器
    public Person(){
        System.out.println("我用了自己的构造器！！！");
    }
    public Person(String name , int age){
        this.age = age;
        this.name = name;
    }//这里的age和name都指的是当前要创建的对象的age和name

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


    void eat(){
        System.out.println("I can eat something.");
    }
}