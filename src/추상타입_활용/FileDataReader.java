package 추상타입_활용;

// 파일 읽기
public class FileDataReader implements ByteSource{

    public byte[] read() {
        return "FileData".getBytes();
    }
}
