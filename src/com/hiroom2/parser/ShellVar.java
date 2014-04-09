/**
 * @file ShellVar.java
 * @author Hiroo MATSUMOTO <hiroom2.mail@gmail.com>
 */
package com.hiroom2.parser;

/**
 * Class of variable declaration.
 */
public class ShellVar {
  
  private String mName;
  private ShellValue mValue;
  
  public ShellVar(String name, ShellValue shellValue) {
    set(name, shellValue);
  }
  
  public void set(String name, ShellValue shellValue) {
    setName(name);
    setValue(shellValue);
  }
  
  public void setName(String name) {
    mName = name;
  }
  
  public void setValue(ShellValue shellValue) {
    mValue = shellValue;
  }
  
  public String getName() {
    return mName;
  }
  
  public ShellValue getValue() {
    return mValue;
  }
  
  public void dump() {
    System.out.println(mName + " = (" + mValue.toString() + ")");
  }
  
}
