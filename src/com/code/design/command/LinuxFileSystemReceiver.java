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
public class LinuxFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void writeFile() {
        System.out.println("Write Linux file");
    }

    @Override
    public void readFile() {
        System.out.println("Read Linux file");
    }

    @Override
    public void closeFile() {
        System.out.println("Close Linux file");
    }
    
}
