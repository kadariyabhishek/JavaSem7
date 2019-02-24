# Priority of Thread
- Each thread have a priority default is 5(i.e. Normal).
- There are three types of priority.
    - MIN_PRIORITY -1
    - NORM_PRIORITY-5
    - MAX_PRIORITY -10
    
``` java

    class A extends Thread{
    public void run(){
    
        sout(" Thread name:" + Thread.CurrentThread C\.getName());
        sout("Thread priority:"+ Thread.CurrentThread().getPrority());
        
        }
        
       psvm( S A){
       
       A a1= new A();
       A a2= new A();
       A a3= new A();
       a1.setPriority(Thread.MIN_PRIORITY);
       a2.setPriority(Thread.NORM_PRIORITY);
       a3.setPriority(Thread.MAX_PRIORITY);
       
       a1.start();
       a2.start();
       a3.start();
       
       }
       }
       
 ```
 
 
# Daemon Thread
- That provides service to other threads.
    - setDaemon()
    - isDaemon()
- It is low priority thread.

``` java
    class A extends Thread{
    
        public void run(){
        if(Thread.currentThread().isDaemon()){
        
        sout("Daemon Thread");
        }else{
        
        sout("Normal Thread");
        }
        
        psvm (S A){
        
            A a1= new A();
            A a2= new A();
            a1.setDaemon(time);
            a1.start();
            a2.start();
            }
            }
            
            
            
```




```java 

    class A extends Thread{
        public A (ThreadGroup tg, String S){
        }
        
        public void run(){
        try(){
            )catch()
            
            sout("Thread name:"+Thread.CurrentThread().getName() );
            
            }
            
            psvm (S A){
            
                ThreadGroup tg= new ThreadGroup("group1");
                
                A a1= new A(tg, 'thread-one");
                A a2= new A(tg, "thread-two");
                a1.start();
                a2.start();
                
                
                A a1=new A();
           }
 ```
       
          
   # Synchronization
      
      - Capability to control the access of multiple thread to shared resources.
      - synchronized method
      - synchronized block
      
   ### Syntax
   
        Synchronized(Object reference){
        //body
        
        }
        
        
  ```java
   #example
    void test(){
        Synchronized(this){
            //body
            }
            
          }
   ```
   
   
   ### Syntax
    
    Synchronized datatype method(){
    
        //body
        }
      
    
   ``` java
   
    public Synchronize{
        //body
        }
   ```
        
      
    
# Programs

1. WAP to create Daemon thread.
2. WAP to create two thread groups and associate multiple threads on it.
3. WAP to use synchronized method.
4. WAP to use synchronized block in methods.



# ASSIGNMENT 2

* What is multithreading in java? Explain classes/interface and their method in detail.

    At least 2 program. 1 of class and 1 of interface.
    Due date: 2019-02-25