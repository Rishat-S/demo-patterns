package org.example;

import org.example.command.*;
import org.example.device.Light;
import org.example.device.Stereo;
import org.example.remote.Buttons;
import org.example.remote.RemoteControl;

public class App {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        Stereo stereo = new Stereo();
        Command stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        Command stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);

        remoteControl.setCommand(Buttons.FIRST, lightOnCommand, lightOffCommand);
        remoteControl.onButtonWasPushed(Buttons.FIRST);
        remoteControl.offButtonWasPushed(Buttons.FIRST);

        remoteControl.setCommand(Buttons.SECOND, stereoOnWithCDCommand, stereoOffWithCDCommand);
        remoteControl.onButtonWasPushed(Buttons.SECOND);
        remoteControl.offButtonWasPushed(Buttons.SECOND);

        System.out.println(remoteControl);
    }
}
