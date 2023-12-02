public class App {
    public static void main(String[] args) {
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
