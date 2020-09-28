import java.util.*;
public class App {

	public static void main(String[] args) {
	    ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

	    while (moreInput()) {
	        double height = getUserHeight();
	        double weight = getUserWeight();

	        BodyMassIndex bmi = new BodyMassIndex(height, weight);
	        bmiData.add(bmi);

	        displayBmiInfo(bmi);
	    }

	    displayBmiStatistics(bmiData);
	}
	
	private static boolean moreInput() {
		System.out.println("Would you like to do another calculation? (Y or N)");
		Scanner input = new Scanner(System.in);
		String answer = input.next();
		if (answer == "Y") {
			return true;
		} else if (answer == "N") {
			return false;
		}
	}

	private static void displayBmiInfo(BodyMassIndex bmi) {
		double tempBmi = BodyMassIndex.calculateBmi(getUserHeight(), getUserWeight());
		int tempBmiCategory = BodyMassIndex.calculateBmiCategory(tempBmi);
		BodyMassIndex.displayBmiInfo(tempBmi, tempBmiCategory);
	}
	
	private static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) {
			// TODO Auto-generated method stub
			
		}
	public static double getUserHeight() {
		Scanner input = new Scanner(System.in);
		double height = 0;
		//imperial height

		System.out.println("Please enter your height in feet: ");
		double heightFeet = input.nextDouble();
		
		System.out.println("Please enter the remaining inches, if any, in your height:");
		double heightInches = input.nextDouble();
		
		while(heightInches < 0 || heightInches > 11) {
			System.out.println("Please retry with inches between 0 and 11:");
			heightInches = input.nextInt();
		}
		height = (heightFeet * 12) + heightInches;
		System.out.println("Your height in inches is: " + height);
		
		return height;
	}
	
	//use the same value from unitType to determine which method is used to obtain the weight
	public static double getUserWeight() {
		Scanner input = new Scanner(System.in);
		double weight = 0;
		//imperial weight

		 System.out.println("What is your weight in pounds? " );
	     double pounds = input.nextInt();
	     while (pounds < 0) {
	     System.out.println("Please enter a valid weight in pounds: " );
		 pounds = input.nextDouble();
	     }
	     weight = pounds;
	     System.out.println("Your weight in pounds is: " + weight);

		return weight;
	  }
}
