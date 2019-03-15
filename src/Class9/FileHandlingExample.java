package Class9;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.System.in;

/**
 * Created by a-19-k on 2/18/19.
 */
public class FileHandlingExample  {
    public static void main(String args[]) {
        try {
            File file = new File("filedemoexample.txt");
            if (file.exists()){
//
                System.out.println("File \"" + file.getName() + "\" already exists in \"" + file.getAbsolutePath() "\" directory.");
                System.out.println("File details: ");
                System.out.println("Can be read: " + file.canRead());
                System.out.println("Can be written:"+file.canWrite());
                System.out.println("Is directory: " + file.isDirectory());
                System.out.println("Is file: " + file.isFile());
                System.out.println("File size: " + file.length());
                Date date = new Date(file.lastModified());
                String formattedDate;
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy H:mm:ss\");
                formattedDate = sdf.format(date);
                System.out.println("Last modified: " + formattedDate);
            } else if (file.createNewFile()){ System.out.println("File \"" + file.getName() + "\" created in \"" + file.getAbsolutePath() + "\" directory.");
            }
        } catch (Exception e) { e.printStackTrace();
        }
    }
}
