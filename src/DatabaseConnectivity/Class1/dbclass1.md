# Database Connectivity

- JDBC is a java application programming interface
- Allow DB access from java code
- Developed by javasoft(Sun microsystem)
- JDBC stands for Java Database Connectivity.
- Using a ser of interface and classes.
- Provide methods for quering and updating the data in RDBMS.
- Driver manager is used as connection factory


## Purpose of JDBC

- Connect to a data source, like DB.
- Sending queries and updating st. to the DB
- Retriving and processing the results.


## Components in JDBC

- JDBC API
- JDBC Driver manager
- JDBC Test Suite
- JDBC-ODBC Bridge


``` java

    classForName("com.mysql.jdbc.Driver");
    
    Connection con = DriverManager.getConnection("jdbc: mysql // 
                                   localhost:3306/DBName","user","password");

```