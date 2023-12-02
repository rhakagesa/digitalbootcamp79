package User;

import Interface.MotorMatic;

public class Rider implements MotorMatic{
    private String name;
    private MotorMatic motor;
    
    public Rider(MotorMatic motor, String name){
        super();
        this.motor = motor;
        this.name = name;
    }

    @Override
    public void startEngine(){
        this.motor.startEngine();
    }

    @Override
    public void stopEngine() {
        this.motor.stopEngine();;
    }

    @Override
    public void increaseSpeed() {
        this.motor.increaseSpeed();
    }

    @Override
    public void decreaseSpeed() {
        this.motor.decreaseSpeed();
    }

    //Getter Setter
    public MotorMatic getMotor() {
        return motor;
    }
    public void setMotor(MotorMatic motor) {
        this.motor = motor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
