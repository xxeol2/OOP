package 추상타입_활용;

public class SocketDataReader implements ByteSource{

    public byte[] read() {
        return "SocketData".getBytes();
    }
}
