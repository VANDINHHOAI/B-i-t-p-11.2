package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		while (i < n) {
			if (i % 3 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("Tong cua cac so chia het cho 3 be hon n = " + sum);
	}	
}

