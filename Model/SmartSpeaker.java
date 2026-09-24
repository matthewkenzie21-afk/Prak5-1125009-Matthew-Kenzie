package Model;

public class SmartSpeaker extends SmartDevice implements Connectable, Switchable {

    private int volume;
    private ConnectionType connectionType;

    public SmartSpeaker(String id, String nama, double daya, String status, int volume, ConnectionType connectionType) {
        super(id, nama, daya, status);
        this.volume = volume;
        this.connectionType = connectionType;
    }

    @Override
    public void turnOn() {
       setStatus("Menyala");
    }

    @Override
    public void turnOff() {
      setStatus("Mati");
    }

    @Override
    public void connect(ConnectionType type) {
       connectionType = type;
    }

    @Override
    public void disconnect() {
        connectionType = ConnectionType.NONE;
    }

    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    @Override
    public String getDeviceDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDeviceDetails'");
    }

    public void print() {
        System.out.print("Koneksi : " + connectionType + " | Volume : " + volume);
    }
    
}