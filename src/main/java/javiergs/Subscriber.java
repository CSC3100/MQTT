package javiergs;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class Subscriber implements MqttCallback {
	
	public static void main(String[] args) {
		String broker = "tcp://test.mosquitto.org:1883";
		String topic = "software/360";
		String clientId = "ASU-subscriber";
		
		try {
			MqttClient client = new MqttClient(broker, clientId);
			client.setCallback(new Subscriber());
			client.connect();
			System.out.println("Connected to broker: " + broker);
			client.subscribe(topic);
			System.out.println("Subscribed to topic: " + topic);
		} catch (MqttException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void connectionLost(Throwable throwable) {
		System.out.println("Connection lost: " + throwable.getMessage());
	}
	
	@Override
	public void messageArrived(String s, MqttMessage mqttMessage) {
		System.out.println("Message arrived. Topic: " + s +
			" Message: " + new String(mqttMessage.getPayload()));
	}
	
	@Override
	public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
	}
}
