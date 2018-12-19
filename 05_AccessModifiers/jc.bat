@echo off
IF "%1" == "" GOTO Error

"C:\Program Files\Java\jdk1.8.0_191\bin\javac" %1
GOTO Finish

:Error
ECHO Params required but not set. Example: [jc.bat *.java]
:Finish


