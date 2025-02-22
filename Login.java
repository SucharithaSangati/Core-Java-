package app;
import ca.Cart;
import app.Promain;
import java.util.*;
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
public class Login{
    static
	{
		System.out.println(colour.bgred+colour.brightWhite+"WELCOME TO E-BUZZ"+colour.end);
	}
    private static ArrayList<String> username = new ArrayList<>();
    private static ArrayList<String> passwords = new ArrayList<>();
    private static ArrayList<Long> mobile = new ArrayList<>();
    private static ArrayList<Promain> promainObjects = new ArrayList<>();
    private static ArrayList<Cart> userCarts = new ArrayList<>();

    //private static final HashMap<String, Cart> userCarts = new HashMap<>();
    private static String loggedInUser = null;


   // private static ArrayList<String> obj;
   // private static Scanner scanner;
   public static Scanner scanner = new Scanner(System.in);

    // public Login() {
    //     username = new ArrayList<>();
    //     passwords = new ArrayList<>();
    //     //scanner = new Scanner(System.in);
    //     mobile = new ArrayList<>();
    //     obj = new ArrayList<>();

    // }
   public static boolean pcp(String p)
	{
		int ca=0,nu=0,sm=0,sc=0;
		for (int i=0; i<p.length(); i++)
		{
			if(p.charAt(i)>='A'&&p.charAt(i)<='Z')
				ca++;
			else if(p.charAt(i)>='a'&&p.charAt(i)<='z')
				sm++;
			else if(p.charAt(i)>='0'&&p.charAt(i)<='9')
				nu++;
			else
				sc++;
		}
		if(ca>0&&nu>0&&sm>0&&sc>0&&p.length()>7)
			return true;
		return false;

	}


    public static String generateRandomString(int length) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder result = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            result.append(letters.charAt(random.nextInt(letters.length())));
        }

        return result.toString();
    }


        public static void signup(){
            System.out.println("Create a new account");
            long contactNumber = 0;
            while(true) {
                long c = 0;
                while(true){
                System.out.println(colour.green+"Enter phone number:"+colour.end);
                
                    try{
                        contactNumber = scanner.nextLong();
                        c=1;
                    }catch(Exception e){
                        String in = scanner.nextLine();
                        System.out.println(colour.bgred+"please enter an integer"+colour.end);
                    }
                    if(c!=0) break;
                }
                if(contactNumber>(long)(Math.pow(10,9))-1&&contactNumber<(long)(Math.pow(10,10))) break;
                System.out.println(colour.brightRed+"Phone number length must be 10 digits only"+colour.end);
                
            }
            String password;
            while(true) {
                System.out.print(colour.brightWhite+"Enter Password[min 8 characters] \n(must include: 1 uppercase letter, 1 lowercase letter, 1 number, and 1 special character): "+colour.end);

                password = scanner.next();
                if(pcp(password))
                    break;
            }
            String uname;
            while(true){
            System.out.print(colour.purple+"Enter username(Without Spaces) "+colour.end);
            uname = scanner.next();
            if(!username.contains(uname)){
                username.add(uname);
                passwords.add(password);
                mobile.add(contactNumber);
                break;
            }
            else System.out.println(colour.red+"Already Exist!. Please try another userName"+colour.end);
        }
        //    String obj1 = generateRandomString();
        //userCarts.put(uname, new Cart());
        userCarts.add(new Cart());
            //Promain obj.get(i) = new Promain();
            System.out.println(colour.green+"Account created Successfully!"+colour.end);
            System.out.print(colour.brightMagenta+"\nLoading Back To Login Page."+colour.end);
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.print(".");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(colour.bgyellow+colour.red+"An error occurred."+colour.end);
                    return;
                }
            }
            System.out.println();
            login();
    }
