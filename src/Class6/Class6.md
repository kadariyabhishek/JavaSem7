# Multithreading
- Process of executing multiple threads simultaneously.

# The Thread LifeCycle

- New 
    - Using new operator, program has not started executing code inside of it.
- Runnable
    - invoke start method, it is in runnable state mind that runnable thread may or maynot be running.
- Blocked
    - Temporarily inactive.
- Wating
- Timed wating
- Terminated



   new
    |
    |(start)
    |                 acquiring lock
    |       ---------------------------------------------------------> blocked                                                           -  blocked
   runable  <---------------------------------------------------------
    |                 lock acquired                                               
    |  
    |           
    |         
    |                  wait for notification
    |        --------------------------------------------------------->waiting
    |       <---------------------------------------------------------                                                           - 
    |                   notification occured
    |
    |                    waiting for timeout of notification
    |        --------------------------------------------------------->timed waiting
    |        <---------------------------------------------------------
    |                     timeout of notification occured.
    |
    |
    |(run method exits)
    |
    |
    |
   terminated
        Figure:  Life cycle of thread state
        
        
   
   
# How to create thread.

- using Thread Class    
- implementing runnable interface

# Multithreading
- ability to have more than one program working at what seems like the same time at what seems like the same time.
- each task usually called a thread, program that can run more than one thread at once are said to be multithread.
- threads are more lightweighted than process.
- Java.lang.Thread---- start(), run()
- Java.lang.runnable---- run()

# Interrupting Threads.

- interrupt method can be used to request termination of a thread.
    Thread.curentthread().is Interrupted()---boolean value.
    
# Constructions in Thread class
- Thread()
- Thread(String s)
- Thread(Runnable r, string s)
- Thread (Runnable r)


## used method
    -start()
    -run()
    -sleep()
    -join()
    -getPriority()
    -setPriority()
    -notify()
    -wait()
    -wait(time)
    
  ```
  java
  
  class A extends Thread{
    public void run(){
        s.out("Thread is running");
        }
        psvm( S A){
        A a= new A();
        a.start();
        }
        }
        
  ```
  
  ```
  java
  
  class A implements Runnable{
    public voud run(){
    
    sout("Thread is running");
    }
    psvm (S A){
    A a= new A();
    Thread t=new Thread(a);
    t.start();
    }
    }
    
    
    
    
Q1. WAP to implement multithreading using Thread class
Q2. WAP to implement multithreading using runnable interface.