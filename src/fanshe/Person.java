package fanshe;

public class Person {
    public String  name;
    public int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void show(){
        System.out.println("Hello");
    }
    private String ShowNation(String nation)
    {
        System.out.println(this.name+"国籍为:+nation");
        return nation;
    }

    public static void main(String[] args) {
        Person ap = new Person();
        ap.setAge(16);
        ap.setName("lingyu");
        ap.ShowNation("CHINA");
    }
}
