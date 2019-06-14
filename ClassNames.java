import java.util.*;

class Arithmetic
{
	int add(int a,int b){return (a+b);}
}

class Adder extends Arithmetic
{

}

public class ClassNames
{
	public static void main(String args[])
	{
		ClassNames cs=new ClassNames();
		System.out.println(cs.getClass().getSimpleName()); //Or use getName();

		Adder a=new Adder();
		System.out.println(a.getClass().getSuperclass().getName());
		System.out.println(a.add(10,20));

	}
}