package Type;

import Interface.MotorMatic;

public class Variu implements MotorMatic{
    private boolean isEngineOn;
    private int speedometer;
    
    public Variu(){
        this.speedometer = 0;
    }

    @Override
    public void startEngine() {
        isEngineOn = true;
        System.out.println("Motor nyala ...");
    }

    @Override
    public void stopEngine() {
        isEngineOn = false;
        System.out.println("Motor mati ...");
    }

    @Override
    public void increaseSpeed() {
        if(isEngineOn){
            if( this.speedometer == MAX_SPEED){
                System.out.println("Kecepatan Maksimal " + this.speedometer + "km/jam");
            }
            else if(this.speedometer <= MIN_SPEED || this.speedometer > MIN_SPEED){
                this.speedometer += 10;
                System.out.println("Kecepatan " + this.speedometer + "km/jam");
            } 
        } else{
            System.out.println("Motor mati, silahkan nyalakan motor dulu");
        }
    }

    @Override
    public void decreaseSpeed() {
        if(isEngineOn){
            if(this.speedometer == MIN_SPEED){
                System.out.println("Motor sedang berhenti, speedometer saat ini " + this.speedometer + "km/jam");
            }
            else {
                this.speedometer -= 10;
                System.out.println("Kecepatan " + this.speedometer + "km/jam");
            }
        } else{
            System.out.println("Motor mati, silahkan nyalakan motor dulu");
        }
    }
    
    //Getter & Setter
    public int getSpeedometer() {
        return speedometer;
    }
    
    public void setSpeedometer(int speedometer) {
        this.speedometer = speedometer;
    }
    
    public boolean isEngineOn() {
        return isEngineOn;
    }
    
    public void setEngineOn(boolean isEngineOn) {
        this.isEngineOn = isEngineOn;
    }
}
