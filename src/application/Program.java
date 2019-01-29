package application;

import java.util.Scanner;

import entities.Room;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// Determina quantos quartos vai alugar;
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		
		
		Room[] vect = new Room[10];
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Rent #"+i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String mail = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Room(name,mail,room);
		}
		for (int i = 0; i < vect.length;i++) {
			if(vect[i] != null) {
				System.out.println(vect[i].toString());
			}
		}
		
		
		sc.close();
	}

}
