package carsfactory.Engine;

public class First implements carsfactory.Cars{
    public String data = "1500";

    public String getData() {
        return data;
    }

    public String toString(){

        return getData() + " ";
    }
}
