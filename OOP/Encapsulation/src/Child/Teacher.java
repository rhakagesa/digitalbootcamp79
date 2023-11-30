package Child;

import Parent.Person;

public class Teacher extends Person {
    private String subject;

    public Teacher(){
        super();
    }

    public Teacher(String name, String address, String subject){
        super(name, address);
        this.subject = subject;
    }

    void teaching(){
        System.out.println("I can teach " + subject + ", So anyone who want to learn can talk to me.");
    }

    public void greeting(){
        super.greeting();
        System.out.println("My job is a " + subject + "teacher.");
    }

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }
}
