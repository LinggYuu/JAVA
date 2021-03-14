package duoxianchengtest;


import java.util.concurrent.locks.ReentrantLock;

class Windows implements Runnable{

    private int ticket = 100;

    //调用lock
    private ReentrantLock lock = new ReentrantLock(true);
    //fair指公平，使线程进来的时候是公平的，有一个先后顺序，不会有插队情况
    //也就是说先进先出，不写的话就是false
    @Override
    public void run() {
        while(true){
            try{
                lock.lock();//调用lock锁定方法
                if(ticket>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+ticket);
                    ticket--;
                }else{
                    break;
                }
            }finally {
                lock.unlock();//调用解锁方法
            }

        }
    }
}








public class LockTest {
    Windows w = new Windows();
    Thread t1 = new Thread(w);
    Thread t2 = new Thread(w);
    Thread t3 = new Thread(w);
}
