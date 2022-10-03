package com.designpatterns.behavirol.command.filesystemexample;

public class WriteFileCommand implements FSCommand{

    private FileSystemReceiver fileSystemReceiver;

    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.writeFile();
    }

}
