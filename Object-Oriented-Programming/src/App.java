import Inheritance.Doctor;
import Inheritance.Programmer;
import Inheritance.Teacher;
import OOP_Introduction.Person;

public class App {
    public static void main(String[] args) throws Exception {
        //Inisialisasi objek baru tanpa mengisi parameter
        Person person1 = new Person();
        //Inisialisasi objek baru dengan mengisi parameter
        Person person2 = new Person("Kharisma", "Sigura - Gura", 27);

        //Objek Person 1
        person1.name = "Rhaka Gemilang Sentosa";
        person1.age = 25;
        person1.address = "Griyasantha";
        //Accsess method without return value
        person1.sayHello();
        //Method with return value
        System.out.println(person1.sayGoodbye("Budi"));

        System.out.println();

        //Objek Person 2
        //Accsess method without return value
        person2.sayHello();
        //Method with return value
        System.out.println(person2.sayGoodbye("Budi"));

        System.out.println();

        //Inheritance
        Teacher teacher1 = new Teacher("Frimananda", "Sigura - gura", 27, "Math", "Calculus");
        teacher1.sayHello();
        
        System.out.println();

        Doctor doctor1 = new Doctor("Khadijah", "Suhat", 25, "Obgyn");
        doctor1.sayHello();


        System.out.println();

        Programmer programmer1 = new Programmer("Gesa", "Suhat", 25, "Javascript and Java");
        programmer1.sayHello();
        
    }
}
