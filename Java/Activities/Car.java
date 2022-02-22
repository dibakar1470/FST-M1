package activities;

public class Car {

    String colour;
    String transmission;
    int make;
    int tyres;
    int doors;

    Car(){
        tyres = 4;
        doors = 4;
    }

        public void displayCharacteristics(){
            System.out.println("Car colour is: " + colour);
            System.out.println("Car transmission is: " + transmission);
            System.out.println("Car make: " + make);
            System.out.println("No. of Car tyres: " + tyres);
            System.out.println("No. of Car doors: " + doors);
        }

        public void accelerate(){
            System.out.println("Car is moving forward");
        }

        public void brake(){
            System.out.println("Car has stopped");
        }

}
