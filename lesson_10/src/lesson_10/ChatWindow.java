package lesson_10;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatWindow {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Чат");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("FILE");
		JMenu m2 = new JMenu("Help");
		
		JMenuItem m11 = new JMenuItem("Open");
		JMenuItem m22 = new JMenuItem("Save as");
		
		m1.add(m11);
		m1.add(m22);
		
		mb.add(m1);
		mb.add(m2);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Введите текст");
		panel.add(label);
		JTextField tf = new JTextField(10);
		panel.add(tf);
		JButton send = new JButton("Отправить");
		panel.add(send);
		JButton reset = new JButton("Отчистить");
		panel.add(reset);
		
		JTextArea ta = new JTextArea();
		
		send.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text =  tf.getText();
				ta.setText(ta.getText() + "YOU: " + text + "\n");
				
			}
		});
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("");
				ta.setText("");
			}
		});
		
		
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.getContentPane().add(BorderLayout.NORTH, mb);
		frame.getContentPane().add(BorderLayout.CENTER, ta);
		frame.setVisible(true);
	}

}
