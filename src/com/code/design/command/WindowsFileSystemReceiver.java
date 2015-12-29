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
public class WindowsFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void writeFile() {
        System.out.println("Write windows file");
    }

    @Override
    public void readFile() {
        System.out.println("Read windows file");
    }

    @Override
    public void closeFile() {
        System.out.println("Close windows file");
    }
    
}
