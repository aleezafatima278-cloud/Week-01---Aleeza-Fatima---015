public class Car {

    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;
    private double fuelLevel;
    private boolean autopilot;

    public Car() {
        this.brand = "unknown";
        this.color = "none";
        this.speed = 0;
        this.engineOn = false;
        this.autopilot = false;
        this.fuelLevel = 100;
    }

    public Car(String brand, String color, int speed, boolean engineOn, double fuelLevel, boolean autopilot) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.engineOn = engineOn;
        this.fuelLevel = fuelLevel;
        this.autopilot = autopilot;
    }

    public void setDetails(String brand, String color, int speed, boolean engineOn, double fuelLevel, boolean autopilot) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.engineOn = engineOn;
        this.fuelLevel = fuelLevel;
        this.autopilot = autopilot;
    }

    public void startEngine() {
        this.engineOn = true;
        System.out.println(this.brand + " engine started");
    }

    public void stopEngine() {
        this.engineOn = false;
        System.out.println(this.brand + " engine stopped");
    }

    public void displayState() {
        System.out.println("Engine on : " + this.engineOn);
        System.out.println("Brand : " + this.brand);
        System.out.println("Speed : " + this.speed);
        System.out.println("Color : " + this.color);
        System.out.println("Fuel level : " + this.fuelLevel);
        System.out.println("Autopilot on : " + this.autopilot);
        System.out.println();
    }

    public int getSpeed() {
        return this.speed;
    }

    public double getFuelLevel() {
        return this.fuelLevel;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getColor() {
        return this.color;
    }

    public boolean getEngineState() {
        return this.engineOn;
    }

    public void increaseSpeed(int speed, int increaseAmount) {
        this.speed = speed;
        if(this.engineOn == true) {
            this.speed = this.speed + increaseAmount;
        } else{
            System.out.println("THE CAR IS OFF");
        }

    }
        
    

    public void decreaseSpeed(int speed, int decreaseAmount) {
        this.speed = speed;
        if((this.engineOn == true)) {
            this.speed = this.speed - decreaseAmount;
        } else {
            System.out.println("THE CAR IS OFF");
        }
        
    }

    public void enableAutopilot() {
        this.autopilot = true;
    }

    public void refillFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
        if(this.fuelLevel == 0) {
            this.fuelLevel = 100.0;
        }
    }


}
