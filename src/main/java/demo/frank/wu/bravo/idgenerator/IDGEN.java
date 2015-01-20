package demo.frank.wu.bravo.idgenerator;

import java.util.UUID;


public class IDGEN {
	public static void main(String[] args) {
		
		while(true){
			String s = UUID.randomUUID().toString();
			System.err.println(s);
		}
		
		
	}
}
