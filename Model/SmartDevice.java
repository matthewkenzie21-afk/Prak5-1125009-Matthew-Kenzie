package Model;

public abstract class SmartDevice {
    
    private String id;
    private String nama;
    private double daya;
    private String status;

    public SmartDevice(String id, String nama, double daya, String status) {
        this.id = id;
        this.nama = nama;
        this.daya = daya;
        this.status = status;
    }

    public abstract String getDeviceDetails();

    public void setId(String id) {
        this.id = id;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setDaya(double daya) {
        this.daya = daya;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public double getdaya() {
        return getdaya();
    }
    public String getStatus() {
        return status;
    }

    public void print() {
        System.out.print(getDeviceDetails() + "[" + nama + "] (ID : " + id + ") - Daya - " + daya + " | Status : " + status + " | ");
    }

}
