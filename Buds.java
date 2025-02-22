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
public class Buds {
	public Buds(){}
	public Buds(Cart cart){
		this.ct = cart;
	}
	static Scanner scanner = new Scanner(System.in);
    static Cart ct;
	static double price ;
	static String sc;
	static Promain main = Promain.main;
	public class NoiseBudsSelector {
		public  static void showSpecifications() {
			while(true) {
			System.out.println(colour.bgred+"!-----Available Models-----!"+colour.end);
			System.out.println("1. Noise Buds Xtreme");
			System.out.println("2. Noise Buds Air");
			System.out.println("3. Noise Buds Fit");
			System.out.println("4.Noise Buds Play");
			System.out.println("5. Noise Buds Pro");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print(colour.magenta+"Enter your choice (1-7): "+colour.end);

			
				String series = scanner.next();

				switch(series) {
				case "1":
					noiseBudsXtremeModel();
					break;
				case "2":
					noiseBudsAirModel();
					break;
				case "3":
					noiseBudsFitModel();
					break;
				case "4":
					noiseBudsPlayModel();
					break;
				case "5":
					noiseBudsProModel();
					break;
				case "6":
					Buds.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println(colour.red+"Invalid choice. Please select a number between 1 and 7."+colour.end);
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}

		// Method for Noise Buds Xtreme
		public static void noiseBudsXtremeModel() {
			System.out.println("Noise Buds Xtreme Specifications:"+colour.end);
			System.out.println("1. Noise Buds Xtreme");
			System.out.println("   - Battery Life: 35 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.0"+colour.end);
			System.out.println("   - Price Range: $30 - $50"+colour.end);
			System.out.println("   - Features: IPX5 water resistance, Noise Cancellation, Deep Bass");
            String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Noise Buds Xtreme model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Noise Buds Xtreme variant:"+colour.end);
					System.out.println("1. Standard Edition  - $30"+colour.end);
					System.out.println("2. Special Edition (with customized case)  - $50"+colour.end);
					System.out.println("3. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3): "+colour.end);
					}

						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: Noise Buds Xtreme, Standard Edition  - $30"+colour.end);
                            price = 30;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Noise Buds Xtreme, Standard Edition", price);
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
							System.out.println(colour.green+"You've selected: Noise Buds Xtreme, Special Edition  - $50"+colour.end);
                            price = 50;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem(" Noise Buds Xtreme, Special Edition", price);
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

		// Method for Noise Buds Air
		public static void noiseBudsAirModel() {
			System.out.println("Noise Buds Air Specifications:"+colour.end);
			System.out.println("1. Noise Buds Air");
			System.out.println("   - Battery Life: 20 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.2");
			System.out.println("   - Price Range: $25 - $40"+colour.end);
			System.out.println("   - Features: ENC (Environmental Noise Cancellation), Lightweight");
            String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Noise Buds Air model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Noise Buds Air variant:"+colour.end);
					System.out.println("1. White  - $25");
					System.out.println("2. Black  - $35");
					System.out.println("3. Pink  - $40"+colour.end);
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
							System.out.println(colour.green+"You've selected: Noise Buds Air, White variant  - $25"+colour.end);
                            price = 25;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Noise Buds Air, White variant", price);
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
							System.out.println(colour.green+"You've selected: Noise Buds Air, Black variant  - $35"+colour.end);
                            price = 35;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem(" Noise Buds Air, Black variant", price);
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
							System.out.println(colour.green+"You've selected: Noise Buds Air, Pink variant  - $40"+colour.end);
                            price = 40;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem(" Noise Buds Air, Pink variant", price);
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

		// Method for Noise Buds Fit
		public static void noiseBudsFitModel() {
			System.out.println("Noise Buds Fit Specifications:"+colour.end);
			System.out.println("1. Noise Buds Fit");
			System.out.println("   - Battery Life: 18 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.1");
			System.out.println("   - Price Range: $40 - $60"+colour.end);
			System.out.println("   - Features: Sweat & Water-resistant, Secure Fit");
            String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Noise Buds Fit model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Noise Buds Fit variant:"+colour.end);
					System.out.println("1. Standard Edition (Black)  - $40"+colour.end);
					System.out.println("2. Sport Edition (Neon Green)  - $60"+colour.end);
					System.out.println("3. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3): "+colour.end);
					}


						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: Noise Buds Fit, Standard Edition  - $40"+colour.end);
                            price = 40;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Noise Buds Fit, Standard Edition", price);
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
							System.out.println(colour.green+"You've selected: Noise Buds Fit, Sport Edition  - $60"+colour.end);
                            price = 60;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Noise Buds Fit, Sport Edition", price);
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

		// Method for Noise Buds Play
		public static void noiseBudsPlayModel() {
			System.out.println("Noise Buds Play Specifications:"+colour.end);
			System.out.println("1. Noise Buds Play");
			System.out.println("   - Battery Life: 14 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.0"+colour.end);
			System.out.println("   - Price Range: $20 - $30"+colour.end);
			System.out.println("   - Features: Bass Boost, Noise Isolation");

            String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Noise Buds Play model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Noise Buds Play variant:"+colour.end);
					System.out.println("1. Black  - $20"+colour.end);
					System.out.println("2. White  - $25");
					System.out.println("3. Blue  - $30"+colour.end);
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
							System.out.println(colour.green+"You've selected: Noise Buds Play, Black variant  - $20"+colour.end);
                            price = 20;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Noise Buds Play, Black variant", price);
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
							System.out.println(colour.green+"You've selected: Noise Buds Play, White variant  - $25"+colour.end);
                            price = 25;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Noise Buds Play, White variant", price);
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
							System.out.println(colour.green+"You've selected: Noise Buds Play, Blue variant  - $30"+colour.end);
                            price = 30;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Noise Buds Play, Blue variant", price);
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

		// Method for Noise Buds Pro
		public static void noiseBudsProModel() {
			System.out.println("Noise Buds Pro Specifications:"+colour.end);
			System.out.println("1. Noise Buds Pro");
			System.out.println("   - Battery Life: 24 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.2");
			System.out.println("   - Price Range: $50 - $80"+colour.end);
			System.out.println("   - Features: Active Noise Cancellation, 12mm Drivers");
            String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Noise Buds Pro model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Noise Buds Pro variant:"+colour.end);
					System.out.println("1. Black  - $50"+colour.end);
					System.out.println("2. White  - $65");
					System.out.println("3. Gold  - $80"+colour.end);
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
							System.out.println(colour.green+"You've selected: Noise Buds Pro, Black variant  - $50"+colour.end);
                            price = 50;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Noise Buds Pro, Black variant", price);
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
							System.out.println(colour.green+"You've selected: Noise Buds Pro, White variant  - $65"+colour.end);
                            price = 65;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Noise Buds Pro, White variant", price);
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
							System.out.println(colour.green+"You've selected: Noise Buds Pro, Gold variant  - $80"+colour.end);
                            price = 80;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Noise Buds Pro, Gold variant", price);
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

	public class BoatBudsSelector {
		public  static void showSpecifications() {
			while(true) {
			System.out.println(colour.bgred+"!-----Available Models-----!"+colour.end);
			System.out.println("1. boAt Airdopes 450"+colour.end);
			System.out.println("2. boAt Airdopes 621");
			System.out.println("3. boAt Airdopes 131");
			System.out.println("4. boAt Airdopes 131");
			System.out.println("5. boAt Airdopes 641");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print(colour.magenta+"Enter your choice (1-7): "+colour.end);

			
				String series = scanner.next();

				switch(series) {
				case "1":
					boatAirdopes450Model();
					break;
				case "2":
					boatAirdopes621Model();
					break;
				case "3":
					boatAirdopes131Model();
					break;
				case "4":
					boatAirdopes171Model();
					break;
				case "5":
					boatAirdopes641Model();
					break;
				case "6":
					Buds.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println(colour.red+"Invalid choice. Please select a number between 1 and 7."+colour.end);
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}

		// Method for boAt Airdopes 450
		public static void boatAirdopes450Model() {
			System.out.println("boAt Airdopes 450 Specifications:"+colour.end);
			System.out.println("1. boAt Airdopes 450"+colour.end);
			System.out.println("   - Battery Life: 15 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.0"+colour.end);
			System.out.println("   - Price Range: $25 - $40"+colour.end);
			System.out.println("   - Features: IPX4 Water Resistance, Deep Bass, 6mm Drivers");
            String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the boAt Airdopes 450 model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your boAt Airdopes 450 variant:"+colour.end);
					System.out.println("1. Black  - $25");
					System.out.println("2. White  - $30"+colour.end);
					System.out.println("3. Blue  - $40"+colour.end);
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
							System.out.println(colour.green+"You've selected: boAt Airdopes 450, Black variant  - $25"+colour.end);
                            price = 25;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("boAt Airdopes 450, Black variant", price);
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
							System.out.println(colour.green+"You've selected: boAt Airdopes 450, White variant  - $30"+colour.end);
                            price = 30;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("boAt Airdopes 450, White variant", price);
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
							System.out.println(colour.green+"You've selected: boAt Airdopes 450, Blue variant  - $40"+colour.end);
                            price = 40;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("boAt Airdopes 450, Blue variant", price);
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

		// Method for boAt Airdopes 621
		public static void boatAirdopes621Model() {
			System.out.println("boAt Airdopes 621 Specifications:"+colour.end);
			System.out.println("1. boAt Airdopes 621");
			System.out.println("   - Battery Life: 30 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.1");
			System.out.println("   - Price Range: $40 - $60"+colour.end);
			System.out.println("   - Features: IPX7 Water Resistance, Beast Mode for gaming, 6mm Drivers");
            String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the boAt Airdopes 621 model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your boAt Airdopes 621 variant:"+colour.end);
					System.out.println("1. Black  - $40"+colour.end);
					System.out.println("2. Green  - $50"+colour.end);
					System.out.println("3. Red  - $60"+colour.end);
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
							System.out.println(colour.green+"You've selected: boAt Airdopes 621, Black variant  - $40"+colour.end);
                            price = 40;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("boAt Airdopes 621, Black variant", price);
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
							System.out.println(colour.green+"You've selected: boAt Airdopes 621, Green variant  - $50"+colour.end);
                            price = 50;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("boAt Airdopes 621, Green variant", price);
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
							System.out.println(colour.green+"You've selected: boAt Airdopes 621, Red variant  - $60"+colour.end);
                            price = 60;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("boAt Airdopes 621, Red variant", price);
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

		// Method for boAt Airdopes 131
		public static void boatAirdopes131Model() {
			System.out.println("boAt Airdopes 131 Specifications:"+colour.end);
			System.out.println("1. boAt Airdopes 131");
			System.out.println("   - Battery Life: 13 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.0"+colour.end);
			System.out.println("   - Price Range: $15 - $25");
			System.out.println("   - Features: Deep Bass, Quick Charge, 10mm Drivers");
            String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the boAt Airdopes 131 model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your boAt Airdopes 131 variant:"+colour.end);
					System.out.println("1. Black  - $15");
					System.out.println("2. Blue  - $20"+colour.end);
					System.out.println("3. Red  - $25");
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
							System.out.println(colour.green+"You've selected: boAt Airdopes 131, Black variant  - $15"+colour.end);
                            price = 15;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("boAt Airdopes 131, Black variant", price);
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
							System.out.println(colour.green+"You've selected: boAt Airdopes 131, Blue variant  - $20"+colour.end);
                            price = 20;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("boAt Airdopes 131, Blue variant", price);
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
							System.out.println(colour.green+"You've selected: boAt Airdopes 131, Red variant  - $25"+colour.end);
                            price = 25;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("boAt Airdopes 131, Red variant", price);
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

		// Method for boAt Airdopes 171
		public static void boatAirdopes171Model() {
			System.out.println("boAt Airdopes 171 Specifications:"+colour.end);
			System.out.println("1. boAt Airdopes 171");
			System.out.println("   - Battery Life: 20 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.0"+colour.end);
			System.out.println("   - Price Range: $25 - $40"+colour.end);
			System.out.println("   - Features: Environmental Noise Cancellation (ENC), 10mm Drivers");
            String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the boAt Airdopes 171 model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your boAt Airdopes 171 variant:"+colour.end);
					System.out.println("1. Black  - $25");
					System.out.println("2. White  - $30"+colour.end);
					System.out.println("3. Blue  - $40"+colour.end);
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
							System.out.println(colour.green+"You've selected: boAt Airdopes 171, Black variant  - $25"+colour.end);
                            price = 25;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("boAt Airdopes 171, Black variant", price);
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
							System.out.println(colour.green+"You've selected: boAt Airdopes 171, White variant  - $30"+colour.end);
                            price = 30;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("boAt Airdopes 171, White variant", price);
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
							System.out.println(colour.green+"You've selected: boAt Airdopes 171, Blue variant  - $40"+colour.end);
                            price = 40;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("boAt Airdopes 171, Blue variant", price);
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

		// Method for boAt Airdopes 641
		public static void boatAirdopes641Model() {
			System.out.println("boAt Airdopes 641 Specifications:"+colour.end);
			System.out.println("1. boAt Airdopes 641");
			System.out.println("   - Battery Life: 28 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.1");
			System.out.println("   - Price Range: $45 - $65");
			System.out.println("   - Features: Hybrid Active Noise Cancellation (ANC), 6mm Drivers");
            String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the boAt Airdopes 641 model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}
				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your boAt Airdopes 641 variant:"+colour.end);
					System.out.println("1. Black  - $45");
					System.out.println("2. White  - $55");
					System.out.println("3. Grey  - $65");
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
							System.out.println(colour.green+"You've selected: boAt Airdopes 641, Black variant  - $45"+colour.end);
                            price = 45;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("boAt Airdopes 641, Black variant", price);
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
							System.out.println(colour.green+"You've selected: boAt Airdopes 641, White variant  - $55"+colour.end);
                            price = 55;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("boAt Airdopes 641, White variant", price);
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
							System.out.println(colour.green+"You've selected: boAt Airdopes 641, Grey variant  - $65"+colour.end);
                            price = 65;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("boAt Airdopes 641, Grey variant", price);
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

	public class RealmeBudsSelector {
		public  static void showSpecifications() {
			while(true) {
			System.out.println(colour.bgred+"!-----Available Models-----!"+colour.end);
			System.out.println("1. Realme Buds Air");
			System.out.println("2. Realme Buds Q2");
			System.out.println("3. Realme Buds Neo");
			System.out.println("4.Realme Buds 2 Pro");
			System.out.println("5. realmeBudsFlowModel()");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print(colour.magenta+"Enter your choice (1-7): "+colour.end);

			
				String series = scanner.next();

				switch(series) {
				case "1":
					realmeBudsAirModel();
					break;
				case "2":
					realmeBudsQ2Model();
					break;
				case "3":
					realmeBudsNeoModel();
					break;
				case "4":
					realmeBuds2ProModel();
					break;
				case "5":
					realmeBudsFlowModel();
					break;
				case "6":
					Buds.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println(colour.red+"Invalid choice. Please select a number between 1 and 7."+colour.end);
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}

		// Method for Realme Buds Air
		public static void realmeBudsAirModel() {
			System.out.println("Realme Buds Air Specifications:"+colour.end);
			System.out.println("1. Realme Buds Air");
			System.out.println("   - Battery Life: 17 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.0"+colour.end);
			System.out.println("   - Price Range: $30 - $50"+colour.end);
			System.out.println("   - Features: ENC (Environmental Noise Cancellation), Quick Charging");
            String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Realme Buds Air model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}


				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Realme Buds Air variant:"+colour.end);
					System.out.println("1. White  - $50"+colour.end);
					System.out.println("2. Black  - $50"+colour.end);
					System.out.println("3. Yellow  - $50"+colour.end);
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
							System.out.println(colour.green+"You've selected: Realme Buds Air, White variant  - $30"+colour.end);
                            price = 30;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Realme Buds Air, White variant", price);
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
							System.out.println(colour.green+"You've selected: Realme Buds Air, Black variant  - $40"+colour.end);
                            price = 40;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Realme Buds Air, Black variant", price);
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
							System.out.println(colour.green+"You've selected: Realme Buds Air, Yellow variant  - $50"+colour.end);
                            price = 50;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Realme Buds Air, Yellow variant", price);
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

		// Method for Realme Buds Q2
		public static void realmeBudsQ2Model() {
			System.out.println("Realme Buds Q2 Specifications:"+colour.end);
			System.out.println("1. Realme Buds Q2");
			System.out.println("   - Battery Life: 28 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.0"+colour.end);
			System.out.println("   - Price Range: $40 - $60"+colour.end);
			System.out.println("   - Features: ANC (Active Noise Cancellation), 10mm Drivers");
            	String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Realme Buds Q2 model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Realme Buds Q2 variant:"+colour.end);
					System.out.println("1. Black  - $40"+colour.end);
					System.out.println("2. White  - $50"+colour.end);
					System.out.println("3. Green  - $60"+colour.end);
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
							System.out.println(colour.green+"You've selected: Realme Buds Q2, Black variant  - $40"+colour.end);
                            price = 40;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Realme Buds Q2, Black variant", price);
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
							System.out.println(colour.green+"You've selected: Realme Buds Q2, White variant  - $50"+colour.end);
                            price = 50;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Realme Buds Q2, White variant", price);
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
							System.out.println(colour.green+"You've selected: Realme Buds Q2, Green variant  - $60"+colour.end);
                            price = 60;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Realme Buds Q2, Green variant", price);
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

		// Method for Realme Buds Neo
		public static void realmeBudsNeoModel() {
			System.out.println("Realme Buds Neo Specifications:"+colour.end);
			System.out.println("1. Realme Buds Neo");
			System.out.println("   - Battery Life: 20 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.0"+colour.end);
			System.out.println("   - Price Range: $20 - $30"+colour.end);
			System.out.println("   - Features: Deep Bass, 10mm Drivers");
            String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Realme Buds Neo model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Realme Buds Neo variant:"+colour.end);
					System.out.println("1. Blue  - $20"+colour.end);
					System.out.println("2. Black  - $25");
					System.out.println("3. Red  - $30"+colour.end);
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
							System.out.println(colour.green+"You've selected: Realme Buds Neo, Blue variant  - $20"+colour.end);
                            price = 20;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Realme Buds Neo, Blue variant", price);
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
							System.out.println(colour.green+"You've selected: Realme Buds Neo, Black variant  - $25"+colour.end);
                            price = 25;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Realme Buds Neo, Black variant", price);
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
							System.out.println(colour.green+"You've selected: Realme Buds Neo, Red variant  - $30"+colour.end);
                            price = 30;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Realme Buds Neo, Red variant", price);
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

		// Method for Realme Buds 2 Pro
		public static void realmeBuds2ProModel() {
			System.out.println("Realme Buds 2 Pro Specifications:"+colour.end);
			System.out.println("1. Realme Buds 2 Pro");
			System.out.println("   - Battery Life: 22 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.2");
			System.out.println("   - Price Range: $40 - $55");
			System.out.println("   - Features: 10mm Bass Boost Drivers, IPX4 Water Resistance");
            String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Realme Buds 2 Pro model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Realme Buds 2 Pro variant:"+colour.end);
					System.out.println("1. Black  - $40"+colour.end);
					System.out.println("2. Blue  - $45");
					System.out.println("3. Green  - $55");
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
							System.out.println(colour.green+"You've selected: Realme Buds 2 Pro, Black variant  - $40"+colour.end);
                            price = 40;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Realme Buds 2 Pro, Black variant", price);
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
							System.out.println(colour.green+"You've selected: Realme Buds 2 Pro, Blue variant  - $45"+colour.end);
                            price = 45;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Realme Buds 2 Pro, Blue variant", price);
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
							System.out.println(colour.green+"You've selected: Realme Buds 2 Pro, Green variant  - $55"+colour.end);
                            price = 55;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Realme Buds 2 Pro, Green variant", price);
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

		// Method for Realme Buds Flow
		public static void realmeBudsFlowModel() {
			System.out.println("Realme Buds Flow Specifications:"+colour.end);
			System.out.println("1. Realme Buds Flow");
			System.out.println("   - Battery Life: 20 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.0"+colour.end);
			System.out.println("   - Price Range: $25 - $40"+colour.end);
			System.out.println("   - Features: Active Noise Cancellation (ANC), Bass Boost");
            String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Realme Buds Flow model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Realme Buds Flow variant:"+colour.end);
					System.out.println("1. Black  - $25");
					System.out.println("2. White  - $30"+colour.end);
					System.out.println("3. Green  - $40"+colour.end);
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
							System.out.println(colour.green+"You've selected: Realme Buds Flow, Black variant  - $25"+colour.end);
                            price = 25;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Realme Buds Flow, Black variant", price);
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
							System.out.println(colour.green+"You've selected: Realme Buds Flow, White variant  - $30"+colour.end);
                            price = 30;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Realme Buds Flow, White variant", price);
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
							System.out.println(colour.green+"You've selected: Realme Buds Flow, Green variant  - $40"+colour.end);
                            price = 40;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Realme Buds Flow, Green variant", price);
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


	public class BoultBudsSelector {
		public  static void showSpecifications() {
			while(true) {
			System.out.println(colour.bgred+"!-----Available Models-----!"+colour.end);
			System.out.println("1. Boult AirBass Z");
			System.out.println("2. Boult Airdopes 441");
			System.out.println("3. Boult Airdopes X1");
			System.out.println("4. Boult Airdopes 200"+colour.end);
			System.out.println("5. Boult Airdopes Infinity");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print(colour.magenta+"Enter your choice (1-7): "+colour.end);

			
				String series = scanner.next();

				switch(series) {
				case "1":
					boultAirBassZModel();
					break;
				case "2":
					boultAirdopes441Model();
					break;
				case "3":
					boultAirdopesX1Model();
					break;
				case "4":
					boultAirdopes200Model();
					break;
				case "5":
					boultAirdopesInfinityModel();
					break;
				case "6":
					Buds.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println(colour.red+"Invalid choice. Please select a number between 1 and 7."+colour.end);
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}

		// Method for Boult AirBass Z
		public static void boultAirBassZModel() {
			System.out.println("Boult AirBass Z Specifications:"+colour.end);
			System.out.println("1. Boult AirBass Z");
			System.out.println("   - Battery Life: 10 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.0"+colour.end);
			System.out.println("   - Price Range: $20 - $30"+colour.end);
			System.out.println("   - Features: IPX5 Water Resistance, Deep Bass, 10mm Drivers");
            String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Boult AirBass Z model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}
				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Boult AirBass Z variant:"+colour.end);
					System.out.println("1. Black  - $20"+colour.end);
					System.out.println("2. White  - $25");
					System.out.println("3. Blue  - $30"+colour.end);
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
							System.out.println(colour.green+"You've selected: Boult AirBass Z, Black variant  - $20"+colour.end);
                            price = 20;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Boult AirBass Z, Black variant", price);
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
							System.out.println(colour.green+"You've selected: Boult AirBass Z, White variant  - $25"+colour.end);
                            price = 25;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Boult AirBass Z, White variant", price);
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
							System.out.println(colour.green+"You've selected: Boult AirBass Z, Blue variant  - $30"+colour.end);
                            price = 30;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Boult AirBass Z, Blue variant", price);
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

		// Method for Boult Airdopes 441
		public static void boultAirdopes441Model() {
			System.out.println("Boult Airdopes 441 Specifications:"+colour.end);
			System.out.println("1. Boult Airdopes 441");
			System.out.println("   - Battery Life: 24 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.0"+colour.end);
			System.out.println("   - Price Range: $30 - $40"+colour.end);
			System.out.println("   - Features: IPX7 Water Resistance, 6mm Drivers, Touch Controls");
            String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Boult Airdopes 441 model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Boult Airdopes 441 variant:"+colour.end);
					System.out.println("1. Black  - $30"+colour.end);
					System.out.println("2. White  - $35");
					System.out.println("3. Green  - $40"+colour.end);
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
							System.out.println(colour.green+"You've selected: Boult Airdopes 441, Black variant  - $30"+colour.end);
                            price = 30;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Boult Airdopes 441, Black variant", price);
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
							System.out.println(colour.green+"You've selected: Boult Airdopes 441, White variant  - $35"+colour.end);
                            price = 35;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Boult Airdopes 441, White variant", price);
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
							System.out.println(colour.green+"You've selected: Boult Airdopes 441, Green variant  - $40"+colour.end);
                            price = 40;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Boult Airdopes 441, Green variant", price);
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

		// Method for Boult Airdopes X1
		public static void boultAirdopesX1Model() {
			System.out.println("Boult Airdopes X1 Specifications:"+colour.end);
			System.out.println("1. Boult Airdopes X1");
			System.out.println("   - Battery Life: 12 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.0"+colour.end);
			System.out.println("   - Price Range: $25 - $35");
			System.out.println("   - Features: IPX5 Water Resistance, 8mm Drivers, Passive Noise Cancellation");
            String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Boult Airdopes X1 model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Boult Airdopes X1 variant:"+colour.end);
					System.out.println("1. Black  - $25");
					System.out.println("2. Blue  - $30"+colour.end);
					System.out.println("3. Red  - $35");
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
							System.out.println(colour.green+"You've selected: Boult Airdopes X1, Black variant  - $25"+colour.end);
                            price = 25;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Boult Airdopes X1, Black variant", price);
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
							System.out.println(colour.green+"You've selected: Boult Airdopes X1, Blue variant  - $30"+colour.end);
                            price = 30;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Boult Airdopes X1, Blue variant", price);
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
							System.out.println(colour.green+"You've selected: Boult Airdopes X1, Red variant  - $35"+colour.end);
                            price = 35;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Boult Airdopes X1, Red variant", price);
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

		// Method for Boult Airdopes 200
		public static void boultAirdopes200Model() {
			System.out.println("Boult Airdopes 200 Specifications:"+colour.end);
			System.out.println("1. Boult Airdopes 200"+colour.end);
			System.out.println("   - Battery Life: 20 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.0"+colour.end);
			System.out.println("   - Price Range: $25 - $35");
			System.out.println("   - Features: 6mm Drivers, In-Ear Design, Fast Charging");
            	String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Boult Airdopes 200 model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Boult Airdopes 200 variant:"+colour.end);
					System.out.println("1. Black  - $25");
					System.out.println("2. White  - $30"+colour.end);
					System.out.println("3. Red  - $35");
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
							System.out.println(colour.green+"You've selected: Boult Airdopes 200, Black variant  - $25"+colour.end);
                            price = 25;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Boult Airdopes 200, Black variant", price);
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
							System.out.println(colour.green+"You've selected: Boult Airdopes 200, White variant  - $30"+colour.end);
                            price = 30;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Boult Airdopes 200, White variant", price);
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
							System.out.println(colour.green+"You've selected: Boult Airdopes 200, Red variant  - $35"+colour.end);
                            price = 35;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Boult Airdopes 200, Red variant", price);
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

		// Method for Boult Airdopes Infinity
		public static void boultAirdopesInfinityModel() {
			System.out.println("Boult Airdopes Infinity Specifications:"+colour.end);
			System.out.println("1. Boult Airdopes Infinity");
			System.out.println("   - Battery Life: 40 hours (with charging case)");
			System.out.println("   - Bluetooth Version: 5.0"+colour.end);
			System.out.println("   - Price Range: $40 - $50"+colour.end);
			System.out.println("   - Features: Dual Equalizer Mode, 12mm Drivers, IPX7 Water Resistance");
            String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Boult Airdopes Infinity model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Boult Airdopes Infinity variant:"+colour.end);
					System.out.println("1. Black  - $40"+colour.end);
					System.out.println("2. White  - $45");
					System.out.println("3. Blue  - $50"+colour.end);
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
							System.out.println(colour.green+"You've selected: Boult Airdopes Infinity, Black variant  - $40"+colour.end);
                            price = 40;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Boult Airdopes Infinity, Black variant", price);
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
							System.out.println(colour.green+"You've selected: Boult Airdopes Infinity, White variant  - $45"+colour.end);
                            price = 45;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Boult Airdopes Infinity, White variant", price);
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
							System.out.println(colour.green+"You've selected: Boult Airdopes Infinity, Blue variant  - $50"+colour.end);
                            price = 50;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Boult Airdopes Infinity, Blue variant", price);
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

	public class AppleBudsSelector {
		public  static void showSpecifications() {
			while(true) {
			System.out.println(colour.bgred+"!-----Available Models-----!"+colour.end);
			System.out.println("1. Apple AirPods 2nd Generation");
			System.out.println("2. Apple AirPods Pro");
			System.out.println("3. Apple AirPods 3rd Generation");
			System.out.println("4. Apple AirPods Pro 2nd Generation");
			System.out.println("5. Apple AirPods Max");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print(colour.magenta+"Enter your choice (1-7): "+colour.end);

			
				String series = scanner.next();

				switch(series) {
				case "1":
					appleAirPods2Model();
					break;
				case "2":
					appleAirPodsProModel();
					break;
				case "3":
					appleAirPods3Model();
					break;
				case "4":
					appleAirPodsPro2Model();
					break;
				case "5":
					appleAirPodsMaxModel();
					break;
				case "6":
					Buds.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println(colour.red+"Invalid choice. Please select a number between 1 and 7."+colour.end);
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}

		// Method for Apple AirPods 2
		public static void appleAirPods2Model() {
			System.out.println("Apple AirPods 2nd Generation Specifications:"+colour.end);
			System.out.println("1. Apple AirPods 2");
			System.out.println("   - Battery Life: Up to 5 hours listening time");
			System.out.println("   - Bluetooth Version: 5.0"+colour.end);
			System.out.println("   - Price Range: $129");
			System.out.println("   - Features: H1 Chip, Voice Activation, Auto-switching between devices");
            System.out.println("   - Colour: White");
            price = 249;
            while(true) {
                System.out.println(colour.blue+"!---Do you want to add this to cart---!"+colour.end);
                sc = scanner.next();
                if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
                else System.out.println(colour.red+"Invalid Selection. "+colour.end);
            }
            if(sc.equalsIgnoreCase("yes")) {
                ct.addItem("Apple AirPods 2, White variant", price);
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
                else showSpecifications();

            }
            else showSpecifications();
        }


		// 	System.out.print(colour.blue+"Would you like to select the Apple AirPods 2 model? (yes/no): "+colour.end);
		// 	while(true) {
		// 		String choice = scanner.next();

		// 		if (choice.equalsIgnoreCase("yes")) {
		// 			System.out.println(colour.purple+"Select your Apple AirPods 2 variant:"+colour.end);
		// 			System.out.println("1. White");
		// 			System.out.print(colour.magenta+"Enter your choice (1): "+colour.end);
		// 			while(true) {
		// 				String variant = scanner.next();


		// 				switch(variant) {
		// 				case "1":
		// 					System.out.println(colour.green+"You've selected: Apple AirPods 2, White variant");
		// 					break;
		// 				default:
		// 					System.out.println(colour.red+"Invalid selection");
		// 				}
		// 				if(variant.equalsIgnoreCase("1")) break;
		// 			}
		// 			break;
		// 		}
		// 		else if(choice.equalsIgnoreCase("No")) {
		// 			showSpecifications();
		// 			return;
		// 		}
		// 		else {
		// 			System.out.println(colour.red+"Invalid selection");
		// 		}
		// 	}
		// }

		// Method for Apple AirPods Pro
		public static void appleAirPodsProModel() {
			System.out.println("Apple AirPods Pro Specifications:"+colour.end);
			System.out.println("1. Apple AirPods Pro");
			System.out.println("   - Battery Life: Up to 4.5 hours listening time with Active Noise Cancellation");
			System.out.println("   - Bluetooth Version: 5.0"+colour.end);
			System.out.println("   - Price Range: $249");
			System.out.println("   - Features: Active Noise Cancellation, Transparency Mode, H1 Chip");
            System.out.println("   - Colour: White");
            price = 249;
            while(true) {
                System.out.println(colour.blue+"!---Do you want to add this to cart---!"+colour.end);
                sc = scanner.next();
                if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
                else System.out.println(colour.red+"Invalid Selection. "+colour.end);
            }
            if(sc.equalsIgnoreCase("yes")) {
                ct.addItem("Apple AirPods Pro, White variant", price);
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
                else showSpecifications();

            }
            else showSpecifications();
        }

		// 	System.out.print(colour.blue+"Would you like to select the Apple AirPods Pro model? (yes/no): "+colour.end);
		// 	while(true) {
		// 		String choice = scanner.next();

		// 		if (choice.equalsIgnoreCase("yes")) {
		// 			System.out.println(colour.purple+"Select your Apple AirPods Pro variant:"+colour.end);
		// 			System.out.println("1. White");
		// 			System.out.print(colour.magenta+"Enter your choice (1): "+colour.end);
		// 			String variant = scanner.next();


		// 			switch(variant) {
		// 			case "1":
		// 				System.out.println(colour.green+"You've selected: Apple AirPods Pro, White variant");
		// 				break;
		// 			default:
		// 				System.out.println(colour.red+"Invalid selection");
		// 			}
		// 		}
		// 		else if(choice.equalsIgnoreCase("No")) {
		// 			showSpecifications();
		// 			return;
		// 		}
		// 		else {
		// 			System.out.println(colour.red+"Invalid selection");
		// 		}
		// 	}
		// }

		// Method for Apple AirPods 3
		public static void appleAirPods3Model() {
			System.out.println("Apple AirPods 3rd Generation Specifications:"+colour.end);
			System.out.println("1. Apple AirPods 3");
			System.out.println("   - Battery Life: Up to 6 hours listening time");
			System.out.println("   - Bluetooth Version: 5.0"+colour.end);
			System.out.println("   - Price Range: $179");
			System.out.println("   - Features: Spatial Audio, Adaptive EQ, Sweat and Water Resistance");
            System.out.println("   - Colour: White");
            price = 249;
            while(true) {
                System.out.println(colour.blue+"!---Do you want to add this to cart---!"+colour.end);
                sc = scanner.next();
                if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
                else System.out.println(colour.red+"Invalid Selection. "+colour.end);
            }
            if(sc.equalsIgnoreCase("yes")) {
                ct.addItem("Apple AirPods 3, White variant", price);
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
                else showSpecifications();

            }
            else showSpecifications();
        }


		// 	System.out.print(colour.blue+"Would you like to select the Apple AirPods 3 model? (yes/no): "+colour.end);
		// 	while(true) {
		// 		String choice = scanner.next();

		// 		if (choice.equalsIgnoreCase("yes")) {
		// 			System.out.println(colour.purple+"Select your Apple AirPods 3 variant:"+colour.end);
		// 			System.out.println("1. White");
		// 			System.out.print(colour.magenta+"Enter your choice (1): "+colour.end);
		// 			String variant = scanner.next();


		// 			switch(variant) {
		// 			case "1":
		// 				System.out.println(colour.green+"You've selected: Apple AirPods 3, White variant");
		// 				break;
		// 			default:
		// 				System.out.println(colour.red+"Invalid selection");
		// 			}
		// 		}
		// 		else if(choice.equalsIgnoreCase("No")) {
		// 			showSpecifications();
		// 			return;
		// 		}
		// 		else {
		// 			System.out.println(colour.red+"Invalid selection");
		// 		}
		// 	}
		// }

		// Method for Apple AirPods Pro 2
		public static void appleAirPodsPro2Model() {
			System.out.println("Apple AirPods Pro 2nd Generation Specifications:"+colour.end);
			System.out.println("1. Apple AirPods Pro 2");
			System.out.println("   - Battery Life: Up to 6 hours listening time with Active Noise Cancellation");
			System.out.println("   - Bluetooth Version: 5.3");
			System.out.println("   - Price Range: $249");
			System.out.println("   - Features: Active Noise Cancellation, Adaptive Transparency, H2 Chip");
            System.out.println("   - Colour: White");
            price = 249;
            while(true) {
                System.out.println(colour.blue+"!---Do you want to add this to cart---!"+colour.end);
                sc = scanner.next();
                if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
                else System.out.println(colour.red+"Invalid Selection. "+colour.end);
            }
            if(sc.equalsIgnoreCase("yes")) {
                ct.addItem("Apple AirPods Pro 2, White variant", price);
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
                else showSpecifications();

            }
            else showSpecifications();
        }

			// System.out.print(colour.blue+"Would you like to select the Apple AirPods Pro 2 model? (yes/no): "+colour.end);
			// while(true) {
			// 	String choice = scanner.next();

			// 	if (choice.equalsIgnoreCase("yes")) {
			// 		System.out.println(colour.purple+"Select your Apple AirPods Pro 2 variant:"+colour.end);
			// 		System.out.println("1. "+colour.end);
			// 		System.out.print(colour.magenta+"Enter your choice (1): "+colour.end);
			// 		String variant = scanner.next();


			// 		switch(variant) {
			// 		case "1":
			// 			System.out.println(colour.green+"You've selected: Apple AirPods Pro 2, White variant");
			// 			break;
			// 		default:
			// 			System.out.println(colour.red+"Invalid selection");
			// 		}
			// 	}
			// 	else if(choice.equalsIgnoreCase("No")) {
			// 		showSpecifications();
			// 		return;
			// 	}
			// 	else {
			// 		System.out.println(colour.red+"Invalid selection");
			// 	}
			// }
		

		// Method for Apple AirPods Max
		public static void appleAirPodsMaxModel() {
			System.out.println("Apple AirPods Max Specifications:"+colour.end);
			System.out.println("1. Apple AirPods Max");
			System.out.println("   - Battery Life: Up to 20 hours with Active Noise Cancellation and spatial audio");
			System.out.println("   - Bluetooth Version: 5.0"+colour.end);
			System.out.println("   - Price Range: $549");
			System.out.println("   - Features: Active Noise Cancellation, Spatial Audio, 40mm Drivers");
            String choice;
			while(true) {
				System.out.print(colour.blue+"Would you like to select the Apple AirPods Max model? (yes/no): "+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println(colour.purple+"Select your Apple AirPods Max variant:"+colour.end);
					System.out.println("1. Silver  -$549");
					System.out.println("2. Space Gray  -$549");
					System.out.println("3. Sky Blue  -$549");
					System.out.println("4. Pink  -$549");
					System.out.println("5. Back");
					System.out.print(colour.magenta+"Enter your choice (1/2/3/4/5): "+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")||variant.equals("5")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4/5): "+colour.end);
					}

						switch(variant) {
						case "1":
							System.out.println(colour.green+"You've selected: Apple AirPods Max, Silver variant  -$549"+colour.end);
                            price = 549;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Apple AirPods Max, Silver variant", price);
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
							System.out.println(colour.green+"You've selected: Apple AirPods Max, Space Gray variant  -$549"+colour.end);
                            price = 549;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Apple AirPods Max, Space Gray variant", price);
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
							System.out.println(colour.green+"You've selected: Apple AirPods Max, Sky Blue variant  -$549"+colour.end);
                            price = 549;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Apple AirPods Max, Sky Blue variant", price);
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
							System.out.println(colour.green+"You've selected: Apple AirPods Max, Pink variant  -$549"+colour.end);
                            price = 549;
							while(true) {
								System.out.println(colour.blue+"!---Do you want to add this to cart---!(yes/no)"+colour.end);
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(colour.red+"Invalid Selection. "+colour.end);
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Apple AirPods Max, Pink variant", price);
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
					case "5":
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
	
	public static void main(String[] args) {
		Buds buds = new Buds();

		System.out.println("Welcome to Buds Selector!");
		System.out.println("Choose from our Buds models:"+colour.end);
		System.out.println("1. Noise Buds");
		System.out.println("2. Boat Buds");
		System.out.println("3. Realme Buds");
		System.out.println("4. Boult Buds");
		System.out.println("5. Apple Buds");
		System.out.println("6. Back");

		System.out.print(colour.magenta+"Enter your choice (1-6): "+colour.end);
		while(true) {
			String series = scanner.next();

			switch(series) {
			case "1":
				Buds.NoiseBudsSelector noise = buds.new NoiseBudsSelector();
				noise.showSpecifications();
				break;
			case "2":
				Buds.BoatBudsSelector boat = buds.new BoatBudsSelector();
				boat.showSpecifications();
				break;
			case "3":
				Buds.RealmeBudsSelector realme = buds.new RealmeBudsSelector();
				realme.showSpecifications();
				break;
			case "4":
				Buds.BoultBudsSelector boult = buds.new BoultBudsSelector();
				boult.showSpecifications();
				break;
			case "5":
				Buds.AppleBudsSelector apple = buds.new AppleBudsSelector();
				apple.showSpecifications();
				break;
			case "6":
			Promain Main = new Promain();
			main.main(new String[]{});
			break ;
			default:
				System.out.println(colour.red+"Invalid selection");
			}
			if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")) break;
		}
		scanner.close();
	}
}