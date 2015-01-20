package demo.frank.wu.alpha.integer;

/**
 * @Description:	  数值比较
 * @FileName: 		 IntDemo.java
 * @Author:		 WuF
 * @Version: 		 1.0
 * @Date: 			 2015年1月20日 上午10:54:38
 */
public class IntDemo {
	
	public static void main(String[] args) {
		
		//int比较
		int int_a = 123456;
		int int_b = 123456;
		System.err.println("int_A == int_B : "+(int_a == int_b));
		System.err.println("=============================================================>");
		//Integer比较
		Integer integer_c = 123456;
		Integer integer_d = 123456;
		Integer integer_h = Integer.valueOf(123456);
		
//		如果两个都是Integer比较的才是引用，有一个是int类型的比较的是数值
/*		1.堆和堆比较
		 　　Integer a = new Integer(1);
		　　Integer b = new Integer(1);
		　　a与b存的是Integer的堆中的地址，而不是值
		 　　a、b指向堆中的地址显然不同所以 a==b 为false
		2.堆和栈比较
		 　　Integer是int的封装对象，堆和栈比较的是栈的值，因为int在堆中是不开辟内存的，他在栈中的值则为他本身的值

		3.int类型的栈和栈比较
		 　　直接比较的是栈的值

		4.Integer e=1; 这个比较特殊，直接赋值  它有独立的内存，每次赋值时将检查内存中是否有值跟他匹配的，若有则把此内存地址付给e，若没有，开辟新的内存
		
		1、Integer是一个类，用Integer声明一个变量其是一个对象类型（或者说引用类型）；int是基本类型，用int声明的变量是非对象类型，即不能在其上调用方法。
		2、“==”作用于对象上的时候，其比较的是对象的引用本身的值（或者说对象的地址更容易理解），而作用于基本类型的时候比较的就是基本类型的值。
*/
		System.err.println("integer_C == integer_D : "+(integer_c == integer_d));
		System.err.println("integer_c.equals(integer_d) : "+integer_c.equals(integer_d));
		System.err.println("integer_c == integer_h : "+(integer_c == integer_h));
		System.err.println("=============================================================>");
		//缓存范围Integer比较
		//自动装箱autoboxing
		/*java.lang.Long，java.lang.Short分别缓存了[-128,127]之间的Long和Short对象，
		java.lang.Byte缓存了所有的对象，java.lang.Character缓存了[0,127]之间的Character对象。
		java缓存这些对象是为了性能优化，既然我们已经知道其缓存了这么些对象，在需要new Integer/Long/…的地方，
		可改用Integer/Long/Short…#valueOf方法。*/
		Integer integer_e = 123;
		Integer integer_f = 123;
		System.err.println("integer_e == integer_f : " + (integer_e == integer_f));
		
//		将对象类型转换成基本类型然后进行比较
//		会调用integer_c.intValue()
		System.err.println("int_A == integer_C : "+(int_a == integer_c));
		System.err.println("=============================================================>");
		
		Integer integer_z = 0;
		System.err.println("integer_z == 0 : "+(integer_z == 0));
		System.err.println("int_a == 123456 :" +(int_a == 123456));
		System.err.println("integer_c == 123456 :" +(integer_c == 123456));
		
		System.err.println("=============================================================>");
		//JDK1.7以后提供的方法
		System.err.println("Integer.compare(integer_c, integer_d) : " + Integer.compare(integer_c, integer_d));
		//JDK1.7之前的方法
		System.err.println("integer_c.compareTo(integer_d) : " + integer_c.compareTo(integer_d));
		
		Integer i = 10;        //装箱  
		int t = i;             //拆箱
		System.err.println(t);
	}

}
