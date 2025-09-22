import java.util.Scanner;

public class Pronounciation{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an alphabet: ");
	char alphabet = input.next().charAt(0);

String vowel = "AEIOUaeiou";
String consonant = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";

int count = 0;

for (int i = 0; i < vowel.length(); i++) {
	if (alphabet == vowel.charAt(i)){
		count = count+1;
	}
    
}
if (count == 1){
	System.out.print(alphabet + "  is a vowel");
	}

for (int i = 0; i < consonant.length(); i++) {
	if (alphabet == consonant.charAt(i)){
		count = count+1;
	}
}
if (count == 1){
	System.out.print(alphabet + "  is a consonant");
	}
	
else {
	System.out.print(alphabet + "  is an invalid input");
	
}

	}
}
