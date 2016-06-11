import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = input.nextLine();
		StringBuffer buffer = new StringBuffer(word);
		buffer.reverse();
		System.out.println("The reversed word is: " + buffer);
		input.close();
	}
}
