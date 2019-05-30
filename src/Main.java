public class Main {
    public static void main(String[] args) {

        Monitor monitor = new Monitor("Samsung",20000F,"0000",16,14);
        Monitor monitor1 = new Monitor("Samsung",20000F,"0000",16,14);
        System.out.println(monitor.equals(monitor1));
        System.out.println(monitor.equals(monitor));
        EthernetAdapter adapter1 =new EthernetAdapter("Cisco",1000,"01",100,"ff:ff:ff:ff:ff");
        EthernetAdapter adapter2 =new EthernetAdapter("Cisco",1000,"01",100,"ff:ff:ff:ff:ff");
        EthernetAdapter adapter3 =new EthernetAdapter("Cisco",1000,"01",100,"ff:ff:ff:ff:ff");
        System.out.println(adapter1);

    }
}
