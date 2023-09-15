package Transport;


public class Transport {
    protected int power = 150 ;
    protected int maxSpeed = 500 ;
    protected int weightkg = 1800;
    protected String brand=("Audi, BMW , Boing, Airbus, Scania , МАЗ") ;

    public Transport(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeightkg() {
        return weightkg;
    }

    public void setWeightkg(int weightkg) {
        this.weightkg = weightkg;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}