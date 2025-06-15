package basic;

public class Nested_Ifelse{
	
	// i will buy furniture only of the shop has more than 10 varieties
	// In that shop there should be 25% discount
	// They should give me no cost EMI
	
	public static void main(String[] args) {
		
		int variety=15;
		int discount=25;
		boolean NoCostEmi= false;
		
		if(variety>=15) {
			System.out.println("OK, Lets ask for discount");
			
			if(discount>=25) {
				System.out.println("Okay, lets ask for EMI option");
				
				if(NoCostEmi==true) {
					System.out.println("Okay, i will buy furniture from this shop");
				}
				else {
					System.out.println("No cost Emi is not available here, will go to next shop");
				}
			}
			else {
				System.out.println("they have less discount, Lets go to next shop");
			}
			
		}
		else {
			System.out.println("Lets go to next shop");
		}
	}
}