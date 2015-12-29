/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.design.command;

/**
 *
 * @author yunpliu
 */
public class FileSystemReceiverUtil {
    
    /**
     * 
     * @return 
     */
    public FileSystemReceiver getFileSystemReceiver() {
        String osName = System.getProperty("os.name");
        System.out.println("Current OS:" + osName);
        if (osName.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        } 
        return new LinuxFileSystemReceiver();
    }
}
