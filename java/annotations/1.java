import java.lang.annotation.*;
import java.lang.reflect.*;

/* marker annotation */
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker { }

class Marker implements MyMarker {
    /* annotate the method using marker.
     *  Notice that no { } is needed 
     */
    @MyMarker
    public static void myMethod() {
        Marker obj = new Marker();

        try {

            Method m = obj.getClass().getMethod("myMethod");

            /* specify if the annotation is present */
            if(m.isAnnotationPresent(MyMarker.class))
                System.out.println("MyMarker is present");

        } catch(NoSuchMethodException exc) {

            System.out.println("Method not found..!!");
        }
    }

    public static void main(String args[])
    {

        myMethod();
    }
}
