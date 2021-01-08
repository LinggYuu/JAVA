package ClassTest;

public class FieldTest {
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
        System.out.println("我讲 "+lan);
    }
}