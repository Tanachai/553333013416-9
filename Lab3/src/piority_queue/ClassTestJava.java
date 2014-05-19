package piority_queue;

import java.util.Arrays;

public class ClassTestJava {
	public static void main(String[] args) {
		Car[] CarArrays = new Car[] {
				new Car("HONDA","VIOS",800000),
				new Car("TOYOTA","fortuner",1200000)};
				Arrays.sort(CarArrays);
				System.out.println(Arrays.toString(CarArrays));

	}
}
