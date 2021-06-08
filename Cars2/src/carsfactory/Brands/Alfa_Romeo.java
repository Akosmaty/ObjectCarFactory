package carsfactory.Brands;

public class Alfa_Romeo implements carsfactory.Cars {

    public String data = "Alfa Romeo";

    public String getData() {
        return data;
    }

    public String toString(){

        return getData() + " ";
    }
}
