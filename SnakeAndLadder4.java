

public class SnakeAndLadder4 {

	public static void main(String[] args) {
		
		int position = 0;
		System.out.println(" Welcome player!! ");
		
		
		int dice;
		int option;
		
		
		while (position < 100) {
			dice = (int)Math.floor( (Math.random() * 10) % 6 + 1); 
			System.out.println("\n The dice was rolled to: " + dice);
			option = (int)Math.floor(Math.random() * 3); 
			
			switch(option) {
			case 0: 
				System.out.println(" Player action: nothing");
				break;
			case 1: 
				System.out.println(" Player action: ladder");
				position += dice;
				break;
			case 2: 
				System.out.println(" Player action: snake");
				position -= dice;
				position = position < 0 ? 0 : position;
				break;
							
			}
			
			System.out.println(" Current position: " + position);
			
		}
		
		System.out.println(" Congratulations!! You won the game!!");
	}

}
