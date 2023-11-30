package Parent;

public class Person {
    private String name;
    private String address;

    public Person(){
        super();
    }

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void greeting(){
        System.out.println("Hello my name is " + name + ".");
        System.out.println("I come from " + address + ".");
    }

    //Getter and Setter
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }
}
