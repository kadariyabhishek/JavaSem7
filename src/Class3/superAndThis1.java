package Class3;

/**
 * Created by a-19-k on 2/6/19.
 */

class A{

    int i=10;
}

class B extends A{

    int i=20;
    public void method() {
        System.out.println("child class:" +this.i);
        System.out.println("child class:" +super.i);
    }
}


public class superAndThis1 {
    public static void main(String[] args) {
        B b= new B();
        b.method();
    }
}
