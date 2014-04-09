/**
 * @file ShellCmds.java
 * @author Hiroo MATSUMOTO <hiroom2.mail@gmail.com>
 */
package com.hiroom2.cmd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Class of list for built-in commands.
 */
public class ShellCmds {
  
  private final List<ShellCmd> mCmd;
  
  public ShellCmds() {
    mCmd = new ArrayList<ShellCmd>();
    mCmd.add(new ShellCmdEcho());
  }
  
  public ShellCmd get(String name, int count) {
    for (Iterator<ShellCmd> it = mCmd.iterator(); it.hasNext();) {
      ShellCmd cmd = it.next();
      if (name.equals(cmd.getArgv())
          && (cmd.getArgc() == ShellCmd.VARIABLE_ARGC || cmd.getArgc() == count))
        return cmd;
    }
    return null;
  }
  
  public ShellCmd get(int idx) {
    return mCmd.get(idx);
  }
  
  public int size() {
    return mCmd.size();
  }
  
}
