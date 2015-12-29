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
public class FileInvoker {
    private static Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }
    
    public void execute() {
        command.execute();
    }
}
