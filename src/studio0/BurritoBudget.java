package studio0;

public class BurritoBudget {

		public static void main(String args[]) {
		double burritosEatenWeek1 = 7;
		double burritosEatenWeek2 = 4;
		double burritosEatenWeek3 = 19; //don't judge me
		double burritosEatenWeek4 = 1;
		
		double totalBurritos = burritosEatenWeek1 + burritosEatenWeek2 + burritosEatenWeek3 + burritosEatenWeek4;
		double averageWeeklyBurritos = totalBurritos / 4;
		
		double burritoPrice = 7.50;
		double averageWeeklyPrice = averageWeeklyBurritos * burritoPrice;
		
		System.out.println("You have spent an average of $" + averageWeeklyPrice + " per week on burritos.");
	
	}
}
