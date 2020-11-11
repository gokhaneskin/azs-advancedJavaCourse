package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface User {
	
	int id();
	String name();
	//boþ gelirse default
	String surname() default "Bilmem";
	EUser type() default EUser.user;
}
