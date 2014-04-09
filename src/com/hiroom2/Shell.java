/**
 * @file Shell.java
 * @author Hiroo MATSUMOTO <hiroom2.mail@gmail.com>
 */
package com.hiroom2;

import java.io.File;
import java.io.FileInputStream;

import com.hiroom2.gen.ASTStart;
import com.hiroom2.gen.Parser;
import com.hiroom2.parser.ShellVisitor;

public class Shell {
  
  public static void main(String[] args) {
    try {
      File file = new File("Shell.txt");
      Parser parser = new Parser(new FileInputStream(file));
      ShellVisitor visitor = new ShellVisitor();
      ASTStart tree = parser.Start();
      tree.jjtAccept(visitor, null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
}