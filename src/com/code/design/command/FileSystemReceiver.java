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
public interface FileSystemReceiver {
    public void writeFile();
    public void readFile();
    public void closeFile();
}
