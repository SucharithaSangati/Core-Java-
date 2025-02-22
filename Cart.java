package ca;
import app.Login;
import app.Promain;
import java.util.*;
import java.util.ArrayList;
class colour
{
	static final String end= "\u001b[0;1m";
   	static final String blink = "\u001b[5m";
    	static final String red =  "\u001b[31;1m";
    	static final String green = "\u001b[32;1m";
    	static final String yellow = "\u001b[33;1m";
    	static final String blue = "\u001b[34;1m";
    	static final String purple = "\u001b[35;1m";
    	static final String skblue = "\u001b[36;1m";
		static final String magenta = "\u001b[35;1m";
		static final String cyan = "\u001b[36;1m";
		static final String brightRed = "\u001b[91m";
		static final String brightGreen = "\u001b[92m";
		static final String brightYellow = "\u001b[93m";
		static final String brightBlue = "\u001b[94m";
		static final String brightMagenta = "\u001b[95m";
		static final String brightCyan = "\u001b[96m";
		static final String brightWhite = "\u001b[97m";
    	static final String bgred = "\u001b[41;1m";
    	static final String bggreen = "\u001b[102;1m";
    	static final String bgyellow = "\u001b[103;1m";
    	static final String bgblue = "\u001b[104;1m";
    	static final String bgpurpe = "\u001b[105;1m";
    	static final String bgskblue = "\u001b[106;1m";
}
public class Cart {
    private ArrayList<String> cartItems;
    private ArrayList<Double> cartPrices;
    private ArrayList<String> orderItems;
    private ArrayList<Double> orderPrices;
   //public static Cart cart = Login.getCurrentUserCart() ;
    private Scanner scanner;
    static Promain main = Promain.main;
    // public static void main(String[]args){
    //     Cart cart = Login.getCurrentUserCart();
    //     Promain.main(new String[] {});
    // }
    // Constructor
    public Cart() {
        cartItems = new ArrayList<>();
        cartPrices = new ArrayList<>();
        scanner = new Scanner(System.in);
        orderItems = new ArrayList<>();
        orderPrices = new ArrayList<>();


    }

    // Add item to cart
    public void addItem(String itemName, double price) {
        cartItems.add(itemName);
        cartPrices.add(price);
        System.out.println(itemName + " added to the cart."+colour.end);
    }

