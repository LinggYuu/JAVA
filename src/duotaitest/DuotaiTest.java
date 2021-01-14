package duotaitest;

public class DuotaiTest {
    public static void main(String[] args) {
//        Person ap = new Person();
//        ap.eat();
//
//        Worker aw = new Worker();
//        aw.eat();
//        aw.age = 18;
//        aw.work();
        /******************************************/
        //对象的多态性   对象体现出多种形态
        //父类的引用指向子类的对象,或者是子类的对象赋给父类的引用
        Person ap2 = new Worker();
        //多态的使用:当调用子父类同名同参数方法时，实际执行的是子类
        //重写父类的方法----虚拟方法调用
        ap2.eat();
        //ap2.work(); 会报错
        //能调的只有Person里的方法
        //编译时还是看父类有啥，执行时调的是子类重写的





        Person ap3 = new Student();

    }


}
