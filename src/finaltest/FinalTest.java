package finaltest;
/*
final:最终的
1.final可以用来修饰的结构:类 方法 变量
2.final用来修饰一个类:此类不能被其他类所继承
3.final用来修饰方法:表明此方法不可以被重写
    如Object类中的getClass();(用于获得类)
4.final用来修饰变量:此时的"变量"就称为是一个常量
    4.1 final修饰属性:可以考虑复制的的位置有:显式初始化、代码块中初始化、构造器中初始化
    默认初始化时不行
    什么是默认初始化:  在类的最开头初始化时写 final int id;不行 需要赋默认值 final int id =01;
    final能够考虑的位置都是在一开始初始化时就赋了值，不能被修改的位置

    4.2final修饰局部变量



 */
public class FinalTest {

public void show(){
    int num;//局部变量
    final int number = 12 ;//final修饰局部变量
}
public void sss(final int a){//final修饰形参时表明此形参是个常量，当我们调用此方法时，给
    //常量形参一个实参，之后能够用这个形参但是不能修改它

}

}

class AA{
    public final void show(){};
}
class BB extends AA{
    //public void show(){};
}

