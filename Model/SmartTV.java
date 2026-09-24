package Model;

public class SmartTV extends SmartDevice implements Connectable, Switchable {
    private int channel;
    private int volume;
    private ConnectionType connectionType;

    public SmartTV(String id, String nama, double daya, String status, int channel, int volume, ConnectionType connectionType) {
        super(id, nama, daya, status);
        this.channel = channel;
        this.volume = volume;
        this.connectionType = connectionType;
    }

    @Override 
    public String getDeviceDetails() {
        return "Smart TV";
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

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void print() {
        System.out.print("Koneksi : " + connectionType + " | Channel : " + channel + " | Volume : " + volume);
    }
}