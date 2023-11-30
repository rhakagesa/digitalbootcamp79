import Child.Doctor;
import Child.Programmer;
import Child.Teacher;
import Parent.Person;

public class AccessModifierApp {
    public static void main(String[] args) {
        Person person1 = new Teacher("Fina", "Malang", "Islam Religion");
        Person person2 = new Doctor("Khadijah", "Malang", "Obgyn");
        Person person3 = new Programmer("Rhaka", "Malang", "Java");

        sayHello(person1);
        sayHello(person2);
        sayHello(person3);
    }

    static void sayHello(Person person){
        String message = "";
        //Type Check
        if(person instanceof Teacher){
            Teacher teacher = (Teacher) person;
            message = "Hello my name " + teacher.name + " as a " + teacher.subject + " teacher.";
        }
        else if(person instanceof Programmer){
            Programmer programmer = (Programmer) person;
            message = "Hello my name " + programmer.name + " as a " + programmer.technology + " programmer.";
        }
        else if(person instanceof Doctor){
            Doctor doctor = (Doctor) person;
            message = "Hello my name " + doctor.name + " as a " + doctor.specialist + " doctor.";
        }
        else {
            message = "Hello my name " + person.name + ".";
        }
        System.out.println(message);
    }
}
