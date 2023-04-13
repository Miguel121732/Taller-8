package cartas;
import java.util.Scanner;

public class MainCard {
	
	public static void main(String args[]){
		 int suitNumber = (int)(Math.random()*4.0+1);
		 int faceNumber = (int)(Math.random()*13.0+1);
		 Card newCard = new Card(suitNumber,faceNumber);
		 System.out.println(newCard);
		 
		 int suitNumber2 = (int)(Math.random()*4.0+1);
		 int faceNumber2 = (int)(Math.random()*13.0+1);
		 Card newCard2 = new Card(suitNumber2,faceNumber2);
		 System.out.println(newCard2);
		 
		 int points = newCard.points+newCard2.points;
		 System.out.println("The total points = " + points);
		 int numCards = 2;
		 
		 try (Scanner reader = new Scanner(System.in)) {
			int choice = 1;
			 while(choice == 1 && points < 21 && numCards < 5){
				 System.out.println("¿Quieres otra tarjeta?");
				 System.out.println("1. Si");
				 System.out.println("2. No");
				 choice=reader.nextInt();
			if(choice == 1){
					 numCards++;suitNumber = (int)(Math.random()*4.0+1);
					 faceNumber = (int)(Math.random()*13.0+1);
					 newCard2 = new Card(suitNumber,faceNumber);
			System.out.println(newCard2);
			points += newCard2.points;
			System.out.println("El total de puntos es: " +points);
			
			}
			
  }
		}
		 
	}
}
