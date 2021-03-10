package kz.aitu.oop.assignment6;

public class SeaLogistics implements Logistics{

	@Override
	public Transport planDelivery() {
		return new Ship();
	}

	@Override
	public Transport createTransport() {
		return new Ship();
	}
}
