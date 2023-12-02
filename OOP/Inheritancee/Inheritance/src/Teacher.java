public class Teacher extends Person{
    String subject, lesson;

    public Teacher(String name, String address, int age, String subject, String lesson){
        super(name, address, age);
        this.subject = subject;
        this.lesson = lesson;
    }

    public void teaching(){
        System.out.println("I can teach " + subject +", and i will teach you " + lesson + ".");
    }

    //Method overriding
    public void sayHello(){
        super.sayHello();
        System.out.println("My job is a " + subject +" teacher, and i will teach you " + lesson + " first.");
    }
}
