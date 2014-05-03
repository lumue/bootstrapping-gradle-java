#bootstrapping a eclipse wtp project with gradle

##basic java bootstrap

###building
activating java plugin http://www.gradle.org/docs/current/userguide/java_plugin.html
create src/test/main source folder
add a class
use some java 8 feature (date&time api, Clock) -> error
set jdk version
gradle run

###testing
refactor to extract TimeRenderer
create src/test/java source folder
add TimeRendererTest
add testCompile dependency (and maven repo)
run test


###running
java -jar build/libs/gradle-eclipse-bootstrap.jar -> error
add manifest attribute main-class

###distributing
activate application plugin http://www.gradle.org/docs/current/userguide/application_plugin.html
set version property

##setup eclipse project
need eclipse gradle tools

###generate eclipse project files


 





