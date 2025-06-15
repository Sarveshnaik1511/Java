package advance;

public class CountCapitalAndSmallCharacters {
	public static void main(String[] args) {

		String name = "Sarvesh Is fRom India";
		int countCap=0;
		int countSmall=0;
		for (int i = 0; i < name.length(); i++) {
			char namechar = name.charAt(i);
			
			if(namechar>=65 && namechar<=90) {
				countCap++;
			}
			else if(namechar==' ') {
				continue;
			}
			else {
				countSmall++;
			}
		}
		
			System.out.println("Capital case count= "+countCap);
		
		
			System.out.println("Small case count="+countSmall);
		
	}

}
