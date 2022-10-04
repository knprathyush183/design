package com.designpatterns.structural.proxy.commandexample;

public class CommandExecutorImpl implements CommandExecutor{

    @Override
    public void runCommand(String cmd) throws Exception {
        System.out.println("'" + cmd + "' command executed");
    }
}
