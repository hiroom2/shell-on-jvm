shell-on-jvm
============

Interpreter like shell on JVM


Copyright (C) 2014 Hiroo MATSUMOTO
See LICENSE file for license conditions.


This is interpreter on JVM. This interpreter uses JavaCC. This
languate grammer is like shell script. This interpreter is not for
business use, just for hobby one.


Script file 
===========

val = 0
echo "init:  val = " $val

inc10()
{
  ret = $1
  i = 0
  while [ $i < 10 ]
  do
    ret = $ret + 1
    i = $i + 1
  done
  return $ret
}

dec10()
{
  ret = $1
  i = 0
  while [ $i < 10 ]
  do
    ret = $ret - 1
    i = $i + 1
  done
  return $ret
}

inc10 $val
val = $?
echo "inc10: val = " $val

inc10 $val
val = $?
echo "inc10: val = " $val

dec10 $val
val = $?
echo "dec10: val = " $val


Output
======

init:  val = 0
inc10: val = 10
inc10: val = 20
dec10: val = 10


Limitation
==========

This interpreter cannot parse 'a=$b-1'. Please change 'a=$b-1' to
'a=$b - 1'.


Build
=====

For building this, run ant for generating JavaCC files with ant, then
build java files. When generating JavaCC files, javacc command is
needed and javacc.dir in ant.properties may be needed to be modified.
