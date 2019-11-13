package lessonn_5;

import java.util.Scanner;

public class SimpleChat2 {
	public static void main(String[] args) {
		boolean chating = true;
		String textInput = "";
		String name = ""; //Ваше имя
		Scanner in = new Scanner(System.in);
		System.out.println("Начало чата...");
				
		while(chating) {
			textInput = (String) in.nextLine();

			if ( textInput.equals("Привет") ) {
				System.out.println("Как тебя зовут?");
				name = (String) in.nextLine();
				System.out.println("Привет " + name + "!");
			}else if( textInput.equals("Как дела?") ) {
				System.out.println("Нормас! А у тебя " + name + " как?");
			}else if( textInput.equals("Пока") ) {
				System.out.println("Пока!");
				chating = false;
			}else {
				System.out.println("Я не знаю что тебе ответить...");
			}
		}
		
		System.out.println("Конец чата.");
		in.close();
	}
}
