package 추상타입_활용;

// 흐름 제어 객체
public class FlowController {

    private boolean useFile;

    public FlowController(boolean useFile) {
        this.useFile = useFile;
    }

    public void process() {
        byte[] data = null;
        if (useFile) {
            FileDataReader fileReader = new FileDataReader();
            data = fileReader.read();
        } else {
            SocketDataReader socketDataReader = new SocketDataReader();
            data = socketDataReader.read();
        }

        Encryptor encryptor = new Encryptor();
        byte[] encryptedData = encryptor.encrypt(data);

        FileDataWriter writer = new FileDataWriter();
        writer.write(encryptedData);
    }
}
