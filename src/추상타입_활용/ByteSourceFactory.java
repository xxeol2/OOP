package 추상타입_활용;

// ByteSource 타입의 객체를 생성하는 과정을 추상화
public class ByteSourceFactory {

    // 객체 생성 기능을 위한 오퍼레이션 정의
    public ByteSource create() {
        if (useFile())
            return new FileDataReader();
        else
            return new SocketDataReader();
    }

    private boolean useFile() {
        String useFileVal = System.getProperty("useFile");
        return useFileVal != null && Boolean.valueOf(useFileVal);
    }

    // 싱글톤 패턴 적용
    private static ByteSourceFactory instance = new ByteSourceFactory();
    public static ByteSourceFactory getInstance() {
        return instance;
    }

    private ByteSourceFactory() {}
}
