package lesson_9;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelExample {
	public LabelExample() {
		JFrame frame = new JFrame("Заголовок окна");
		frame.setBounds(100, 100, 200, 200); // Размеры окна
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Текст на экране");
		frame.getContentPane().add(label);
		frame.setVisible(true); //Делаем окно видимым
	}
	public static void main(String[] args) {
		LabelExample app = new LabelExample(); // Запускаем
	}
}
