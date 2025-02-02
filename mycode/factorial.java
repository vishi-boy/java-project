package mycode;
class factorial{
	public static void main(String args[]) {
		int i,fact=1;
		int number=5;
		System.out.println("this factorial problem is solved by vishal gupta, roll no 118");
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of "+number+" is: "+fact);
	}
}