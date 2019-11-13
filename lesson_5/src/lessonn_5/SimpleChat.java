package lessonn_5;

import java.util.Scanner;

public class SimpleChat {

	public static void main(String[] args) {
		boolean chating = true;
		String textInput = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Начало чата...");
				
		while(chating) {
			textInput = (String) in.nextLine();

			if ( textInput.equals("Привет") ) {
				System.out.println("Привет! Как тебя зовут?");
			}else if( textInput.equals("Вася") ) {
				System.out.println("Привет Васёк, я Геннадий");
			}else if( textInput.equals("Как дела?") ) {
				System.out.println("Нормас!");
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
