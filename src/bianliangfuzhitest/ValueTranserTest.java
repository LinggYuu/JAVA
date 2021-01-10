package bianliangfuzhitest;

public class ValueTranserTest {
    public static void main(String[] args) {
        //基本数据类型
//        int m = 10;
//        int n = m;
//        System.out.println("m="+m);
//        System.out.println("n="+n);
//        n = 20;
//        System.out.println("m="+m);
//        System.out.println("n="+n);
        //引用数据类型
        T at = new T();
        at.id = 1;
        T at2 =at;//赋值后at2和at的地址值相同，都指向了堆空间中同一个对象实体
        System.out.println("atid:"+at.id);
        System.out.println("at2id: "+at2.id);
        at2.id +=1;
        System.out.println("atid:"+at.id);
        System.out.println("at2id: "+at2.id);
    }
}

class T{
    int id;
}