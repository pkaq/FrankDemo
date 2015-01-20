package demo.frank.wu.bravo.math;

public class MathDemo {

	/**
	 Function:		 	main 
	 Description: 		
	 Calls: 			
	 Called By: 		
	 Table Accessed: 	
	 Table Updated: 	
	 Input:				
	 Output:			
	 Return: 			void
	 Others: 			
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PI
		System.out.println(Math.PI);
		//绝对值
		System.out.println(Math.abs(-4));
		//取整
		System.out.println("Ceil & Floor=====================================>");
		System.out.println(Math.ceil(3.3d));
		System.out.println(Math.floor(3.3d));
		
		System.out.println("Max & Min=====================================>");
		//比较大小
		System.out.println(Math.max(3.1, 1.5));
		System.out.println(Math.min(3.1, 1.5));
		
		//随机数
		System.out.println("Random=====================================>");
		System.out.println(Math.random());
		
		//四舍五入
		System.out.println("Round=====================================>");
		System.out.println(Math.round(3.49));

	}

}
