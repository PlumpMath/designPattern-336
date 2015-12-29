/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.design.command;

/**
 *
 * @author Hall Liu
 */
public class CloseFileCommand implements Command {

    private final FileSystemReceiver receiver;

    public CloseFileCommand(FileSystemReceiver receiver) {
        this.receiver = receiver;
    }
    
    @Override
    public void execute() {
        receiver.closeFile();
    }
    
}
