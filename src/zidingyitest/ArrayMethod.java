package zidingyitest;

public class ArrayMethod {
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
