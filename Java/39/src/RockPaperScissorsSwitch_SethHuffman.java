import java.util.Scanner;

//import javax.swing.Spring;

public class RockPaperScissorsSwitch_SethHuffman {
	//SethHuffman
	public static void evalWinner(int compare, int p1v){
		if (p1v == compare){
			System.out.print("Player 1 Wins");
		} else {
			System.out.print("Player 2 Wins");
		}
	}

		public static void main(String[] args) {
			
			Scanner thing = new Scanner(System.in);
			
			System.out.print("Player 1 throws: ");
			String player1 = thing.nextLine();
			player1=player1.toUpperCase();
					
			System.out.print("Player 2 throws: ");
			String player2 = thing.nextLine();
			player2=player2.toUpperCase();
					
			int Rock = 1;
			int Scissor = 2;
			int Paper = 4;
			int Lizard = 8;
			int Spock = 16;
			
			int player1val = 0;
			int player2val = 0;

			if (player1.equals("SPOCK")){
				player1val = Spock;
			} else if (player1.equals("LIZARD")){
				player1val = Lizard;
			} else if (player1.equals("PAPER")){
				player1val = Paper;
			} else if (player1.equals("SCISSOR")){
				player1val = Scissor;
			} else if (player1.equals("ROCK")){
				player1val = Rock;
			}
			if (player2.equals( "SPOCK")){
				player2val = Spock;
			} else if (player2.equals("LIZARD")){
				player2val = Lizard;
			} else if (player2.equals("PAPER")){
				player2val = Paper;
			} else if (player2.equals("SCISSOR")){
				player2val = Scissor;
			} else if (player2.equals("ROCK")){
				player2val = Rock;
			}
			
			int game = player1val+player2val;
			
			
			
/*					1 String RockWin1 = Rock + Scissor;
					2 String RockWin2 = Rock + Lizard;
					3 String ScissorWins1 = Scissor + Lizard;
					4 String ScissorWins2 = Scissor + Paper;
					5 String PaperWins1 = Paper + Rock;
					6 String PaperWins2 = Paper + Spock;
					7 String LizardWins1 = Lizard + Paper;
					8 String LizardWins2 = Lizard + Spock;
					9 String SpockWins1 = Spock + Rock;
					10 String SpockWins2 = Spock + Paper;
					11 String Tie = Rock + Rock;
					12 String Tie1 = Scissor + Scissor;
					13 String Tie2 = Paper + Paper;
					14 String Tie3 = Lizard + Lizard;
					15 String Tie4 = Spock + Spock;
					16 String NoValue = NoValue;*/
					
					
					switch (game) {

					case 2:  System.out.println("It is a Tie");
                    		 break;
		            case 3:  System.out.println("Rock Wins");
		            		 evalWinner(Rock,player1val);
                    		 break;
					case 4:  System.out.println("It is a Tie");
		                     break;
		            case 5:  System.out.println("Paper Wins");
		            		 evalWinner(Paper,player1val);
		                     break;
		            case 6:  System.out.println("Scisors Wins");
           		 			 evalWinner(Scissor,player1val);
		                     break;
		            case 8:  System.out.println("It is a Tie");
		                     break;
		            case 9:  System.out.println("Rock Wins");
           		 			 evalWinner(Rock,player1val);
		                     break;
		            case 10: System.out.println("Scisors Wins");
		            		 evalWinner(Scissor,player1val);
		                     break;
		            case 12: System.out.println("Lizard Wins");
		            		 evalWinner(Lizard,player1val);
		                     break;
		            case 16: System.out.println("It is a Tie");
		                     break;
		            case 17: System.out.println("Spock Wins");
           		 			 evalWinner(Spock,player1val);
		                     break;
		            case 18: System.out.println("Spock Wins");
  		 			 		 evalWinner(Spock,player1val);
		                     break;
		            case 20: System.out.println("Paper Wins");
		            		 evalWinner(Paper,player1val);
		                     break;
		            case 24: System.out.println("Lizard Wins");
		            		 evalWinner(Lizard,player1val);
		                     break;
					case 32: System.out.println("It is a Tie");
							 break;
		            default: System.out.println("No Value Pair");
		                     break;
						
		}
					
					thing.close();
		}
}

