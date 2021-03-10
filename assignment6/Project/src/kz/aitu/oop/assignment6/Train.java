package kz.aitu.oop.assignment6;

public class Train implements Transport{

	@Override
	public void deliver() {
		System.out.println("Delivered by train in freight car");
	}
}
