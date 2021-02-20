package daimakuaitest;

public class BlockTest {
    public static void main(String[] args) {

        String desc = Person.desc;
        System.out.println("哼哼啊啊啊啊啊啊啊");
        Person ap = new Person();
    }

}


class Person{

    String name;
    int age;
    static String desc = "我是一个人";

    public Person(){

    };

    public Person(String name,int age){
            this.age = age;
            this.name = name;
    };

    //static代码块
    static {
        System.out.println("hello");
    }

    //非static代码块
    {
        System.out.println("hi");
    }



    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
