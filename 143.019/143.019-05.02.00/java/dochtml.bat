REM Batch file to generate the HTML files for 0319 API

REM Title of the API
SET TITLE="GSM 43.019 v5.2.0 Annex A: Java Card SIM API" 

REM Location of the Java Card 2.1 API
SET JC21API=C:\java\javacard\jc211\api21

REM Generation
JAVADOC -classpath C:\java\javacard\ETSI_SMG9\43019-520\Annex_A_java;%JC21API% -windowtitle %TITLE% -doctitle %TITLE% -use -version -nohelp -d ..\Annex_A_HTML sim.access sim.toolkit

