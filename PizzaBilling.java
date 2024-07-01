import java.util.Scanner;

class Billing{
    Scanner sc = new Scanner(System.in);
    boolean extraTopping = false , extraCheese = false , takeAway = false;
    int pza = 0, exCheese = 0, exTop = 0, tAway = 0;

    public void Price(int a){
        switch (a){
            case 1 -> pza = 300;
            case 2 -> pza = 400;
            case 3 -> pza = 550;
            case 4 -> pza = 650;
        }
        Extra(a);
    }
    public void Output(){
        System.out.println("-------------------------------------- Welcome to Pizza-mania --------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tChoose your PiZZa:");
        System.out.println("\t\t 1. Veg. Pizza \t 2. NonVeg. Pizza \t 3. Delux Veg. Pizza \t 4. Delux NonVeg. Pizza");

    }

    public void Extra(int a){
        if (a <= 2) {
            System.out.println("Do you want extra topping (true/false):");
            extraTopping = sc.nextBoolean();
            System.out.println("Do you want extra cheese (true/false):");
            extraCheese = sc.nextBoolean();
        }
        System.out.println("Is it a take away (true/false):");
        takeAway = sc.nextBoolean();
        Bill(a);
    }
    public void Bill(int a){
        System.out.println("Pizza: "+pza);
        if (a <= 2) {
            if (extraTopping && extraCheese) {
                exCheese = 100; exTop = 150;
                System.out.println("Extra Cheese: "+exCheese);
                System.out.println("Extra Topping: "+exTop);
            } else if (!extraCheese && extraTopping) {
                exTop =150;
                System.out.println("Extra Topping: "+exTop);
            } else {
                exCheese = 100;
                System.out.println("Extra Cheese: "+exCheese);
            }
        }
        if (takeAway) {
            tAway =20;
            System.out.println("Take Away: "+tAway);
        }
        System.out.println();
        System.out.println("Total Amount: "+(pza+exTop+exCheese+tAway));
        System.out.println();
        System.out.println("Thank-you!!! Visit Again...");
    }
}

