package 책임_분리;

// 흐름 제어 객체
public class FlowController {

    public void process() {
        // 데이터 읽기 객체 직접 생성
        FileDataReader reader = new FileDataReader();

        // 흐름제어: 1 읽기
        byte[] data = reader.read();

        Encryptor encryptor = new Encryptor();
        // 흐름제어: 2 암호화
        byte[] encryptedData = encryptor.encrypt(data);

        FileDataWriter writer = new FileDataWriter();
        // 흐름제어: 3 쓰기
        writer.write(encryptedData);
    }
}
