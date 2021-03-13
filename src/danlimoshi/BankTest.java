package danlimoshi;

/*
使用同步机制将单例模式中的懒汉式改写为线程安全的
 */
public class BankTest {
    public static void main(String[] args) {
        Bank ab = Bank.getInstance();
        System.out.println(Bank.id);
    }
}

//懒汉式单例  ,写单例的诀窍:私有化构造器，静态化对象和属性
class Bank{
    static int id;
    private static Bank instance = null;
    private Bank(){ }

//    public static Bank getInstance(){//这里要声明为比private高一级的
//        if(instance == null){
//            /*假如当前线程run方法执行到这阻塞了，另外一个线程进来
//            判断后发现instance仍然为null，所以它也进条件里，这样
//            的话instance会被new多次，此时的instance就相当于
//            共享数据
//            */
//            instance = new Bank();
//            id = 3;
//        }
//        return instance;
//    }

    //解决方法1(比较好):将该方法声明为synchronized
    //它的锁为当前类本身，Bank.class
    //锁中的代码，一个线程进入后必须完全执行完才行
//public static synchronized Bank getInstance(){//这里要声明为比private高一级的
//    if(instance == null){
//
//        instance = new Bank();
//        id = 3;
//    }
//    return instance;
//}
/*

解决方法2:使用同步代码块,效率稍微差一些

 */
    public static  Bank getInstance(){//这里要声明为比private高一级的
//      synchronized (Bank.class){
//          if(instance == null){
//              instance = new Bank();
//              id = 3;
//          }
//          return instance;
//      }
        //效率比较高的写法
    if(instance ==null){
        synchronized (Bank.class){
            if(instance == null){
                instance = new Bank();
            }
        }
    }
        return  instance;
    }


}



//饿汉式
class Person{

    private static Person instance = new Person();

    public static Person getInstance(){//这里要声明为比private高一级的
        return instance;
    }

}