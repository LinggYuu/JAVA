package duoxianchengtest.xianchengtongxin;


class Number implements Runnable{
    private int num =1;

    @Override
    public void run() {
        while(true){
            synchronized (this){

                notify();//通知，用于唤醒线程
                if(num<100){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+num);
                    num++;
                    try {
                        this.wait();
                        /*
                        让这个线程阻塞一下，同时会释放锁，也就是别的线程能进来了
                        这点就跟sleep不一样，sleep不会释放锁
                         */
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }
        }
    }
}







public class CommunicationTest {
    public static void main(String[] args) {
        Number n = new Number();
        Thread t1 = new Thread(n);
        Thread t2 = new Thread(n);
        t1.start();
        t2.start();
    }

}
