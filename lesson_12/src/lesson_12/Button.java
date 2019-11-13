package lesson_12;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button {

	public static void main(String[] args) {
		JFrame f=new JFrame();//creating instance of JFrame  
        
		JButton b=new JButton("click"); //Создание экземпляра новой кнопки
		b.setBounds(150,100,100, 40);//x-положение, y-положение, ширина,  высота  
		          
		f.add(b);//добавление кнопки к JFrame  
		          
		f.setSize(400,500); //400 ширина и 500 высота окна  
		f.setLayout(null); //Отключаем менеджер слоев располож. элементов
		f.setVisible(true);//делаем frame видимым  
	}
}
