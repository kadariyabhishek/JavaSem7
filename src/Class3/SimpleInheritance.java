package Class3;

/**
 * Created by a-19-k on 2/27/19.
 */

class SimpleInheritance {
    String designation = "Teacher";
    String collegeName = "DWIT";
    void does(){
        System.out.println("Teaching");
    }
}

class JavaTeacher extends SimpleInheritance{
    String mainSubject = "JAVA";
    public static void main(String args[]){
        JavaTeacher obj = new JavaTeacher();
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        obj.does();
    }
}