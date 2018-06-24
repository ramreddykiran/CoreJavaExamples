package logicalprograms;

public class sampel {

	public static void main(String[] args) {
		m1();

	}
	
public static void m1(){
		
		String s1 = "radar";
		char a1[] = s1.toCharArray();
		System.out.println(a1);
		System.out.println(a1.length);
		
		
		
			//char a2[] = { a1[4],a1[3], a1[2],a1[1],  a1[0] };
		int l=a1.length-1;
		char a2[] = new char[l];
		
		for(int i=l, j=0;i>=0; i--,j++){
	   a2[j] = a1[i];
	   System.out.println(a2[j] + " "+ a1[i]);
			
			
		}
			System.out.println(a2);
			
			
			
			String s2 = String.valueOf(a2);
			
			System.out.println(s2);
			
			if(s1.equalsIgnoreCase(s2)){
				System.out.println("Given string is a palindrome");
			}else{System.out.println("Given string i not a palindrome");
					
				
			
			
	

}
	}

}
