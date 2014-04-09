shell-on-jvm
============

Interpreter like shell on JVM


Copyright (C) 2014 Hiroo MATSUMOTO
See LICENSE file for license conditions.


This is interpreter on JVM. This interpreter uses JavaCC. This
languate grammer is like shell script. This interpreter is not for
business use, just for hobby one.

When reading below script file, 
======================================================================
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
======================================================================

below output will displayed.
<=====================================================================
init:  val = 0
inc10: val = 10
inc10: val = 20
dec10: val = 10
=====================================================================>

This interpreter cannot parse 'a=$b-1'. Please change 'a=$b-1' to
'a=$b - 1'.

For building this, run ant for generating JavaCC files with ant, then
build java files. When generating JavaCC files, javacc command is
needed and javacc.dir in ant.properties may be needed to be modified.

======================================================================
Buildfile: <path-to>/Shell/build.xml

properties:

default:
    [mkdir] Created dir: <path-to>/Shell/src/com/hiroom2/gen
   [jjtree] Java Compiler Compiler Version 5.0 (Tree Builder)
   [jjtree] (type "jjtree" with no arguments for help)
   [jjtree] Reading from file
    <path-to>/Shell/src/com/hiroom2/parser/Shell.jjt . . .
   [jjtree] File "Node.java" does not exist.  Will create one.
   [jjtree] File "SimpleNode.java" does not exist.  Will create one.
   [jjtree] File "ASTStart.java" does not exist.  Will create one.
   [jjtree] File "ASTStmts.java" does not exist.  Will create one.
   [jjtree] File "ASTFunc.java" does not exist.  Will create one.
   [jjtree] File "ASTBlock.java" does not exist.  Will create one.
   [jjtree] File "ASTStmt.java" does not exist.  Will create one.
   [jjtree] File "ASTIfStmt.java" does not exist.  Will create one.
   [jjtree] File "ASTWhileStmt.java" does not exist.  Will create one.
   [jjtree] File "ASTBreakStmt.java" does not exist.  Will create one.
   [jjtree] File "ASTReturnStmt.java" does not exist.  Will create
    one.
   [jjtree] File "ASTCond.java" does not exist.  Will create one.
   [jjtree] File "ASTComp.java" does not exist.  Will create one.
   [jjtree] File "ASTExpr.java" does not exist.  Will create one.
   [jjtree] File "ASTCall.java" does not exist.  Will create one.
   [jjtree] File "ASTBinOp.java" does not exist.  Will create one.
   [jjtree] File "ASTBinOpAssign.java" does not exist.  Will create
    one.
   [jjtree] File "ASTIdentifier.java" does not exist.  Will create
    one.
   [jjtree] File "ASTBinOpAdd.java" does not exist.  Will create one.
   [jjtree] File "ASTBinOpMul.java" does not exist.  Will create one.
   [jjtree] File "ASTValue.java" does not exist.  Will create one.
   [jjtree] File "ASTInteger.java" does not exist.  Will create one.
   [jjtree] File "ASTRefVar.java" does not exist.  Will create one.
   [jjtree] File "ASTRefArg.java" does not exist.  Will create one.
   [jjtree] File "ASTRefRet.java" does not exist.  Will create one.
   [jjtree] File "ASTString.java" does not exist.  Will create one.
   [jjtree] File "ParserTreeConstants.java" does not exist.  Will
    create one.
   [jjtree] File "ParserVisitor.java" does not exist.  Will create
    one.
   [jjtree] File "JJTParserState.java" does not exist.  Will create
    one.
   [jjtree] Annotated grammar generated successfully in
    <path-to>/Shell/src/com/hiroom2/gen/Shell.jj
   [javacc] Java Compiler Compiler Version 5.0 (Parser Generator)
   [javacc] (type "javacc" with no arguments for help)
   [javacc] Reading from file
    <path-to>/Shell/src/com/hiroom2/gen/Shell.jj . . .
   [javacc] Note: UNICODE_INPUT option is specified. Please make sure
    you create the parser/lexer using a Reader with the correct
    character encoding.
   [javacc] File "TokenMgrError.java" does not exist.  Will create
    one.
   [javacc] File "ParseException.java" does not exist.  Will create
    one.
   [javacc] File "Token.java" does not exist.  Will create one.
   [javacc] File "SimpleCharStream.java" does not exist.  Will create
    one.
   [javacc] Parser generated successfully.

BUILD SUCCESSFUL
Total time: 2 seconds
======================================================================
