package Class3;

/**
 * Created by a-19-k on 2/27/19.
 */
public class StaticFinalKeyword {
        // a final variable
        // direct initialize
        final int THRESHOLD = 5;

        // a blank final variable
        final int CAPACITY;

        // another blank final variable
        final int  MINIMUM;

        // a final static variable PI
        // direct initialize
        static final double PI = 3.141592653589793;

        // a  blank final static  variable
        static final double EULERCONSTANT;

        // instance initializer block for
        // initializing CAPACITY
        {
            CAPACITY = 25;
        }

        // static initializer block for
        // initializing EULERCONSTANT
        static{
            EULERCONSTANT = 2.3;
        }

        // constructor for initializing MINIMUM
        // Note that if there are more than one
        // constructor, you must initialize MINIMUM
        // in them also
        public StaticFinalKeyword()
        {
            MINIMUM = -1;
        }

    }

