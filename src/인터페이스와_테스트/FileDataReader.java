package 인터페이스와_테스트;

// 파일 읽기
public class FileDataReader implements ByteSource {

    public byte[] read() {
        return "FileData".getBytes();
    }
}
