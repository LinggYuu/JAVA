package abstracttest;

public class AbstratTest {
}


abstract class Person{
    public Person() {
        System.out.println("调了我");
    }

    abstract void show();
}

class man extends Person{
    private static String  sex = "male";
    void show(){
        System.out.println("我是男的");
    }

    public static void main(String[] args) {
        man am = new man();
        System.out.println(man.sex);
        am.show();
        Person ap = new man();
        ap.show();

    }
}