package kz.aitu.oop.assignment6;

public interface Logistics {
	public default Transport planDelivery() {
		Transport q =createTransport();
		return q;
	};
	public Transport createTransport();
}