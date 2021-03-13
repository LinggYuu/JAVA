package deadlocktest;

/*
用Lock锁解决线程安全问题
 */

class Window implements Runnable{

    private int ticket =100;



   @Override
    public void run() {
        while(true){
            if(ticket>0){

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+":"+ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}
public class LockTest {
    public static void main(String[] args) {
        Window w = new Window();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.start();
        t2.start();
        t3.start();
    }
}
