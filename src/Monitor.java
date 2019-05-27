import java.util.Objects;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutiony;

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



    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public void setResolutiony(int resolutiony) {
        this.resolutiony = resolutiony;
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
                resolutiony == monitor.resolutiony;
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolutionX, resolutiony);
    }
}
