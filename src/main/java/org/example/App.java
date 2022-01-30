package org.example;

import org.example.device.Light;
import org.example.device.Stereo;
import org.example.remote.Buttons;
import org.example.remote.RemoteControl;

public class App {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();

        remoteControl.setCommand(Buttons.FIRST, light::on, light::off);
        remoteControl.onButtonWasPushed(Buttons.FIRST);

        remoteControl.setCommand(Buttons.SECOND, stereo::on, stereo::off);
        remoteControl.setCommand(Buttons.THIRD, stereo::setCd, stereo::setDvd);
        remoteControl.setCommand(Buttons.FOURTH, stereo::setVolumeUp, stereo::setVolumeDown);
        remoteControl.onButtonWasPushed(Buttons.SECOND);
        remoteControl.onButtonWasPushed(Buttons.THIRD);
        remoteControl.onButtonWasPushed(Buttons.FOURTH);
        remoteControl.onButtonWasPushed(Buttons.FOURTH);
        remoteControl.onButtonWasPushed(Buttons.FOURTH);
        remoteControl.onButtonWasPushed(Buttons.FOURTH);
        remoteControl.onButtonWasPushed(Buttons.FOURTH);
        remoteControl.offButtonWasPushed(Buttons.FOURTH);

        remoteControl.offButtonWasPushed(Buttons.SECOND);
        remoteControl.offButtonWasPushed(Buttons.FIRST);

        System.out.println(remoteControl);
    }
}
