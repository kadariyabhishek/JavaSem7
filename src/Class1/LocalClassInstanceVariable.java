package Class1;

/**
 * Created by a-19-k on 2/26/19.
 */
public class LocalClassInstanceVariable {
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }
    public static void main(String args[]) {
        LocalClassInstanceVariable test = new LocalClassInstanceVariable();
        test.pupAge();
    }


}
