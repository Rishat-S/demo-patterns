package org.example.remote;

import org.example.command.Command;
import org.example.command.NoCommand;

public class RemoteControl {
    public static final int BUTTONS_COUNT = Buttons.values().length;
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[BUTTONS_COUNT];
        offCommands = new Command[BUTTONS_COUNT];
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < BUTTONS_COUNT; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(Buttons slot, Command onCommand, Command offCommand) {
        onCommands[slot.getValue()] = onCommand;
        offCommands[slot.getValue()] = offCommand;
    }

    public void onButtonWasPushed(Buttons slot) {
        onCommands[slot.getValue()].execute();
        undoCommand = onCommands[slot.getValue()];
    }

    public void offButtonWasPushed(Buttons slot) {
        offCommands[slot.getValue()].execute();
        undoCommand = offCommands[slot.getValue()];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
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
        stringBuilder
                .append("undo slot: ")
                .append(undoCommand.getClass().getName());
        return stringBuilder.toString();
    }
}
