package app;
import app.Acs;
import app.Fridges;
import app.Tvs;
import app.Buds;
import app.Laptops;
import app.Mobiles;
import ca.Cart;
import app.Login;
import java.util.Scanner;
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
    	static final String bgred =  "\u001b[101;1m";
    	static final String bggreen = "\u001b[102;1m";
    	static final String bgyellow = "\u001b[103;1m";
    	static final String bgblue = "\u001b[104;1m";
    	static final String bgpurpe = "\u001b[105;1m";
    	static final String bgskblue = "\u001b[106;1m";
}
public class Promain
{
	static Scanner sc=new Scanner(System.in);
	public static Promain main = new Promain();
	
	public static void main(String [] args)
	{
		Cart cart = Login.getCurrentUserCart();		
		while(true)
		{
			System.out.println(colour.brightYellow+"Which product you want"+colour.end+"\n 1.Air Conditioners \n 2.Airpods\n 3.Fridges \n 4.Laptops \n 5.Mobiles \n 6.Televisions \n 7.view cart\n 8.Orders\n 9.Logout");
			String product=sc.next();
			if(product.equals("1"))
			{
				Acs ac=new Acs(cart);
				ac.main(new String[]{});
			}
			else if(product.equals("2"))
			{
				Buds bud=new Buds(cart);
				bud.main(new String[]{});
			}
			else if(product.equals("3"))
			{
				Fridges fd=new Fridges(cart);
				fd.main(new String[]{});
			}
			else if(product.equals("4"))
			{
				Laptops lap=new Laptops(cart);
				lap.main(new String[]{});
			}
			else if(product.equals("5"))
			{
				Mobiles phn=new Mobiles(cart);
				phn.main(new String[]{});
			}
			else if(product.equals("6"))
			{
				Tvs tv=new Tvs(cart);
				tv.main(new String[]{});
			}
			else if(product.equals("7"))
			{
				cart.displayCart();
			}
			else if(product.equals("8")){
				//Cart ct = Cart.cart;
				cart.displayorders();
			}
			else if(product.equals("9"))
			{
				System.out.print(colour.green+"Thank you for visiting "+colour.end);
				Login login = new Login();
				login.main(new String[]{});
			}
			else{
				System.out.println(colour.red+"Invalid Input"+colour.end);
				System.out.println(colour.bgred+"Please enter valid Input"+colour.end);
				continue;
			}
		}
	}
}
