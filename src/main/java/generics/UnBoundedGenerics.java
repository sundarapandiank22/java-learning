package generics;

public class UnBoundedGenerics<T> {
    public T getClassInfo(T param){
        System.out.println(param.getClass());
        return param;
    }
}

class UnBoundedGenericsMultiple<K,V>{

}