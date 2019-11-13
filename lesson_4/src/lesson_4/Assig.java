package lesson_4;

public class Assig {

	public static void main(String[] args) {
		int cheeps = 113; //Сколько у тебя есть чипсов
		int people = 5; // На сколько человек нужно разделить поровну
		cheeps %= people; // то же cheeps = cheeps % people
		System.out.println("Чипсов осталось: " + cheeps);
		
		System.out.println("Запуск машины по клонированию котов...");
		int cats = 2; // У тебя 2 кота
		cats *= 5; //Клонируем каждого кота по 5 раз
		//то же cats = cats * 5;
		System.out.println("Теперь у меня " + cats + " котов!");

	}

}
