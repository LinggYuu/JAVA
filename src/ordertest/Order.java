package ordertest;

public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtected;
    public int orderPublic;

    private void methodPrivate(){
        System.out.println("调用Private方法");
    }
    void methodDefault(){
        System.out.println("调用Default方法");

    }
    protected void methodProtected(){
        System.out.println("调用protected方法");
    }
    public void methodPublic(){
        System.out.println("调用了public方法");
    }
    public void methodYongprivate(){
        orderPrivate =1;
    }



}
