package carsfactory;

import carsfactory.Brands.Alfa_Romeo;
import carsfactory.Color.Black;
import carsfactory.Engine.third;
import carsfactory.Wheels.Two;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Cars> car = new ArrayList<Cars>();

        car.add(new Alfa_Romeo());
        car.add(new third());
        car.add(new Black());
        car.add(new Two());
        printer(car);


    }
    public static void printer(ArrayList<Cars> car){

        car.forEach(System.out::print);
        System.out.println();
    }
}
