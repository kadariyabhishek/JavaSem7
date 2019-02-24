package Class3;

/**
 * Created by a-19-k on 2/6/19.
 */

interface TestA{
    public void show();
}

class Z implements TestA{
    public void show(){
        System.out.println("This is show method");
    }
}

class InterfaceTest{
    public static void main(String[] args) {
        Z a = new Z();
        a.show();
    }
}
