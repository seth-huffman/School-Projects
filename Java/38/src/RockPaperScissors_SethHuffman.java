import java.util.Scanner;

public class RockPaperScissors_SethHuffman {
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
				
				int results = player1val+player2val;

				
				if (results == 3) {
					evalWinner(Rock,player1val);
					} else if (results == 9) { 
						evalWinner(Rock,player1val);
					} else if (results == 6) { 
						evalWinner(Scissor,player1val);
					} else if (results == 10) { 
						evalWinner(Scissor,player1val);
					} else if (results == 5) { 
						evalWinner(Paper,player1val);
					} else if (results == 20) { 
						evalWinner(Paper,player1val);
					} else if (results == 24) { 
						evalWinner(Lizard,player1val);
					} else if (results == 12) { 
						evalWinner(Lizard,player1val);
					} else if (results == 18) { 
						evalWinner(Spock,player1val);
					} else if (results == 17) { 
						evalWinner(Spock,player1val);
					} else if (results == 2){
						System.out.print("It is a Tie");
					} else if (results == 4){
						System.out.print("It is a Tie");
					} else if (results == 8){
						System.out.print("It is a Tie");
					} else if (results == 16){
						System.out.print("It is a Tie");
					} else if (results == 32){
						System.out.print("It is a Tie");
					} else { System.out.print("No value pair");}
					
	}
}

