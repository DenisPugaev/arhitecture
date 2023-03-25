package ru.gb.hm5.command;

public interface Command {
    void execute();
    void redo();
    void undo();
}
