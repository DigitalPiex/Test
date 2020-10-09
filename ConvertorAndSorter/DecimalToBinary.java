package test;

import java.util.ArrayList;
import java.util.Random;

public class DecimalToBinary {

	public static String convertDecToBin(int decimal) {

		StringBuilder sb = new StringBuilder();

		while (decimal != 0) {
			sb.append(decimal % 2);
			decimal = decimal / 2;
		}

		return sb.reverse().toString();
	}

	public static void main(String[] args) {

		ArrayList<Integer> tenNumbers = new ArrayList<>(10);

		for (int i = 0; i < 10; i++) {
			tenNumbers.add(new Random().nextInt(512));
		}

		tenNumbers.forEach(x -> System.out.println(x + " - " + convertDecToBin(x)));

	}
}