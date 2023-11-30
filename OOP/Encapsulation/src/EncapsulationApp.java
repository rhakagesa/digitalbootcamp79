import Child.Doctor;
import Child.Programmer;
import Child.Teacher;
import Parent.Person;

public class EncapsulationApp {
    public static void main(String[] args) {
        Person person1 = new Teacher();
        person1.setName("Fina");
        person1.setAddress("Malang");
        ((Teacher)person1).setSubject("Islamic Religion");

        Person person2 = new Doctor();
        person2.setName("Khadijah");
        person2.setAddress("Malang");
        ((Doctor)person2).setSpecialist("Obgyn");

        Person person3 = new Programmer();
        person3.setName("Rhaka");
        person3.setAddress("Gresik");
        ((Programmer)person3).setTechnology("Java");

        sayHello(person1);
        sayHello(person2);
        sayHello(person3);
    }

    static void sayHello(Person person){
        String message = "";
        //Type Check
        if(person instanceof Teacher){
            Teacher teacher = (Teacher) person;
            message = "Hello my name " + teacher.getName() + " as a " + teacher.getSubject() + " teacher.";
        }
        else if(person instanceof Programmer){
            Programmer programmer = (Programmer) person;
            message = "Hello my name " + programmer.getName() + " as a " + programmer.getTechnology() + " programmer.";
        }
        else if(person instanceof Doctor){
            Doctor doctor = (Doctor) person;
            message = "Hello my name " + doctor.getName() + " as a " + doctor.getSpecialist() + " doctor.";
        }
        else {
            message = "Hello my name " + person.getName() + ".";
        }
        System.out.println(message);
    }
}
