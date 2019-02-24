# Console class
   
- used to get input from console.
- provides method to read texts and passwords.
``` java
    String text=System.console().readLine();    
    System.out.println("Text is: "+text);    
 ```
 

# File

- doesnot operate on stream.
- deals directly with files

# Constructors

- File (String dirpath)
- File (String dirpath, string filename)
- File (File dirObj, string filename)
- File (URL urlobj)

# Method
- getName()
- getParent()
- existing()
- length()
- lastmodified()
- isFile()
- isDirectory()



``` java
class A{
    psvm(S A) throw IoException{
        File f= new File("Input.txt");
        if(f.createNewFile()){
            sout("File input.txt created");
            }
            else
            sout("File already exists");
          }
          }
          
```

# RandomAccess File
- implements interface DateInput & DateOutput.
- not derived from I/P stream & O/P stream.
- It support positioning request.
- Position the file pointer within file.
- RandomAcessFile (File Fileobj, string access)
- RandomAccessFile (String filename, String access)
- r, rw, rws--> read and write and every change to the file's data will immediately written to the physical device.
- seek()-pointer position


# Serilization

- process of writing the state of an object to a byte stream.
- implement RMT.
- serializable interface implements.

``` 
    RandomAccessFile rf;
    rf= new RandomAccessFile('text.txt','rw');
    rf.seek(rf.length(1);//end of  file
    rf.writeBytes("Hello \n");
    rf.close();
    
    
    
```



 
 Programs
 
 WAP to perform atleast 10 file objects method.
 wap to write certain text in middle of the file using randomclassfile class.