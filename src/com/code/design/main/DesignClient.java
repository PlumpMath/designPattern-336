/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.design.main;

import com.code.design.command.Command;
import com.code.design.command.FileInvoker;
import com.code.design.command.FileSystemReceiver;
import com.code.design.command.FileSystemReceiverUtil;
import com.code.design.command.ReadFileCommand;

/**
 *
 * @author yunpliu
 */
public class DesignClient {
    
    public static void main(String[] args) {
        testCommandPattern();
    }

    
    /**
     * Command pattern: use unified interface to accept command as parameter to execute different logic
     */
    private static void testCommandPattern() {
        // test command pattern
        FileSystemReceiverUtil receiverUtil = new FileSystemReceiverUtil();
        FileSystemReceiver receiver = receiverUtil.getFileSystemReceiver();
        Command command = new ReadFileCommand(receiver);
        FileInvoker invoker = new FileInvoker(command);
        invoker.execute();
    }
}
