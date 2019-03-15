# The Network Protocol Driver (Type 3)

- It's a pure java driver that use a properity of network protocol to communicate with JDBC, middleware on the server.
- Deployed over internet without client installation.
- Java -> JDBC st. -> SQL st. -> DB

[Java]---[Type 3 JDBC Driver]----network protocol----------[JDBC middleware]------[DB]

# Function

- Follows the three tier communication approach.
- Not a vendor specific.
- client --> JDBC driver--> middleware --> DB


## Advantage

- No need for the vendor dob database library
- Can be used in internet 


## Disadvantage

- Require DB-specific coding to be done in the middle tier.
- Extra layer added mag result in a time- bottlereck.


# Native-protocol Driver (Type 4)

- Convert JDBC call directly into the vendor specific  specific DB protocol.
- Platform independent.
- Installed inside the JVM


## Function

- Communicate directly with a vendor DB through socjet connecting.
- Completely implemented in java to achive platform independent.
- eg oracle Thin Driver.
- client-> Type-4 -> DB

[Java]----[Type 4 driver]----[DB]

## Driver Manager Class

- class.forName()-----Loading driver.
- registerDriver(driver)----- register driver
- doregisterDriver(driver)----drop the driver
- getConnection(url)-----establish the connection
- geDriver(url)----- attempts to locate the driver.


## JDBC steps

- Loading driver
- Establishing connection
- Executing st.
- Getting Results.
- Closing DB connection


<TASKS> 

- use Test.
- create Table emp(id, varchar(20),name varchar(20), add varchar(20));
- insert intro emp values("101", 'run', 'ktm');
- select * from emp.



