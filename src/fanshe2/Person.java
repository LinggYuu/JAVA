package fanshe2;

public class Person extends Creature<String>implements Comparable<String>,MyInterface{

    private String name;
    int age;
    public int id;

    public Person(){

    }
    private Person(String name){
        this.name = name;
    }
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    private String show(String nation){
        System.out.println("国籍:"+nation);
        return nation;
    }

    public String display(String interest){
        return interest;
    }

    @Override
    public void info() {
        System.out.println("人");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}