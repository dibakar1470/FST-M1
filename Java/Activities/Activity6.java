package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);

        plane.onboard("Dibakar Prasad");
        plane.onboard("Sumit");
        plane.onboard("Amit");

        System.out.println("Plane took off at: " + plane.takeOff());
        System.out.println("People on the plane: " + plane.getPassengers());

        Thread.sleep(5000);

        plane.land();
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());

    }
}

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTakeOffTime;
    private Date lastLandTime;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String passenger) {
        this.passengers.add(passenger);
    }

    public Date takeOff() {
        this.lastTakeOffTime = new Date();
        return lastTakeOffTime;
    }

    public void land() {
        this.lastLandTime = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastLandTime;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}
