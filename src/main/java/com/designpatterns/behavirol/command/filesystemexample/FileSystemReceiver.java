package com.designpatterns.behavirol.command.filesystemexample;

public interface FileSystemReceiver {
    void openFile();

    void writeFile();

    void closeFile();
}
