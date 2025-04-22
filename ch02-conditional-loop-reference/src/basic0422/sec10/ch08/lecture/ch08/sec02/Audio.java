package basic0422.sec10.ch08.lecture.ch08.sec02;

public class Audio implements RemoteControl{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");

    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 껐다.");

    }

    @Override
    public void setVolume(int volume) {
        if (volume<MIN_VOLUME){ this.volume = MIN_VOLUME;

        } else if (volume>MAX_VOLUME) { this.volume = MAX_VOLUME;

        } else{System.out.println("현재 Audio 볼륨:" + volume);
        }}}
