package logicalprograms;
// Java program to read data of various types using Scanner class.
import java.util.Scanner;
public class ScannerDemo1
{
    public static void main(String[] args)
    {
    	
    	int a[] = {2,5,3,6,6};
    	String[] a1 ={"we","sfd"};
    	String s1 = "we";
    	if(a1[0].equals(""))
    	System.out.println(s1.hashCode() + " ,");
    	for(int i : a){
    	}
        // Declare the object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);
 
        // String input
        System.out.println("enter ln ");
        String name = sc.nextLine();
        
        System.out.println("enter int ");
        int age = sc.nextInt();
       
 
        // Character input
       /* char gender = sc.next().charAt(0);
 
        // Numerical data input
        // byte, short and float can be read
        // using similar-named functions.
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double cgpa = sc.nextDouble();
 */
        // Print the values to check if input was correctly obtained.
        System.out.println(age +"  Name:    "+name.trim());
        /*System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+mobileNo);
        System.out.println("CGPA: "+cgpa);*/
    }
}