interface Connectable {
    String connect();
    String disconnect();
}
interface Switchable {
    String turnOn();
    String turnOff();
}
interface Lockable {
    String lock();
    String unlock();
}

enum Status {
    PENDING,
    SHIPPED,
    DELIVERED,
    CANCELLED
}

abstract class SmartDevice {
    private String id;
    private String nama;
    private double daya;

    SmartDevice(String id, String nama, double daya) {
        this.id = id;
        this.nama = nama;
        this.daya = daya;
    }

    abstract String getDeviceDetails();

    void setID(String id) {
        this.id = id;
    }
    void setNama(String nama) {
        this.nama = nama;
    }
    void setDaya(double daya) {
        this.daya = daya;
    }

    void print() {
        System.out.print(getDeviceDetails() + " [" + nama + "] " + "(ID: " + id + ")" + " - Daya: " + daya + "W |");
    }
}

class SmartTV extends SmartDevice implements Connectable, Switchable {
    private int channel;
    private int volume;
    
    SmartTV(String id, String nama, double daya, int channel, int volume) {
        super(id, nama, daya);
        this.channel = channel;
        this.volume = volume;
    }

    @Override
    String getDeviceDetails() {
        return "Smart TV";
    }

    @Override
    void print() {
        super.print();
        System.out.println("Status: " + turnOn() + " | Koneksi: " + connect() + " | Channel: " + channel + " | Volume: " + volume);
    }


    @Override
    public String connect() {
        return "WIFI";
    }
    @Override
    public String disconnect() {
        return"Tidak terkoneksi";
    }
    @Override
    public String turnOn() {
        return "Menyala";
    }
    @Override
    public String turnOff() {
        return "Terkunci";
    }
}

class SmartSpeaker extends SmartDevice implements Connectable, Switchable {
    private int volume;

    SmartSpeaker(String id, String nama, double daya, int volume) {
        super(id, nama, daya);
        this.volume = volume;
    }

    @Override
    String getDeviceDetails() {
        return "Smart Speaker";
    }

    @Override
    void print() {
        super.print();
        System.out.println("Status: " + turnOn() + " | Koneksi: " + connect() + " | Volume: " + volume);
    }

    @Override
    public String connect() {
        return "BLUETOOTH";
    }
    @Override
    public String disconnect() {
        return "Tidak terkoneksi";
    }
    @Override
    public String turnOn() {
        return "Menyala";
    }
    @Override
    public String turnOff() {
        return "Terkunci";
    }
}

class SmartDoorLock extends SmartDevice implements Lockable {
    private String PIN;

    SmartDoorLock(String id, String nama, double daya, String PIN) {
        super(id, nama, daya);
        this.PIN = PIN;
    }

    @Override
    String getDeviceDetails() {
        return "Smart Door Lock";
    }

    @Override
    void print() {
        super.print();
        System.out.println("Status: " + lock() + " | PIN: " + PIN);
    }

    @Override
    public String lock() {
        return "Terkunci";
    }
    @Override
    public String unlock() {
        return "Terbuka";
    }
}

public class APP {
    public static void main(String[] args) {
        SmartDevice device1 = new SmartTV("TV-01", "TV Living Room", 120.0, 5, 20);
        SmartDevice device2 = new SmartSpeaker("SP-02", "Echo Studio", 30.0, 15);
        SmartDevice device3 = new SmartDoorLock("DL-03", "Pintu Utama", 150, "****");

        device1.print();
        Status stat1 = Status.PENDING;
        System.out.println(stat1);
        System.out.println();

        device2.print();
        Status stat2 = Status.SHIPPED;
        System.out.println(stat2);
        System.out.println();

        device3.print();
        Status stat3 = Status.CANCELLED;
        System.out.println(stat3);
        System.out.println();
    }
}