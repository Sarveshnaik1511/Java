package advance;

public class CountDuplicateCharacters {
	
	public static void main(String[] args) {
		String info ="Sarvesh is from sindhudurg";
		
		info= info.toUpperCase();
		
		char [] c =info.toCharArray();
		for(int i=0;i<c.length;i++) {
			int count=0;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j] && c[j]!=' ' ) {
					count ++;
					c[j]=' ';
				}
				
			}
			if(count>0) {
			System.out.println(c[i] +" repeated "+count +" times");
		}
			}
		
		}
		
	}


