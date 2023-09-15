package Transport;

public class Air extends Transport {
    double wingspan= 34.32;
    int minimumtakeoff= 3500;

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinimumtakeoff() {
        return minimumtakeoff;
    }

    public void setMinimumtakeoff(int minimumtakeoff) {
        this.minimumtakeoff = minimumtakeoff;
    }

    public Air(String brand) {
        super( "Boing, Airbus");
    }


}
