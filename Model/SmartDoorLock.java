package Model;

public class SmartDoorLock extends SmartDevice implements Lockable {
    private String pin;

    public SmartDoorLock(String id, String nama, double daya, String status, String pin) {
        super(id, nama, daya, status);
        this.pin = pin;
    }

    @Override
    public String getDeviceDetails() {
        return "Smart Door Lock";
    }

    @Override
    public void lock() {
        setStatus("Terkunci");
    }

    @Override
    public void unlock() {
        setStatus("Terbuka");
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
    
    public String getPin() {
        return pin;
    }

    public void print() {
        super.print();
        System.out.println("PIN: ****");
    }
}