package ExceptionHandlingBasic;
import java.util.*;

public class ExceptionHandlingMethods {
	public static void main(String[] args) {
		
		ExceptionHandlingMethods em = new ExceptionHandlingMethods();
		String x =" ";
		String y = "abcd";
		System.out.println("foo() null");
		em.foo(null);
		System.out.println("bar() null");
		em.bar(null);
		System.out.println("empty string");
		em.foo(x);
		System.out.println("abcd");
		em.foo(y);
	}
	
	public void foo(String x) {
		try {
		System.out.println("First Character - foo() method:" + x.charAt(0));
		}catch(NullPointerException e) {
			System.out.println(e);
		}
	}
	
	public void bar(String x) {
		if(x == null) {
			System.out.println("2 - Null pointer:");
		}else {
			System.out.println("3 - First Character - bar() method:" + x.charAt(0));
		}
	}
}
