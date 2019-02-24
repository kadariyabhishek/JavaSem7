package Class9;

import java.io.File;
import java.io.IOException;

/**
 * Created by a-19-k on 2/18/19.
 */
public class FileHandlingExample  {
    public static void main(String[] args) throws IOException{

        File f= new File("input.txt");

        if(f.createNewFile()){
            System.out.println("File input.txt created");
        }else{
            System.out.println("File already exists");
        }
    }
}
