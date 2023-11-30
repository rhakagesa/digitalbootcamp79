public class Doctor extends Person{
    String specialist;

    public Doctor(){

    }

    public Doctor(String name, String address, String specialist){
        super(name, address);
        this.specialist = specialist;
    }

    void surgery(){
        System.out.println("I camn surgery operation Patiens");
    }

    void greeting(){
        super.greeting();
        System.out.println("My occupation is a " + specialist + " doctor.");
    }
}
