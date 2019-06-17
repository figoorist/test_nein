Browser: Chrome

Maven

TestNG

Parameters and running - testng.xml

Page object pattern is represented with Steps -> Pages hierarchy


Windows:
For chromedriver.exe in project root Chrome ver. 74 is requirement


Surefire reporting plugin can also generate the report using its standalone goal:
mvn surefire-report:report
(https://maven.apache.org/surefire/maven-surefire-report-plugin/usage.html)


Thanks for your comment. I think i've fixed them all. There have been facades, cause i thought it's better for project maintaining in future
