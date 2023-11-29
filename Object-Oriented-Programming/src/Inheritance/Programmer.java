package Inheritance;
import OOP_Introduction.Person;

public class Programmer extends Person{
    String tech;

    public Programmer(String name, String address, int age, String tech){
        super(name, address, age);
        this.tech = tech;
    }

    //Method overriding
    public void sayHello(){
        super.sayHello();
        System.out.println("My job is programmer, the tech what i use is " + tech + ".");
    }

    public void hacking(){
        System.out.println("I can hack a websites.");
    }

    public void coding(){
        System.out.println("I can create application using technology : " + tech + ".");
    }
}
