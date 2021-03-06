package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MainAnnotation {

	public static void main(String[] args) {
		
		Profile profile=new Profile();
		// ? generic type i bilmiyorum sa� tarafa bk ona g�re ayarla
		Class<?> profileClass= profile.getClass();
		
		//getMethods() t�m kal�t�lm��lar� getirir declared Tan�ml�lar� getirir.
		Method[] methods= profileClass.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("method : "+ method.getName());
			Parameter[] parameters = method.getParameters();
			for (Parameter parameter : parameters) {
				System.out.println("Parameter : "+ parameter.getName() + " Value :"+parameter.getType());
			}
			Annotation[] annotations = method.getDeclaredAnnotations();
			for (Annotation annotation : annotations) {
				System.out.println(annotation);
			}
			System.out.println("#################");
		}
	}

}
