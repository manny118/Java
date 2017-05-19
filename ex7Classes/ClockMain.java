package ex7Classes;

public class ClockMain {

	public static void main(String[] args) {


		Clock c1 = new Clock(15, 90, 140);

		System.out.println(c1);


		c1.incrementHours(13);

		System.out.println(c1);


		c1.incrementMinutes(90);

		System.out.println(c1);


		c1.incrementSeconds(600);

		System.out.println(c1);


		c1.reset();
		System.out.println(c1);


	}




}
