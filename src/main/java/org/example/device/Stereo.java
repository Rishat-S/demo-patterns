package org.example.device;

public class Stereo {
    private int volume;

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCd() {
        System.out.println("Stereo set CD");
    }

    public void setDvd() {
        System.out.println("Stereo set DVD");
    }

    public void setRadio() {
        System.out.println("Stereo set Radio");
    }

    public void setVolumeUp() {
        System.out.println("Stereo set Volume: " + ++volume);
    }

    public void setVolumeDown() {
        System.out.println("Stereo set Volume: " + --volume);
    }
}
