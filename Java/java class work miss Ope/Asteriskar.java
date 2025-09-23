public class Asteriskar{

	public static void main(String[] args){
	
	int n = 5;
	String us = "*"; 
	for(int index = 1; index <= n; index++){
		for(int counter = index; counter <= n; counter++){
		
		System.out.print("");
	}
	for(int counter = 1; counter <= index; counter++){
		System.out.printf("%s \t \t %s",us,us);

		
	}
	System.out.println();
}
}

} 


