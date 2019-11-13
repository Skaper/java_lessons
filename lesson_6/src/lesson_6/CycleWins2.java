package lesson_6;

public class CycleWins2 {
	public static void main(String[] args) {
		String players[] = new String[4];
		players[0] = "David";
		players[1] = "Daniel";
		players[2] = "Anna";
		players[3] = "Gregory";
		int totalPlayers = players.length;
		int counter = 0;
		while (counter < totalPlayers){
			 String thePlayer = players[counter];
			 System.out.println("Поздравляем, "+ thePlayer + "!");
			 counter++;
		}
	}
}

