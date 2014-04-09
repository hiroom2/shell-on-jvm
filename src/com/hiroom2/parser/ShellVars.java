/**
 * @file ShellVar.java
 * @author Hiroo MATSUMOTO <hiroom2.mail@gmail.com>
 */
package com.hiroom2.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Class of list for variable declaration.
 */
public class ShellVars {
  
  private final List<ShellVar> mVar;
  
  public ShellVars() {
    mVar = new ArrayList<ShellVar>();
  }
  
  public ShellVar get(String name) {
    for (Iterator<ShellVar> it = mVar.iterator(); it.hasNext();) {
      ShellVar id = it.next();
      if (id.getName().equals(name))
        return id;
    }
    return null;
  }
  
  public void set(String name, ShellValue shellValue) {
    for (Iterator<ShellVar> it = mVar.iterator(); it.hasNext();) {
      ShellVar id = it.next();
      if (id.getName().equals(name)) {
        id.setValue(shellValue);
        return;
      }
    }
    mVar.add(new ShellVar(name, shellValue));
  }
  
  public void dump() {
    for (Iterator<ShellVar> it = mVar.iterator(); it.hasNext();)
      it.next().dump();
  }
  
}
