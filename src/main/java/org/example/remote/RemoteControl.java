package org.example.remote;

import org.example.command.Command;
import org.example.command.NoCommand;

public class RemoteControl {
    public static final int BUTTONS_COUNT = Buttons.values().length;
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[BUTTONS_COUNT];
        offCommands = new Command[BUTTONS_COUNT];
        for (int i = 0; i < BUTTONS_COUNT; i++) {
            NoCommand noCommand = new NoCommand();
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(Buttons slot, Command onCommand, Command offCommand) {
        onCommands[slot.getValue()] = onCommand;
        offCommands[slot.getValue()] = offCommand;
    }

    public void onButtonWasPushed(Buttons slot) {
        onCommands[slot.getValue()].execute();
    }

    public void offButtonWasPushed(Buttons slot) {
        offCommands[slot.getValue()].execute();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n-------Remote Control-----------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[slot ")
                    .append(i).append("] ")
                    .append(onCommands[i].getClass().getName())
                    .append("  ")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }
        return stringBuilder.toString();
    }
}
