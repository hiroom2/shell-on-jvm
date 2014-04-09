/**
 * @file ShellValue.java
 * @author Hiroo MATSUMOTO <hiroom2.mail@gmail.com>
 */
package com.hiroom2.parser;

/**
 * Class of value which is integer or string.
 */
public class ShellValue {
  
  public static final int TYPE_NONE = 0;
  public static final int TYPE_INTEGER = 1;
  public static final int TYPE_STRING = 2;
  
  private String mValue;
  private int mType;
  
  public ShellValue() {
    this(null, TYPE_NONE);
  }
  
  public ShellValue(String value, int type) {
    mValue = value;
    mType = type;
  }
  
  public ShellValue(ShellValue v) {
    this(v.getValue(), v.getType());
  }
  
  public String getValue() {
    return mValue;
  }
  
  public void setValue(String value) {
    mValue = value;
  }
  
  public int getType() {
    return mType;
  }
  
  public void setType(int type) {
    mType = type;
  }
  
  public boolean isString() {
    return mType == TYPE_STRING;
  }
  
  public void add(ShellValue v) {
    if (isString() || v.isString()) {
      setValue(getValue() + v.getValue());
      return;
    }
    
    Integer left = Integer.valueOf(getValue());
    Integer right = Integer.valueOf(v.getValue());
    int result = left + right;
    setValue("" + result);
  }
  
  public void sub(ShellValue v) {
    if (isString() || v.isString()) {
      setValue(getValue() + "-" + v.getValue());
      return;
    }
    
    Integer left = Integer.valueOf(getValue());
    Integer right = Integer.valueOf(v.getValue());
    int result = left - right;
    setValue("" + result);
  }
  
  public void mul(ShellValue v) {
    if (isString() || v.isString()) {
      setValue(getValue() + "*" + v.getValue());
      return;
    }
    Integer left = Integer.valueOf(getValue());
    Integer right = Integer.valueOf(v.getValue());
    int result = left * right;
    setValue("" + result);
  }
  
  public void div(ShellValue v) {
    if (isString() || v.isString()) {
      setValue(getValue() + "/" + v.getValue());
      return;
    }
    Integer left = Integer.valueOf(getValue());
    Integer right = Integer.valueOf(v.getValue());
    int result = left / right;
    setValue("" + result);
  }
  
  public static ShellValue GE(ShellValue lv, ShellValue rv) {
    int li = Integer.valueOf(lv.getValue());
    int ri = Integer.valueOf(rv.getValue());
    if (li >= ri)
      return new ShellValue("1", TYPE_INTEGER);
    return new ShellValue("0", TYPE_INTEGER);
  }
  
  public static ShellValue GT(ShellValue lv, ShellValue rv) {
    int li = Integer.valueOf(lv.getValue());
    int ri = Integer.valueOf(rv.getValue());
    if (li > ri)
      return new ShellValue("1", TYPE_INTEGER);
    return new ShellValue("0", TYPE_INTEGER);
  }
  
  public static ShellValue LE(ShellValue lv, ShellValue rv) {
    int li = Integer.valueOf(lv.getValue());
    int ri = Integer.valueOf(rv.getValue());
    if (li <= ri)
      return new ShellValue("1", TYPE_INTEGER);
    return new ShellValue("0", TYPE_INTEGER);
  }
  
  public static ShellValue LT(ShellValue lv, ShellValue rv) {
    int li = Integer.valueOf(lv.getValue());
    int ri = Integer.valueOf(rv.getValue());
    if (li < ri)
      return new ShellValue("1", TYPE_INTEGER);
    return new ShellValue("0", TYPE_INTEGER);
  }
  
  public static ShellValue EQ(ShellValue lv, ShellValue rv) {
    if (lv.getValue().equals(rv.getValue()))
      return new ShellValue("1", TYPE_INTEGER);
    return new ShellValue("0", TYPE_INTEGER);
  }
  
  public static ShellValue NE(ShellValue lv, ShellValue rv) {
    if (!lv.getValue().equals(rv.getValue()))
      return new ShellValue("1", TYPE_INTEGER);
    return new ShellValue("0", TYPE_INTEGER);
  }
  
  @Override
  public String toString() {
    return "value = " + mValue + ", type = " + mType;
  }
  
}
