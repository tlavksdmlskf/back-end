package review.remoteContral;

public class Main {
    public static void main(String[] args) {
        TV samsungTV = new SamsungTV();
        TV lgTV = new LGTV();
        UniversalRemote remote = new UniversalRemote();

// 삼성 TV와 페어링
        remote.pairWith(samsungTV);
        remote.setPower(true); // 전원 켜기
        remote.setChannel(5); // 5번 채널 변경
        remote.watchStreaming();
        remote.setPower(false);

        System.out.println("================================");

// LG TV와 페어링
        remote.pairWith(lgTV);
        remote.setPower(true); // 전원 켜기
        remote.setChannel(5); // 5번 채널 변경
        remote.watchStreaming();
        remote.setPower(false);
    }
}
