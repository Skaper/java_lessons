package lesson_12;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dialog {
	public static void main(String[] args) {
		JFrame f=new JFrame();//creating instance of JFrame  
		JButton b=new JButton("click"); //Создание экземпляра новой кнопки
		b.setBounds(130,100,100, 40);//x-положение, y-положение, ширина,  высота  
		
		b.addActionListener(new ActionListener() { //Слушатель нажатий кнопки
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,
			    		"Ты нажал на кнопку!",
			    		"Заголовок окна",
			    	    JOptionPane.PLAIN_MESSAGE);
			}
		});;
		f.add(b);//добавление кнопки к JFrame  
		f.setSize(400,500); //400 ширина и 500 высота окна  
		f.setLayout(null); //Отключаем менеджер слоев располож. элементов
		f.setVisible(true);//делаем frame видимым  
	}

}
