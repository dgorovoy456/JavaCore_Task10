import java.util.Objects;
import java.util.Random;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutiony;
    private  int random = new Random().nextInt(1000);

    public Monitor(String manufacture, float price, String serialNumber, int resolutionX, int resolutiony) {
        super(manufacture, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutiony = resolutiony;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutiony() {
        return resolutiony;
    }




    @Override
    public String toString() {
        return "Monitor: manufacture = "+getManufacture() +", price = "
                +getPrice()+", serialNumber "+getSerialNumber()
                + ", X= "+getResolutionX() + ", Y= "+getResolutiony();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX &&
                resolutiony == monitor.resolutiony && serialNumber.equals(monitor.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolutionX, resolutiony,serialNumber,random);
    }
}
