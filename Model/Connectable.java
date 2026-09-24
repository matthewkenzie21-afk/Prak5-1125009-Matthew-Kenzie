package Model;

public interface Connectable {
    void connect(ConnectionType type);
    void disconnect();
}