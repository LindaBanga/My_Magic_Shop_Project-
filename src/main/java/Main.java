import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User newUser = new User("Witch123", 50000d,"Fiona de Witch II", "Magic Zoo Keeper");

        Shop shop = new Shop();
        System.out.println(" Welcome to the Magic! shop, here you can buy all things magical");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your user name: ");
        String userName;
        userName = scanner.nextLine();
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome " + newUser.name);

        Product product1 = new Product("Unicorn blue ", 6000f, 3);
        Product product2 = new Product("Unicorn white ",4000f, 6);
        Product product3 = new Product("Elephant pink ", 7000f, 2);
        Product product4 = new Product("Flying piglet purple ", 5000f, 3);
        Product product5 = new Product("Himalayan dragon ", 600000f,1);
       String product1Details = product1.getProductDetails();
       String product2Details = product2.getProductDetails();
       String product3Details = product3.getProductDetails();
       String product4Details = product4.getProductDetails();
       String product5Details = product5.getProductDetails();

        System.out.println(product1Details);
        System.out.println(product2Details);
        System.out.println(product3Details);
        System.out.println(product4Details);
        System.out.println(product5Details);


        List<String> Product = new ArrayList<String>();
        Product.add("Unicorn blue");
        Product.add("Unicorn white");
        Product.add("Elephant pink");
        Product.add("Flying piglet purple");
        Product.add("Himalayan dragon");


        String userInput = "";
        do {
            System.out.println("Enter your choice: ");
            System.out.println("Enter amount: ");
            System.out.println("Would you like to buy the chosen item? Yes/No: ");
            System.out.println("Type finish to end program ");

            userInput = scanner.nextLine();




        } while (!userInput.equalsIgnoreCase("finish"));
        return;
    }
}
