package estudos;

import java.util.ArrayList;
import java.util.Scanner;

public class exemplos2 {
	public static void main(String[] args) {
		ArrayList<Byte> maiorpromenor = new ArrayList<Byte>();
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um valor");
		byte n1 = sc.nextByte();
		maiorpromenor.add(n1);
		System.out.println("digite um valor");
		byte n2 = sc.nextByte();
		maiorpromenor.add(n2);
		System.out.println("digite um valor");
		byte n3 = sc.nextByte();
		maiorpromenor.add(n3);
		System.out.println(maiorpromenor);
		maiorpromenor.sort(null);
		System.out.println(maiorpromenor);
	}
}