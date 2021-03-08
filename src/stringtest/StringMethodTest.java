package stringtest;

import org.junit.Test;

public class StringMethodTest {
    @Test
    public void test1(){
//        String s1 = "HelloWorld";
//        System.out.println(s1.length());
//        System.out.println(s1.charAt(0));
//        System.out.println(s1.isEmpty());
//
//        String s2 = s1.toLowerCase();
//        System.out.println(s2);
//        System.out.println(s1);//s1不可变，体现了字符串不可变性，仍然为原来的字符串
//        String s3 = "  he  l  l o wo r ld  ";
//        String s4 = s3.trim();//去除首尾空格，就是在输入用户名时去除多余空格
//        System.out.println(s3+"111111"+s4);
//        String s5 = "HelloWorld";
//        String s6 = new String("HelloWorld");
//        System.out.println(s1.equals(s5));//比较实际内容
//        System.out.println(s1==s5);//比较地址值
//        //因为s5的字符串是存在常量池中的那一坨，地址一样
//        System.out.println(s1.equals(s6));//比较实际内容
//        System.out.println(s1==s6);//比较地址值
//System.out.println("-------------------------------------");
//        String s7 = "Hello";
//        String s8 = s7.concat("World");
//        System.out.println(s1.equals(s8));
//        System.out.println(s1==s8);//出现了变量的话存在堆中了
//System.out.println("-------------------------------------");
//
//        String a1 = "abc";
//        String a2 = new String("abd");
//        String a3 = new String("abc");
//        System.out.println(a1.compareTo(a2));
//        System.out.println(a1.compareTo(a3));//涉及到字符串排序，用户排序可以用
//        System.out.println(a2.compareTo(a3));
//        //a: 97
////        凡是函数类比较的都是比较实际值好像

//System.out.println("-------------------------------------");
//
//        String a4 = "lingyu";
//        System.out.println(a4.substring(0,4));//从0开始，到4之前一位
//        //0,4就是0-3位 左闭右开原则
//
//        System.out.println("-------------------------------------");
//        String a5 = "lingyu";
//        System.out.println(a5.endsWith("u"));
//        System.out.println(a5.endsWith("yu"));//是否以XX结尾
//
//        System.out.println(a5.startsWith("ling"));
//        System.out.println(a5.startsWith("ling",1));//从1位置是否为xx的前缀
//
//
//        System.out.println("-------------------------------------");
//
//        String a6 = "lingyunblingyu";
//        System.out.println(a6.contains("nb"));//是否包含
//
//        System.out.println(a6.indexOf("in"));//该子串在原串中第一次出现的位置
//        System.out.println(a6.lastIndexOf("in"));//该字串在原串中最后一次出现的位置
//        //index和lastindex若没找到子串接返回-1
//        System.out.println(a6.indexOf("in",5));//从第5个位置开始找子串

        String s1 = "helloworldworldworld";
        String s2 = s1.replace("world","yazan");
        System.out.println(s1);//String的不可变性
        System.out.println(s2);//replace会把所有的都改了




    }
    @Test
    public void num(){
        String s ="lingnb nb is nb.zhennba";
        String w ="01234567890123456789012";
        int i = 0;
        int n = 0;
        while (s.indexOf("nb",i)!=-1){
            n++;
            System.out.println(s.indexOf("nb",i));
            i=s.indexOf("nb",i)+2;
        }
        System.out.println(n);



    }
}
