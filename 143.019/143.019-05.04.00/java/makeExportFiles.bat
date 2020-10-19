@echo off
REM
REM Batch file to generate export file for 0319 API
REM Version for Microsoft NT plateform  (Windows NT4/2000)
REM written by yannick.burianne@slb.com
REM 
REM Set the environment variable JDK122IN & JC21LIB to the directory where you 
REM installed your Java development tools and JavaCard development Kit
REM

REM for compilation & convertion purpose
IF "%JC21%" == "" SET JC21=C:\Java\jc211

echo Run Sun Compiler for TOOLKIT package 
javac  -g -classpath C:\Java\Javacard\ETSI_SMG9\43019-500\Annex_A_Java;%JC21%\lib\api21.jar sim\toolkit\*.java 

echo Run Sun Compiler for ACCESS package  
javac  -g -classpath C:\Java\Javacard\ETSI_SMG9\43019-500\Annex_A_Java;%JC21%\lib\api21.jar sim\access\*.java 

echo.
REM echo Run Sun JavaCard Converter for TOOLKIT package   
REM java -jar %JC21LIB%\converter.jar -config sim\toolkit\toolkit.opt 

echo.
REM echo Run Sun JavaCard Converter for ACCESS package 
REM %JDK122BIN%\java -jar %JC21LIB%\converter.jar -config sim\access\access.opt 

:END
PAUSE