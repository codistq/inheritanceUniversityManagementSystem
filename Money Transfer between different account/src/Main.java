import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankSystem bank1 = new BankSystem();
        boolean control1 = true;
        DataCenter john = new DataCenter("8520","John","Smith","1","123",8000);
        DataCenter paul = new DataCenter("2580","Paul","Jordan","2","321",9500);
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to A bank please Enter a customerID and password");
        System.out.print("Enter a customerID : ");
        String customerID = scan.next();
        System.out.print("Enter a password : ");
        String password = scan.next();
        while (control1) {
            if ((customerID.equals(john.getCustomerID())) || customerID.equals(paul.getCustomerID())) {
                if(customerID.equals(john.getCustomerID()) && password.equals(john.getPassword())){
                    bank1.loginSystem(john,paul);
                    control1 = false;
                } else if (customerID.equals(paul.getCustomerID()) && password.equals(paul.getPassword())) {
                    bank1.loginSystem(paul,john);
                    control1 = false;
                }

            } else {
                System.out.println("Please make sure to enter a correct customerID ! ");
                break;
            }
        }
    }
}