package fanshe;

import org.junit.Test;

import java.lang.reflect.*;

public class ReflectTest {
    @Test
    public void test() throws Exception{
//        Class clas = Person.class;
//        //通过反射造Person类的对象
//        Constructor cons = clas.getConstructor(String.class,int.class);
//        //通过反射建对象
//        Object obj = cons.newInstance("ss",123);
//        Person p = (Person) obj;
//        p.show();
//        Field age = clas.getDeclaredField("age");//获取属性
//        //此时需要该属性不为private
//        age.set(p,10);
//        System.out.println(p.toString());
//
//        //调用方法
//
//        Method show = clas.getDeclaredMethod("show");
//        show.invoke(p);//通过invoke调用方法
//
//        //通过反射调用Person类私有结构,私有构造器，属性
//        Constructor cons2 = clas.getDeclaredConstructor(String.class);
//        cons2.setAccessible(true);//使私有的可被调
//        Object pp = cons2.newInstance("sad");
//        Person ppp = (Person)pp;
//        System.out.println(ppp.toString());
//
//        Field age1 = clas.getDeclaredField("age");
//        age1.set(ppp,156123);//设置属性，前一个为对象，后一个为参数
//        System.out.println(ppp.toString());
    }

    @Test
    public void test2() throws ClassNotFoundException {
        //前三种需掌握
        //方式一:调用运行时类的属性: 。class
        Class clas = Person.class;
        System.out.println(clas);
        //方式一，加上泛型版本,避免后面进行强转
        //Class<Person> clas1 = Person.class;
        //System.out.println(clas1);

        //方式二:通过运行时类的对象
        Person p1 = new Person();
        Class clas2 = p1.getClass();//得到对象的类

        //方式三:调用Class的静态方法:forName(String classPath)
        Class aClass = Class.forName("fanshe.Person");//java指java下的
        System.out.println(aClass);

        //方式四:使用类的加载器：ClassLoader
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        Class aClass1 = classLoader.loadClass("fanshe.Person");
        System.out.println(aClass1);

        System.out.println(aClass==clas);//true
    }




}
