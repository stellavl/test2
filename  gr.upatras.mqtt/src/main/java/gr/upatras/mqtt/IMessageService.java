package gr.upatras.mqtt;

public interface IMessageService {
	Message postMessage(String text);
	void publishMessage(Message message);
}