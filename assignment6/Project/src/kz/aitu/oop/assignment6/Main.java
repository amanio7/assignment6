package kz.aitu.oop.assignment6;

public class Main {
	public static void main(String[] args) {
		Logistics logistic=createLogisticsByTransport("Train");
		Transport q1=logistic.planDelivery();
		Logistics s=createLogisticsByTransport("Ship");
		Transport q2=s.createTransport();
		
		q1.deliver();
		q2.deliver();
	}
	public static Logistics createLogisticsByTransport(String transport) {
		if (transport.equalsIgnoreCase("Train")) {
			return new RailroadLogistics();
		} else if (transport.equalsIgnoreCase("Truck")) {
			return new RoadLogistics();
		} else if (transport.equalsIgnoreCase("Ship")) {
			return new SeaLogistics();
		} else {
			throw new RuntimeException(transport+"is unknown transport");
		}
	}
}