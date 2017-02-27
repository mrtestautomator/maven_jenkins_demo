set projectLocation=F:\Ranjith_Testing\WorkSpace\Frameworks
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\Parameter.xml
pause