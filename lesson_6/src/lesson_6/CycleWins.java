package lesson_6;

public class CycleWins {

	public static void main(String[] args) {
		String players[] = new String[4];
		players[0] = "David";
		players[1] = "Daniel";
		players[2] = "Anna";
		players[3] = "Gregory";
		int totalPlayers = players.length;
		int counter;
		for (counter=0; counter < totalPlayers; counter++){
		 	String thePlayer = players[counter];
		 	System.out.println("Поздравляем, "+ thePlayer+" ");
		}

	}

}

