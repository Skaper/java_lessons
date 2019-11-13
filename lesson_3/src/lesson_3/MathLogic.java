package lesson_3;

public class MathLogic {
	public static void main(String[] args) {
		int age = 15;//Возраст
		if(age < 14) {
			System.out.println("У тебя нет паспорта!");
		}
		if(age == 14) {
			System.out.println("Иди получать паспорт");
		}
		
		if(age >= 14) {
			System.out.println("У тебя уже есть паспорт!");
		}
	}
}
