package review.ex_3;

public class SamsungTV implements TV{
    private boolean power;
    private int channel_number;
    private UniversalRemote remote;

    public SamsungTV() {
        power = false;
        channel_number = 1;
    }

    @Override
    public void streaming() {
        if (remote.get_fairing())
            System.out.println("넷플릭스를 스트리밍합니다.");
    }
    
    @Override
    public void changeChannel(int channel_number) {
        if(remote.get_fairing() && power){
            this.channel_number = channel_number;
            System.out.println(channel_number + "번 채널로 전환합니다.");
        }

    }

    @Override
    public void checkingChannel() {
        if(remote.get_fairing() && power){
            System.out.println("현재 채널은 " + channel_number + "번 입니다.");
        }
    }

    @Override
    public String returnName() {
        return "This TV name is Samsung TV";
    }


}
