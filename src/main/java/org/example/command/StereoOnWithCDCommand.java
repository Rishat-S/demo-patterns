package org.example.command;

import org.example.device.Stereo;

public class StereoOnWithCDCommand implements Command {
    public static final int DEFAULT_VOLUME_LEVEL = 11;
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(DEFAULT_VOLUME_LEVEL);
    }

    @Override
    public void undo() {

    }
}
