package com.designpatterns.behavirol.command.filesystemexample;

public class FSInvoker {

    private FSCommand command;

    public FSInvoker(FSCommand command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
