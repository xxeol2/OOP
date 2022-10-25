package 인터페이스와_테스트;

// 흐름 제어 객체
public class FlowController {

    private ByteSource byteSource;

    public FlowController(ByteSource byteSource) {
        this.byteSource = byteSource;
    }

    public void process() {
        byte[] data = byteSource.read();

        // ...
    }

    public void testProcess() {
        ByteSource mockSource = new MockByteSource();
        FlowController fc = new FlowController(mockSource);
        fc.process();

        // 결과가 정상적으로 만들어졌는지 확인하는 코드
    }

    // 보통 Mock객체를 위한 클래스를 별도로 만들기보다는 Mockito나 jmock과 같은 프레임워크를 이용해 Mock 객체 생성함
    class MockByteSource implements ByteSource {
        public byte[] read() {
            byte[] data = new byte[128];
            // data를 테스트 목적의 데이터로 초기화
            return data;
        }
    }
}
