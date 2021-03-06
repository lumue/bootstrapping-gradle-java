#bootstrapping eclipse wtp project with gradle

##basic java bootstrap

###building
activating java plugin http://www.gradle.org/docs/current/userguide/java_plugin.html
create src/test/main source folder
add a class
use some java 8 feature (date&time api, Clock) -> error
set jdk version
`gradle run`

###testing
refactor to extract TimeRenderer
create src/test/java source folder
add TimeRendererTest
add testCompile dependency (and maven repo)
run test


###running
`java -jar build/libs/gradle-eclipse-bootstrap.jar` -> error
add manifest attribute main-class

###distributing
activate application plugin http://www.gradle.org/docs/current/userguide/application_plugin.html
set version property
set project name in settings.gradle:
`rootProject.name = 'bootstrapping-gradle-java'`

##setup eclipse project
need eclipse gradle tools

###generate eclipse project files
apply eclipse plugin
run eclipse task 
add generated files to .gitignore
```
/.settings/
/.classpath
/.project
```

###tweak generated files
add gradle project nature to .project file generation
```
eclipse.project {
  natures 'org.springsource.ide.eclipse.gradle.core.nature'
}
```
add gradle specific classpath entries
```
eclipseClasspath {
	containers "com.springsource.sts.gradle.classpathcontainer"
}
```