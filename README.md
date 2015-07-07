# Spring-MVC-MyBatis

##############
Instructions
##############

Project Description:
--------------------
This simple web application project built using Spring MVC, MyBatis, MySQL, Java, Rest, Bootstrap, Jquery, Handlebar template, Maven, Jetty plugin, Junit

1. Lists the avaialble assignee names from the DB in the web page using controller and bootstrap dropdown.
   http://localhost:9001/assignment/index#
2. When the page loads it populate the bootstrap dropdown with the names using spring controller (note: not using rest)
3. when a name is selected it makes a rest call using Jquery / Ajax with an assignee id and get the response of ASSIGNMENT model back in JSON  format
   and parse it in a bootstrap List Group using Handlebar js mechanism. (Refer : http://handlebarsjs.com/)
   a) When the rest service is been called it gets the value based on id, for example , http://localhost:9001/assignment/rest/filterby/id/4

Refer the video : http://screencast.com/t/etOTfZ0L2
This shows how to maven clean, install and demo

Things to know/understand/learn from this simple project:
---------------------------------------------------------
1) Spring MVC + Java with annotation
2) MyBatis with annotation
3) Bootstrap Framework
4) Handlebar template
5) Jquery Ajax call
6) Maven
7) Jetty integrated
8) Rest with spring
9) Controller code model&view in response / rest usage ( we can decide which one to use and where)
10) Junit with spring
11) How to read properties using autowire and properties in json structure can be read by spring
12) how to write better service layer on top of DAO and keep DAO / Mapper clean


Steps to run:
-------------
1. Set up the DB, install MySQL and ignore if you already have.
2. Run the statements in the resources/dbscript/setupdb.sql script to create DB, user and sample table with some data
3. Import the downloaded github project as a maven existing project
4. Do maven clean and install
5. goto plugin and run jetty

Points to Note:
--------------
1. The port on jetty run is 9001 (configured in pom.xml)
2. If you want to create table & data from the above .sql script under an existing user/db,
   Please configure the properties like, user, password , db in a file under /resources/properties/system.properties

Classes:
--------
1. CoreAdminController - is the controller , home.jsp goes thru this controller to populate dropdown
2. AssignmentDAO - Acts as mapper interface
3. AssignmentDAOImpl - its a service/data layer to make a call to DAO with its business logic inside
4. Assignment - its a valued object or model
5. AssignmentService - its a rest service to get Assignment details based on Id
6. PropertiesUtil - this is a demo class to read from spring configurations and properties util can be autowired
7. SpringUtil - to get bean context

Properties:
------------
1. log4j - Log4j properties
2. system - DB properties to be used in mybatis

