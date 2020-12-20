package client.models;

public class Server {
    private String _hostName;
    private int _portNumber;

    public void setHostName(String hostName) {
        this._hostName = hostName;
    }

    public void setPortNumber(int portNumber) {
        this._portNumber = portNumber;
    }

    public String getHostName() { return this._hostName; }

    public int getPortNumber() { return this._portNumber; }
}
