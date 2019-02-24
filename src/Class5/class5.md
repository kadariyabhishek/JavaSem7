# Checked Exception
  * Throwable class inherit( Except runtime exception).
 
# Unchecked Exception
   * Runtime exception
       - Arithmetic 
       - Null pointer
# Throw Keyword
  * Mainly used for custom exception
    
  exp. throw new RuntimeException("Error);
        IoException("Error")
        
``` java

    Class A{
    
    psvm( S A){
     int i=20;
     if(i>18){
        sout("Eligible for vote");}
     else,{
     throw new RuntimeException("not eligible");
     }
     }
     }
     
```
#Throws Keyword
*
## syntax
      
    return_type method_name() throws Exception_name{
      
      
 
    void get() throws IOException{}
 
 
# Custom Exception
 ```java
    class CustomException extends Exception{
        customException(String S){
            Super(S);
        }
    }
  
  
  class A{
   void show() throws CustomException{
        i=10;
        if(i<10){
        throw new CustomException("Not eligible");
        }else{
            sout ("eligible);}
            }
            }}
            
  class A{
   psvm(S A){
       A a= new A();
       a.show(); -> try catch must be used here
   }
   }
 ```
    
### Programs
  1. WAP to create customException and use it.
  2. WAP to implement throw exception.
  3. WAP to implement throw keyword.
  4. WAP to implement finally keyword.
            
    