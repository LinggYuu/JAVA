package stringtest;
    /*

    String,StringBuffer,StringBuilder三者的异同
    String：不可变字符序列；底层使用final char[]存储
    StringBuffer：可变的字符序列：线程安全的(针对多个线程操作共享数据)，效率低
                    底层使用char[] 存储
    StringBuiler:可变的字符序列:jdk5.0新增的，线程不安全，效率高
                    底层使用char[] 存储


源码分析:

String str = new String();//char[] value = new char[0];
String str1 = new String("abc");//char[] value = new char[]{'a','b','c'};

StringBuffer sb1 = new StringBuffer();//cahr[] value = new char[16];
底层创建一个长度为16的数组
System.out.println(sb1.length());//0，返回的是实际长度
sb1.append('a');//value[0] = 'a';
sb2.append('b');//value[1] = 'b';

StringBuffer sb2 = new StringBuffer("abc");//char[] value = new char["abc".length()+16];

System.out.println(sb2.length());3

扩容问题:如果要添加的数据底层数组放不下了，那就需要扩容底层数组。
默认情况下，扩容为原来容量的2倍+2，同时将原有数组大的元素复制到新数组中。

开发中建议使用StringBuffer(int capacity)，带参构造器指定容量，可以避免扩容

*/

import org.junit.Test;

import java.util.Stack;

public class StringBufferBuilderTest {

    @Test
    public void test(){
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer ss = null;
        StringBuffer sss = new StringBuffer(233);
        sb.setCharAt(0,'s');//把0位置的换成s，直接把字符串改了
        int a= 2323;
        Stack<StringBuffer> asd = null;
        StringBuffer sb2 = sb;
        ss = sb2;
        sb.append("sadqjsdvhnsiudhvnfqlashdvkuishzdcnhkhesadSaCSDV");
        System.out.println(sb);
        System.out.println(ss);
    }

}
