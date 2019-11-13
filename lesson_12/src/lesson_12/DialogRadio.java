package lesson_12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class DialogRadio {
	public static void main(String[] args) {
		JFrame f=new JFrame();//creating instance of JFrame 
		
		JLabel label = new JLabel("Что лучше?");
		label.setBounds(140,5,100, 40);//x-положение, y-положение, ширина,  высота  
		
		JRadioButton radio1 = new JRadioButton("Android"); //Создание переключателя
		radio1.setBounds(115,50,80, 40);//x-положение, y-положение, ширина,  высота  
		
		JRadioButton radio2 = new JRadioButton("iOS");
		radio2.setBounds(200,50,80, 40);//x-положение, y-положение, ширина,  высота  
		
		JButton b=new JButton("click"); //Создание экземпляра новой кнопки
		b.setBounds(130,100,100, 40);//x-положение, y-положение, ширина,  высота  
		
		ButtonGroup group = new ButtonGroup(); //Создание группы элементов
		group.add(radio1); // Добавление radio1 в группу group
		group.add(radio2); // Добавление radio1 в группу group
		
		b.addActionListener(new ActionListener() { //Слушатель нажатий кнопки
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String message = "Нужно что-то выбрать!";
				if(radio1.isSelected()) message = "Ты вырал Android, учи язык java!";
				if(radio2.isSelected()) message = "Ты вырал iOS, учи язык swift!";
				JOptionPane.showMessageDialog(null,
						message,
			    		"Заголовок окна",
			    	    JOptionPane.PLAIN_MESSAGE);
			}
		});
		f.add(b);//добавление кнопки к JFrame  
		f.add(radio1);//добавление переключателя к JFrame  
		f.add(radio2);//добавление переключателя к JFrame  
		f.add(label);//добавление текста к JFrame  
		f.setSize(400,500); //400 ширина и 500 высота окна  
		f.setLayout(null); //Отключаем менеджер слоев располож. элементов
		f.setVisible(true);//делаем frame видимым  
	}
}
