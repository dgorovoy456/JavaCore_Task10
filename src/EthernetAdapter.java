import java.util.Objects;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacture, float price, String serialNumber, int speed, String mac) {
        super(manufacture, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }

    @Override
    public String toString() {
        return "EthernetAdapter: manufacture = " + getManufacture() + ", price = "
                + getPrice() + ", serialNumber=" + getSerialNumber() + ", speed" +
                "=" + getSpeed() + ", mac=" + getMac();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed == that.speed &&
                Objects.equals(mac, that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, mac);

    }
}