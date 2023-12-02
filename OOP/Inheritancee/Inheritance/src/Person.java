public class Person {
    //Field/Attribute/Properties
    public String name, address;
    public int age;
    final String country = "Malang";

    //Constructor Default
    public Person(){
    }

    //Constructor with Parameter
    /*
    Person(String personName, String personAddress, int personAge){
        name = personName;
        address = personAddress;
        age = personAge;
    } 
    */
    
    //Variable Shadowing (Var Field and Var Constructor is same)
    /*
     Person(String name, String address, int age){
        name = name;
        address = address;
        age = age;
    }
    */

    //use keyword this for avoid variable shadowing
    public Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    //Method without return
    void sayHello(){
        System.out.println("Hello my name " + name + ", my age is " + age + " nice to meet you.");
        System.out.println("My home address is at " + address + ", " + country + " city.");
    }

    //Method with return
    String sayGoodbye(String paramName){
        return "Byeee... " + paramName +" see you again.";
    }
}