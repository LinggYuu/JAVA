package ClassTest;

import java.time.LocalDate;
import java.util.Date;

public class ClassTest {
    public static void main(String[] args) {
        person ap1 =new person();//类的实例化
        //即创建类的对象
        //调用属性:  对象.属性
        person ap2 = new person();
        System.out.println(ap2.name);
        //输出null,说明有默认初始化值,与数组那块的初始化值一样
        //new一次在堆中就会多一个实体
        ap1.name = "Yazan";
        //调用方法:  对象.方法
        ap1.speak("Chinese");
        //如果创建一个类的多个对象,每个对象都独立地拥有一套
        //类的属性(非static的)
        //which means修改一个对象的属性a不影响另一个对象的属性a
        ap2 = ap1; //将ap1变量保存的对象的地址值赋给ap2,导致
        //ap1和ap2指向堆空间同一个对象实体
    }
}

// 一个java只能有一个public类,且该类只能与项目名同名

class person{

    String name;

    public void eat(){
        System.out.println("I ate an apple.");
    }
    public void speak(String lan){
        System.out.println("I speak "+lan);
    }//类中有方法，方法即函数
}

class food{
    String name;
}

//建完类要造对象
//即类的实例化