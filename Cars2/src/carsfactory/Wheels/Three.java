package carsfactory.Wheels;

public class Three implements carsfactory.Cars{
    public String data = "19'";

    public String getData() {
        return data;
    }
    public String toString(){

        return getData() + " ";
    }
}
