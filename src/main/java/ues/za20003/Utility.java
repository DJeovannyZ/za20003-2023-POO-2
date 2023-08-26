package ues.za20003;

public class Utility {

	public static double calculateCost(int age) {
        if(age <= 2) {
            return 10.00;
        }else if(age < 7 ){
            return 25.00;
        }else{
            return 35.00;
        }
	}
}
