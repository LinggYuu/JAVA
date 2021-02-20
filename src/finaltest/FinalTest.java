package finaltest;
/*
final:最终的
1.final可以用来修饰的结构:类 方法 变量
2.final用来修饰一个类:此类不能被其他类所继承
3.final用来修饰方法:表明此方法不可以被重写
    如Object类中的getClass();
4.final用来修饰变量:此时的"变量"就称为是一个常量
    4.1 final修饰属性:可以考虑复制的的位置有:显式初始化、代码块中初始化、构造器中初始化
 */
public class FinalTest {
}

class AA{
    public final void show(){};
}
class BB extends AA{
    //public void show(){};
}