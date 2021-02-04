package maintest;

/*
    main作为程序的入口
    main也是一个普通的静态方法
 */

public class MainTest {
    public static void main(String[] args) {
        //main方法是程序的入口，也是一个普普通通的静态方法
        Main.main(new String[100]);
    }
}

class Main{
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            args[i] = "args_"+i;
            System.out.println(args[i]);
        }
    }
}