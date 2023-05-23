# MS-IVR  #

####  MS- IVR Microservice implemented using JWT Authentication in order to support the API's required for IVR telephony integration.
####

#
\
\

 ![](./src/main/resources/IVR_Integration.png)



### What is this repository for? ###
#

 *  Hosts set of API's for IVR Telephony clients. Telephony Client's use the following set of API's to Authenticate Caller for different IVR workflows.


    * 1 :  Get Auth token from Identity Server using the /token API.
 
    * 2 :  Validate the Incoming phone number using /validateANI API.
 
    * 3 :  Authenticate Caller using the attributes collected by IVR using 
      /authenticateCaller API.

* Version 1.0.0

### Documentaion :
#
Please refer to the swagger/ OpenAPI documentaion.
    

    ## API Docs :
    
    https://{server}:{port}:/ms-ivr/ivr/api-docs/

    ## Swagger Open API 3.0 :
    
    https://{server}:{port}/ms-ivr/ivr/swagger-ui/index.html?configUrl=/ms-ivr/ivr/api-docs/swagger-config


### How do I get set up? ###
#
* Summary of set up
    - git Checkout this project (ms-ivr)
    - Build :  mvn clean install 
    - Run  : spring-boot : run

* Configuration
    - Please refer to the application.yaml file in the project directory.
    - Requires GHIX_HOME setup.
        *   Ex : java  -DGHIX_HOME=/Users/kancherla_s/iex -jar target/ms-ivr-0.0.1-SNAPSHOT.jar
    

* Dependencies
    * Identity server to validate the signed JWT tokens.
    *  Database


* Database configuration
    Requires POSTGRESS

* Deployment instructions
    * Build & Deploy using the Jenkins deployment pipeleine using Build-MS & Deploy-MS jobs.



### Contribution guidelines ###
#
* Writing tests
   Please use the /test folder under the project directory. 
* Code review
    Send your pull requests to 
    * Suresh Kancherla - Suresh.kancherla@getinsured.com
    * Abhai Chaudhary - Abhai.Chaudhary@getinsured.com
    
* Other guidelines

### Who do I talk to? ###

* Repo owner or admin
    * Suresh Kancherla - Suresh.kancherla@getinsured.com
    * Abhai Chaudhary - Abhai.Chaudhary@getinsured.com
    * Sanjeev Jorapur - Sanjeev.Jorapur@gteinsured.com
    
