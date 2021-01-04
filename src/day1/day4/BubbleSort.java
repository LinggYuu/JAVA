package day1.day4;


public class BubbleSort {
    public static void main(String[] args) {
        //输出下三角
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("⭐");
//            }
//            System.out.println();
//        }
        //99乘法表
//        for(int i=1;i<=9;i++){
//            for(int j=1;j<=i;j++) {
//                System.out.print(i + "*" + j + "=" + (i * j));
//                System.out.print("  ");
//            }System.out.println();
//        }
        //100内质数（只能被1和本身整除的自然数
        for(int i=2  ;i<=100;i++){
            int flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                System.out.println(i);
        }
    }
}
