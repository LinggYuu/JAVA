package fanshe;

//通过反射创建对应的运行时类的对象


import org.junit.Test;

import java.util.Random;

public class NewInstanceTest {

    @Test
    public void test() throws Exception {
        Class clas = Person.class;//得到一个运行时类
        Person a = new Person();
        Class clas2 = a.getClass();//getclass获取对象的运行时类
        Object obj = clas.newInstance();
        //类对象.newInstance()造的其实是Person类的对象

        /*
        newInstance():调用此方法，创建对应的运行时类的对象
        上面调用了运行时类的空参构造器
        想用此方法创建运行时类的对象要求:
            1.运行时类必须提供空参的构造前期
            2.空参的构造器的访问权限得够。通常设为public
          一般javabean中要求提供一个public的空参构造器
                1.便于通过反射创建运行时类的对象
                2.便于子类继承此运行时类时，默认调用super()时，保证父类有此构造器
         */
    }
    @Test
    public void test2() throws Exception {
        int i = new Random().nextInt(3);
        String classpath="";//注意不能没有=“ ”
        switch (i){
            case 0:
                classpath = "java.util.Date";
                break;
            case 1:
                classpath = "java.util.Date";
                break;
            case 2:
                classpath = "fanshe.Person";
                break;
        }
        Object obj = getInstance(classpath);
        System.out.println(obj);
    }

    /*
    getInstance方法创建一个指定类的对象
    classpath：指定类的全类名
     */
    public Object getInstance(String classpath) throws Exception {
        Class clas3 = Class.forName(classpath);
        return clas3.newInstance();
    }


}
