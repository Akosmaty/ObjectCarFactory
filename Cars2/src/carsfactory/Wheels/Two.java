package carsfactory.Wheels;

public class Two implements carsfactory.Cars{
    public String data = "17'";

    public String getData() {
        return data;
    }
    public String toString(){

        return getData() + " ";
    }
}
