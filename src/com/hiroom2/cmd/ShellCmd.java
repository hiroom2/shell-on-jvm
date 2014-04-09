/**
 * @file ShellCmd.java
 * @author Hiroo MATSUMOTO <hiroom2.mail@gmail.com>
 */
package com.hiroom2.cmd;

import com.hiroom2.parser.ShellValue;

/**
 * Class of shell built-in command.
 */
public abstract class ShellCmd {
  
  public static final int VARIABLE_ARGC = -1;
  
  /**
   * Return string of command name used in script file.
   * 
   * @return Command name
   */
  public abstract String getArgv();
  
  /**
   * Return arguments number. If command support variable arguments, return
   * VARIABLE_ARGC.
   * 
   * @return Arguments number
   */
  public abstract int getArgc();
  
  /**
   * Run command.
   * 
   * @param value
   *          Arguments of command
   * @return Command status
   */
  public abstract int run(ShellValue... value);
  
}
