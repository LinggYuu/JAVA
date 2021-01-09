package zidingyitest;


import java.lang.reflect.Method;

public class ArrayUtil {

    public static void main(String[] args) {
        ArrayMethod a = new ArrayMethod();
        int[]arr ={3,5,9,8,1,66,7,2,3,4};
        int res = a.getMax(arr);
        System.out.println(res);
        ArrayMethod2 a2 = new ArrayMethod2();
        System.out.println(a2.getMin(arr));
        ArrayMethod1 a1 = new ArrayMethod1();
        System.out.println(a1.getMax(arr));
        ArrayUtil a3 = new ArrayUtil();
        System.out.println(a3.getMax2(arr));

    }
    public int getMax2(int[] arr){
        int num = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>num){
                num=arr[i];
            }
        }
        return num;
    }

}

class ArrayMethod2{
    int id;
    public int getMin(int[] arr){
        return 0;
    }
}
class ArrayMethod1{
    public int getMax(int[] arr){
        int num = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>num){
                num=arr[i];
            }
        }
        return num;
    }
}