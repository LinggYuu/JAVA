package daimakuaitest;



class Root{
    static{
        System.out.println("RootStaticBlock");
    }
    {
        System.out.println("RootBlock");
    }

    public Root() {
        super();
        System.out.println("Root无参构造器");
    }
}
class Mid extends Root{
    static{
        System.out.println("MidStaticBlock");
    }
    {
        System.out.println("MidBlock");
    }
    public Mid(){
        super();
        System.out.println("Mid无参构造器");
    }
    public Mid(String msg){
        this();
        System.out.println("Mid带参构造器，其参数值:"+msg);
    }
}

class Leaf extends Mid{
    static{
        System.out.println("LeafStaticBlock");
    }
    {
        System.out.println("LeafBlock");
    }
    public Leaf(){
        super("尚硅谷");
        //通过super调用父类中有一个字符串参数的构造器
        System.out.println("Leaf的构造器");
    }
}

public class LeafTest{
    public static void main(String[] args) {
        new Leaf();
    }
}

//代码块先于构造器执行