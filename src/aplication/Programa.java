package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Programa {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
//		Date entrada= formato.parse("12/01/2024");
//		Date salida= formato.parse("15/01/2024");
//		
//		String entrada2 = ""+entrada;
//		
//		Reservation reserva1 = new Reservation(1020, entrada,salida);
//		System.out.println(reserva1);
//		
//		System.out.println("entre " + entrada2 + " y " + salida + " hay " + Reservation.duracion(entrada,salida) + " dias");
		
		
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Room number: ");
		int number = sc.nextInt();
		System.out.println("Check-in date (dd/MM/yyyy)");
		Date checkIn = formato.parse(sc.next());
		System.out.println("Check-Out date (dd/MM/yyyy)");
		Date checkOut = formato.parse(sc.next());
		
		if(!checkOut.after(checkIn)) {
			System.out.println("error salida antes de entrada");
		}
		else {
			Reservation reserva = new Reservation(number, checkIn, checkOut);
			System.out.println(reserva);
			
			System.out.println();
			System.out.println("enter data to update reservation");
			System.out.println("Check-in date (dd/MM/yyyy)");
			checkIn = formato.parse(sc.next());
			System.out.println("Check-Out date (dd/MM/yyyy)");
			checkOut = formato.parse(sc.next());
			
			reserva.updateDates(checkIn, checkOut);
			System.out.println(reserva);
		}
		
		
	
	
	}

}
