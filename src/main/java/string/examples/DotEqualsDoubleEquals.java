package string.examples;

public class DotEqualsDoubleEquals {
	public static void main(String[] args) {
		String s1 ="String1";
		String s3 ="String1";
		String s2= new String(s1);// new String("String1");
		System.out.println(s1==s3);// it verifies Strings value and memory.
		System.out.println(s1.equals(s3));// it verifies Strings value only.
		System.out.println(s1==s2);//it verifies Strings value and memory.
		System.out.println(s1.equals(s2));// it verifies Strings value only.
	}

}
