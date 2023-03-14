package Computer;

public class Laptop extends Computer{
    private int autonomousWorkDuration;

    public Laptop(int frequency, int coresCount, int ramSize, int hddSize, int autonomousWorkDuration) {
        super(frequency, coresCount, ramSize, hddSize);
        this.autonomousWorkDuration = autonomousWorkDuration;
    }

    @Override
    public double price() {
        return (super.price() + autonomousWorkDuration / 10.0);
    }

    @Override
    public boolean isSuitableForUse() {
        return (super.isSuitableForUse() && (autonomousWorkDuration >= 60));
    }

    @Override
    public String info() {
        return "Laptop:\n" +
                "  frequency: " + frequency + " MHz\n" +
                "  cores: " + coresCount + "\n" +
                "  RAM: " + ramSize + " MB\n" +
                "  HDD: " + hddSize + " GB\n" +
                "  price: " + price() + "$\n" +
                "  autonomous work duration: " + autonomousWorkDuration + " min\n" +
                (isSuitableForUse() ? "  is suitable for use" : "  is not suitable for use");
    }
}
