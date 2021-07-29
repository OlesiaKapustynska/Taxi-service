## Taxi-service app
<img src="https://prnt.sc/1haow7n" >
This is a simple web application for registration drivers in taxi service and managements cars, manufacturers, drivers.
The project is according to the requirements of SOLID principles for easy reading, testing, and extension. This project used N-tier architecture and users authentication.
***
### Architecture layers
- **DAO** -  It communicates with the Database and handles the persisting of our data.
- **Service**  - The program's business logic is executed here.
- **Controller** - This is where we handle all the incoming requests to our application and return a response.
### Technologies Used
- Java 11
- Maven 3.1.1
- DI via Injector
- Apache Tomcat
- Java Servlet API
- JSP
- JSTL
- Logger
- JDBC
- MySQL
***
### Setup
1. Fork the project into your local directory and then open it in an IDE.
1. Create MySQL database, and the necessary tables using resources/init_db.sql and reconfigure the "ConnectionUtil" class in the "taxi.util" package.
1. Before running the app you should configure Apache Tomcat.
1. Run the program and create a new driver by filling out the form.