    // Display cart items
    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println(colour.purple+"Your cart is empty."+colour.end);
            while(true){
                System.out.println("->Back");
                String bac = scanner.next();
                if(bac.equalsIgnoreCase("back")) break;
                else System.out.println(colour.red+"Invalid Input."+colour.end);
                }
                return;
        } else {
            System.out.println("Items in your cart:"+colour.end);
            for (int i = 0; i < cartItems.size(); i++) {
                System.out.println((i + 1) + ". " + cartItems.get(i) + " - $" + cartPrices.get(i));
            }
            if(cartItems.size()>1) System.out.println(colour.skblue+"Do you want to buy items (yes/no): "+colour.end);
            else System.out.println(colour.skblue+"Do you want to buy item  (yes/no):"+colour.end);
            String buy;
            while(true){
                buy = scanner.next();
                if(buy.equalsIgnoreCase("yes") || buy.equalsIgnoreCase("no")) break;
                else System.out.println(colour.red+"Invalid Selection. Please enter a valid Input(yes/no):"+colour.end);
            }
            if(buy.equalsIgnoreCase("yes")) generateBill();
            else {
                String remove;
                if(cartItems.size()>0){
                System.out.println(colour.skblue+"Do you want to remove item  (yes/no):"+colour.end);
                while(true){
                    remove = scanner.next();
                    if(remove.equalsIgnoreCase("yes") || remove.equalsIgnoreCase("no")) break;
                    else System.out.println(colour.red+"Invalid Selection. Please enter a valid Input(yes/no):"+colour.end);
                }
                if(remove.equalsIgnoreCase("yes")) removeItem();
                else main.main(new String[]{});
            }
            }
        }
    }
    public void clearCart() {
        cartItems.clear();
        cartPrices.clear();
        //System.out.println(colour.purple+"Your cart has been cleared."+colour.end);
    }
      // Remove item from cart
      public void removeItem() {
        if (cartItems.isEmpty()) {
            System.out.println(colour.purple+"Your cart is empty. No items to remove."+colour.end);
            return;
        }

        //displayCart(); String remove;
        
        
        while(true){      
        System.out.print(colour.cyan+"Enter the number of the item to remove: "+colour.end);
        int index = 0;
        while(true){
            int c = 0;
            try{
         index = scanner.nextInt() - 1;
         c++;
            }
            catch(Exception e){
                String in = scanner.nextLine();

                System.out.println(colour.green+"Please enter a Integer."+colour.end);
            }
            if(c!=0 ) break;
        }
        if (index >= 0 && index < cartItems.size()) {
            System.out.println(cartItems.get(index) + " removed from the cart."+colour.end);
            cartItems.remove(index);
            cartPrices.remove(index);
            displayCart();
        } else {
            System.out.println(colour.red+"Invalid selection. No item removed."+colour.end);
        }
        if (!(index >= 0 && index < cartItems.size())) break;
    }
}

    // Billing method
    public void generateBill() {
        if (cartItems.isEmpty()) {
            System.out.println(colour.purple+"Your cart is empty. No bill to generate."+colour.end);
            return;
        }

        double total = 0.0;
        System.out.println("Billing Details:"+colour.end);
        for (int i = 0; i < cartItems.size(); i++) {
            System.out.println(cartItems.get(i) + " - $" + cartPrices.get(i));
            total += cartPrices.get(i);
        }
        System.out.println("Total Amount: $" + total);
        System.out.println(colour.skblue+"Do you want to proceed for payment(yes/no):"+colour.end);
        String payment;
        while(true){
            payment = scanner.next();
            if(payment.equalsIgnoreCase("yes") || payment.equalsIgnoreCase("no")) break;
            else System.out.println(colour.red+"Invalid Selection. Please enter a valid Input(yes/no):"+colour.end);
        }
        if(payment.equalsIgnoreCase("yes")) choosePaymentMode();
        else displayCart();
    }
        public  void orders() {    
            // Adding items to the cart
            if(cartItems.size()>0){
            for(int i = 0;i<cartItems.size();i++){
            orderItems.add(cartItems.get(i));
            // Displaying cart items
            orderPrices.add(cartPrices.get(i));
            }
            clearCart();
        }
        }
        public  void displayorders(){
            if(orderItems.size()>0){
                int i = 0;
            for ( i = 0; i < orderItems.size(); i++) {
                System.out.println((i + 1) + ". " + orderItems.get(i) + " - $" + orderPrices.get(i));
            }
            System.out.println( "-> Back");
            while(true){
            String back = scanner.next();
            if(back.equalsIgnoreCase("back")) break;
            else System.out.println(colour.red+"Invalid input."+colour.end);
            }
            return;
            }
            else{
                System.out.println("No Orders done yet!");
                while(true){
                System.out.println("->Back");
                String bac = scanner.next();
                if(bac.equalsIgnoreCase("back")) break;
                else System.out.println(colour.red+"Invalid Input."+colour.end);
                }
                return;
            }
        }
    int c = 0;
    public void choosePaymentMode() {
        System.out.println("\u001B[36;1mEnter full name:\u001B[0m");
		String fullname = scanner.next();
		System.out.println("\u001B[36mEnter Address:\u001B[0m");
		String address = scanner.next();
		while(true) {
			System.out.println("\u001B[36mEnter Pincode:\u001B[0m");
            int pin =0 ;
            while(true){
                try{
			pin = scanner.nextInt();
            c++;
                }catch(Exception e){
                    String in = scanner.nextLine();

                    System.out.println(colour.green+"Please enter an integer");
                }
                if(c!=0) break;
            }
			if(pin>100000-1&&pin<1000000)
				break;

			System.out.println(colour.green+"Pin code must be 6 digit numeric value");
		}
		while(true) {
			System.out.println("\u001B[36mEnter phone number:\u001B[0m");
            long contactNumber = 0;
            int d = 0;
            while(true){
                try{
                    contactNumber = scanner.nextLong();
                 d++;
                }catch(Exception e){
                    String in = scanner.nextLine();

                    System.out.println(colour.green+"Please enter an integer");
                }
                if(d!=0) break;
            }
			if(contactNumber>(long)(Math.pow(10,9))-1&&contactNumber<(long)(Math.pow(10,10)))
				break;
			System.out.println(colour.green+"Phone number length must be 10 digits only");
		}
        System.out.println("Address added Successfully.\n\n\n");
        System.out.println("Choose a payment method:"+colour.end);
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. UPI (currently unavaliable)");
        System.out.println("4. Cash on Delivery");
        System.out.println("5. Back");

        System.out.print(colour.cyan+"Enter your choice: "+colour.end);
        String choice = scanner.next();

        switch (choice) {
            case "1":
                System.out.println(colour.purple+"You selected: Credit Card");
                //System.out.print(colour.cyan+"Enter Credit Card Number: "+colour.end);
                String cardNumber;
				while(true) {
					System.out.print("\u001B[36mEnter Credit Card Number: \u001B[0m");
					 cardNumber = scanner.next();
					if(cardNumber.length()==16 && cardNumber.charAt(0) != '0'){
                        int c = 0;
                        for(int i = 0;i<16;i++){
                             if(cardNumber.charAt(i)>='0' && cardNumber.charAt(i)<='9') c++;
                        }
                        if(c == 16) break;
                    }
                    else 
					System.out.println("The cardNumber must be 16 digits");
				}

				String cvv;
				while(true) {
					System.out.print(colour.cyan+"Enter CVV:"+colour.end);
					cvv = scanner.next();
					if(cvv.length()==3 && cvv.charAt(0) != '0'){
                        int c = 0;
                        for(int i = 0;i<3;i++){
                             if(cvv.charAt(i)>='0' && cvv.charAt(i)<='9') c++;
                        }
                        if(c == 3) break;
                    }
                        else
						System.out.println(colour.green+"Please enter 3 digit number only");
				}
				while(true) {
					int expiryMonth = 0 ;
					while(true) {
						System.out.print(colour.cyan+"Enter Expiry Month: "+colour.end);
                        while(true){
                            int c = 0;
                        try{
						expiryMonth = scanner.nextInt();
                        c++;
                        }
                        catch(Exception e){
                            String in = scanner.nextLine();

                            System.out.println(colour.green+"Please Enter an Integer");
                        }
                        if(c!=0) break;
                    }
						if(expiryMonth>=1&&expiryMonth<13)
							break;
						System.out.println("The month range must be 1 and 12");
					}

					System.out.print(colour.cyan+"Enter Expiry Year: "+colour.end);
                    int expiryYear = 0;
                        while(true){
                            int c = 0;
                        try{
                            expiryYear = scanner.nextInt();
                        c++;
                        }
                        catch(Exception e){
                            String in = scanner.nextLine();
                            System.out.println(colour.green+"Please Enter an Integer");
                        }
                        if(c!=0) break;
                    }
					if(expiryYear>2024||(expiryYear==2024&&expiryMonth==12))
						break;
					System.out.println("The expiry of the card must be greater than Today's date");
				}
                orders();
                System.out.println("Credit Card details received successfully."+colour.end);
                System.out.println(colour.purple+"Your order will be delivered soon."+colour.end);
                break;
            case "2":
                System.out.println(colour.purple+"You selected: Debit Card");
                String cardNumbe;
				while(true) {
					System.out.print("\u001B[36mEnter Debit Card Number: \u001B[0m");
					 cardNumbe = scanner.next();
					if(cardNumbe.length()==16 && cardNumbe.charAt(0) != '0'){
                        int c = 0;
                        for(int i = 0;i<16;i++){
                             if(cardNumbe.charAt(i)>='0' && cardNumbe.charAt(i)<='9') c++;
                        }
                        if(c == 16) break;
                    }
                    else 
					System.out.println("The cardNumber must be 16 digits");
				}

				String cv;
				while(true) {
					System.out.print(colour.cyan+"Enter CVV:"+colour.end);
					cv = scanner.next();
					if(cv.length()==3 && cv.charAt(0) != '0'){
                        int c = 0;
                        for(int i = 0;i<3;i++){
                             if(cv.charAt(i)>='0' && cv.charAt(i)<='9') c++;
                        }
                        if(c == 3) break;
                    }
                        else
						System.out.println(colour.green+"Please enter 3 digit number only");
				}
                while(true) {
					int expiryMonth = 0;
					while(true) {
						System.out.print(colour.cyan+"Enter Expiry Month: "+colour.end);
                        while(true){
                            int c = 0;
                        try{
						expiryMonth = scanner.nextInt();
                        c++;
                        }
                        catch(Exception e){
                            String in = scanner.nextLine();
                            System.out.println(colour.green+"Please Enter an Integer");
                        }
                        if(c!=0) break;
                    }
						if(expiryMonth>=1&&expiryMonth<13)
							break;
						System.out.println("The month range must be 1 and 12");
					}

					System.out.print(colour.cyan+"Enter Expiry Year: "+colour.end);
                    int expiryYear = 0;
                        while(true){
                            int c = 0;
                        try{
                            expiryYear = scanner.nextInt();
                        c++;
                        }
                        catch(Exception e){
                            String in = scanner.nextLine();

                            System.out.println(colour.green+"Please Enter an Integer");
                        }
                        if(c!=0) break;
                    }
					if(expiryYear>2024||(expiryYear==2024&&expiryMonth==12))
						break;
					System.out.println("The expiry of the card must be greater than Today's date");
				}
                orders();
                System.out.println("Debit Card details received successfully."+colour.end);
                System.out.println(colour.purple+"Your order will be delivered soon."+colour.end);

                break;
            case "3":
                System.out.println("Sorry for the Inconvience UPI Currently Unavailable");
                System.out.print(colour.green+"Page is Reloading to back. Please Wait. ");
                System.out.print("Loading");
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.print("."+colour.end);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("An error occurred."+colour.end);
                        return;
                    }
                }
                choosePaymentMode();
                break;
            case "4":
                System.out.println(colour.purple+"You selected: Cash on Delivery");
                orders();
                System.out.println(colour.green+"Please have the exact amount ready at the time of delivery."+colour.end);
                break;
            case "5":
                main.main(new String[]{});
                break;
            default:
                System.out.println(colour.red+"Invalid choice. Please try again."+colour.end);
                choosePaymentMode(); // Retry on invalid input
        }
        System.out.println(colour.skblue+"Do you want to shop more(yes/no):"+colour.end);
        String shop;
        while(true){
            shop = scanner.next();
            if(shop.equalsIgnoreCase("yes") || shop.equalsIgnoreCase("no")) break;
            else System.out.println(colour.red+"Invalid Selection. Please enter a valid Input(yes/no):"+colour.end);
        }
        if(shop.equalsIgnoreCase("yes"))
        { //Promain Main = new Promain();
		main.main(new String[]{});
    }
        else main.main(new String[]{});
    }


}
