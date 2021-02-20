package daimakuaitest;

//属性赋值顺序
//属性可赋值的位置:
//    1.默认初始化
//    2.显式初始化 /5.在代码块中赋值
//    3.构造器中初始化
//    4.有了对象后，通过对象.属性或对象.方法的方式进行赋值
//    执行顺序  1-2/5-3-4
//        2和5谁在前就谁先执行

public class OrderTest {
    public static void main(String[] args) {
        Order ao = new Order();
        System.out.println(ao.id);
    }
}
//类结构是加载，加载没有顺序
class Order{

    {
        id = 4; //代码块中赋值
    }
    int  id = 3; //显式赋值



}