REM Batch file to generate the HTML files for 0319 API

REM Title of the API
SET TITLE="GSM 03.19 v8.2.0 Annex A: Java Card SIM API" 

REM Location of the Java Card 2.1 API
SET JC21API=D:\java_card_kit-2_1_2\lib\api21.jar

REM Generation
JAVADOC -windowtitle %TITLE% -doctitle %TITLE% -use -version -nohelp -bootclasspath %JC21API% -d ..\Annex_A_HTML sim.access sim.toolkit

