/**
 * @file ShellFunc.java
 * @author Hiroo MATSUMOTO <hiroom2.mail@gmail.com>
 */
package com.hiroom2.parser;

import com.hiroom2.gen.ASTBlock;

/**
 * Class of function declaration.
 */
public class ShellFunc {
  
  private final String mName;
  private final ASTBlock mBlock;
  
  public ShellFunc(String name, ASTBlock block) {
    mName = name;
    mBlock = block;
  }
  
  public String getName() {
    return mName;
  }
  
  public ASTBlock getBlock() {
    return mBlock;
  }
  
}
