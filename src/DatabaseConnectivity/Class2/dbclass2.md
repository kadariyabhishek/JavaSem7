# JDBC API

- It provide industrial standard for independently connecting java programming language and a wide range of DB.
- Access within a N/W
- package java.sql, javax.sql

# JDBC Driver Manager

- Its a class define objects which connect java application to JDBC driver.
- JDBC driver translate standard JDBC call into a N/W or DB protocol or into a DB library.
- If backend change means we need to update driver only.

# JDBC Test Suite

- To ensure that the JDBC drivers will run user's program or not.

# JDBC- ODBC Bridge

- Translate JDBC method call into DDBC function call
- Implements sunjdbc.odc package

# JDBC Architecutre

    [JSP/Applet/Application]      ----------------------------   [JDBC API] ------------------ [JDBC Driver Manager]
                                                                                                |
                                                                                                |
                                                                                            
                                         ----------------------------------------------------------------------
                                  |
                                [JDBC Driver]                         [JDBC Driver]                        [JDBC Driver]
                                  |                                     |                                       |
                              
                                  
                                 Oracle                            MS SQL                                      Mysql
                                 
                                 



# Types of Driver

- JDBC- ODBC Bridge (Type 1)
- Java to Native API (Type 2)
- Java to N/W protocol (Type 3)
- Java to Database protocol (Type 4)


# JDBC- ODBC Bridge:

- It acts as bridge between JDBC and another database connectivity mechanism such as ODBC.
- It includes in Java 2 SDK with sun.jdbc.odbc package.
- Java st. convert into JDBC st.
- JDBC st. call ODBC by using the JDBC- ODBC bridge.


   [JDBC servlet/ Applicaiton]-----[Type/ JDBC Driver]------[JDBC-ODBC Library (Native code)]
                                                                        |
                                                                        |
                                                   [DB]   ----------[ODBC Driver]
                                                   
  # Function
   - Translate query obtained by JDBC into corresponding ODBC query.
   - CLient---> JDBC Driver --> ODBC Driver ---> DB
   
  # Advantage:
   - Only DB for which ODBC driver is installed, can be accessed
  
  # Disadvantage:
   - Performance overhead.
   - ODBC driver needs to be installed on client machine
   - not siutable to applets.
  
  
# Java to Native API (Type 2):

- It use Java Natie Interface (INI) to make calls to a local DB library API.
- It communicates directly with the DB server.
- Usually faster than driver type 1.

[Java JDBC]---[Type 2 JDBC Driver]---[Database library (Native Class)]--- [DB]



   Function:
   - Convert JDBC call to the client API for the DB.
   - Client-> JDBC driver -> Vendor client DB library-> DB
   
   Advantage:
   - Better than Type1
   
   Disadvantage:
   
   - Vendor client lib need to be installed.
   - Cannot used in internet due to client side s/w needed.
   - Not all DB give the client side lib.
   
   Types of Driver
   
   - DDBC- ODBC Bridge (Type 1)
   - Java to Na
                              
                                       
                                       