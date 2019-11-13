package lesson_4;
import java.util.Scanner;

public class LogicTree {

	public static void main(String[] args) {
		int day = 1; //Текущий день
		int month = 1; //Текущий месяц
		
		Scanner in = new Scanner(System.in);
        System.out.print("Какой сейчас день?: ");
        day = in.nextInt();
        System.out.print("Какой сейчас месяц?: ");
        month = in.nextInt();
        
		if(day >= 1 && day <= 8 && month == 1) {
			System.out.println("Новогодние каникулы");
		}else if(day == 7 && month == 1) {
			System.out.println("Рождество");
		}else if(day == 23 && month == 2) {
			System.out.println("День защитника Отечества");
		}else if(day == 8 && month == 3) {
			System.out.println("Международный женский день");
		}else {
			System.out.println("Не знаю праздника в этот день");
		}
		in.close();
	}

}
