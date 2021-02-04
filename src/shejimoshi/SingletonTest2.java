package shejimoshi;

import com.sun.org.apache.xpath.internal.operations.Or;

/*
懒汉式：啥时候用啥时候造，线程不安全好像，要加锁

懒汉式好处:延迟对象创建
        坏处:目前的写法线程不安全

饿汉式坏处:对象一开始就创建好，对象加载时间过长
        好处:线程安全的


 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Order ao1 = Order.getInstance();
        Order ao2 = Order.getInstance();
    }
}


class Order{

//    私有化类的构造器
    private Order(){}
//    在类内部创建对象，但只声明不new
//    此对象也必须声明为static
    private static Order instance =null;
    //假如直接new了就是饿汉式

    public static Order getInstance(){
//            不能直接  instance=new Order;会导致每次都会new
//        加个判断
        if(instance == null){
            instance = new Order();
        }
        return  instance;
    }

}
