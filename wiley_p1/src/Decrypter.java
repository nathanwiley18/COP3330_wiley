//Decryption calculations. Returns decrypted number.
public class Decrypter {
	public static int decrypt(int num2) {
		
		int temp = num2;
		int digit3 = (temp + 3) % 10;
		 temp = temp / 10;
		 
		 int digit4 = (temp + 3) % 10;
		 temp = temp / 10;
		 
		 int digit1 = (temp + 3) % 10;
		 temp = temp / 10;
		 
		 int digit2 = (temp + 3) % 10;
		 int decryptedNum = (digit4 * 1000 + digit3 * 100 + digit2 * 10 + digit1);
		 return decryptedNum;
	}
}
