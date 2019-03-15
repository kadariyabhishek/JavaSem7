#Trasactions

- By default it is in auto-commit mode.
    con.setAutoCommit(false)
    con.commit()
- Transaction is defined as all changes made to the DB between successive commits.


# java.sql Statements

- It represents SQL st.

## Methods:-

1. executeQuery()--> tale SQ: string as an argument and return a Resultset object.
                 --> used for any SQL call that to return data from a DB.
2. executeupdate()--> update string are used. This reutrns the number of attributed rows.

3. execute()--> Is executing dynamically created SQL string. If the string returns row from the DB, the method returns true otherwise false.


# java.sql.Resultset
- It is one or more rows of data returned by a DB query.
- method for retireving columns from the results of a DB.
- getString(index/string(column))
    eg. 
        rs.getString(1);|| rs.getstring("id");
        
    -next()--- next row
    -previous() --- move backward
    -first() --
    -last()