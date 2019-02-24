//package Class5;
//
//import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
//
///**
// * Created by a-19-k on 2/8/19.
// */
//public class Custom extends Exception {
//   int id;
//   public  Custom(int x){
//       id =x;
//   }
//
//   public String toString(){
//       return "CustomException["+id+"]";
//    }
//}
//
//public class CreateCustomException{
//    static void compute(int a) throws Custom{
//        if (a>10)
//            throw new CreateCustomException(a);
//            System.out.println("No error caught");
//    }
//
//    public static void main(String args[]) {
//
//        try {
//            compute(5);
//            compute(12);
//        } catch(Custom ex1) {
//            System.out.println(ex1);
//        }
//    }
//}