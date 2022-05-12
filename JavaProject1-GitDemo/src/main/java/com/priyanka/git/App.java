package com.priyanka.git;
import com.priyanka.git.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    	System.out.println("Employee Details!!");
		Employee e1 = new Employee("Priyanka","Sarode",101,20000);
		System.out.println(e1.toString());
    }
}
