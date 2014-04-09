/**
 * @file ShellFuncs.java
 * @author Hiroo MATSUMOTO <hiroom2.mail@gmail.com>
 */
package com.hiroom2.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Class of list of function declaration.
 */
public class ShellFuncs {
  
  private final List<ShellFunc> mFuncs;
  
  public ShellFuncs() {
    mFuncs = new ArrayList<ShellFunc>();
  }
  
  public ShellFunc get(String name) {
    for (Iterator<ShellFunc> it = mFuncs.iterator(); it.hasNext();) {
      ShellFunc shellFunc = it.next();
      if (shellFunc.getName().equals(name))
        return shellFunc;
    }
    return null;
  }
  
  public void set(ShellFunc shellFunc) {
    mFuncs.add(shellFunc);
  }
  
}
