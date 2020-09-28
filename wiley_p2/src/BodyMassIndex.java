import java.util.*;

public class BodyMassIndex {
	
	//use the unitType value, the returned height value and the returned weight value to calculate
	//the correct BMI based on the measurement system used
	public static double calculateBmi(double height, double weight) {
		
		double bmi = 0;
		bmi = (weight * 703) / (height * height);
		
		return bmi;
	}
	
	//use the returned BMI value to calculate and return the correct BMI category
	public static int calculateBmiCategory(double bmi){
		int category = 0;
		if (bmi < 18.5) {
			category = 1;
		} else if (bmi > 18.5 && bmi < 24.9) {
			category = 2;
		} else if (bmi > 25 && bmi < 29.9) {
			category = 3;
		} else {
			category = 4;
		}
		return category;
	}
	
	//finally, using the BMI and the BMI category, determine and print the correct BMI
	//and BMI category 
    public static void displayBmiInfo(double bmi, int category)
    {
        System.out.println("Your BMI is: " + bmi);
        if (category == 1) {
        	System.out.println("Based on your BMI, you are underweight.");
        } else if (category == 2) {
        	System.out.println("Based on your BMI, you are normal weight.");
        } else if (category == 3) {
        	System.out.println("Based on your BMI, you are overweight.");
        } else if (category == 4) {
        	System.out.println("Based on your BMI, you are obese.");
        }
    }
}
