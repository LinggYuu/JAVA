package day1.day4.day3;

public class day3 {
    public static void main(String[] args) {
        //打印一个三位数的每个位值
        int num= 187;
        for(int i=1;i<=3;i++){
            System.out.println(num%10);
            num/=10;
        }
    }
}
