package duoxianchengtest;

/*

练习:创建两个分线程，其中一个遍历50以内偶数，另一个发50遍hello


 */

class Thread1 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i <= 50;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i <= 50;i++){
            System.out.println("hello");
        }
    }
}



public class ThreadDemo {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        //更简便的方式
        //创建Thread类的匿名子类的方式
//        new Thread(){
//            @Override
//            public void run() {
//                for(int i = 0; i <= 50;i++){
//                    if(i%2 == 0){
//                        System.out.println(i);
//                    }
//                }
//            }
//        }.start();
    }
}
