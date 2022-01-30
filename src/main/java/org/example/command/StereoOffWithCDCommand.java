package org.example.command;

import org.example.device.Stereo;

public class StereoOffWithCDCommand implements Command{
    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
