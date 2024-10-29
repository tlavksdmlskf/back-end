package review.ex_3;

public class UniversalRemote {
    private boolean is_fairing;
    private TV tv;
    public boolean get_fairing() {
        return is_fairing;
    }

    public UniversalRemote() {
        this.is_fairing = false;
        this.tv = new defautTV();
    }

    public void pairing(TV tv){
        if (!(tv instanceof defautTV))
            System.out.println(this.tv.returnName() + "와 페어링 해제되었습니다");

        this.tv = tv;
        is_fairing = true;
        tv.set_remote(this);
        System.out.println(tv.returnName() + "와 페어링 되었습니다.");

    }
    public void tv_on(){
        if (is_fairing && tv.getpower){

        }
    }

}
