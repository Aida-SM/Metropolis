import java.util.Scanner;
public class Metropolis{
    public static void main(String[] args) {

        boolean isCapital=false;
        char AnswerOfIsCapital;
        int numberOfCitizens;
        double taxesPerCitizen;
        double incomePerCitizen;
        double incomeOfCityPerYear;

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

        System.out.println("How much the average income of each month?");
        incomePerCitizen= scanner.nextDouble();

         if(typeOfCity( isCapital,numberOfCitizens, taxesPerCitizen)){
            System.out.println("city is metropolis");
        }

    }

    private static boolean typeOfCity(boolean isCapital,int numberOfCitizens, double taxesPerCitizen){

         if (isCapital==true &&  numberOfCitizens>100000 || isCapital==false && numberOfCitizens>200000 && taxesPerCitizen>=720000000 ){

            return true;

        }

        else
            return false;
    }

 }