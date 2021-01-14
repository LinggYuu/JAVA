package ordertest;

public class OrderTest {
    public static void main(String[] args) {
        Order ao = new Order();
        ao.orderDefault=1;
        ao.orderPublic=1;
       // ao.orderPrivate =1;
        ao.methodDefault();
        ao.methodProtected();
        ao.methodPublic();
        //ao.methodPrivate();
    }
}
