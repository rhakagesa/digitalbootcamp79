public class PolymorphismApp {
    public static void main(String[] args) {
        Person person1 = new Programmer("Rhaka", "Gresik", "Javascript");

        person1.greeting();

        //Casting
        Programmer programmer1 = (Programmer) person1;
        System.out.println(programmer1.technology);
    }
}
