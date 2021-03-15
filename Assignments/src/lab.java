import java.util.Scanner;

public class lab {

    public static void displayMainMenu()
    {
        System.out.println("Choose the meal you want: ");
        System.out.println("1.Italian\n2.Chinese\n3.American");
    }

    public static void displayItalianFoodMenu()
    {
        System.out.println("Choose one from below: ");
        System.out.println("1.Italian Pizza - $15.99");
        System.out.println("2.Italian Pasta - $9.99");
        System.out.println("3.Italian Burger -$7.99");
    }

    public static void displayChineseFoodMenu()
    {
        System.out.println("Choose one from below: ");
        System.out.println("Orange Chicken - $9.99");
        System.out.println("Noodles - $7.99");
        System.out.println("Chicken Spring Rolls- $3.99");
    }

    public static void displayAmericanFoodMenu()
    {
        System.out.println("Choose one from below: ");
        System.out.println("Spicy Chicken Burger Meal - $8.99 (comes with drink");
        System.out.println("HotDog - $11.99");
        System.out.println("16inch Chicken Pizza - $16.99");
    }

    public static int determineTrays(int people,int feeds)
    {
      int nTrays = people / feeds ;

      if(people % feeds > 0)
      {
          nTrays+= 1 ;
      }
      return nTrays;
    }

    public static double getSubtotal(double price , int trays)
    {
        return price * trays ;
    }

    public static double getTax(double subtotal, double tax)
    {
        return subtotal * tax ;
    }

    public static double getTip(double subtotal, double tipRate)
    {
        return subtotal * tipRate;
    }

    public static double getGrandTotal(double subtotal,double tax,double tip)
    {
        return subtotal + tax + tip ;
    }

    public static double pricePerPerson(double gradTotal, int people)
    {
        return gradTotal /people ;
    }
    public static int determineLeftOvers(int feeds, int trays,int people)
    {
        return (trays*feeds)-people;
    }


    //================================
    //===============================

    public static void main(String[] args) {

        double [][] priceList = {{15.99,9.99,7.99},{9.99,7.99,3.99},{8.99,11.99,16.99}};

        int [] [] feedList = {{5,7,4},{7,7,5},{8,5,10}};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many people want food: ");

        int people = Integer.parseInt(sc.nextLine());

        if(people >= 10 && people <= 100)
        {
            int countryChoice;
            int foodOption;
            int nOfTrays;
            int leftOvers;
            int feeds;
            double subTotal;
            double tax;
            double tip ;
            double price ;
            double grandTotal;
            double perPerson;

            while(true) {
                displayMainMenu();
                countryChoice = Integer.parseInt(sc.nextLine());
                if (countryChoice >= 1 && countryChoice <= 3) {
                    break;
                }
            }
            while (true)
            {
                switch(countryChoice)
                {
                    case 1:
                        displayItalianFoodMenu();
                        break;
                    case 2:
                        displayChineseFoodMenu();
                        break;
                    case 3:
                        displayAmericanFoodMenu();
                        break;
                }
                foodOption = Integer.parseInt(sc.nextLine());
                if(foodOption >= 1 && foodOption <=3)
                {
                    break;
                }

            }

            feeds = feedList[countryChoice-1][foodOption-1];

            price = priceList[countryChoice-1][foodOption-1];

            nOfTrays = determineTrays(people,feeds);

            subTotal = getSubtotal(price,nOfTrays);

            tip = getTip(subTotal,0.15);

            tax = getTax(subTotal,0.07);

            grandTotal = getGrandTotal(subTotal,tip,tax);

            leftOvers = determineLeftOvers(feeds,nOfTrays,people);

            perPerson = pricePerPerson(grandTotal,people);

            System.out.println("You need "+""+nOfTrays);

            System.out.println("Feeds "+""+feeds);

            System.out.println("Price for "+""+people+" people ("+nOfTrays+"trays)"+":"+subTotal);

            System.out.println("Tax :"+(String.format("%.2f",tax)));

            System.out.println("Tip :"+(String.format("%.2f",tip)));

            System.out.println("Total(Food,Tax,Tip): "+String.format("%.2f",grandTotal));

            System.out.println("Price per Person :"+String.format("%.2f",perPerson));

            System.out.println("LeftOver servings for the delivery Person :"+leftOvers);

        }

        else
        {
            System.out.println("We cannot make order for less than 10 people.");
        }
    }
}
