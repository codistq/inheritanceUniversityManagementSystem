import java.util.Scanner;

public class BankSystem {
    BankSystem(){
    }
    public void loginSystem(DataCenter user,DataCenter user2){
        Scanner scan = new Scanner(System.in);
        boolean check1 = true;
        System.out.println("Welcome MR."+user.getName()+" "+user.getSurname());
        System.out.println("Please choose a number : ");
        System.out.println("Press 1 for information.");
        System.out.println("Press 2 for update a password ");
        System.out.println("Press 3 for balance check");
        System.out.println("Press 4 for transfer money");
        System.out.print(" 1 or 2 or 3 or 4 ? :");
        int press = scan.nextInt();
        while (check1){
            if((press==1)||(press==2)||(press==3)||(press==4)){
                switch (press){
                    case 1:
                        System.out.println("name:"+user.getName());
                        System.out.println("name:"+user.getSurname());
                        System.out.println("name:"+user.getCustomerID());
                        System.out.println("name:"+user.getIBAN());
                        break;
                    case 2 :
                        System.out.print("Please enter a correct password:");
                        String currentPassword = scan.next();
                        int tryPass = 2;
                        while (tryPass>0) {
                            if (currentPassword.equals(user.getPassword())) {
                                System.out.print("Please enter a new password : ");
                                String newPassword = scan.next();
                                System.out.print("Please confirm new password : ");
                                String newPasswordConfirm = scan.next();
                                if(newPassword.equals(newPasswordConfirm)){
                                    user.setPassword(newPassword);
                                    System.out.println("Password is changed");
                                    System.out.println("New password is :"+user.getPassword());
                                    break;
                                }else {
                                    System.out.println("Confirm password is not same new password ! ");
                                }
                            } else {

                                System.out.print("Correct password is incorrect try again ! : ");
                                currentPassword = scan.next();
                                tryPass--;
                                if(tryPass==0){
                                    System.out.println("Account is has been bloked ! ");
                                }

                            }
                        }
                    break;
                    case 3 :
                        System.out.println("MR."+user.getName()+" "+user.getSurname() + "'s total balance is "+user.getBalance()+" $");
                        break;
                    case 4 :
                        boolean IbanCheck=true;
                        System.out.print("Enter the IBAN of the account to which the money will be transferred: ");
                        String transferIBAN = scan.next();
                        if(transferIBAN.equals(user2.getIBAN())){
                            System.out.println("Name of the account holder you want to deposit: "+user2.getName()+" "+user2.getSurname());
                            System.out.print("How much money do you want to deposit? ");
                            int depositMany = scan.nextInt();
                            if(depositMany<user.getBalance()){
                                int total;
                                total =user.getBalance()-depositMany;
                                user.setBalance(total);
                                System.out.println("Money has been sent");
                                System.out.println("Total balance:"+user.getBalance()+" $");
                            }else{
                                System.out.println("Check your total balance ! ");
                                continue;
                            }
                        }else{
                            System.out.println("Account cant find ! try again :  ");
                            continue;
                        }
                    break;
                    default:
                        System.out.println("Enter a 1 or 2 or 3 or 4 ");
                        break;
                }
                check1 =false;
            }else {
                System.out.print("You made a wrong keystroke please try again..: ");
                press = scan.nextInt();
            }
        }
    }
}
