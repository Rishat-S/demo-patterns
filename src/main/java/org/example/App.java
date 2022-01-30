package org.example;

import org.example.command.Command;
import org.example.command.GarageDoorOpenCommand;
import org.example.command.LightOnCommand;
import org.example.device.GarageDoor;
import org.example.device.Light;
import org.example.remote.SimpleRemoteControl;

public class App {
    public static void main(String[] args) {
        Command lightOnCommand = new LightOnCommand(new Light());
        Command garageDoorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();
        remoteControl.setCommand(garageDoorOpenCommand);
        remoteControl.buttonWasPressed();
    }
}
