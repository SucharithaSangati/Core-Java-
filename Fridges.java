package app;
import app.Promain;
import java.util.Scanner;
import ca.Cart;
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
public class Fridges {
	public Fridges(){}
	public Fridges(Cart cart){
		this.ct = cart;
	}
	static Scanner scanner = new Scanner(System.in);
    static Cart ct;
	static double price ;
	static String sc;
	static Promain main = Promain.main;
	public class LGFridgeSelector {
		public static void showSpecifications() {
			while(true) {
			System.out.println(colour.bgred+"!-----Available Models-----!"+colour.end);
			System.out.println("1. LG Top Freezer Fridge ");
			System.out.println("2. LG French Door Fridge");
			System.out.println("3. LG Side-by-Side Fridge");
			System.out.println("4. LG Double Door Fridge");
			System.out.println("5. LG Mini Fridge");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print(colour.magenta+"Enter your choice (1-7): "+colour.end);

			
				String series = scanner.next();

				switch(series) {
				case "1":
					lgTopFreezerModel();
					break;
				case "2":
					lgFrenchDoorModel();
					break;
				case "3":
					lgSideBySideModel();
					break;
				case "4":
					lgDoubleDoorModel();
					break;
				case "5":
					lgMiniFridgeModel();
					break;
				case "6":
					Fridges.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println(colour.red+"Invalid choice. Please select a number between 1 and 7."+colour.end);
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}

		// Method for LG Top Freezer Fridge
		public static void lgTopFreezerModel() {
			System.out.println(colour.green+"LG Top Freezer Fridge Specifications:"+colour.end);
			System.out.println("1. 250L Top Freezer");
			System.out.println("   - Capacity: 250 /300 / 350 Liters");
			System.out.println("   - Energy Rating: 4 / 5 stars");
			System.out.println("   - Price Range: $350 - $500"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the LG Top Freezer model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your LG Top Freezer variant:"+colour.end);
					System.out.println("1. 250L, Top Freezer, 4 stars  -$350"+colour.end);
					System.out.println("2. 300L, Top Freezer, 4 stars  -$450"+colour.end);
					System.out.println("3. 350L, Top Freezer, 5 stars  -$500"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}



					switch(variant) {
					case "1":
						System.out.println(colour.green+"You've selected: 250L, Top Freezer, 4 stars  -$350"+colour.end);
						price = 350;
						while(true) {
							System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("LG Top Freezer, 250L, Top Freezer, 4 stars", price);
							String dis;
							while(true) {
								System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
								dis = scanner.next();
								if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
								else System.out.print(colour.red+"Invalid Input."+colour.end);
							}
							if(dis.equalsIgnoreCase("yes")) {
								ct.displayCart();
							}

						}
						break;
					case "2":
						System.out.println(colour.green+"You've selected: 300L, Top Freezer, 4 stars  -$450"+colour.end);
						price = 450;
						while(true) {
							System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("LG Top Freezer, 300L, Top Freezer, 4 stars", price);
							String dis;
							while(true) {
								System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
								dis = scanner.next();
								if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
								else System.out.print(colour.red+"Invalid Input."+colour.end);
							}
							if(dis.equalsIgnoreCase("yes")) {
								ct.displayCart();
							}

						}
						break;
					case "3":
						System.out.println(colour.green+"You've selected: 350L, Top Freezer, 5 stars  -$500"+colour.end);
						price = 500;
						while(true) {
							System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("LG Top Freezer, 350L, Top Freezer, 5 stars", price);
							String dis;
							while(true) {
								System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
								dis = scanner.next();
								if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
								else System.out.print(colour.red+"Invalid Input."+colour.end);
							}
							if(dis.equalsIgnoreCase("yes")) {
								ct.displayCart();
							}

						}
						break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for LG French Door Fridge
		public static void lgFrenchDoorModel() {
			System.out.println("LG French Door Fridge Specifications:"+colour.end);
			System.out.println("1. 500L French Door");
			System.out.println("   - Capacity: 500 / 600 / 700Liters");
			System.out.println("   - Features: Door-in-Door, Smart Inverter Compressor");
			System.out.println("   - Price Range: $800 - $1200"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Realme LG French Door model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}
			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your LG French Door variant:"+colour.end);
					System.out.println("1. 500L, French Door, Door-in-Door  -$800"+colour.end);
					System.out.println("2. 600L, French Door, Door-in-Door  -$1000"+colour.end);
					System.out.println("3. 700L, French Door, Smart Inverter Compressor  -$1200"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}


					switch(variant) {
					case "1":
						System.out.println(colour.green+"You've selected: 500L, French Door, Door-in-Door  -$800"+colour.end);
						price = 800;
						while(true) {
							System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("LG French Door, 500L, French Door, Door-in-Door", price);
							String dis;
							while(true) {
								System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
								dis = scanner.next();
								if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
								else System.out.print(colour.red+"Invalid Input."+colour.end);
							}
							if(dis.equalsIgnoreCase("yes")) {
								ct.displayCart();
							}

						}
						break;
					case "2":
						System.out.println(colour.green+"You've selected: 600L, French Door, Door-in-Door  -$1000"+colour.end);
						price = 1000;
						while(true) {
							System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("LG French Door, 600L, French Door, Door-in-Door", price);
							String dis;
							while(true) {
								System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
								dis = scanner.next();
								if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
								else System.out.print(colour.red+"Invalid Input."+colour.end);
							}
							if(dis.equalsIgnoreCase("yes")) {
								ct.displayCart();
							}

						}
						break;
					case "3":
						System.out.println(colour.green+"You've selected: 700L, French Door, Smart Inverter Compressor  -$1200"+colour.end);
						price = 1200;
						while(true) {
							System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("LG French Door, 700L, French Door, Smart Inverter Compressor", price);
							String dis;
							while(true) {
								System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
								dis = scanner.next();
								if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
								else System.out.print(colour.red+"Invalid Input."+colour.end);
							}
							if(dis.equalsIgnoreCase("yes")) {
								ct.displayCart();
							}

						}
						break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}
		// Method for LG Side-by-Side Fridge
		public static void lgSideBySideModel() {
			System.out.println("LG Side-by-Side Fridge Specifications:"+colour.end);
			System.out.println("1. 600L Side-by-Side");
			System.out.println("   - Capacity: 600 / 700 / 800 Liters");
			System.out.println("   - Features: Ice and Water Dispenser, Smart Inverter");
			System.out.println("   - Price Range: $1000 - $1500"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the LG Side-by-Side model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your LG Side-by-Side variant:"+colour.end);
					System.out.println("1. 600L, Side-by-Side, Ice and Water Dispenser  - $1000"+colour.end);
					System.out.println("2. 700L, Side-by-Side, Smart Inverter  - $1250"+colour.end);
					System.out.println("3. 800L, Side-by-Side, Premium Features  - $1500"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 600L, Side-by-Side, Ice and Water Dispenser  - $1000"+colour.end);
							price = 1000;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Side-by-Side, 600L, Side-by-Side, Ice and Water Dispenser", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 700L, Side-by-Side, Smart Inverter  - $1250"+colour.end);
							price = 1250;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Side-by-Side, 700L, Side-by-Side, Smart Inverter", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 800L, Side-by-Side, Premium Features  - $1500"+colour.end);
							price = 1500;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Side-by-Side, 800L, Side-by-Side, Premium Features", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for LG Double Door Fridge
		public static void lgDoubleDoorModel() {
			System.out.println("LG Double Door Fridge Specifications:"+colour.end);
			System.out.println("1. 360L Double Door");
			System.out.println("   - Capacity: 360 / 400 / 450 Liters");
			System.out.println("   - Features: Smart Inverter, Moist Balance Crisper");
			System.out.println("   - Price Range: $600 - $900"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the LG Double Door model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your LG Double Door variant:"+colour.end);
					System.out.println("1. 360L, Double Door, Smart Inverter  - $600"+colour.end);
					System.out.println("2. 400L, Double Door, Moist Balance Crisper  - $750"+colour.end);
					System.out.println("3. 450L, Double Door, Smart Inverter  - $900"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 360L, Double Door, Smart Inverter  - $600"+colour.end);
							price = 600;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Double Door, 360L, Double Door, Smart Inverter", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 400L, Double Door, Moist Balance Crisper  - $750"+colour.end);
							price = 750;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Double Door, 400L, Double Door, Moist Balance Crisper", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 450L, Double Door, Smart Inverter  - $900"+colour.end);
							price = 900;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Double Door, 450L, Double Door, Smart Inverter", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for LG Mini Fridge
		public static void lgMiniFridgeModel() {
			System.out.println("LG Mini Fridge Specifications:"+colour.end);
			System.out.println("1. 90L Mini Fridge");
			System.out.println("   - Capacity: 90 Liters");
			System.out.println("   - Features: Adjustable Thermostat, Energy Efficient");
			System.out.println("   - Price Range: $100 - $200"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the LG Mini Fridge model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your LG Mini Fridge variant:"+colour.end);
					System.out.println("1. 90L, Mini Fridge, Energy Efficient  - $100"+colour.end);
					System.out.println("2. 120L, Mini Fridge, Adjustable Thermostat  - $150"+colour.end);
					System.out.println("3. 150L, Mini Fridge, Energy Efficient  - $200"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 90L, Mini Fridge, Energy Efficient  - $100"+colour.end);
							price = 100;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Mini Fridge, 90L, Mini Fridge, Energy Efficient", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 120L, Mini Fridge, Adjustable Thermostat  - $150"+colour.end);
							price = 150;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Mini Fridge, 120L, Mini Fridge, Adjustable Thermostat", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 150L, Mini Fridge, Energy Efficient  - $200"+colour.end);
							price = 200;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Mini Fridge, 150L, Mini Fridge, Energy Efficient", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
                            case "4":
                            showSpecifications();
                            break;
                        }
                    }
    
                }
                else if(choice.equalsIgnoreCase("No")) {
                    showSpecifications();
                    return;
                }
    
            }
	}

	public class SamsungFridgeSelector {
		public static void showSpecifications() {
			while(true) {
			System.out.println(colour.bgred+"!-----Available Models-----!"+colour.end);
			System.out.println("1. Samsung Top Freezer Fridge");
			System.out.println("2. Samsung French Door Fridge");
			System.out.println("3. Samsung Side-by-Side Fridge");
			System.out.println("4. Samsung Double Door Fridge");
			System.out.println("5. Samsung Mini Fridge");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print(colour.magenta+"Enter your choice (1-7): "+colour.end);

			
				String series = scanner.next();

				switch(series) {
				case "1":
					samsungTopFreezerModel();
					break;
				case "2":
					samsungFrenchDoorModel();
					break;
				case "3":
					samsungSideBySideModel();
					break;
				case "4":
					samsungDoubleDoorModel();
					break;
				case "5":
					samsungMiniFridgeModel();
					break;
				case "6":
					Fridges.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println(colour.red+"Invalid choice. Please select a number between 1 and 7."+colour.end);
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}

		// Method for Samsung Top Freezer Fridge
		public static void samsungTopFreezerModel() {
			System.out.println("Samsung Top Freezer Fridge Specifications:"+colour.end);
			System.out.println("1. 300L Top Freezer");
			System.out.println("   - Capacity: 300 Liters");
			System.out.println("   - Energy Rating: 3 stars");
			System.out.println("   - Price Range: $400 - $600"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Samsung Top Freezer model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Samsung Top Freezer variant:"+colour.end);
					System.out.println("1. 300L, Top Freezer, 3 stars  - $400"+colour.end);
					System.out.println("2. 350L, Top Freezer, 4 stars  - $500"+colour.end);
					System.out.println("3. 400L, Top Freezer, 4 stars  - $600"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 300L, Top Freezer, 3 stars  - $400"+colour.end);
							price = 400;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Samsung Top Freezer, 300L, Top Freezer, 3 stars", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 350L, Top Freezer, 4 stars  - $500"+colour.end);
							price = 500;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Samsung Top Freezer, 350L, Top Freezer, 4 stars", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 400L, Top Freezer, 4 stars  - $600"+colour.end);
							price = 600;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Samsung Top Freezer, 400L, Top Freezer, 4 stars", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Samsung French Door Fridge
		public static void samsungFrenchDoorModel() {
			System.out.println("Samsung French Door Fridge Specifications:"+colour.end);
			System.out.println("1. 500L French Door");
			System.out.println("   - Capacity: 500 Liters");
			System.out.println("   - Features: FlexZone, Twin Cooling Plus");
			System.out.println("   - Price Range: $900 - $1300"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Samsung French Door model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Samsung French Door variant:"+colour.end);
					System.out.println("1. 500L, French Door, FlexZone  - $900"+colour.end);
					System.out.println("2. 600L, French Door, Twin Cooling Plus  - $1100"+colour.end);
					System.out.println("3. 700L, French Door, Premium Features  - $1300"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 500L, French Door, FlexZone  - $900"+colour.end);
							price = 900;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Samsung French Door, 500L, French Door, FlexZone", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 600L, French Door, Twin Cooling Plus  - $1100"+colour.end);
							price = 1100;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Samsung French Door, 600L, French Door, Twin Cooling Plus", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 700L, French Door, Premium Features  - $1300"+colour.end);
							price = 1300;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Samsung French Door, 700L, French Door, Premium Features", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Samsung Side-by-Side Fridge
		public static void samsungSideBySideModel() {
			System.out.println("Samsung Side-by-Side Fridge Specifications:"+colour.end);
			System.out.println("1. 600L Side-by-Side");
			System.out.println("   - Capacity: 600 Liters");
			System.out.println("   - Features: Water Dispenser, All-around Cooling");
			System.out.println("   - Price Range: $1000 - $1500"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Samsung Side-by-Side model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Samsung Side-by-Side variant:"+colour.end);
					System.out.println("1. 600L, Side-by-Side, Water Dispenser  - $1000"+colour.end);
					System.out.println("2. 700L, Side-by-Side, All-around Cooling  - $1250"+colour.end);
					System.out.println("3. 800L, Side-by-Side, Premium Features  - $1500"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 600L, Side-by-Side, Water Dispenser  - $1000"+colour.end);
							price = 1000;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Samsung Side-by-Side, 600L, Side-by-Side, Water Dispenser", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 700L, Side-by-Side, All-around Cooling  - $1250"+colour.end);
							price = 1250;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Samsung Side-by-Side, 700L, Side-by-Side, All-around Cooling", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 800L, Side-by-Side, Premium Features  - $1500"+colour.end);
							price = 1500;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Samsung Side-by-Side, 800L, Side-by-Side, Premium Features", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Samsung Double Door Fridge
		public static void samsungDoubleDoorModel() {
			System.out.println("Samsung Double Door Fridge Specifications:"+colour.end);
			System.out.println("1. 350L Double Door");
			System.out.println("   - Capacity: 350 Liters");
			System.out.println("   - Features: Cool Pack, Digital Inverter");
			System.out.println("   - Price Range: $600 - $800"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Samsung Double Door model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Samsung Double Door variant:"+colour.end);
					System.out.println("1. 350L, Double Door, Cool Pack  - $600"+colour.end);
					System.out.println("2. 400L, Double Door, Digital Inverter  - $700"+colour.end);
					System.out.println("3. 450L, Double Door, Smart Cooling  - $800"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 350L, Double Door, Cool Pack  - $600"+colour.end);
							price = 600;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Samsung Double Door, 350L, Double Door, Cool Pack", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 400L, Double Door, Digital Inverter  - $700"+colour.end);
							price = 700;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Samsung Double Door, 400L, Double Door, Digital Inverter", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 450L, Double Door, Smart Cooling  - $800"+colour.end);
							price = 800;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Samsung Double Door, 450L, Double Door, Smart Cooling", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Samsung Mini Fridge
		public static void samsungMiniFridgeModel() {
			System.out.println("Samsung Mini Fridge Specifications:"+colour.end);
			System.out.println("1. 90L Mini Fridge");
			System.out.println("   - Capacity: 90 Liters");
			System.out.println("   - Features: Adjustable Thermostat, Energy Efficient");
			System.out.println("   - Price Range: $120 - $200"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Samsung Mini Fridge model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Samsung Mini Fridge variant:"+colour.end);
					System.out.println("1. 90L, Mini Fridge, Energy Efficient  - $120"+colour.end);
					System.out.println("2. 120L, Mini Fridge, Adjustable Thermostat  - $160"+colour.end);
					System.out.println("3. 150L, Mini Fridge, Energy Efficient  - $200"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 90L, Mini Fridge, Energy Efficient  - $120"+colour.end);
							price = 120;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Samsung Mini Fridge, 90L, Mini Fridge, Energy Efficient", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 120L, Mini Fridge, Adjustable Thermostat  - $160"+colour.end);
							price = 160;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Samsung Mini Fridge, 120L, Mini Fridge, Adjustable Thermostat", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 150L, Mini Fridge, Energy Efficient  - $200"+colour.end);
							price = 200;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Samsung Mini Fridge, 150L, Mini Fridge, Energy Efficient", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}
	}

	public class GodrejFridgeSelector {
		public static void showSpecifications() {
			while(true) {
			System.out.println(colour.bgred+"!-----Available Models-----!"+colour.end);
			System.out.println("1. Godrej Top Freezer Fridge ");
			System.out.println("2. Godrej Double Door Fridge");
			System.out.println("3. Godrej Side-by-Side Fridge");
			System.out.println("4. Godrej French Door");
			System.out.println("5. Godrej Mini Fridge");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print(colour.magenta+"Enter your choice (1-7): "+colour.end);

			
				String series = scanner.next();

				switch(series) {
				case "1":
					godrejTopFreezerModel();
					break;
				case "2":
					godrejDoubleDoorModel();
					break;
				case "3":
					godrejSideBySideModel();
					break;
				case "4":
					godrejFrenchDoorModel();
					break;
				case "5":
					godrejMiniFridgeModel();
					break;
				case "6":
					Fridges.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println(colour.red+"Invalid choice. Please select a number between 1 and 7."+colour.end);
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}

		// Method for Godrej Top Freezer Fridge
		public static void godrejTopFreezerModel() {
			System.out.println("Godrej Top Freezer Fridge Specifications:"+colour.end);
			System.out.println("1. 250L Top Freezer");
			System.out.println("   - Capacity: 250 Liters");
			System.out.println("   - Energy Rating: 3 stars");
			System.out.println("   - Price Range: $300 - $450"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Godrej Top Freezer model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Godrej Top Freezer variant:"+colour.end);
					System.out.println("1. 250L, Top Freezer, 3 stars  - $300"+colour.end);
					System.out.println("2. 300L, Top Freezer, 4 stars  - $350"+colour.end);
					System.out.println("3. 350L, Top Freezer, 4 stars  - $450"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 250L, Top Freezer, 3 stars  - $300"+colour.end);
							price = 300;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Top Freezer, 250L, Top Freezer, 3 stars", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 300L, Top Freezer, 4 stars  - $350"+colour.end);
							price = 350;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Top Freezer, 300L, Top Freezer, 4 stars", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 350L, Top Freezer, 4 stars  - $450"+colour.end);
							price = 450;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Top Freezer, 350L, Top Freezer, 4 stars", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Godrej Double Door Fridge
		public static void godrejDoubleDoorModel() {
			System.out.println("Godrej Double Door Fridge Specifications:"+colour.end);
			System.out.println("1. 350L Double Door");
			System.out.println("   - Capacity: 350 Liters");
			System.out.println("   - Features: Cool Lock, Fresh Preserve");
			System.out.println("   - Price Range: $500 - $650"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Godrej Double Door model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}


				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Godrej Double Door variant:"+colour.end);
					System.out.println("1. 350L, Double Door, Cool Lock  - $500"+colour.end);
					System.out.println("2. 400L, Double Door, Fresh Preserve  - $550"+colour.end);
					System.out.println("3. 450L, Double Door, Active Fresh  - $650"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 350L, Double Door, Cool Lock  - $500"+colour.end);
							price = 500;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Double Door, 350L, Double Door, Cool Lock", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 400L, Double Door, Fresh Preserve  - $550"+colour.end);
							price = 550;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Double Door, 400L, Double Door, Fresh Preserve", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 450L, Double Door, Active Fresh  - $650"+colour.end);
							price = 650;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Double Door,  450L, Double Door, Active Fresh", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Godrej Side-by-Side Fridge
		public static void godrejSideBySideModel() {
			System.out.println("Godrej Side-by-Side Fridge Specifications:"+colour.end);
			System.out.println("1. 600L Side-by-Side");
			System.out.println("   - Capacity: 600 Liters");
			System.out.println("   - Features: Water Dispenser, Cooling Technology");
			System.out.println("   - Price Range: $850 - $1100"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Godrej Side-by-Side model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Godrej Side-by-Side variant:"+colour.end);
					System.out.println("1. 600L, Side-by-Side, Water Dispenser  - $850"+colour.end);
					System.out.println("2. 650L, Side-by-Side, Advanced Cooling  - $950"+colour.end);
					System.out.println("3. 700L, Side-by-Side, Premium Features  - $1100"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 600L, Side-by-Side, Water Dispenser  - $850"+colour.end);
							price = 850;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Side-by-Side, 600L, Side-by-Side, Water Dispenser", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 650L, Side-by-Side, Advanced Cooling  - $950"+colour.end);
							price = 950;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Side-by-Side, 650L, Side-by-Side, Advanced Cooling", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 700L, Side-by-Side, Premium Features  - $1100"+colour.end);
							price = 1100;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Side-by-Side, 700L, Side-by-Side, Premium Features", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Godrej French Door Fridge
		public static void godrejFrenchDoorModel() {
			System.out.println("Godrej French Door Fridge Specifications:"+colour.end);
			System.out.println("1. 500L French Door");
			System.out.println("   - Capacity: 500 Liters");
			System.out.println("   - Features: Multi Flow Cooling, Energy Efficient");
			System.out.println("   - Price Range: $950 - $1200"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Godrej French Door model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Godrej French Door variant:"+colour.end);
					System.out.println("1. 500L, French Door, Multi Flow Cooling  - $950"+colour.end);
					System.out.println("2. 600L, French Door, Energy Efficient  - $1050"+colour.end);
					System.out.println("3. 700L, French Door, Smart Features  - $1200"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 500L, French Door, Multi Flow Cooling  - $950"+colour.end);
							price = 950;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej French Door,  500L, French Door, Multi Flow Cooling", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 600L, French Door, Energy Efficient  - $1050"+colour.end);
							price = 1050;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej French Door, 600L, French Door, Energy Efficient", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 700L, French Door, Smart Features  - $1200"+colour.end);
							price = 1200;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej French Door, 700L, French Door, Smart Features", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Godrej Mini Fridge
		public static void godrejMiniFridgeModel() {
			System.out.println("Godrej Mini Fridge Specifications:"+colour.end);
			System.out.println("1. 90L Mini Fridge");
			System.out.println("   - Capacity: 90 Liters");
			System.out.println("   - Features: Adjustable Thermostat, Energy Efficient");
			System.out.println("   - Price Range: $120 - $180"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Godrej Mini Fridge model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Godrej Mini Fridge variant:"+colour.end);
					System.out.println("1. 90L, Mini Fridge, Energy Efficient  - $180"+colour.end);
					System.out.println("2. 120L, Mini Fridge, Adjustable Thermostat  - $180"+colour.end);
					System.out.println("3. 150L, Mini Fridge, Cool Storage  - $180"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}


					switch(variant) {
					case "1":
						System.out.println(colour.green+"You've selected: 90L, Mini Fridge, Energy Efficient  - $120"+colour.end);
						price = 120;
						while(true) {
							System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Godrej Mini Fridge, 90L, Mini Fridge, Energy Efficient", price);
							String dis;
							while(true) {
								System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
								dis = scanner.next();
								if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
								else System.out.print(colour.red+"Invalid Input."+colour.end);
							}
							if(dis.equalsIgnoreCase("yes")) {
								ct.displayCart();
							}

						}
						break;
					case "2":
						System.out.println(colour.green+"You've selected: 120L, Mini Fridge, Adjustable Thermostat  - $150"+colour.end);
						price = 150;
						while(true) {
							System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Godrej Mini Fridge,  120L, Mini Fridge, Adjustable Thermostat", price);
							String dis;
							while(true) {
								System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
								dis = scanner.next();
								if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
								else System.out.print(colour.red+"Invalid Input."+colour.end);
							}
							if(dis.equalsIgnoreCase("yes")) {
								ct.displayCart();
							}

						}
						break;
					case "3":
						System.out.println(colour.green+"You've selected: 150L, Mini Fridge, Cool Storage  - $180"+colour.end);
						price = 180;
						while(true) {
							System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Godrej Mini Fridge, 150L, Mini Fridge, Cool Storage", price);
							String dis;
							while(true) {
								System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
								dis = scanner.next();
								if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
								else System.out.print(colour.red+"Invalid Input."+colour.end);
							}
							if(dis.equalsIgnoreCase("yes")) {
								ct.displayCart();
							}

						}
						break;
					case "4":
						showSpecifications();
                        break;
					}
				}
            }
				else if(choice.equalsIgnoreCase("No")) {
					showSpecifications();
					return;
                }
				
		}
	}

	public class WhirlpoolFridgeSelector {
		public static void showSpecifications() {
			while(true) {
			System.out.println(colour.bgred+"!-----Available Models-----!"+colour.end);
			System.out.println("1. Whirlpool Top Freezer Fridge ");
			System.out.println("2. Whirlpool Double Door Fridge");
			System.out.println("3. Whirlpool Side-by-Side Fridge");
			System.out.println("4. Whirlpool French Door Fridge");
			System.out.println("5. Whirlpool Mini Fridge");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print(colour.magenta+"Enter your choice (1-7): "+colour.end);

			
				String series = scanner.next();

				switch(series) {
				case "1":
					whirlpoolTopFreezerModel();
					break;
				case "2":
					whirlpoolDoubleDoorModel();
					break;
				case "3":
					whirlpoolSideBySideModel();
					break;
				case "4":
					whirlpoolFrenchDoorModel();
					break;
				case "5":
					whirlpoolMiniFridgeModel();
					break;
				case "6":
					Fridges.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println(colour.red+"Invalid choice. Please select a number between 1 and 7."+colour.end);
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}
		// Method for Whirlpool Top Freezer Fridge
		public static void whirlpoolTopFreezerModel() {
			System.out.println("Whirlpool Top Freezer Fridge Specifications:"+colour.end);
			System.out.println("1. 240L Top Freezer");
			System.out.println("   - Capacity: 240 Liters");
			System.out.println("   - Energy Rating: 3 stars");
			System.out.println("   - Price Range: $300 - $450"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Whirlpool Top Freezer model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Whirlpool Top Freezer variant:"+colour.end);
					System.out.println("1. 240L, Top Freezer, 3 stars  - $300"+colour.end);
					System.out.println("2. 280L, Top Freezer, 4 stars  - $400"+colour.end);
					System.out.println("3. 300L, Top Freezer, 5 stars  - $450"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 240L, Top Freezer, 3 stars  - $300"+colour.end);
							price = 300;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Top Freezer, 240L, Top Freezer, 3 stars", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 280L, Top Freezer, 4 stars  - $400"+colour.end);
							price = 400;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Top Freezer, 280L, Top Freezer, 4 stars", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 300L, Top Freezer, 5 stars  - $450"+colour.end);
							price = 450;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Top Freezer, 300L, Top Freezer, 5 stars", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Whirlpool Double Door Fridge
		public static void whirlpoolDoubleDoorModel() {
			System.out.println("Whirlpool Double Door Fridge Specifications:"+colour.end);
			System.out.println("1. 330L Double Door");
			System.out.println("   - Capacity: 330 Liters");
			System.out.println("   - Features: Fresh Food Storage, Energy Efficient");
			System.out.println("   - Price Range: $500 - $650"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Whirlpool Double Door model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Whirlpool Double Door variant:"+colour.end);
					System.out.println("1. 330L, Double Door, Fresh Food Storage  - $500"+colour.end);
					System.out.println("2. 350L, Double Door, Convertible Fresh Food Storage  - $550"+colour.end);
					System.out.println("3. 400L, Double Door, IntelliFresh Technology  - $650"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 330L, Double Door, Fresh Food Storage  - $500"+colour.end);
							price = 500;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Double Door, 330L, Double Door, Fresh Food Storage", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 350L, Double Door, Convertible Fresh Food Storage  - $550"+colour.end);
							price = 550;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Double Door, 350L, Double Door, Convertible Fresh Food Storage", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 400L, Double Door, IntelliFresh Technology  - $650"+colour.end);
							price = 650;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Double Door, 400L, Double Door, IntelliFresh Technology", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Whirlpool Side-by-Side Fridge
		public static void whirlpoolSideBySideModel() {
			System.out.println("Whirlpool Side-by-Side Fridge Specifications:"+colour.end);
			System.out.println("1. 600L Side-by-Side");
			System.out.println("   - Capacity: 600 Liters");
			System.out.println("   - Features: Water Dispenser, Fast Cooling");
			System.out.println("   - Price Range: $950 - $1300"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Whirlpool Side-by-Side model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}


				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Whirlpool Side-by-Side variant:"+colour.end);
					System.out.println("1. 600L, Side-by-Side, Water Dispenser  - $950"+colour.end);
					System.out.println("2. 650L, Side-by-Side, Fast Cooling  - $1150"+colour.end);
					System.out.println("3. 700L, Side-by-Side, Smart Cooling  - $1300"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 600L, Side-by-Side, Water Dispenser  - $950"+colour.end);
							price = 950;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Side-by-Side, 600L, Side-by-Side, Water Dispenser", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 650L, Side-by-Side, Fast Cooling  - $1150"+colour.end);
							price = 1150;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Side-by-Side, 650L, Side-by-Side, Fast Cooling", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 700L, Side-by-Side, Smart Cooling  - $1300"+colour.end);
							price = 1300;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Side-by-Side, 700L, Side-by-Side, Smart Cooling", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Whirlpool French Door Fridge
		public static void whirlpoolFrenchDoorModel() {
			System.out.println("Whirlpool French Door Fridge Specifications:"+colour.end);
			System.out.println("1. 500L French Door");
			System.out.println("   - Capacity: 500 Liters");
			System.out.println("   - Features: Energy Saving, Adjustable Shelves");
			System.out.println("   - Price Range: $1100 - $1500"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Whirlpool French Door model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Whirlpool French Door variant:"+colour.end);
					System.out.println("1. 500L, French Door, Energy Saving  - $1100"+colour.end);
					System.out.println("2. 550L, French Door, Adjustable Shelves  - $1300"+colour.end);
					System.out.println("3. 600L, French Door, Smart Temperature Control  - $1500"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 500L, French Door, Energy Saving  - $1100"+colour.end);
							price = 1100;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool French Door, 500L, French Door, Energy Saving", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 550L, French Door, Adjustable Shelves  - $1300"+colour.end);
							price = 1300;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool French Door, 550L, French Door, Adjustable Shelves", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 600L, French Door, Smart Temperature Control  - $1500"+colour.end);
							price = 1500;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool French Door, 600L, French Door, Smart Temperature Control", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Whirlpool Mini Fridge
		public static void whirlpoolMiniFridgeModel() {
			System.out.println("Whirlpool Mini Fridge Specifications:"+colour.end);
			System.out.println("1. 90L Mini Fridge");
			System.out.println("   - Capacity: 90 Liters");
			System.out.println("   - Features: Adjustable Thermostat, Space-Saving Design");
			System.out.println("   - Price Range: $100 - $200"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Whirlpool Mini Fridge model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Whirlpool Mini Fridge variant:"+colour.end);
					System.out.println("1. 90L, Mini Fridge, Adjustable Thermostat - $100"+colour.end);
					System.out.println("2. 100L, Mini Fridge, Energy Efficient  - $150"+colour.end);
					System.out.println("3. 120L, Mini Fridge, Space Saving - $200"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 90L, Mini Fridge, Adjustable Thermostat - $100"+colour.end);
							price = 100;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Mini Fridge, 90L, Mini Fridge, Adjustable Thermostat", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 100L, Mini Fridge, Energy Efficient - $150"+colour.end);
							price = 150;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Mini Fridge, 100L, Mini Fridge, Energy Efficient", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 120L, Mini Fridge, Space Saving - $200"+colour.end);
							price = 200;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Mini Fridge,  120L, Mini Fridge, Space Saving", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}
	}

	public class HaierFridgeSelector {
		public static void showSpecifications() {
			while(true) {
			System.out.println(colour.bgred+"!-----Available Models-----!"+colour.end);
			System.out.println("1. Haier Top Freezer Fridge ");
			System.out.println("2. Haier Double Door Fridge");
			System.out.println("3. Haier Side-by-Side Fridge");
			System.out.println("4. Haier French Door Fridge");
			System.out.println("5. Haier Mini Fridge");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print(colour.magenta+"Enter your choice (1-7): "+colour.end);

			
				String series = scanner.next();

				switch(series) {
				case "1":
					haierTopFreezerModel();
					break;
				case "2":
					haierDoubleDoorModel();
					break;
				case "3":
					haierSideBySideModel();
					break;
				case "4":
					haierFrenchDoorModel();
					break;
				case "5":
					haierMiniFridgeModel();
					break;
				case "6":
					Fridges.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println(colour.red+"Invalid choice. Please select a number between 1 and 7."+colour.end);
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}

		// Method for Haier Top Freezer Fridge
		public static void haierTopFreezerModel() {
			System.out.println("Haier Top Freezer Fridge Specifications:"+colour.end);
			System.out.println("1. 220L Top Freezer");
			System.out.println("   - Capacity: 220 Liters");
			System.out.println("   - Energy Rating: 3 stars");
			System.out.println("   - Price Range: $250 - $400"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Haier Top Freezer model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}


				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Haier Top Freezer variant:"+colour.end);
					System.out.println("1. 220L, Top Freezer, 3 stars  - $400"+colour.end);
					System.out.println("2. 250L, Top Freezer, 4 stars  - $400"+colour.end);
					System.out.println("3. 280L, Top Freezer, 5 stars  - $400"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 220L, Top Freezer, 3 stars  - $250"+colour.end);
							price = 250;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Top Freezer, 220L, Top Freezer, 3 stars", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 250L, Top Freezer, 4 stars  - $325"+colour.end);
							price = 325;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Top Freezer, 250L, Top Freezer, 4 stars", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 280L, Top Freezer, 5 stars  - $400"+colour.end);
							price = 400;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Top Freezer, 280L, Top Freezer, 5 stars", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Haier Double Door Fridge
		public static void haierDoubleDoorModel() {
			System.out.println("Haier Double Door Fridge Specifications:"+colour.end);
			System.out.println("1. 330L Double Door");
			System.out.println("   - Capacity: 330 Liters");
			System.out.println("   - Features: Energy Efficient, Fresh Storage");
			System.out.println("   - Price Range: $450 - $600"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Haier Double Door model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Haier Double Door variant:"+colour.end);
					System.out.println("1. 330L, Double Door, Fresh Storage  - $450"+colour.end);
					System.out.println("2. 350L, Double Door, Smart Cooling  - $500"+colour.end);
					System.out.println("3. 400L, Double Door, Convertible Fresh Storage  - $600"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 330L, Double Door, Fresh Storage  - $450"+colour.end);
							price = 450;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Double Door, 330L, Double Door, Fresh Storage", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 350L, Double Door, Smart Cooling  - $500"+colour.end);
							price = 500;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Double Door, 350L, Double Door, Smart Cooling", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 400L, Double Door, Convertible Fresh Storage  - $600"+colour.end);
							price = 600;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Double Door, 400L, Double Door, Convertible Fresh Storage", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Haier Side-by-Side Fridge
		public static void haierSideBySideModel() {
			System.out.println("Haier Side-by-Side Fridge Specifications:"+colour.end);
			System.out.println("1. 550L Side-by-Side");
			System.out.println("   - Capacity: 550 Liters");
			System.out.println("   - Features: Water Dispenser, Fast Cooling");
			System.out.println("   - Price Range: $800 - $1200"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Haier Side-by-Side model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Haier Side-by-Side variant:"+colour.end);
					System.out.println("1. 550L, Side-by-Side, Water Dispenser  - $800"+colour.end);
					System.out.println("2. 600L, Side-by-Side, Smart Cooling  - $1000"+colour.end);
					System.out.println("3. 650L, Side-by-Side, Fast Cooling  - $1200"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 550L, Side-by-Side, Water Dispenser  - $800"+colour.end);
							price = 800;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Side-by-Side, 550L, Side-by-Side, Water Dispenser", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 600L, Side-by-Side, Smart Cooling  - $1000"+colour.end);
							price = 1000;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Side-by-Side, 600L, Side-by-Side, Smart Cooling", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 650L, Side-by-Side, Fast Cooling  - $1200"+colour.end);
							price = 1200;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Side-by-Side, 650L, Side-by-Side, Fast Cooling", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Haier French Door Fridge
		public static void haierFrenchDoorModel() {
			System.out.println("Haier French Door Fridge Specifications:"+colour.end);
			System.out.println("1. 500L French Door");
			System.out.println("   - Capacity: 500 Liters");
			System.out.println("   - Features: Adjustable Shelves, Energy Saving");
			System.out.println("   - Price Range: $1000 - $1400"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Haier French Door model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Haier French Door variant:"+colour.end);
					System.out.println("1. 500L, French Door, Adjustable Shelves  -$1000"+colour.end);
					System.out.println("2. 550L, French Door, Smart Temperature Control  -$1200"+colour.end);
					System.out.println("3. 600L, French Door, Dual Cooling  -$1400"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 500L, French Door, Adjustable Shelves  -$1000"+colour.end);
							price = 1000;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier French Door, 500L, French Door, Adjustable Shelves", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 550L, French Door, Smart Temperature Control  -$1200"+colour.end);
							price = 1200;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier French Door, 550L, French Door, Smart Temperature Control", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 600L, French Door, Dual Cooling  -$1400"+colour.end);
							price = 1400;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier French Door, 600L, French Door, Dual Cooling", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Haier Mini Fridge
		public static void haierMiniFridgeModel() {
			System.out.println("Haier Mini Fridge Specifications:"+colour.end);
			System.out.println("1. 90L Mini Fridge");
			System.out.println("   - Capacity: 90 Liters");
			System.out.println("   - Features: Adjustable Thermostat, Space Saving");
			System.out.println("   - Price Range: $100 - $180"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Haier Mini Fridge model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Haier Mini Fridge variant:"+colour.end);
					System.out.println("1. 90L, Mini Fridge, Adjustable Thermostat  - $100"+colour.end);
					System.out.println("2. 100L, Mini Fridge, Energy Efficient  -$150"+colour.end);
					System.out.println("3. 120L, Mini Fridge, Compact Design  -$180"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4): "+colour.end);
					}
 


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: 90L, Mini Fridge, Adjustable Thermostat  - $100"+colour.end);
							price = 100;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Mini Fridge, 90L, Mini Fridge, Adjustable Thermostat", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println(colour.green+"You've selected: 100L, Mini Fridge, Energy Efficient  - $150"+colour.end);
							price = 150;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Mini Fridge, 100L, Mini Fridge, Energy Efficient", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println(colour.green+"You've selected: 120L, Mini Fridge, Compact Design  - $180"+colour.end);
							price = 180;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Mini Fridge, 120L, Mini Fridge, Compact Design", price);
								String dis;
								while(true) {
									System.out.println(colour.yellow+"Do you want to see cart (yes/no)"+colour.end);
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print(colour.red+"Invalid Input."+colour.end);
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
					case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}
	 }
    // public static void range() {
	// 	int ran;
	// 	int ran1;
	// 	System.out.println("Please enter your Starting Range");
	// 	System.out.print("$ ");

	// 	while(true) {
	// 		try {
	// 			ran = scanner.nextInt();
	// 			break;
	// 		}
	// 		catch(Exception e) {
	// 			System.out.println("Please enter a Integer value");
	// 		}
	// 	}
	// 	System.out.println("Please enter your Ending  Range");
	// 	System.out.print("$ ");
	// 	while(true) {
	// 		try {
	// 			ran1 = scanner.nextInt();
	// 			break;
	// 		}
	// 		catch(Exception e) {
	// 			System.out.println("Please enter a Integer value");
	// 		}
	// 	}
	// 	for(int i = ran; i<=ran1; i++) {

	// 	}
	// }
	public static void main(String[] args) {
		Fridges fridge = new Fridges();

		System.out.println("Welcome to Fridges Selector!");
		System.out.println("Choose from our Fridges models:"+colour.end);
		System.out.println("1. LG Fridge");
		System.out.println("2. Samsung Fridge");
		System.out.println("3. Godrej Fridge");
		System.out.println("4. Whirlpool Fridge");
		System.out.println("5. Haier Fridge");
		System.out.println("6. Back");

		System.out.print(colour.magenta+"Enter your choice (1-6): "+colour.end);
		while(true) {
			String series = scanner.next();

			switch(series) {
			case "1":
				Fridges.LGFridgeSelector lg = fridge.new LGFridgeSelector();
				lg.showSpecifications();
				break;
			case "2":
				Fridges.SamsungFridgeSelector samsung = fridge.new SamsungFridgeSelector();
				samsung.showSpecifications();
				break;
			case "3":
				Fridges.GodrejFridgeSelector godrej = fridge.new GodrejFridgeSelector();
				godrej.showSpecifications();
				break;
			case "4":
				Fridges.WhirlpoolFridgeSelector whirlpool = fridge.new WhirlpoolFridgeSelector();
				whirlpool.showSpecifications();
				break;
			case "5":
				Fridges.HaierFridgeSelector haier = fridge.new HaierFridgeSelector();
				haier.showSpecifications();
				break;
			case "6":
				Promain Main = new Promain();
				main.main(new String[]{});
				break;
			default:
				System.out.println(colour.red+"Invalid selection");
			}
			if(series.equals("1")||series.equals("2")||series.equals("3")||series.equals("4")||series.equals("5")) break;
		}
		scanner.close();
	}
}