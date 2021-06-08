package carsfactory.Engine;

public class secound implements carsfactory.Cars{
    public String data = "2000";

    public String getData() {
        return data;
    }
    public String toString(){

        return getData() + " ";
    }
}
