package equalstest;




public class EqualsTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        double d = 10.0;
        char a = 10;
        char ac = 65;
        char ac2 = 'A';
        System.out.println(j==i);//true
        System.out.println(d==i);//true  自动类型提升
        System.out.println(a==i);//true
        System.out.println(ac==ac2);//true
    }

}
