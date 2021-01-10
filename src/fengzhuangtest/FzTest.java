package fengzhuangtest;

public class FzTest {
    public static void main(String[] args) {
        Person ap =new Person();
        //ap.legs=-1;  报错 报错报的是不可见而不是没这个属性
        //就是有这个属性但是没法用，不可见

    }
}

class Person{
    String name;
    int age;
    private int legs;  //只能是正的偶数
    //当声明为private后不能再直接使用  xx.legs = num了
    //也就是将这个属性封装了，没有对外暴露
    //只能通过方法调用它
    //属性还是有的
    //隐藏了但是仍存在
    public void setLegs(int l){
        if(l>=0&&l%2==0){
            legs=l;
        }else legs=0;
    }
    //并且要禁止用户用 a.legs=-1;
    //若要禁止，将legs属性设为private

}
