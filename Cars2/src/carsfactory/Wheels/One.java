package carsfactory.Wheels;

public class One implements carsfactory.Cars{
    public String data = "15'";

    public String getData() {
        return data;
    }
    public String toString(){

        return getData() + " ";
    }
}
