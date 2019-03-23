# Scrollable Resultset (JDBC 2.0)

    con.createStatement (Resultset. TYPE_FORWARD_ONLY, Resultset,CONCURREAD_ONLY);
                                         |                      |
                                        type             resultset concurrency read ony
   -It means only move forward.
   
# Three types of resultset of JDBC 

    - TYPE_FORWARD_ONLY ----> not suitable
    - TYPE_FORWARD _SENSITIVE --> means that you can see changes made to the result if you scroll back to the modified row at a later time.
    - TYPE_SCROLL_INSENSITIVE --->  is unaware of in-place edits made to modifiable instance.
    
    
# Prepare STATEMENT:-

   - SQL st. to contain parameters like a function defination and execute a single st. repeatedly with different values for those parameters.
    
    PrepareStatement pst = Con.PrepareStatement ("query");
        pst.setxxx(1, value);
        
        
# Stored Procedures:-

    - Like method you call in the DB.
    - Precompiled in DB.
    - Faster than other.
    
    callablestatement st = con.preparcall("store pro name");
    
# Updatable Resultset

- It enables you to perform in-place changes to a resultset & have them take effect using the current transaction.
    * Resultset.CONCUR_UPDATABLE
    * Resultset.CONCUR_READ_ONLY
    
    eg. rs.updateDouble(2, 5000);
    
    
# BLOB and CLOBS
 
 - Binary large object - binary data -> Blob b = rs.getBlob(1);
 - Character Large Object - text data clob c= rs.getClob(2);
 
# Row set:-

    - javax.sql.Rowset
    - It is an extension of the Resultset interface that serves data up in accordance witht he javaBean API.
    
     Rowset rs= new Imaginary Rowset();
     rs.setDataSourceName("Data Source");
     rs.setUsername("username");
     rs.setPassword("pwd");
     rs.setCommand("query");
    


 