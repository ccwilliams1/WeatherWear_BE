# WeatherWear_BE
Backend for WeatherWear application

To install:

Download the project as a zip file
Extract it wherever
Open Eclipse
File --> Import --> Maven --> Existing Maven Projects
Navigate to where you extracted the zip and import it. Check whatever checkboxes

To run:
Expand the Java Resources folder then expand the src/main/java folder
Theres 4 pacakges:
com.weatherwear
com.weatherwear.controller
com.weatherwear.model
com.weatherwear.service

com.weatherwear holds the WeatherWearSpring.java file. Run this to start the application

.controller holds the REST endpoint '/weather'. Once the application is running, this file ensures that a user will be able to submit a GET request to
'localhost:8080/weather' with the parameter ?data=x with x being a JSON string.

.model holds the Weather.java object. Once data is received from the controller class, the passed data gets parsed into a weather object

.service holds the Drools KieContainer necessary to execute the Drools rules. 

Nothing special needs to be done with any of these files. Once the WeatherWearSpring.java file is running and you see "Listening on 8080" you're good to go.

Nothing will work however unless you have the Postgres database running as well
