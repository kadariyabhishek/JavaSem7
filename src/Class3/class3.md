# Super and this keyword
    *Call the superclass constructor.
    *Used to access members of the superclass.
    
    class A{
    int l;
    int b;
    A(A a){
    
    l= a.l;
    b= a.b;}
    
    double area(){
     return(l*b);
     }}
     
     
     
     class B extends A{
     
     B(B b){
     
        super(b);
        }
        }
        
     class Test{
      
      psvm(s A){
        double a;
      B  b1= new B();
      B  b2= new(b1);
      
      a=b2.area();
      
      sout("Area."+a);
      
      }}
      
      
        
     

# Inheritance
    -Mainly used for code reusability
    
    -Class Person(){
            name;
            address;
            dob}
    
    -Class Student(){
            student_id();
            department;
            course;
            }
    
    
    - CLass Faculty(){
            f_id;
            course;
            department;
            }
            
         
       
# Interface
     -Implements
     -All methods in interface are public.
     -Fields are always public static final.
    
   Syntax:
   interface  <interface name>{
   method 1();
   method 2();
   }
   
# Abstract class


