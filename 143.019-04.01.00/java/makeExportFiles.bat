@echo off
REM
REM Batch file to generate export file for 0319 API
REM Version for Microsoft NT plateform  (Windows NT4/2000)
REM written by yannick.burianne@slb.com
REM 
REM Set the environment variable JDK122IN & JC21LIB to the directory where you 
REM installed your Java development tools and JavaCard development Kit
REM

if not "%OS%" == "Windows_NT" echo Sorry this batch file runs only on Windows NT4/2000 & goto END

REM for compilation & convertion purpose
IF "%JDK122BIN%" == "" SET JDK122BIN=C:\jdk1.2.2\bin
IF "%JC21LIB%" == "" SET JC21LIB=D:\java_card_kit-2_1_2\lib

echo Run Sun Compiler for TOOLKIT package 
%JDK122BIN%\javac -g -classpath %JC21LIB%\api21.jar sim\toolkit\*.java 

echo Run Sun Compiler for ACCESS package  
%JDK122BIN%\javac -g -classpath %JC21LIB%\api21.jar sim\access\*.java 

echo.
echo Run Sun JavaCard Converter for TOOLKIT package   
%JDK122BIN%\java -jar %JC21LIB%\converter.jar -config sim\toolkit\toolkit.opt 

echo.
echo Run Sun JavaCard Converter for ACCESS package 
%JDK122BIN%\java -jar %JC21LIB%\converter.jar -config sim\access\access.opt 

:END
PAUSE