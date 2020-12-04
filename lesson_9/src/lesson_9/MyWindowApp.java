package lesson_9;

import javax.swing.JFrame;

public class MyWindowApp {
	public MyWindowApp() {
		JFrame frame = new JFrame("Заголовок окна");
		frame.setBounds(100, 100, 200, 200); // Размеры окна
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		MyWindowApp app = new MyWindowApp(); // Запускаем
	}
}
