package generics;

import java.util.ArrayList;

public class DemoGenerics {
    public static void main(String[] args) {
        // ArrayList<Object> list = new ArrayList<String>(); => Compile Error
        UnBoundedGenerics<String> obj= new UnBoundedGenerics<>();
        obj.getClassInfo("Demo Unbounded Class");

        ArrayList<String> list = new ArrayList();
        list.add("pandian");
        // list.add(1);
        // Generics is complier level validated.
        // Thus considering left hand side of assigned gererics type

        ArrayList<String> stringGenerics = new ArrayList<>();
        stringGenerics.add("pandian");   // cannot add anything other than String.
        withoutGenericsMethod(stringGenerics);    // can add anything in this method for the same list
        System.out.println(stringGenerics);

        BoundedGenerics<Integer> boundedGenerics = new BoundedGenerics<>();
        // BoundedGenerics<String> boundedGenericString = new BoundedGenerics<>();      //Error
        // parameter type should be Child of Number
        

    }

    public static void withoutGenericsMethod(ArrayList list){
        list.add(1);
        // can add anything to the list
    }

    public  void wildCardMethod1(ArrayList<String> list){
        // can add only String to the list
    }
    public  void wildCardMethod2(ArrayList<?> list){
        // can add only null to the list
        // list.add("pandian"); // Error
    }
    public  void wildCardMethod3(ArrayList<? extends String> list){
        // can add only null to the list
        // list.add("pandian"); // error
    }
    public  void wildCardMethod4(ArrayList<? super Number> list){
        // can add Number or null to the list
        // list.add("pandian"); // error
         list.add(1); // allows number
    }

    // Declaring Generics in method level
    public  <T>void genericMethod(T obj){
        // Scope of this T will be only within this method.
    }
}
