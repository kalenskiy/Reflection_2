package Task2;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args){
        Container con = new Container("Hello");
        Class<?> cls = Container.class;
        String path = cls.getAnnotation(SaveTo.class).path();
        Method[] mt = cls.getMethods();
        for(Method m: mt){
            if(m.isAnnotationPresent(Saver.class)){
                try {
                    m.invoke(con, path);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }



    }

}
