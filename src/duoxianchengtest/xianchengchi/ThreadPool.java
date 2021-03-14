package duoxianchengtest.xianchengchi;

/*
创建线程的方式
 */


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


class Threadd implements Runnable{
    @Override
    public void run() {
        for(int i =0;i<=100;i++){
                if(i%2 ==0){
                    System.out.println(i);
                }
        }
    }
}
class Threaddd implements Runnable{
    @Override
    public void run() {
        for(int i =0;i<=100;i++){
            if(i%2 != 0){
                System.out.println("ss"+i);
            }
        }
    }
}



public class ThreadPool {
    public static void main(String[] args) {

        //1.提供指定线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //造十个线程
        //设置线程池的属性
        executorService.getClass();//获得类对象
        ThreadPoolExecutor executorService1 = (ThreadPoolExecutor) executorService;
        executorService1.setCorePoolSize(15);
        Threadd dd = new Threadd();
        //2.执行指定的线程的操作。需要提供实现Runnable接口或Callable接口实现类的对象
        executorService.execute(dd);//适合使用于Runnable
        executorService.execute(new Threaddd());//适合使用于Runnable
        //executorService.submit();//适合使用与Callable


        executorService.shutdown();
        //3.关闭线程池
    }
}
