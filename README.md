# LoadTest Microservice
This is a microservice, utilizing Wildfly Swarm and the Java Microprofile.   

####Runtime Instructions
TODO FINISH!!
This application exposes a RESTful endpoint
 
####Compile, Build, and Deployment Instructions
#####Compile and Execute
```bash
mvn wildfly-swarm:run
```
#####Create "fat" executable uberjar
```bash
mvn package
```
#####Run executable uberjar
```bash
java -jar myapp-swarm.jar
```

#####Create hollow uberjar
Use this to decouple the wildfly container executable jar from the resulting war file.  This can allow layered containerization
```
mvn package -Dswarm.hollow=true
```
Alternatively, sonfigure the wildfly swarm plugin with `<hollow>true</hollow>` within the `pom.xml`

#####Run hollow uberjar and war
```bash
java -jar myruntime-hollowjar.jar myapp.war
```
   