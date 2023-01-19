import java.util.Scanner;

public class Account {
private String userEmail;
private String userFirstName;
private String userLastName;
private String userPhoneNumber;
private String userAddress;
private String userBank;
private int userInitialAmount;

public Account(String userEmail, String userFirstName, String userLastName, String userPhoneNumber, String userAddress, String userBank, int userInitialAmount){
    this. userEmail= userEmail;
    this. userFirstName=userFirstName;
    this.userLastName= userLastName;
    this. userPhoneNumber= userPhoneNumber;
    this. userAddress= userAddress;
    this. userBank= userBank;
    this.userInitialAmount= userInitialAmount;
}


public void setEmail(String email){
    userEmail= email;
}


public void setFirstName(String firstName){
    userFirstName=firstName;
}


public void setLastName(String lastName){
    userLastName= lastName;
}


public void setPhoneNumber(String phoneNumber){
    userPhoneNumber= phoneNumber;
}


public void setAddress(String address){
    userAddress=address;
}


public void setBank(String bank){
    userBank= bank;
}


public void setInitialAmount(int initialAmount){
    userInitialAmount= initialAmount;
}

public static Account myAccount(){
    Scanner createAccount= new Scanner(System.in);

    System.out.println("Enter your email that you use for banking: ");
    String inputEmail= createAccount.nextLine();

    System.out.println("Enter your legal first name: ");
    String inputFirstName= createAccount.nextLine();

    System.out.println("Enter your legal middle and last name:  ");
    String inputLastName= createAccount.nextLine();

    System.out.println("Enter your phone number ");
    String inputPhoneNumber= createAccount.nextLine();

    System.out.println("Enter your residential address to receive mails from us:  ");
    String inputAddress= createAccount.nextLine();


    System.out.println("Enter the name of the bank you are associated with:  ");
    String inputBankName= createAccount.nextLine();

    System.out.println("Enter the amount you would like to start with:  ");
    int inputInitialAmount= createAccount.nextInt();


    Account newAccount = new Account(inputEmail, inputFirstName, inputLastName, inputPhoneNumber, inputAddress, inputBankName, inputInitialAmount);

    return newAccount;
}


    public static void main(String[] args) throws Exception {
        Account thisAccount= myAccount();
        System.out.println("The new account contins the following information: ");
        thisAccount.toString();
    } 
    
    
    
    
   
}
