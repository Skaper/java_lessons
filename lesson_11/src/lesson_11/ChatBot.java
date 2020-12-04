package lesson_11;

import java.util.HashMap;

public class ChatBot {
	private HashMap<String, String> wordsList;
	
	public ChatBot() {
		wordsList = new HashMap<String, String>();
		//Словарь ответов бота: addAnswer("Вопрос", "Ответ")
		addAnswer("Как дела", "Хорошо!");
		addAnswer("Пока", "бб");
	}
	
	private void addAnswer(String question, String answer) {
		wordsList.put(question.toLowerCase(), answer.toLowerCase());
	}
	
	public String getAnswer(String question) {
		return wordsList.get(question.toLowerCase());
	}
}
