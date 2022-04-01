package oops.abstraction;

public interface IVechile {
	void start();

	void brak();

	void stop();

}

class Maruthi implements IVechile {

	@Override
	public void start() {
		System.out.println("starting....");

	}

	@Override
	public void brak() {
		System.out.println("breaking......");

	}

	@Override
	public void stop() {
		System.out.println("stoping....");

	}

}

class Suzike implements IVechile {

	@Override
	public void start() {
		System.out.println("strting.....");

	}

	@Override
	public void brak() {
		System.out.println("braking...");

	}

	@Override
	public void stop() {
		System.out.println("stoping....");// we have to write logic here
	}

}