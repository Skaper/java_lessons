package lesson_3;

public class Logic {

	public static void main(String[] args) {
		boolean isButtonPressed = true; //Состояние кнопки
		boolean isChecked = false; //Состания флажка
		
		if(isButtonPressed) {
			System.out.println("Кнопка нажата!");
		}else {
			System.out.println("Кнопка НЕ нажата!");
		}
		
		if(isChecked) {
			System.out.println("Флажок установлен!");
		}else {
			System.out.println("Флажок снят!");
		}

	}

}
