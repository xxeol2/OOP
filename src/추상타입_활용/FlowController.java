package 추상타입_활용;

// 흐름 제어 객체
public class FlowController {

    public void process() {
        ByteSource source = ByteSourceFactory.getInstance().create();
        byte[] data = source.read();

        Encryptor encryptor = new Encryptor();
        byte[] encryptedData = encryptor.encrypt(data);

        FileDataWriter writer = new FileDataWriter();
        writer.write(encryptedData);
    }
}
