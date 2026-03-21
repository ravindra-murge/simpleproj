package ms.proj.profile;

import ms.proj.simple.login;

 class profile {
	 
	 int method1() {
		  int a=10;
		  int b=20;
		  int c =a+b;
		  System.out.println(c);
		return c;
	 }

	public static void main(String[] args) {
		profile object =new profile();
		System.out.println("good morning");
		
		int var =object.method1();
System.out.println(var);
		
	}
}
