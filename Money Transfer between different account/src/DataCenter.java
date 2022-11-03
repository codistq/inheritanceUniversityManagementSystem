public class DataCenter {
   private String customerID;
   private String name;
   private String surname;
   private String IBAN;
   private String password;
   private int balance;
   DataCenter(String customerID,String name, String surname,String IBAN,String password, int balance){
       this.customerID = customerID;
       this.name = name;
       this.surname = surname;
       this.IBAN = IBAN;
       this.password = password;
       this.balance = balance;
   }
   public String getCustomerID(){
       return this.customerID;
   }
   public void setCustomerID(String customerID){
       this.customerID = customerID;
   }
   public String getName(){
       return this.name;
   }
   public void setName(String name){
       this.name = name;
   }
   public String getSurname(){
       return this.surname;
   }
   public void setSurname(String surname){
       this.surname = surname;
   }
   public String getIBAN(){
       return this.IBAN;
   }
   public void setIBAN(String IBAN){
       this.IBAN = IBAN;
   }
   public String getPassword(){
       return this.password;
   }
   public void setPassword(String password){
       this.password = password;
   }
   public int getBalance(){
       return this.balance;
   }
   public void setBalance(int balance){
       this.balance = balance;
   }
}
