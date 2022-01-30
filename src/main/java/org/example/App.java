package org.example;

import org.example.command.Command;
import org.example.command.LightOnCommand;
import org.example.device.Light;
import org.example.remote.SimpleRemoteControl;

public class App {
    public static void main(String[] args) {
        Command command = new LightOnCommand(new Light());
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        remoteControl.setCommand(command);
        remoteControl.buttonWasPressed();
    }
}
