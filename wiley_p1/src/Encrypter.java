import java.util.Scanner;

public class Encrypter {
	
static Scanner input = new Scanner (System.in);
	
	public static void main (String [] args) {
		
		int numToEncrypt;
		System.out.println("Enter a 4 digit number to encrypt: ");
		numToEncrypt = input.nextInt();
		String encryptedCode = String.format("%04d", encrypt(numToEncrypt));
		System.out.printf("The encrypted code is: ");
		System.out.println(encryptedCode);
		
		int numToDecrypt;
		System.out.println("Enter a 4 digit number to decrypt: ");
		numToDecrypt = input.nextInt();
		String decryptedCode = String.format("%04d", Decrypter.decrypt(numToDecrypt));
		System.out.printf("The decrypted code is: ");
		System.out.println(decryptedCode);
	}
	
	//Encryption calculations. Returns encrypted number.
	public static int encrypt(int num) {
		 int temp = num;
		 int digit4 = (temp + 7) % 10;
		 temp = temp / 10;
		 
		 int digit3 = (temp + 7) % 10;
		 temp = temp / 10;
		 
		 int digit2 = (temp + 7) % 10;
		 temp = temp / 10;
		 
		 int digit1 = (temp + 7) % 10;
		 int encryptedNum = (digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2);
		 return encryptedNum;
	}
}
