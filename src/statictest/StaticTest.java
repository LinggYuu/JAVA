package statictest;

public class StaticTest {
    public static void main(String[] args) {
        Person ap = new Person();
        ap.name = "yazan";
        Person ap2 = new Person();
        ap2.name = "ling";
        ap.age = 22;
        System.out.println(ap2.age);
    }
}




class Person{
    static int age;
    String name;
}


class animal{
    int id;
}