static int userIndex;
    public static void login(){
        String uname;
        while (true) {
            System.out.print(colour.purple+"Enter username(Without Spaces)"+colour.end);
            uname = scanner.next();
            userIndex = username.indexOf(uname);
            if (userIndex != -1) {
                //loggedInUser = uname;
                break;
            }
            String suchi;
            while(true){
            System.out.println(colour.brightRed+"Invalid username."+colour.end+" \n "+colour.bgred+"1. Retry "+colour.end+"\n"+colour.green+" 2. See UserName "+colour.end+"\n"+colour.brightMagenta+"3. Create New Account "+colour.end+ "\n"+colour.bgskblue+" 4. Exit"+colour.end);
            suchi = scanner.next();
                if(suchi.equals("1")||suchi.equals("2")||suchi.equals("3")||suchi.equals("4")) break;
                else System.out.println(colour.red+"Invalid Input."+colour.end);
            }
                if(suchi.equals("2")) {
                long contactNumber = 0;
                while(true){
                System.out.println(colour.brightCyan+"Enter phone number:"+colour.end);
                int c = 0;
                while(true){
                    try{
                        contactNumber = scanner.nextLong();
                        c++;
                    }catch(Exception e){
                        String in = scanner.nextLine();
                        System.out.println(colour.purple+"please enter phone number"+colour.end);
                    }
                    if(c!=0) break;
                }
                if(mobile.contains(contactNumber)) break;
                else{
                    String us;
                    while(true){
                    System.out.println(colour.brightRed+"Invalid Mobile Number"+colour.end+" \n "+colour.bgred+"1. Retry "+colour.end+"\n"+colour.brightMagenta+"2. Create New Account "+colour.end+ "\n"+colour.brightYellow+"3.Back"+colour.end+"\n"+colour.bgskblue+" 4. Exit"+colour.end);
                    us = scanner.next();
                    if(us.equals("1")||us.equals("2")||us.equals("3")||us.equals("4")) break;
                    else System.out.println("Invalid Input.");
                    }
                    if(us.equals("2")) signup();
                    else if(us.equals("3")) login();
                    else if(us.equals("4")) System.exit(0);
                }
                
                }
                if(mobile.contains(contactNumber)){
                    for(int i = 0;i<mobile.size();i++){
                        if(contactNumber==mobile.get(i))
                     System.out.println("UserName:"+username.get(i));
                    }
                     System.out.print(colour.brightMagenta+"\nLoading Back To Login Page."+colour.end);
                     for (int i = 0; i < 5; i++) {
                         try {
                             System.out.print(".");
                             Thread.sleep(1000);
                         } catch (InterruptedException e) {
                             System.out.println(colour.bgyellow+colour.red+"An error occurred."+colour.end);
                             return;
                         }
                     }
                    }
        }
                    else if(suchi.equals("3")){ signup(); break;}
                    else if(suchi.equals("4")) System.exit(0);
    }
    while(true){
    System.out.print(colour.purple+"Enter Password: "+colour.end);
    String password = scanner.next();
    if(password.equals(passwords.get(userIndex))){
        System.out.println(colour.bgred+colour.brightWhite+"Hi, " +uname+colour.end);

        Promain.main(new String[]{});
        break;
    }
    else{
         System.out.println("Invalid Password");
         String rp;
         while(true){
            System.out.println(colour.bgyellow+colour.red+" 1. Do you want to retry "+colour.end+"\n "+colour.bgpurpe+"2. Do you want to reset Password "+colour.end+"\n "+colour.bgred+"3. Exit"+colour.end);
            rp = scanner.next();
            if(rp.equals("1")||rp.equals("2")||rp.equals("3")) break;
            else System.out.println(colour.brightRed+"Invalid Input."+colour.end);
            }
         //if(rp.equalsIgnoreCase("2")) reset();
         if(rp.equalsIgnoreCase("2")) reset();
         if(rp.equalsIgnoreCase("3")) System.exit(0);

        }
}

}
public static Cart getCurrentUserCart() {
    return userCarts.get(userIndex);
}
public static void reset(){
    while(true){
    System.out.print(colour.green+"Enter username(without Spaces) "+colour.end);
    String uname=scanner.next();
    int i;
    for(i = 0;i<username.size();i++){
        if(uname.equals(username.get(i))) break;
    }
    if(i!=username.size()){
        String password;
        while(true) {
            System.out.print(colour.brightWhite+"Enter Password[min 8 characters] \n(must include: 1 uppercase letter, 1 lowercase letter, 1 number, and 1 special character): ");

            password = scanner.next();
            if(pcp(password))
                break;
        }
        passwords.remove(i);
        passwords.add(password);
        System.out.println(colour.green+"Updated Password Successfully!"+colour.end);
        login();
        break;
    }
    else{
        String op;
        while(true){
        System.out.println(colour.bgred+" 1. Do you want to retry \n"+colour.end+colour.green+" 2. Do you want to create an account "+colour.end+"\n 3. Back \n 4. Exit");
        op = scanner.next();
        if(op.equals("1")||op.equals("2")||op.equals("3")||op.equals("4")) break;
        else System.out.println(colour.red+"Invalid Input."+colour.end);
        }
        if(op.equals("2")) signup();
        else if(op.equals("4")) System.exit(0);
        else if(op.equals("3")) login();
    }

}
}
public static void display(){
    for(int i = 0;i<username.size();i++){
        System.out.println(username.get(i));
    }
    String en;
    while(true){
    System.out.println(colour.green+" 1. Login "+colour.end+"\n"+colour.purple+" 2. SignUp "+colour.end+"\n"+colour.red+"3. Exit"+colour.end);
    en = scanner.next();
    if(en.equals("1")||en.equals("2")||en.equals("3")) break;
    else System.out.println(colour.red+"Invalid Input."+colour.end);
    }
    if(en.equals("1")) login();
    else if(en.equals("2")) signup();
    else System.exit(0);
}
public static void main(String[] args){
    display();
}
}