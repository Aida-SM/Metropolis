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

        System.out.println("How many taxes a citizen pays each month in average ");
        taxesPerCitizen = scanner.nextDouble();

        System.out.println("How much the average income of each month?");
        incomePerCitizen= scanner.nextDouble();

        incomeOfCityPerYear= (incomePerCitizen*(taxesPerCitizen/100))*numberOfCitizens*12;

         if(typeOfCity( isCapital,numberOfCitizens, incomeOfCityPerYear)){
            System.out.println("city is metropolis");
        }

    }

    private static boolean typeOfCity(boolean isCapital,int numberOfCitizens, double incomeOfCityPerYear){

         if (isCapital==true &&  numberOfCitizens>100000 || isCapital==false && numberOfCitizens>200000 && incomeOfCityPerYear>=720000000 ){

            return true;

        }

        else
            return false;
    }

 }