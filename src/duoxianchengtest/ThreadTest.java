package duoxianchengtest;
/*

多线程的创建,方式一:继承于Thread类
1.创建一个继承Thread类的子类
2.重写Thread类的run()//将此线程执行的操作声明在run中
3.创建Thread类的子类的对象
4.通过此对象调用start()

例子:遍历100以内的所有偶数
 */


import org.junit.Test;
//一个线程
class  MyThread extends Thread{
    @Override
    //@Test不能用
    public void run() {
        for(int i= 0;i<=100;i++){
            if(i%2 == 0){
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }
}
/*
    Thread.currentThread().getName()//用于获取当前类的名字
 */
public class ThreadTest {

    /*
    main方法进来后造了个主线程，造对象、调start()方法仍是主线程做的，
    调完start()后，相当于主线程造完独立线程后，开始执行分线程(注意主
    线程贯穿始终
     */
    public static void main(String[] args) {
        MyThread am = new MyThread();
        am.start();//调用start()会使得线程开始执行并执行run()方法
        //注意不能够直接写am.run();一定要调用run()
        //下面的操作仍然是在main线程中执行的
        //不能通过直接调用已调线程对象的run()方法启动另外一个线程，
        //需要重新搞一个对象，如下
        MyThread t = new MyThread();
        t.start();
        for(int i= 0;i<=100;i++){
            if(i%2 == 0){
                System.out.println(Thread.currentThread().getName()+"Hello");
            }
        }

    }


}
