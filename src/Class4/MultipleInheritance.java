package Class4;

/**
 * Created by a-19-k on 2/27/19.
 */
public interface MultipleInheritance {
        void display();
    }

class Acquire implements MultipleInheritance {
        @Override
        public void display() {

            System.out.println(" Multiple inheritance is possible");
        }
        public static void main(String[] args) {
            Acquire acq= new Acquire();
            acq.display();
        }
    }

