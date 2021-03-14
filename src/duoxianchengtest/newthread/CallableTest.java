package duoxianchengtest.newthread;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
创建线程的方式三:实现callable接口


 */

class Nthread implements Callable{
    @Override
    /*
    call方法相当于run方法，但可以有返回值
     */
    public Object call() throws Exception {
        int sum =0;
        for(int i = 1;i<=100;i++){
            if(i%2 ==0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }
}


public class CallableTest {
    public static void main(String[] args) {
        Nthread nn = new Nthread();
        /*使用FutureTask

         */
        FutureTask ft = new FutureTask(nn);
        new Thread(ft).start();
//        try {
//            //get()返回值即为FutureTask构造器
//            // 参数Callable对象重写的call方法的返回值
//            //get只是为了获取返回值，也可以不调用
//            Object sum = ft.get();
//            System.out.println(sum);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
    }

}
