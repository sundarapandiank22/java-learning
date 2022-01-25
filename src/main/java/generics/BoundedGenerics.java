package generics;

import java.io.Serializable;

public class BoundedGenerics<T extends Number> {
    public T getClassInfo(T param){
        System.out.println(param.getClass());
        return param;
    }
}

// both class and interface
class BoundedGenerics1<T extends String & Runnable> {

}

// class with multiple interfaces
class BoundedGenerics2<T extends String & Runnable & Serializable> {

}
