public class Doctor extends Person {
    String specialist;

    public Doctor(String name, String address, int age, String specialist){
        super(name, address, age);
        this.specialist = specialist;
    }

    //Method overriding
    @Override
    public void sayHello(){
        super.sayHello();
        System.out.println("My occupation is a " + specialist + " doctor.");
    }
    
    void surgery(){
        System.out.println("I can surgery operation Patients.");
    }
}
