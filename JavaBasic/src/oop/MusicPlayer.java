package oop;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("music player start!");
    }

    void off(){
        isOn = false;
        System.out.println("music player off.");
    }

    void volumeUp() {
        volume ++;
        System.out.println("music volume : " + volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("music volume : " + volume);
    }

    void showStatus(){
        System.out.println("music player status");
        if (isOn){
            System.out.println("player is on, volume : "+volume);
        } else {
            System.out.println("player is off, volume : " + volume);
        }
    }
}
