package Class4;

/**
 * Created by a-19-k on 2/27/19.
 */

abstract class AbstractClass {
    abstract void draw();
}
class Rectangle extends AbstractClass{
    void draw(){System.out.println("drawing rectangle");}
}
class TestAbstraction1{
    public static void main(String args[]){
        AbstractClass s=new Rectangle();
        s.draw();
    }
}
