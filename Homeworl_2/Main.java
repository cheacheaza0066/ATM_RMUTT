package Homeworl_2;
import java.util.*;
public class Main {
        public static void main(String[] args) {
            
            ArrayList<Account>accounlist=new ArrayList<Account>();
            ArrayList<Manager>adminlist=new ArrayList<Manager>();
            Manager admin=CreateManager();
            adminlist.add(admin);
            Scanner input=new Scanner(System.in);
            System.out.print("Step 1. Number of Account To create:");
            int amount=input.nextInt();
            System.out.println("Step 2. Enter Detail of account");
            for(int i=0;i<amount;i++){
               
                System.out.println("No. "+(i+1));
                Account account = CreaAccount();
                accounlist.add(account);
                System.out.println("-----------------------");
            }
            while(true){
            String LoginID,LoginPassword;
            boolean check=false;
            int indexOfAccountList=0;
            do{
                    System.out.println("----- ATM -----");
                    System.out.print("Account ID:");
                    LoginID=input.next();
                    System.out.print("Account Password:");
                    LoginPassword=input.next();
                    for(int j = 0; j<accounlist.size();j++){
                        if(accounlist.get(j).getLoginId().equals(LoginID) && accounlist.get(j).getLoginPassword().equals(LoginPassword)){
                            check = true;
                            indexOfAccountList = j;
                            break;
                        }else{
                            check = false;
                        }
                    } 
                    if(check == false){
                        System.out.println("ID or Password Wrong");
                    }

            }while(check == false);

            if(check == true){
                int choice;
                do{
                    // System.out.println("Welcome " + accounlist.get(indexOfAccountList).getFullname());
                    System.out.println("Choose your Action");
                    System.out.println("1. Check Balance");
                    System.out.println("2 WithDraw");
                    System.out.println("3 Deposite");
                    System.out.println("4 Transfer");
                    System.out.println("5 Exit");
                    System.out.print("Enter your Choice");
                    choice= input.nextInt();
                    switch (choice) {
                        case 1:
                            accounlist.get(indexOfAccountList).Checkable();
                            break;
                        case 2:
                            accounlist.get(indexOfAccountList).Withdrawable();
                        break;
                        case 3:
                            accounlist.get(indexOfAccountList).Depositeable();
                        break;
                        case 4:
                            System.out.println("Select to Transfer Account");
                            for(int i=0; i<accounlist.size();i++){
                                if (accounlist.get(i).getLoginId().equals(LoginID)) {
                                    continue;
                                }
                                System.out.println((i+1) + " . " + accounlist.get(i).getFullname());
                            }
                            System.out.println("Select your Choice");
                            int SelectAccount = input.nextInt();
                            float TransferAmount = accounlist.get(indexOfAccountList).Transferable();
                            accounlist.get(SelectAccount-1).setBalance(accounlist.get(SelectAccount-1).getBalance() + TransferAmount);

                        break;
                    case 5 :
                        System.out.println("ThankYou");   
                        break; 
                        default:
                        System.out.println("Invalid choice");
                            break;
                    }
                }while(choice != 5);
            }
        }
    }

    public static Account CreaAccount(){
        String loginId, loginPassword, Fullname , citizen,gender;
        float Balance;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Enter your  Login ID : ");
            loginId = input.nextLine();
                if(loginId.length() < 13){
                    System.out.println("admin LoginID too short");
                }
                else if (loginId.length()>13) {
                 System.out.println("admin LoginID too long");
                }
        }while(loginId.length()<13  || loginId.length() > 13);
        do{
            System.out.println("Enter your Login Password : ");
            loginPassword = input.nextLine();
                if(loginPassword.length() < 4){
                    System.out.println(" Password too short");
                }
                else if (loginPassword.length()>13) {
                 System.out.println("admin Password too long");
                }
        }while(loginPassword.length()<4  || loginPassword.length() > 4);
        do{
            System.out.println("Enter your Fullname : ");
            Fullname = input.nextLine();
               
        }while( Fullname.length() > 50);
        do{
            System.out.println("Enter your citizen : ");
            citizen = input.nextLine();
                if(citizen.length() < 13){
                    System.out.println(" citizen too short");
                }
                else if (citizen.length()>13) {
                 System.out.println(" citizen too long");
                }
        }while(citizen.length()<13  || citizen.length() > 13);
        do{
            System.out.println("Enter your gender : ");
            gender = input.nextLine();
            gender = gender.toLowerCase();
                if(gender.equals("male") == false && gender.equals("female") == false){
                    System.out.println(" Enter Gender male or female");
                }
                
        }while(gender.equals("male") == false && gender.equals("female") == false);
        do{
            System.out.println("Enter your Balance : ");
            Balance  = input.nextFloat();
                if(Balance < 0){
                    System.out.println(" Your Balance is lees than 0");
                }
                else if (Balance > 1000000) {
                 System.out.println("Your Balance is over 1000000");
                }
        }while(Balance < 0  || Balance > 1000000);
        Account account = new Account(loginId, loginPassword, Balance, Fullname, citizen, gender);
        return account;
    }


    public static Manager CreateManager(){
        String adminLoginID,adminLoginPassword,Fullname,citizen,gender;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter your Admin Login ID : ");
            adminLoginID = input.nextLine();
                if(adminLoginID.length() < 13){
                    System.out.println("admin LoginID too short");
                }
                else if (adminLoginID.length()>13) {
                 System.out.println("admin LoginID too long");
                }
        }while(adminLoginID.length()<13  || adminLoginID.length() > 13);
        do{
            System.out.println("Enter your Admin Login Password : ");
            adminLoginPassword = input.nextLine();
                if(adminLoginPassword.length() < 4){
                    System.out.println("admin Password too short");
                }
                else if (adminLoginPassword.length()>13) {
                 System.out.println("admin Password too long");
                }
        }while(adminLoginPassword.length()<4  || adminLoginPassword.length() > 4);
        do{
            System.out.println("Enter your Fullname : ");
            Fullname = input.nextLine();
                
        }while(Fullname.length() > 50);
        do{
            System.out.println("Enter your citizen : ");
            citizen = input.nextLine();
                if(citizen.length() < 13){
                    System.out.println(" citizen too short");
                }
                else if (citizen.length()>13) {
                 System.out.println(" citizen too long");
                }
        }while(citizen.length()<13  || citizen.length() > 13);
        
        do{
            System.out.println("Enter your gender : ");
            gender = input.nextLine();
            gender = gender.toLowerCase();
                if(gender.equals("male") == false && gender.equals("female") == false){
                    System.out.println(" Enter Gender male or female");
                }
                
        }while(gender.equals("male") == false && gender.equals("female") == false);
        Manager manager = new Manager(adminLoginID, adminLoginPassword, Fullname, citizen, gender);
        return manager;
    }
}
