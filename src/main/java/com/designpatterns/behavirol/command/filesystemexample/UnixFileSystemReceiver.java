package com.designpatterns.behavirol.command.filesystemexample;


public class UnixFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Opening File in Unix OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing File in Unix OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing File in Unix OS");
    }
}
