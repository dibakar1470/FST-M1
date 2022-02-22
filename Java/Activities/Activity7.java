package activities;

public class Activity7 {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}

interface BicycleParts{
    public int gears = 0;
    public int currentSpeed = 0;
}

interface BicycleOperations{
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}

class Bicycle implements BicycleParts, BicycleOperations{

    public int gears;
    public int currentSpeed;

    @Override
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        System.out.println("Reduce the current speed by: " + currentSpeed);
    }

    @Override
    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Increase the current speed by: " + currentSpeed);
    }

    public Bicycle(int gears, int currentSpeed){
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}

class MountainBike extends Bicycle{

    public int seatHeight;

    public MountainBike(int gears, int currentSpeed, int seatHeightAt){
        super(gears, currentSpeed);
        seatHeight = seatHeightAt;
    }

    public void setHeight(int newValue) {
        this.seatHeight = newValue;
    }

    public String bicycleDesc() {
        return(super.bicycleDesc() + "\nSeat height is " + seatHeight);
    }
}
