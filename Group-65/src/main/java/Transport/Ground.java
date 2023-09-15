package Transport;

public class Ground extends Transport {
    int numberofwheels ;
    protected int fuelconsumption = (8 / 100);

    public Ground(String brand) {
        super("BMW,Audi");
    }

    public int getNumberofwheels() {
        return numberofwheels;
    }

    public void setNumberofwheels(int numberofwheels) {
        this.numberofwheels = numberofwheels;
    }

    public int getFuelconsumption() {
        return fuelconsumption;
    }

    public void setFuelconsumption(int fuelconsumption) {
        this.fuelconsumption = fuelconsumption;
    }

    public void Fuelconsumption() {
    }
}
