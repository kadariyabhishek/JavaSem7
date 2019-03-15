package Class5;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by a-19-k on 2/8/19.
 */
class InvalidAgeException extends Exception {
    InvalidAgeException(String s){
        super(s);
    }
}
class CustomException{
    static void validate(int age)throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("not valid");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String args[]){
        try{
            validate(13);
        }catch(Exception m){System.out.println("Exception occured: "+m);}
    }

}