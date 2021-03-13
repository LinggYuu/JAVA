package shejimoshi;

//单例设计模式
//采取一定的方法保证整个的软件系统中，对某一个类只能存在一个对象实例
/*


饿汉式：一上来就造好



 */
public class SingletonTest1 {


    public static void main(String[] args) {
        //Bank ab = new Bank();报错因为构造器私有化了
        Bank ab1 = Bank.getInstance();
        Bank ab2 = Bank.getInstance();
        Bank.ii();
        System.out.println(ab1==ab2);//是true的，为同一个对象
    }


}

/*
造个bank

 */

class Bank{
//    私有化构造器
//     int  id;//报错
    static int id;
    private Bank(){}

//     内部化创建类的对象
//    要求此对象也必须声明为静态的
    private static Bank instance = new Bank();

//     提供公共的静态方法，返回类的对象

    public static Bank getInstance(){
        return instance;

    }
    public static void ii(){
        System.out.println(id=3);//静态方法的只能调静态变量
    }

}

