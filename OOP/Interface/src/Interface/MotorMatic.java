package Interface;

public interface MotorMatic {
    //Final Field
    int MAX_SPEED = 80;
    int MIN_SPEED = 0;

    //Abstract Method
    void startEngine();
    void stopEngine();
    void increaseSpeed();
    void decreaseSpeed();
}
