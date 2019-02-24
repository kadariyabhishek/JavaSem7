package Class8;

import java.io.FileInputStream;
import java.io.IOException;
/**
 * Created by a-19-k on 2/14/19.
 */
public class JavaIO {



        public static void main(String[] args) throws IOException {

            int i;
            FileInputStream fin;
            fin = new FileInputStream(args[0]);
            do {

                i = fin.read();
                if (i != -1) {
                    System.out.println((char) i); //fout,write(i);
                }
            } while (i != -1);

            fin.close(); //fout.close();
        }
    }

