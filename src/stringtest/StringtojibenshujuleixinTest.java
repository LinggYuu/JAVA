package stringtest;

import org.junit.Test;

public class StringtojibenshujuleixinTest {

    @Test
    public void test(){
        String s1 = "123";//常量池里
        int i1 = 33333;
        int num = Integer.parseInt(s1);
        String s2 = String.valueOf(num);
        String s3 = num+"";//在堆里
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
    //有变量参与的都在堆里

    /*
    String和char【】之间的转换

    String--->char[]  :调用String的toCharArray()
    char[]--->String  :调用String的构造器
     */
    @Test
    public void test2(){
        String s = "abc123";
        char[] ac = s.toCharArray();
        for(int i =0;i<s.length();i++){
            System.out.println(ac[i]);
        }
    }
        char[] ac2 = new char[]{'h','e','l','l','o'};
        String s = new String(ac2);

    @Test
    public void fanzhuan_onetothree(){
        String s = "lingyunb";
        char[] acc = s.substring(1,4).toCharArray();
        char[] acc2 = new char[acc.length] ;
        int t = 0;
        System.out.println(acc.length);
        System.out.println(s.substring(4));
        System.out.println(s.substring(0,1));

        for(int i = acc.length-1;i>=0;i--){
            System.out.println(acc[i]);
            acc2[t++]=acc[i];
        }
        String ss = new String(acc2);
        String sss= s.substring(0,1)+ss+s.substring(4);
        System.out.println(sss);

    }




}
