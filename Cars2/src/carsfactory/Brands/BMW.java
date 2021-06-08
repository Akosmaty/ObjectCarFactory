package carsfactory.Brands;

public class BMW implements carsfactory.Cars{
    public String data = "BMW";

    public String getData() {
        return data;
    }

    public String toString(){

        return getData() + " ";
    }
}
