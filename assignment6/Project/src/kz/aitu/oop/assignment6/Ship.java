package kz.aitu.oop.assignment6;

public class Ship implements Transport{

	@Override
	public void deliver() {
		System.out.println("Delivered by ship in container");
	}
}
