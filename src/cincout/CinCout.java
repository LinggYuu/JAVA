package cincout;

import java.util.*;

public class CinCout {

    public static void main(String[] args) {
        String[] str = new String[5];
        String astr;
        Scanner in = new Scanner(System.in);
//        str[1]= in.nextLine();//会输出一整行
//        System.out.println(str[1]);
//        astr = in.next();//输出空格前的
//        System.out.println(astr);
//        int ad;
//        ad = in.nextInt();
//        System.out.println(ad);
//        for(int i=0;i<str.length;i++){
//            str[i] = in.nextLine();
//        }
//        System.out.println(Arrays.toString(str));
//        double r = Math.random()*10;
//        int ai = (int) (Math.random()*10);
//        System.out.println(r);
//        System.out.println(ai);
        int[] arr = {3,6,9,8,2,4,5,7,1,0};
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[j]>arr[j-1]){
                    int t = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = t;
                }
            }
        }
        for (int a:arr){
            System.out.print(a);
            System.out.println(",");
        }

    }

}
