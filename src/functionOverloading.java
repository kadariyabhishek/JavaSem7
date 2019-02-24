/**
 * Created by a-19-k on 2/4/19.
 */
public class functionOverloading {
}

class A {

    int add(int a, int b) {
        return (a + b);
    }


    double add(double   a, double b) {
        return (a + b);
    }
}

class B{
    private  static void main(String[] args) {
        int v;
        double t;
        A a= new A();

        v= a.add(5,4);
        t= a.add(10.5,1.5);

        System.out.println("Integer sum="+v);
        System.out.println("Float sum"+t);

    }

}