/**
 * @file ShellArgs.java
 * @author Hiroo MATSUMOTO <hiroom2.mail@gmail.com>
 */
package com.hiroom2.parser;

import java.util.ArrayList;
import java.util.List;

/**
 * Class of arguments for call expression.
 */
public class ShellArgs {
  
  public static final int DEFAULT_SIZE = 32;
  private final List<ShellValue> mArgs;
  
  public ShellArgs() {
    mArgs = new ArrayList<ShellValue>();
  }
  
  public void push(ShellValue value) {
    mArgs.add(value);
  }
  
  public ShellValue get(int idx) {
    return mArgs.get(idx);
  }
  
  public void clear() {
    mArgs.clear();
  }
  
}
