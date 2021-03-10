package kz.aitu.oop.assignment6;

public class RoadLogistics implements Logistics{

	@Override
	public Transport planDelivery() {
		return new Truck();
	}

	@Override
	public Transport createTransport() {
		return new Truck();
	}
}
