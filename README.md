[![Codacy Badge](https://api.codacy.com/project/badge/Grade/ac38a5e5d954475980e46c279494be23)](https://www.codacy.com/app/ravikalla/springboot-rest-webservice?utm_source=github.com&utm_medium=referral&utm_content=ravikalla/springboot-rest-webservice&utm_campaign=badger)
[![Build Status](https://travis-ci.org/ravikalla/springboot-rest-webservice.svg?branch=master)](https://travis-ci.org/ravikalla/springboot-rest-webservice)

# Webservices using Springboot

###Download code:
 * cmd> git clone https://github.com/ravikalla/springboot-rest-webservice.git
 * cmd> mvn clean install
 * cmd> cd target

###Run application in local:
 * cmd> java -jar springboot-rest-webservice-0.1.0.jar --server.port=8088

#####Rest Webservice URLs:
 * http://localhost:8088/sayHello?name=Ravi
 * http://localhost:8088/sayhi
 
###Run application in PCF:
 * Install CloudFoundry client in local - https://docs.cloudfoundry.org/cf-cli/install-go-cli.html
 * Create a free account in PCF - https://run.pivotal.io
 * Add a Space in PCF WebServices window - https://console.run.pivotal.io (I created space named "webservice-space")
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
