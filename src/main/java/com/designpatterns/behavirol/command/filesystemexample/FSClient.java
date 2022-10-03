package com.designpatterns.behavirol.command.filesystemexample;

import java.util.Scanner;

public class FSClient {
    public static void main(String[] args) {
        System.out.println("Enter os name : Windows or Unix");
        Scanner sc = new Scanner(System.in);
        String osName = sc.next();
        FileSystemReceiver receiver = null;
        if("Windows".equalsIgnoreCase(osName)) {
            receiver = new WindowsFileSystemReceiver();
        } else if ("Unix".equalsIgnoreCase(osName)) {
            receiver = new UnixFileSystemReceiver();
        } else {
            throw new RuntimeException("Invalid OS name : " + osName);
        }

        OpenFileCommand openFileCommand = new OpenFileCommand(receiver);
        FSInvoker invoker = new FSInvoker(openFileCommand);
        invoker.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(receiver);
        invoker = new FSInvoker(writeFileCommand);
        invoker.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(receiver);
        invoker = new FSInvoker(closeFileCommand);
        invoker.execute();
    }
}
