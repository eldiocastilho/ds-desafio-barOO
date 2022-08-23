package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bill bill;
		bill = new Bill();

		System.out.print("Sexo: ");
		bill.gender = sc.next().charAt(0);

		System.out.print("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();

		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();

		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();

		double valFeeding = bill.feeding();
		double valCover = bill.cover();
		double valTicket = bill.ticket();
		double valTotal = bill.total();
		
		System.out.println();
		System.out.println("RELATÓRIO");
		System.out.printf("Consumo = R$ %.2f%n" , valFeeding );	
		if (valCover > 0) {
		System.out.printf("Couvert = R$ %.2f%n" , valCover );
		} else {
			System.out.println("Isento de Couvert");	
		}
		System.out.printf("Ingresso = R$ %.2f%n" , valTicket );
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f%n" , valTotal );
		
		sc.close();
	}

}
