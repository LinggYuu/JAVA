package duoxianchengtest;

/*

start():启动当前线程，调用当前线程的run()
run():通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
currentThread():静态方法，返回执行当前代码的线程，返回类型Thread
getName():获取当前线程的名字
setName():设置当前线程的名字
命名线程还能够通过构造器命名
yeild():释放当前cpu的执行权
join():在线程a中调用线程b的join(),线程a就进入阻塞，直到线程b完全执行完后
才执行线程a
sleep(long millitime):让当前线程睡眠指定的millitime毫秒，在指定的millitime
毫秒内，当前线程是阻塞状态。
isAlive():判断当前线程是否还存活

弹幕大佬：join让别的先行，yield放出来一起争抢
 */

class Thread3 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i <= 50;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
            if(i==20){
                try {
                    sleep(100);//睡100毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if(i%20 == 0){
                yield();
            }
        }
    }
    //有参构造器，可以用来命名线程
    public Thread3(String name){
        super(name);
    }

}
public class ThreadMethodTest {
    public static void main(String[] args) {
        Thread3 at = new Thread3("一只线程");
        at.setPriority(Thread.MAX_PRIORITY);
        at.setName("一只线程");//也可以这么命名

    }
}
