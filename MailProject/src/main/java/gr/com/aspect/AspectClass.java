package gr.com.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AspectClass {
	
	@Pointcut("execution(public * *(..))")
	public void p1() {
	}

	@Before("p1()")
	public void show() {
		System.out.println("Before Advice");
	}
	
}
