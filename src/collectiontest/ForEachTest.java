package collectiontest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class ForEachTest {

    @Test
    public void test(){

        Collection cc = new ArrayList();
        cc.add(123);
        cc.add(456);
        cc.add(new String("cat"));
        cc.add(false);
        cc.add(456);

       //for(集合元素类型 局部变量 ：集合对象)
       //内部仍然调用了迭代器
        for(Object o:cc){
            System.out.println(o);
        }

    }

    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5,6};
        for(int i:arr){
            System.out.println(i);
        }
    }

    @Test
    public void test3(){
        String[] arr = new String[]{"wss","eee","asd"};
        for(String s:arr){
            s = "aa";
        }
        //这里相当于把s给赋值了，而对 arr无影响
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }





}
