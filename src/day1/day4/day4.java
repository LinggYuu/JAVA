package day1.day4;

import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
//        int a=5;
//        switch(a){
//            case 0:
//                System.out.println("0");
//                break;
//            case 1:
//                System.out.println("1");
//                break;
//            case 3:
//                System.out.println(3);
//            default:
//                System.out.println("other");
//
//        }
        Scanner s= new Scanner(System.in);
        while(true){
            int num= s.nextInt();
            if(num>100){
                System.out.println(num);
            }else{
                System.out.println("F W");
                break;
            }
        }


    }
}
