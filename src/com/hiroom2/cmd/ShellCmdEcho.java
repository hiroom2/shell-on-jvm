/**
 * @file ShellCmdEcho.java
 * @author Hiroo MATSUMOTO <hiroom2.mail@gmail.com>
 */
package com.hiroom2.cmd;

import com.hiroom2.parser.ShellValue;

/**
 * Class of echo command.
 */
public class ShellCmdEcho extends ShellCmd {
  
  @Override
  public String getArgv() {
    return "echo";
  }
  
  @Override
  public int getArgc() {
    return VARIABLE_ARGC;
  }
  
  @Override
  public int run(ShellValue... value) {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < value.length; ++i)
      sb.append(value[i].getValue());
    System.out.println(sb.toString());
    return 0;
  }
  
}
