package gr.upatras.mqtt;

import org.springframework.stereotype.Service;

@Service
public class MessageService implements IMessageService {
	public Message postMessage(String text) {
		Message message = new Message(text);
		return message;
	}
	
	public void publishMessage(Message message) {
		message.publish();
	}
}