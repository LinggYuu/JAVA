package duoxianchengtest;

/*
创建多线程方式2：实现runnable接口


 */

//1
class MThread implements Runnable{
//2
    @Override
    public void run() {
        for(int i=0;i<=100;i++){
            if(i%2==0)
            {
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }
}

//Thread构造器有许多

public class ThreadTest2 {
    public static void main(String[] args) {
        MThread mThread = new MThread();
        //Thread类也是runnable接口的实现类
        Thread tt = new Thread(mThread);//多态体现
        //public Thread(Runnable target){}构造器
        tt.setName("线程1");
        tt.start();
        //start()：1.启动线程2.调用当前线程的run

        //再去启动一个线程，遍历100以内 偶数
        Thread tt2 = new Thread(mThread);
        tt2.setName("线程2");
        tt2.start();
    }


}
