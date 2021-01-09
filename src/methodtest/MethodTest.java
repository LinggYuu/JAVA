package methodtest;

public class MethodTest {
    public static void main(String[] args) {
        RetTest ar = new RetTest();
        ar.age=18;
        System.out.println(ar.getName());
    }
}

class User{
    //属性field,成员变量
    String name;
    int age;
    public void eat(String food){
        System.out.println("I ate an "+food);
    }//food为形参,为局部变量
    public void speak(){
        String lan = "chinese";//lan为局部变量
        //非形参的局部变量初始化一下
        System.out.println("我讲 "+lan);
    }
    public int age(int age){
        return age;
    }
}
class RetTest{
    //method 指定了返回值就必须要能有返回值
    int age;
    public String getName(){
        if(age>=18)  return"成年了";//if只有这一步会报错
        //因为返回值要所有情况下都有，所以else情况下也得有返回值
        return"小盆宇";
    }

}