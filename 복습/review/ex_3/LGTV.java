package review.ex_3;

public class LGTV implements TV{
    private boolean is_On;
    private int channel_number;
    private UniversalRemote remote;

    public LGTV() {
        is_On = false;
        channel_number = 1;
    }

    @Override
    public void set_remote(UniversalRemote remote) {
        this.remote = remote;
    }

    @Override
    public void streaming() {
        if (remote.get_fairing() && is_On)
            System.out.println("유튜브를 스트리밍합니다.");
    }

    @Override
    public void tvOn() {
        if (remote.get_fairing() && !is_On) {
            is_On = true;
            System.out.println("전원을 킵니다.");
        }
    }

    @Override
    public void tvOff() {
        if(remote.get_fairing() && is_On) {
            is_On = false;
            System.out.println("전원을 끕니다.");
        }
    }

    @Override
    public void changeChannel(int channel_number) {
        if(remote.get_fairing() && is_On){
            this.channel_number = channel_number;
            System.out.println(channel_number + "번 채널로 전환합니다.");
        }

    }

    @Override
    public void checkingChannel() {
        if(remote.get_fairing() && is_On){
            System.out.println("현재 채널은 " + channel_number + "번 입니다.");
        }
    }

    @Override
    public String returnName() {
        return "LG TV";
    }
}
