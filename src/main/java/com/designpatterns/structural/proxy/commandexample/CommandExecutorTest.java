package com.designpatterns.structural.proxy.commandexample;

public class CommandExecutorTest {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Prathyu", "dcvjdhb");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand("rm -rf abc.pdf");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
