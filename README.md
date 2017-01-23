# Webservices using Springboot

###Download code:
 * cmd> git clone https://github.com/ravikalla/springboot-rest-webservice.git
 * cmd> mvn clean install
 * cmd> cd target

###Run application in local:
cmd> java -jar springboot-rest-webservice-0.1.0.jar --server.port=8088

#####Rest Webservice URLs:
Hit below URLs in browser to view the results:
<br/>
 * http://localhost:8088/sayHello?name=Ravi
 * http://localhost:8088/sayhi
 
###Run application in PCF:
 * Create a free account in PCF - https://run.pivotal.io
 * Add a Space in PCF WebServices window - https://console.run.pivotal.io (I created "webservice-space")
 * cmd> cf login -a https://console.run.pivotal.io
 * cmd> cf target -s <b><i>webservice-space</i></b>
 * cmd> cf push <b><i>springboot-rest-webservice</i></b> -p <b><i>target/springboot-rest-webservice-0.1.0.jar</i></b>
<br/>

####Rest Webservice URLs:
 * https://springboot-rest-webservice.cfapps.io/sayhi
 * https://springboot-rest-webservice.cfapps.io/sayHello?name=Ravi

###Reference
 * Spring Webservices - https://spring.io/guides/gs/actuator-service/
 * Pivotal - http://pivotal.io/platform/pcf-tutorials/getting-started-with-pivotal-cloud-foundry/introduction
