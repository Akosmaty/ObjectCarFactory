package carsfactory.Brands;

public class Skoda implements carsfactory.Cars{

    public String data = "Skoda";

    public String getData() {
        return data;
    }

    public String toString(){

        return getData() + " ";
    }
}
