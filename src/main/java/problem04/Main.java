package problem04;

public class Main {
	public static void main(String[] args) {
		
		for(int i=1;i<=9; i++) {
			int random1 = (int)(Math.random()*10)+1;
			int random2 = (int)(Math.random()*10)+1;
			int random3 = (int)(Math.random()*80)+9;
			int random4 = (int)(Math.random()*80)+9;
			
			if(random1 == 10 ) {
				random1 = random1-1;
			}else if(random2 == 10) {
				random2 = random2-1;
			}
			
			//System.out.println(i+"X"+random1+", "+i+"X"+random2);
			System.out.println(i+"X"+random1+"?");
			System.out.println(random3);
			System.out.println(i+"X"+random2+"?");
			System.out.println(random4);
		}
		
//		while(true) {
//			int i = 1;
//			int random1, random2 = (int)(Math.random()*10)+1;
//			int random3, random4 = (int)(Math.random()*80)+9;
//			
//			System.out.println(i+"X"+random1+"?");
//			System.out.println(random3);
//			System.out.println(i+"X"+random2+"?");
//			System.out.println(random4);
//			i++;
//			
//			if(i == 9) {
//				break;
//			}
//		}
	}
}