import java.util.Scanner;
public class Metropolis{
	public static void main(String[] args) {

		boolean isCapital;
		int numberOfCitizens;
		double taxesPerCitizen;

		Scanner.scanner=new Scanner(System.in);
		
		System.out.println("is the city Capital y/n");
		isCapital=scanner.nextBoolean();
			if (isCapital=='y'|| isCapital=='Y') {
					isCapital=1;
				}
			else if(isCapital=='n'|| isCapital=='N') {
					isCapital=0;

				}
			else
					System.out.println("is the city Capital y/n");

		System.out.println("How many citizen it has?");
		numberOfCitizens=scanner.nextInt();

		System.out.println("How much the average income of a year");
			taxesPerCitizen=scanner.nextDouble();
			


        
		
	}






}
		
	






