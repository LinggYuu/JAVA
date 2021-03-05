package interfacetest;

public class USBTest {
    public static void main(String[] args) {
        Computer ac = new Computer();
        Flash flash = new Flash();
        ac.transferData(flash);//体现了接口的多态性
    }

}


interface USB{
    void start();
    void stop();
}

class Computer{
    public void transferData(USB usb){
        usb.start();
        System.out.println("具体传输细节");
        usb.stop();
    }
}

class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘开启");
    }

    @Override
    public void stop() {
        System.out.println("U盘关闭");
    }
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开启");
    }

    @Override
    public void stop() {
        System.out.println("打印机关闭");
    }
}