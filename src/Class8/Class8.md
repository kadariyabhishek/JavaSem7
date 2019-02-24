# File Handling
- java I/O operation
- Stream
    - java perform I/O through streams/
    - sequence of data
    
    * InputStream - read
    * OutputStream- write
    * Byte stream - UNICode8
    * Character stream - UNICode 16
    
## ByteStream Classes

- BufferInputStream

## Reading Console Input
    - System.in
    _ BufferedReader
    
  ### Syntax
    
    BufferReader br= new BufferReader(new InputStreamreader(System.in));
    
    -read();
    
``` java
    
    class A{
    psvm(S A) throws IOException{
    
    char c;
    BufferedReader br = new BufferedReader(new InputStreamReader(Sytem.in));
    
    sout("Enter the characters, 'q' to quit');
    
    do{
    c = (char)br.read();
    sout (c);
    }while(c != 'q');
    }
    }
    
 ```
 
 
 # Reading String
 
 - readline();
    
    BufferReader br = new BufferReader(new InputStreamR
    
  )
  
  
  
 # Reading and writing Files
 
 - FileInputStream -- read()
 - FileOutStream -- write()
 
 ``` java
 
    class A{
        
        psvm (S A) throws IoException{
        
            int i;
            FileInoutStream fin;
            fin= new FileInputStream(args[0]);
            
            do{
            
                i = fin.read();
                if( i!= -1){
                    sout((char)i; //fout,write(i);
                    }
                   } while(i!=-1);
                   
                   fin.close(); //fout.close();
    

 ```
    
## Constructor

    FileInputStream(String path)
    FileInputStream(File obj)
    
    FileOutputStream(String path)
    FileOutputstream(File obj)
    FileOutStream(String Path, boolean append)
    FileOutputStream( File obj, booean append).
    
    
    
# Character Streams
  
 - BufferedReader
 - BufferedWriter
 - FileReader
 - FileWriter
 - Reader
 - Writer
 
# Reading & Wrtingna Files

- FileReader --------------> FileReader(String path);
                             FileReader(File obj);
- FileWriter---------------> FileWriter(String path);
                             FileWriter(File obj);
                             FileWriter(String path, boolean append)
                             FileWriter(File obj, boolean path)
                             
# File Copy

 ``` java
 
 class A{
    psvm(S A)throws IoException{
        FileReader fr= new FileReader("input.txt");
        FileWriter fw= new FileWriter("Output.txt");
        int cl
        while((c=fr.read()!= -1){
        
        fw.write(c);
        }
        
        fr.close();
        fr.close();
        }
        }
        
        
 ```
 
 
# Programs
   1. WAP to store 10 student detail from user.
    (student_id| student_name| batch| course)
   2. WAP to display the student details from existing File.
   3. WAP to search the particular student based on student id from existing file-userinput
   
   
    