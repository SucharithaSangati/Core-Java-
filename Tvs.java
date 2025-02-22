package app;
import app.Promain;
import java.util.Scanner;
import ca.Cart;
import  java.util.*;
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
public class Tvs {
	public Tvs(){}
	public Tvs(Cart cart){
		this.ct = cart;
	}
	static Scanner scanner = new Scanner(System.in);
    static Cart ct;
	static double price ;
	static String sc;
	static Promain main = Promain.main;
	static
	{
		System.out.println("Welcome to Tv Selector!");
	}
	 class SonyTVSelector {
		public static void showSpecifications() {
			while(true) {
			System.out.println(colour.bgyellow+"!-----Available Models-----!"+colour.end);
			System.out.println("1. Sony Bravia X900H");
			System.out.println("2. Sony Bravia A8H OLED");
			System.out.println("3. Sony X950H");
			System.out.println("4. Sony X800H");
			System.out.println("5. Sony A9G OLED");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print(colour.brightWhite+"Enter your choice (1-7):"+colour.end);

			
				String series = scanner.next();

				switch(series) {
				case "1":
					sonyBraviaX900HModel();
					break;
				case "2":
					sonyBraviaA8HModel();
					break;
				case "3":
					sonyX950HModel();
					break;
				case "4":
					sonyX800HModel();
					break;
				case "5":
					sonyA9GModel();
					break;
				case "6":
					Tvs.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println(colour.red+"Invalid choice. Please select a number between 1 and 7."+colour.end);
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}


		// Method for Sony Bravia X900H
		public static void sonyBraviaX900HModel() {
			System.out.println(colour.yellow+"Sony Bravia X900H Specifications:"+colour.end+colour.end);
			System.out.println("1. 55 / 65-inch LED 4K TV"+colour.end);
			System.out.println("   - Resolution: 4K UHD");
			System.out.println("   - Smart TV: Yes (Android TV)");
			System.out.println("   - Price Range: $700 - $1000"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Sony Bravia X900H model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}
			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Sony Bravia X900H variant:"+colour.end);
					System.out.println("1. 55-inch LED 4K, Smart TV    -$700"+colour.end);
					System.out.println("2. 65-inch LED 4K, Smart TV    -$1000"+colour.end);
					System.out.println("3. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3):"+colour.end);
					String variant;

					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3):"+colour.end);
					}
					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 55-inch LED 4K, Smart TV -$700"+colour.end);
						price = 700;
						// System.out.println("Price : $" + price+"     + 10% Discount."+colour.end);

						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem(colour.yellow+"Sony Bravia X900H, 55-inch LED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 65-inch LED 4K, Smart TV"+colour.end);
						price = 1000;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						// System.out.println("Price : $" + price+"     + 10% Discount."+colour.end);
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem(colour.yellow+"Sony Bravia X900H, 65-inch LED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
								dis = scanner.next();
								if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
								else System.out.print(colour.red+"Invalid Input."+colour.end);
							}
							if(dis.equalsIgnoreCase("yes")) {
								ct.displayCart();
							}
							//else if(dis.equalsIgnoreCase("no")) System.out.print

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

		// Method for Sony Bravia A8H OLED
		public static void sonyBraviaA8HModel() {
			System.out.println(colour.yellow+"Sony Bravia A8H OLED Specifications:"+colour.end+colour.end);
			System.out.println("1. 55 / 65-inch OLED 4K TV"+colour.end);
			System.out.println("   - Resolution: 4K OLED");
			System.out.println("   - Smart TV: Yes (Android TV)");
			System.out.println("   - Price Range: $1500 - $2500"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Sony Bravia A8H OLED model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Sony Bravia A8H variant:"+colour.end);
					System.out.println("1. 55-inch OLED 4K, Smart TV  -$1500"+colour.end);
					System.out.println("2. 65-inch OLED 4K, Smart TV  -%2500"+colour.end);
					System.out.println("3. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3):"+colour.end);
					}

					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 55-inch OLED 4K, Smart TV  -$1500"+colour.end);
						price = 1500;
						//System.out.println("Price : $" + price+"     + 10% Discount."+colour.end);
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem(colour.yellow+"Sony Bravia A8H, 55-inch LED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 65-inch OLED 4K, Smart TV  -$2500"+colour.end);
						price = 2500;
						// System.out.println("Price : $" + price+"     + 10% Discount."+colour.end);
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem(colour.yellow+"Sony Bravia A8H, 65-inch LED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

		// Method for Sony X950H
		public static void sonyX950HModel() {
			System.out.println(colour.yellow+"Sony X950H Specifications:"+colour.end+colour.end);
			System.out.println("1. 55 / 65 -inch LED 4K TV"+colour.end);
			System.out.println("   - Resolution: 4K UHD");
			System.out.println("   - Smart TV: Yes (Android TV)");
			System.out.println("   - Price Range: $1000 - $1500"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Sony X950H model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}


			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Sony X950H variant:"+colour.end);
					System.out.println("1. 55-inch LED 4K, Smart TV  -$1000"+colour.end);
					System.out.println("2. 65-inch LED 4K, Smart TV  -$1500"+colour.end);
					System.out.println("3. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3):"+colour.end);
					}

					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 55-inch LED 4K, Smart TV  -$1000"+colour.end);
						price = 1000;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem(colour.yellow+"Sony X950H, 55-inch LED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 65-inch LED 4K, Smart TV  -$1500"+colour.end);
						price = 1500;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem(colour.yellow+"Sony X950H, 65-inch LED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

		// Method for Sony X800H
		public static void sonyX800HModel() {
			System.out.println(colour.yellow+"Sony X800H Specifications:"+colour.end+colour.end);
			System.out.println("1. 50 / 55-inch LED 4K TV"+colour.end);
			System.out.println("   - Resolution: 4K UHD");
			System.out.println("   - Smart TV: Yes (Android TV)");
			System.out.println("   - Price Range: $500 - $700"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Sony X800H model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}


			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Sony X800H variant:"+colour.end);
					System.out.println("1. 50-inch LED 4K, Smart TV  -$500"+colour.end);
					System.out.println("2. 55-inch LED 4K, Smart TV  -$700"+colour.end);
					System.out.println("3. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3):"+colour.end);
					}

					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 50-inch LED 4K, Smart TV  -$500"+colour.end);
						price = 500;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem(colour.yellow+"Sony X800H, 50-inch LED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 55-inch LED 4K, Smart TV  -$700"+colour.end);
						price = 700;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem(colour.yellow+"Sony X800H, 55-inch LED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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



		// Method for Sony A9G OLED
		public static void sonyA9GModel() {
			System.out.println(colour.yellow+"Sony A9G OLED Specifications:"+colour.end+colour.end);
			System.out.println("1. 55 / 65-inch OLED 4K TV"+colour.end);
			System.out.println("   - Resolution: 4K OLED");
			System.out.println("   - Smart TV: Yes (Android TV)");
			System.out.println("   - Price Range: $2000 - $3000"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Sony A9G OLED model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}


			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Sony A9G OLED variant:"+colour.end);
					System.out.println("1. 55-inch OLED 4K, Smart TV  -$2000"+colour.end);
					System.out.println("2. 65-inch OLED 4K, Smart TV  -$3000"+colour.end);
					System.out.println("3. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3):"+colour.end);
					}

					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 55-inch OLED 4K, Smart TV  -$2000"+colour.end);
						price = 2000;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem(colour.yellow+"Sony A9G OLED, 55-inch OLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 65-inch OLED 4K, Smart TV  -$3000"+colour.end);
						price = 3000;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem(colour.yellow+"Sony A9G OLED, 65-inch OLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
	}

	class SamsungTVSelector {
		public static void showSpecifications() {
			while(true) {
			System.out.println(colour.bgyellow+"!-----Available Models-----!"+colour.end);
			System.out.println("1. Samsung Q90T QLED");
			System.out.println("2. Samsung TU8000 Crystal UHD");
			System.out.println("3. Samsung The Frame");
			System.out.println("4. Samsung Q70T QLED");
			System.out.println("5. Samsung AU8000 UHD");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print(colour.brightWhite+"Enter your choice (1-7):"+colour.end);

			
				String series = scanner.next();

				switch(series) {
				case "1":
					samsungQ90TModel();
					break;
				case "2":
					samsungTU8000Model();
					break;
				case "3":
					samsungTheFrameModel();
					break;
				case "4":
					samsungQ70TModel();
					break;
				case "5":
					samsungAU8000Model();
					break;
				case "6":
					Tvs.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println(colour.red+"Invalid choice. Please select a number between 1 and 7."+colour.end);
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}

		// Method for Samsung Q90T QLED
		public static void samsungQ90TModel() {
			System.out.println("Samsung Q90T QLED Specifications:"+colour.end+colour.end);
			System.out.println("1. 55 / 65 / 75-inch QLED 4K TV"+colour.end);
			System.out.println("   - Resolution: 4K UHD");
			System.out.println("   - Smart TV: Yes (Tizen OS)");
			System.out.println("   - Price Range: $1000 - $1500"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Samsung Q90T QLED model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}


			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Samsung Q90T QLED variant:"+colour.end);
					System.out.println("1. 55-inch QLED 4K, Smart TV  -$1000"+colour.end);
					System.out.println("2. 65-inch QLED 4K, Smart TV  -$1250");
					System.out.println("3. 75-inch QLED 4K, Smart TV  -$1500"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3/4):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4):"+colour.end);
					}
					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 55-inch QLED 4K, Smart TV  -$1000"+colour.end);
						price = 1000;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Samsung Q90T QLED, 55-inch QLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 65-inch QLED 4K, Smart TV  -$1250");
						price = 1250;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Samsung Q90T QLED, 65-inch QLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 75-inch QLED 4K, Smart TV  -$1500"+colour.end);
						price = 1500;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Samsung Q90T QLED, 75-inch QLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

		// Method for Samsung TU8000 Crystal UHD
		public static void samsungTU8000Model() {
			System.out.println("Samsung TU8000 Crystal UHD Specifications:"+colour.end+colour.end);
			System.out.println("1. 55 / 65-inch Crystal UHD 4K TV"+colour.end);
			System.out.println("   - Resolution: 4K UHD");
			System.out.println("   - Smart TV: Yes (Tizen OS)");
			System.out.println("   - Price Range: $400 - $600"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Samsung TU8000 Crystal UHD model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}


			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Samsung TU8000 variant:"+colour.end);
					System.out.println("1. 55-inch Crystal UHD 4K, Smart TV  -$400"+colour.end);
					System.out.println("2. 65-inch Crystal UHD 4K, Smart TV  -$600"+colour.end);
					System.out.println("3. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3):"+colour.end);
					}

					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 55-inch Crystal UHD 4K, Smart TV  -$400"+colour.end);
						price = 400;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Samsung TU8000 Crystal UHD, 55-inch Crystal UHD 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 65-inch Crystal UHD 4K, Smart TV  -$600"+colour.end);
						price = 600;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Samsung TU8000 Crystal UHD, 65-inch Crystal UHD 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

		// Method for Samsung The Frame
		public static void samsungTheFrameModel() {
			System.out.println("Samsung The Frame Specifications:"+colour.end+colour.end);
			System.out.println("1. 55 / 65 / 75-inch QLED 4K TV"+colour.end);
			System.out.println("   - Resolution: 4K UHD");
			System.out.println("   - Smart TV: Yes (Tizen OS)");
			System.out.println("   - Price Range: $900 - $1500"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Samsung The Frame model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}


			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Samsung The Frame variant:"+colour.end);
					System.out.println("1. 55-inch QLED 4K, Smart TV"+colour.end);
					System.out.println("2. 65-inch QLED 4K, Smart TV"+colour.end);
					System.out.println("3. 75-inch QLED 4K, Smart TV"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3/4):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4):"+colour.end);
					}

					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 55-inch QLED 4K, Smart TV  -$900"+colour.end);
						price = 900;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Samsung The Frame, 55-inch QLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 65-inch QLED 4K, Smart TV  -$1200"+colour.end);
						price = 1200;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Samsung The Frame, 65-inch QLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 75-inch QLED 4K, Smart TV  -$1500"+colour.end);
						price = 1500;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Samsung The Frame, 75-inch QLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

		// Method for Samsung Q70T QLED
		public static void samsungQ70TModel() {
			System.out.println("Samsung Q70T QLED Specifications:"+colour.end+colour.end);
			System.out.println("1. 55 / 65 -inch QLED 4K TV"+colour.end);
			System.out.println("   - Resolution: 4K UHD");
			System.out.println("   - Smart TV: Yes (Tizen OS)");
			System.out.println("   - Price Range: $700 - $1200"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Samsung Q70T QLED model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}


			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Samsung Q70T QLED variant:"+colour.end);
					System.out.println("1. 55-inch QLED 4K, Smart TV  -$700"+colour.end);
					System.out.println("2. 65-inch QLED 4K, Smart TV  -$1200"+colour.end);
					System.out.println("3. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3):"+colour.end);
					}

					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 55-inch QLED 4K, Smart TV  -$700"+colour.end);
						price = 700;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Samsung Q70T QLED, 55-inch QLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 65-inch QLED 4K, Smart TV  -$1200"+colour.end);
						price = 1200;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Samsung Q70T QLED, 65-inch QLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

		// Method for Samsung AU8000 UHD
		public static void samsungAU8000Model() {
			System.out.println("Samsung AU8000 UHD Specifications:"+colour.end+colour.end);
			System.out.println("1. 50 / 55 / 65-inch Crystal UHD 4K TV"+colour.end);
			System.out.println("   - Resolution: 4K UHD");
			System.out.println("   - Smart TV: Yes (Tizen OS)");
			System.out.println("   - Price Range: $350 - $500"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Samsung AU8000 UHD model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}


			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Samsung AU8000 variant:"+colour.end);
					System.out.println("1. 50-inch Crystal UHD 4K, Smart TV  -$350");
					System.out.println("2. 55-inch Crystal UHD 4K, Smart TV  -$425");
					System.out.println("3. 65-inch Crystal UHD 4K, Smart TV  -$500"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3/4):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4):"+colour.end);
					}

					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 50-inch Crystal UHD 4K, Smart TV  -$350");
						price = 350;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Samsung AU8000 UHD, 50-inch Crystal UHD 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 55-inch Crystal UHD 4K, Smart TV  -$425");
						price = 425;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Samsung AU8000 UHD, 55-inch Crystal UHD 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 65-inch Crystal UHD 4K, Smart TV  -$500"+colour.end);
						price = 500;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Samsung AU8000 UHD, 65-inch Crystal UHD 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

	 class LGTVSelector {
		public static void showSpecifications() {
			while(true) {
			System.out.println(colour.bgyellow+"!-----Available Models-----!"+colour.end);
			System.out.println("1. LG CX OLED");
			System.out.println("2. LG UN7300 UHD");
			System.out.println("3. LG NanoCell");
			System.out.println("4. LG QNED");
			System.out.println("5. LG OLED65W8");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print(colour.brightWhite+"Enter your choice (1-7):"+colour.end);

			
				String series = scanner.next();

				switch(series) {
				case "1":
					lgCXOLEDModel();
					break;
				case "2":
					lgUN7300Model();
					break;
				case "3":
					lgNanoCellModel();
					break;
				case "4":
					lgQNEDModel();
					break;
				case "5":
					lgOLED65W8Model();;
					break;
				case "6":
					Tvs.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println(colour.red+"Invalid choice. Please select a number between 1 and 7."+colour.end);
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}


		// Method for LG CX OLED
		public static void lgCXOLEDModel() {
			System.out.println("LG CX OLED Specifications:"+colour.end+colour.end);
			System.out.println("1. 55 / 65 / 77-inch OLED 4K TV"+colour.end);
			System.out.println("   - Resolution: 4K UHD");
			System.out.println("   - Smart TV: Yes (webOS)");
			System.out.println("   - Price Range: $1300 - $2500"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the LG CX OLED model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your LG CX OLED variant:"+colour.end);
					System.out.println("1. 55-inch OLED 4K, Smart TV  -$1300"+colour.end);
					System.out.println("2. 65-inch OLED 4K, Smart TV  -$2000"+colour.end);
					System.out.println("3. 77-inch OLED 4K, Smart TV  -$2500"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3/4):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4):"+colour.end);
					}

					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 55-inch OLED 4K, Smart TV  -$1300"+colour.end);
						price = 1300;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("LG CX OLED, 55-inch OLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 65-inch OLED 4K, Smart TV  -$2000"+colour.end);
						price = 2000;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("LG CX OLED, 65-inch OLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 77-inch OLED 4K, Smart TV  -$2500"+colour.end);
						price = 2500;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("LG CX OLED, 77-inch OLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

		// Method for LG UN7300 UHD
		public static void lgUN7300Model() {
			System.out.println("LG UN7300 UHD Specifications:"+colour.end+colour.end);
			System.out.println("1. 55 / 65 -inch UHD 4K TV"+colour.end);
			System.out.println("   - Resolution: 4K UHD");
			System.out.println("   - Smart TV: Yes (webOS)");
			System.out.println("   - Price Range: $400 - $600"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the LG UN7300 UHD model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your LG UN7300 variant:"+colour.end);
					System.out.println("1. 55-inch UHD 4K, Smart TV  -$400"+colour.end);
					System.out.println("2. 65-inch UHD 4K, Smart TV  -$600"+colour.end);
					System.out.println("3. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3):"+colour.end);
					}

					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 55-inch UHD 4K, Smart TV  -$400"+colour.end);
						price = 400;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("LG UN7300 UHD, 55-inch UHD 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 65-inch UHD 4K, Smart TV  -$600"+colour.end);
						price = 600;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("LG UN7300 UHD, 65-inch UHD 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

		// Method for LG NanoCell
		public static void lgNanoCellModel() {
			System.out.println("LG NanoCell Specifications:"+colour.end+colour.end);
			System.out.println("1. 55 / 65 / 75-inch NanoCell 4K TV"+colour.end);
			System.out.println("   - Resolution: 4K UHD");
			System.out.println("   - Smart TV: Yes (webOS)");
			System.out.println("   - Price Range: $600 - $900"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the LG NanoCell model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}


			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your LG NanoCell variant:"+colour.end);
					System.out.println("1. 55-inch NanoCell 4K, Smart TV  -$600"+colour.end);
					System.out.println("2. 65-inch NanoCell 4K, Smart TV  -$750");
					System.out.println("3. 75-inch NanoCell 4K, Smart TV  -$900"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3/4):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4):"+colour.end);
					}

					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 55-inch NanoCell 4K, Smart TV  -$600"+colour.end);
						price = 600;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("LG NanoCell, 55-inch NanoCell 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 65-inch NanoCell 4K, Smart TV  -$750");
						price = 750;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("LG NanoCell, 65-inch NanoCell 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 75-inch NanoCell 4K, Smart TV  -$900"+colour.end);
						price = 900;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("LG NanoCell, 75-inch NanoCell 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

		// Method for LG QNED
		public static void lgQNEDModel() {
			System.out.println("LG QNED Specifications:"+colour.end+colour.end);
			System.out.println("1. 65 / 75-inch QNED 4K TV"+colour.end);
			System.out.println("   - Resolution: 4K UHD");
			System.out.println("   - Smart TV: Yes (webOS)");
			System.out.println("   - Price Range: $1000 - $1500"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the LG QNED model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your LG QNED variant:"+colour.end);
					System.out.println("1. 65-inch QNED 4K, Smart TV  -$1000"+colour.end);
					System.out.println("2. 75-inch QNED 4K, Smart TV  -$1500"+colour.end);
					System.out.println("3. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3):"+colour.end);
					}

					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 65-inch QNED 4K, Smart TV  -$1000"+colour.end);
						price = 1000;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("LG QNED, 65-inch QNED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 75-inch QNED 4K, Smart TV  -$1500"+colour.end);
						price = 1500;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("LG QNED, 75-inch QNED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

		// Method for LG OLED65W8
		public static void lgOLED65W8Model() {
			System.out.println("LG OLED65W8 Specifications:"+colour.end+colour.end);
			System.out.println("1. 65 / 77-inch OLED 4K TV"+colour.end);
			System.out.println("   - Resolution: 4K UHD");
			System.out.println("   - Smart TV: Yes (webOS)");
			System.out.println("   - Price Range: $2500 - $4000"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the LG OLED65W8 model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your LG OLED65W8 variant:"+colour.end);
					System.out.println("1. 65-inch OLED 4K, Smart TV  -$2500"+colour.end);
					System.out.println("2. 77-inch OLED 4K, Smart TV  -$4000"+colour.end);
					System.out.println("3. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3):"+colour.end);
					}

					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 65-inch OLED 4K, Smart TV  -$2500"+colour.end);
						price = 2500;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("LG OLED65W8, 65-inch OLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 77-inch OLED 4K, Smart TV  -$4000"+colour.end);
						price = 4000;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("LG OLED65W8, 77-inch OLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
	}

	 class MiTVSelector {
		public static void showSpecifications() {
			while(true) {
			System.out.println(colour.bgyellow+"!-----Available Models-----!"+colour.end);
			System.out.println("1. MI Smart TV"+colour.end);
			System.out.println("2. MI 4K Pro TV"+colour.end);
			System.out.println("3. MI QLED TV"+colour.end);
			System.out.println("4. MI OLED TV"+colour.end);
			System.out.println("5. MI Android TV"+colour.end);
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print(colour.brightWhite+"Enter your choice (1-7):"+colour.end);

			
				String series = scanner.next();

				switch(series) {
				case "1":
					miSmartTVModel();
					break;
				case "2":
					mi4KProModel();
					break;
				case "3":
					miQLEDModel();
					break;
				case "4":
					miOLEDModel();
					break;
				case "5":
					miAndroidTVModel();
					break;
				case "6":
					Tvs.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println(colour.red+"Invalid choice. Please select a number between 1 and 7."+colour.end);
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}

		// Method for Mi Smart TV
		public static void miSmartTVModel() {
			System.out.println("MI Smart TV Specifications:"+colour.end+colour.end);
			System.out.println("1. 32 / 43 / 50 -inch HD Ready");
			System.out.println("   - Resolution: HD Ready");
			System.out.println("   - Smart TV: Yes (Android TV)");
			System.out.println("   - Price Range: $200 - $350");
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Mi Smart TV model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}


			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Mi Smart TV variant:"+colour.end);
					System.out.println("1. 32-inch HD Ready, Smart TV  -$200"+colour.end);
					System.out.println("2. 43-inch Full HD, Smart TV  -$300"+colour.end);
					System.out.println("3. 50-inch Full HD, Smart TV  -$350");
					System.out.println("4. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3/4):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4):"+colour.end);
					}

					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 32-inch HD Ready, Smart TV  -$200"+colour.end);
						price = 200;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Mi Smart TV, 32-inch Full HD, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 43-inch Full HD, Smart TV  -$300"+colour.end);
						price = 300;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Mi Smart TV, 43-inch Full HD, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 50-inch Full HD, Smart TV  -$350");
						price = 350;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Mi Smart TV, 50-inch Full HD, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

		// Method for Mi 4K Pro TV
		public static void mi4KProModel() {
			System.out.println("MI 4K Pro TV Specifications:"+colour.end+colour.end);
			System.out.println("1. 43 / 50 / 55-inch 4K UHD");
			System.out.println("   - Resolution: 4K UHD");
			System.out.println("   - Smart TV: Yes (Android TV)");
			System.out.println("   - Price Range: $350 - $600"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Mi 4K Pro TV model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Mi 4K Pro TV variant:"+colour.end);
					System.out.println("1. 43-inch 4K UHD, Smart TV  -$350");
					System.out.println("2. 50-inch 4K UHD, Smart TV  -$450");
					System.out.println("3. 55-inch 4K UHD, Smart TV  -$600"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3/4):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4):"+colour.end);
					}

					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 43-inch 4K UHD, Smart TV  -$350");
						price = 350;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Mi 4K Pro TV, 43-inch 4K UHD, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 50-inch 4K UHD, Smart TV  -$450");
						price = 450;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Mi 4K Pro TV, 50-inch 4K UHD, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 55-inch 4K UHD, Smart TV  -$600"+colour.end);
						price = 600;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Mi 4K Pro TV, 55-inch 4K UHD, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

		// Method for Mi QLED TV
		public static void miQLEDModel() {
			System.out.println("MI QLED TV Specifications:"+colour.end+colour.end);
			System.out.println("1. 55 / 65-inch QLED 4K TV"+colour.end);
			System.out.println("   - Resolution: 4K UHD");
			System.out.println("   - Smart TV: Yes (Android TV)");
			System.out.println("   - Price Range: $600 - $900"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Mi QLED TV model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Mi QLED variant:"+colour.end);
					System.out.println("1. 55-inch QLED 4K, Smart TV  -$600"+colour.end);
					System.out.println("2. 65-inch QLED 4K, Smart TV  -$900"+colour.end);
					System.out.println("3. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3):"+colour.end);
					}
					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 55-inch QLED 4K, Smart TV  -$600"+colour.end);
						price = 600;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Mi QLED TV, 55-inch QLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 65-inch QLED 4K, Smart TV  -$900"+colour.end);
						price = 900;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Mi QLED TV, 65-inch QLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

		// Method for Mi OLED TV
		public static void miOLEDModel() {
			System.out.println("MI OLED TV Specifications:"+colour.end+colour.end);
			System.out.println("1. 55 / 65-inch OLED 4K TV"+colour.end);
			System.out.println("   - Resolution: 4K UHD");
			System.out.println("   - Smart TV: Yes (Android TV)");
			System.out.println("   - Price Range: $1000 - $1500"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Mi OLED TV model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Mi OLED variant:"+colour.end);
					System.out.println("1. 55-inch OLED 4K, Smart TV  -$1000"+colour.end);
					System.out.println("2. 65-inch OLED 4K, Smart TV  -$1500"+colour.end);
					System.out.println("3. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3):"+colour.end);
					}
					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 55-inch OLED 4K, Smart TV  -$1000"+colour.end);
						price = 1000;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Mi OLED TV, 55-inch OLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 65-inch OLED 4K, Smart TV  -$1500"+colour.end);
						price = 1500;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Mi OLED TV, 65-inch OLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

		// Method for Mi Android TV
		public static void miAndroidTVModel() {
			System.out.println("MI Android TV Specifications:"+colour.end+colour.end);
			System.out.println("1. 32 / 43 / 50-inch HD Ready");
			System.out.println("   - Resolution: HD Ready");
			System.out.println("   - Smart TV: Yes (Android TV)");
			System.out.println("   - Price Range: $150 - $250");
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Mi Android TV model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Mi Android TV variant:"+colour.end);
					System.out.println("1. 32-inch HD Ready, Android TV  -$150");
					System.out.println("2. 43-inch Full HD, Android TV  -$200"+colour.end);
					System.out.println("3. 50-inch Full HD, Android TV  -$250");
					System.out.println("4. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3/4):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4):"+colour.end);
					}
					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 32-inch HD Ready, Android TV  -$150");
						price = 150;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Mi Android TV, 32-inch HD Ready, Android TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 43-inch Full HD, Android TV  -$200"+colour.end);
						price = 200;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Mi Android TV,  43-inch Full HD, Android TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 50-inch Full HD, Android TV  -$250");
						price = 250;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Mi Android TV, 50-inch Full HD, Android TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

	 class RealmeTVSelector {
		public static void showSpecifications() {
			while(true) {
			System.out.println(colour.bgyellow+"!-----Available Models-----!"+colour.end);
			System.out.println("1. Realme Smart TV ");
			System.out.println("2. Realme 4K Pro TV"+colour.end);
			System.out.println("3. Realme QLED TV"+colour.end);
			System.out.println("4. Realme Android TV"+colour.end);
			System.out.println("5. Realme Super Slim TV"+colour.end);
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print(colour.brightWhite+"Enter your choice (1-7):"+colour.end);

			
				String series = scanner.next();

				switch(series) {
				case "1":
					realmeSmartTVModel();
					break;
				case "2":
					realme4KProModel();
					break;
				case "3":
					realmeQLEDModel();
					break;
				case "4":
					realmeAndroidTVModel();
					break;
				case "5":
					realmeSuperSlimTVModel();;
					break;
				case "6":
					Tvs.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println(colour.red+"Invalid choice. Please select a number between 1 and 7."+colour.end);
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}


		// Method for Realme Smart TV
		public static void realmeSmartTVModel() {
			System.out.println("Realme Smart TV Specifications:"+colour.end+colour.end);
			System.out.println("1. 32 / 43 / 50-inch HD Ready");
			System.out.println("   - Resolution: HD Ready");
			System.out.println("   - Smart TV: Yes (Android TV)");
			System.out.println("   - Price Range: $200 - $350");
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Realme Smart TV model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Realme Smart TV variant:"+colour.end);
					System.out.println("1. 32-inch HD Ready, Smart TV  -$200"+colour.end);
					System.out.println("2. 43-inch Full HD, Smart TV  -$300"+colour.end);
					System.out.println("3. 50-inch Full HD, Smart TV  -$350");
					System.out.println("4. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3/4):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4):"+colour.end);
					}

					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 32-inch HD Ready, Smart TV  -$200"+colour.end);
						price = 200;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Realme Smart TV, 32-inch Full HD Ready, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 43-inch Full HD, Smart TV  -$300"+colour.end);
						price = 300;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Realme Smart TV, 43-inch Full HD, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 50-inch Full HD, Smart TV  -$350");
						price = 350;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Realme Smart TV, 50-inch Full HD, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

		// Method for Realme 4K Pro TV
		public static void realme4KProModel() {
			System.out.println("Realme 4K Pro TV Specifications:"+colour.end+colour.end);
			System.out.println("1. 43 / 50 / 55-inch 4K UHD");
			System.out.println("   - Resolution: 4K UHD");
			System.out.println("   - Smart TV: Yes (Android TV)");
			System.out.println("   - Price Range: $400 - $600"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Realme 4K Pro TV model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Realme 4K Pro variant:"+colour.end);
					System.out.println("1. 43-inch 4K UHD, Smart TV  -$400"+colour.end);
					System.out.println("2. 50-inch 4K UHD, Smart TV  -$500"+colour.end);
					System.out.println("3. 55-inch 4K UHD, Smart TV  -$600"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3/4):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4):"+colour.end);
					}
					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 43-inch 4K UHD, Smart TV  -$400"+colour.end);
						price = 400;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Realme 4K Pro TV, 43-inch 4K UHD, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 50-inch 4K UHD, Smart TV  -$500"+colour.end);
						price = 500;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Realme 4K Pro TV, 50-inch 4K UHD, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 55-inch 4K UHD, Smart TV  -$600"+colour.end);
						price = 600;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Realme 4K Pro TV, 55-inch 4K UHD, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

		// Method for Realme QLED TV
		public static void realmeQLEDModel() {
			System.out.println("Realme QLED TV Specifications:"+colour.end+colour.end);
			System.out.println("1. 55 / 65-inch QLED 4K TV"+colour.end);
			System.out.println("   - Resolution: 4K UHD");
			System.out.println("   - Smart TV: Yes (Android TV)");
			System.out.println("   - Price Range: $600 - $900"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Realme QLED TV model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Realme QLED variant:"+colour.end);
					System.out.println("1. 55-inch QLED 4K, Smart TV  -$600"+colour.end);
					System.out.println("2. 65-inch QLED 4K, Smart TV  -$900"+colour.end);
					System.out.println("3. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3):"+colour.end);
					}

					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 55-inch QLED 4K, Smart TV  -$600"+colour.end);
						price = 600;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Realme QLED TV, 55-inch QLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 65-inch QLED 4K, Smart TV  -$900"+colour.end);
						price = 900;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Realme QLED TV, 65-inch QLED 4K, Smart TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

		// Method for Realme Android TV
		public static void realmeAndroidTVModel() {
			System.out.println("Realme Android TV Specifications:"+colour.end+colour.end);
			System.out.println("1. 32 / 43 / 50-inch HD Ready");
			System.out.println("   - Resolution: HD Ready");
			System.out.println("   - Smart TV: Yes (Android TV)");
			System.out.println("   - Price Range: $180 - $300"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Realme Android TV model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Realme Android TV variant:"+colour.end);
					System.out.println("1. 32-inch HD Ready, Android TV  -$180");
					System.out.println("2. 43-inch Full HD, Android TV  -$250");
					System.out.println("3. 50-inch Full HD, Android TV  -$300"+colour.end);
					System.out.println("4. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3/4):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4):"+colour.end);
					}
					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 32-inch HD Ready, Android TV  -$180");
						price = 180;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Realme Android TV, 32-inch Full HD, Android TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 43-inch Full HD, Android TV  -$250");
						price = 250;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Realme Android TV, 43-inch Full HD, Android TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 50-inch Full HD, Android TV  -$300"+colour.end);
						price = 300;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Realme Android TV, 50-inch Full HD, Android TV"+colour.end, price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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

		// Method for Realme Super Slim TV
		public static void realmeSuperSlimTVModel() {
			System.out.println("Realme Super Slim TV Specifications:"+colour.end+colour.end);
			System.out.println("1. 43 / 50 / 55-inch Full HD");
			System.out.println("   - Resolution: Full HD");
			System.out.println("   - Smart TV: Yes (Android TV)");
			System.out.println("   - Price Range: $350 - $500"+colour.end);
			String choice;
			while(true) {
				System.out.print(colour.skblue+"Would you like to select the Realme Super Slim TV model? (yes/no):"+colour.end+colour.end);
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(colour.red+"Invalid Selection. "+colour.end);
			}

			if (choice.equalsIgnoreCase("yes")) {
				while(true) {
					System.out.println(colour.purple+"Select your Realme Super Slim TV variant:"+colour.end);
					System.out.println("1. 43-inch Full HD, Slim Design");
					System.out.println("2. 50-inch Full HD, Slim Design");
					System.out.println("3. 55-inch Full HD, Slim Design");
					System.out.println("4. Back");
					System.out.print(colour.brightWhite+"Enter your choice (1/2/3/4):"+colour.end);
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(colour.red+"Invalid Selection. Please Enter your choice (1/2/3/4):"+colour.end);
					}
					switch(variant) {
					case "1":
						System.out.println(colour.brightBlue+"You've selected: 43-inch Full HD, Slim Design  -$350");
						price = 350;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Realme Super Slim TV, 43-inch Full HD, Slim Design", price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 50-inch Full HD, Slim Design  -$450");
						price = 450;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Realme Super Slim TV, 50-inch Full HD, Slim Design", price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
						System.out.println(colour.brightBlue+"You've selected: 55-inch Full HD, Slim Design  -$500"+colour.end);
						price = 500;
						while(true) {
							System.out.println(colour.bgyellow+"!---Do you want to add this to cart---!(yes/no):"+colour.end+colour.end);
							sc = scanner.next();
							if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
							else System.out.println(colour.red+"Invalid Selection. "+colour.end);
						}
						if(sc.equalsIgnoreCase("yes")) {
							ct.addItem("Realme Super Slim TV, 55-inch Full HD, Slim Design", price);
							String dis;
							while(true) {
								System.out.println(colour.magenta+"Do you want to see cart (yes/no):"+colour.end+colour.end);
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
	public static void main(String [] args) {
		Tvs tv = new Tvs();
		System.out.println(colour.bggreen+"Choose from our Tv models:"+colour.end);
		System.out.println("1. Sony TVs");
		System.out.println("2. Samsung Tvs");
		System.out.println("3. LG Tvs");
		System.out.println("4. Mi Tvs");
		System.out.println("5. Realme Tvs");
		System.out.println("6. Back");
		String choice;
		while(true) {
			System.out.print(colour.brightWhite+"Enter your choice (1-6):"+colour.end);
			choice = scanner.next();
			if(choice.equalsIgnoreCase("1")||choice.equalsIgnoreCase("2")||choice.equalsIgnoreCase("3")||choice.equalsIgnoreCase("4")||choice.equalsIgnoreCase("5") || choice.equalsIgnoreCase("6")) break;
			else System.out.println(colour.red+"Invalid Input");
		}

		switch(choice) {
		case "1":
			Tvs.SonyTVSelector sony = tv.new SonyTVSelector();
			sony.showSpecifications();
			break;
		case "2":
			Tvs.SamsungTVSelector samsung = tv.new SamsungTVSelector();
			samsung.showSpecifications();
			break;
		case "3":
			Tvs.LGTVSelector lg = tv.new LGTVSelector();
			lg.showSpecifications();
			break;
		case "4":
			Tvs.MiTVSelector mi = tv.new MiTVSelector();
			mi.showSpecifications();
			break;
		case "5":
			Tvs.RealmeTVSelector realme = tv.new RealmeTVSelector();
			realme.showSpecifications();
			break;
		case "6":
		Promain Main = new Promain();
		main.main(new String[]{});
		break ;
		default:
			System.out.println(colour.red+"Invalid selection");
		}

		scanner.close();
	}
}
