package Class8;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by a-19-k on 3/5/19.
 */
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name; int batch; String course;
    public Student(int id, String name, int batch, String course) { this.id = id;
        this.name = name; this.batch = batch; this.course = course;
    }
    public void getStudentDetails() {
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Batch: " + this.batch);
        System.out.println("Course: " + this.course);
        System.out.println("-------------");
    }

}
class FileHandler {
    String fileName;
    String filePath = "";

    public FileHandler(String fileName) throws IOException {
        this.fileName = fileName;
        File file = new File(this.fileName);
        if (file.createNewFile()) {
            System.out.println("File " + this.fileName + "created");
        } else {
            System.out.println("File " + this.fileName + " already exists");
        }
    }
    public void WriteObjectToFile(Object serObj) {
        try {
            FileOutputStream fileOut = new FileOutputStream(this.filePath +
                    this.fileName);
            ObjectOutputStream objectOut = new
                    ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.flush();
            System.out.println("The student object was succesfully written to " + this.fileName + " file.");
            objectOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Student> ReadObjectFromFile() {
        try {
            FileInputStream fileIn = new FileInputStream(this.filePath + this.fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            ArrayList<Student> studentList = new ArrayList<>();
            studentList = (ArrayList<Student>)objectIn.readObject();
            System.out.println("All data has been read from the file.");
            return studentList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

class FileHandling {
    public static void main(String args[]) {
        try {
            FileHandler studentFile = new FileHandler("students.dat");
            ArrayList<Student> studentList = new ArrayList<>();
            Scanner input = new Scanner(System.in);
            int n = 0;
            while (n < 10) {
                System.out.println("Enter student id:");
                int id = input.nextInt();
                input.nextLine();

                System.out.println("Enter student name");
                String name = input.nextLine();

                System.out.println("Enter batch: ");
                int batch = input.nextInt();
                input.nextLine();

                System.out.println("Enter course: ");
                String course = input.nextLine();

                Student student = new Student(id, name, batch, course);
                studentList.add(student);
                n++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

