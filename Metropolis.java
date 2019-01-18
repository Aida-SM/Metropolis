import java.util.Scanner;
public class Metropolis{
    public static void main(String[] args) {

        boolean isCapital;
        char AnswerOfIsCapital;
        int numberOfCitizens;
        double taxesPerCitizen;

        Scanner scanner = new Scanner(System.in);

        System.out.println("is the city Capital y/n");
        AnswerOfIsCapital = scanner.next().charAt(0);
        if (AnswerOfIsCapital == 'y' || AnswerOfIsCapital == 'Y') {
            isCapital = true;
        } else if (AnswerOfIsCapital == 'n' || AnswerOfIsCapital == 'N') {
            isCapital = false;

        } else
            System.out.println("is the city Capital y/n");

        System.out.println("How many citizen it has?");
        numberOfCitizens = scanner.nextInt();

        System.out.println("How much the average income of a year");
        taxesPerCitizen = scanner.nextDouble();

        if (isCapital==true &&  numberOfCitizens>100000 || isCapital==false && numberOfCitizens>200000 && taxesPerCitizen>=720000000 ){

            System.out.println("this city is Metropolis");

        }

        else
            System.out.println("this city is not Metropolis");


    }

 }