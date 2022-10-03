package com.designpatterns.behavirol.command.filesystemexample;

public class WindowsFileSystemReceiver implements FileSystemReceiver{

    @Override
    public void openFile() {
        System.out.println("Opening File in Windows OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing File in Windows OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing File in Windows OS");
    }
}
