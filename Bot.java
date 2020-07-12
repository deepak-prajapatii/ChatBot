package chatbot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Bot extends JFrame {

	private JTextArea Chatarea = new JTextArea();
	private JTextField chatbox = new JTextField();

	public Bot() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(600, 600);
		frame.setTitle("ChatBot");
		frame.add(Chatarea);
		frame.add(chatbox);

		// For TextArea

		Chatarea.setSize(500, 400);
		Chatarea.setLocation(2, 2);

		// For TextField
		chatbox.setSize(400, 30);
		chatbox.setLocation(2, 500);

		chatbox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String text = chatbox.getText();
				String gtext = text.toLowerCase();
				Chatarea.append("You -> " + text + "\n");
				chatbox.setText("");

				if (gtext.contains("hi")) {
					bot("Holla");
				} else {
					int rand = (int) (Math.random() * 5 + 1);
					if (rand == 1) {
						bot("Sorry I can't help you");
					} else if (rand == 2) {
						bot("Sorry I can't help you Bro");
					} else {
						bot("Please try after sometime :) ");
					}

				}

			}

		});

	}

	private void bot(String string) {
		Chatarea.append("BOT -> " + string + "\n");
	}

	public static void main(String[] args) {
		new Bot();

	}

}
