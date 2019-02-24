# Abstract class

- Abstract keyword
- At least one abstract method.
- Inherit must be used.
- No Instance can be set.
- Constructor and static method can be put. Also final method.

## SYNTAX
```java
abstract class A{
abstract void show;
}

class B extends A{
void show(){
sout("This is show method");
}

psvm( S A){
B b= new B();
b.show();
}
}
```

# Exception Handling

- Exception is a potential death trap, if not catch current thread of execution terminate.

# Dealing with errors

    - If error occurs return to a safe state and enable the user to execute other command or allow the user to save all the work and terminate
    the program gracefully.
    - Mission of exception handling is to transfer control from where the error occured to and error handler that can deal with the situation .

## Types of error

    1. User input errors:
        Ask to enter URL, entered in wrong format.
    2. Device errors:
        Printer turnoff, web page temporarily unavailable.
    3. Physical Limitation:
        Out of memory.
    4. Code errors:
        Method may not perform currently.



## The classification of Exception

                                Throwable
                                    |
                  ___________________________________________________________________
                 |                                                                   |
                Error                                                              Exception
                 |                                                                    |
              -Stackoverflow error                        ------------------------------------------------------
              -Virtual Machine Error                      |              |                     |               |
              -Out of Memory Error                  I/O exception   Runtime Exception     SQL Exception    ClassNotFound Exception.
                                                                         |
                                             ----------------------------------------------------------------------------
                                            |                     |                       |                             |
                               Arithmetic Exception     Number Format Exception   Index out of Baound exception     Null Point Exception


* Try - Exception Code
* Catch - Message or Operation
* Throw - Throw new runtime
* Throws -
* Finally - Eg. File Operation

## Syntax

    ```java

    try{
    code(Exception e1){
    } catch (Exception e2){
        msg
    }finally{
        msg
    }
    }

   ``

### final vs finally vs finalize
    Finalize - Like  a destructor


    1. WAP to implement interface to support multiple inheritance.
    2. WAP to implement Abstract Class.
    3. WAP to implement Exception Handling in Java
    4. WAP to check palindrome
    5. WAP to reverse the string without using keyword.