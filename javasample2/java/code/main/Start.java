import java.util.Scanner;
class Start {
    public static void main(String[] data) {
        Coffee[] a = new Coffee[3];
        a[0] = new Coffee();
        a[0].name = "Latte";
        a[0].price = 80;
        a[1] = new Coffee();
        a[1].name = "Mocha";
        a[1].price = 90;
        a[2] = new Coffee();
        a[2].name = "Espresso";
        a[2].price = 70;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].name);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Coffee: ");
        String s = input.nextLine();
        int result = -1;  
        for (int i = 0; i < a.length; i++) {
            if (a[i].name.equals(s)) {
                result = i;
            }
        }
        if (result == -1) {
System.out.println("Not found");
        } else {
            System.out.println("The price is " + 
                            a[result].price);
        }
    }
}
class Coffee {
    String name;
    double price;
}

