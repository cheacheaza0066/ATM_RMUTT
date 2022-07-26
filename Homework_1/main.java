package Homework_1;
import java.util.*;

import javax.lang.model.element.Element;
import javax.net.ssl.SSLEngineResult.Status;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            ArrayList<Banking> ab = new ArrayList<Banking>();
            int s;
            do{
                System.out.print("Step 1. Enter amount of all account = ");
                s = sc.nextInt();
            }while(s>=5);
            System.out.print("Step 2. Enter Detail of each account. ");
            if(s > 5){
                System.out.print("Account more than 5");
            }else{
                for(int i =0;i<s;i++){
                    Banking bk = new Banking();
                    
                    System.out.println("No . "+ (i+1));
                    System.out.println("Account ID = ");
                    String BankAccountNumber = sc.next();
                    System.out.print("Account Name = ");
                    String name = sc.next();
                    System.out.print("Password = ");
                    String BankAccountPassword = sc.next();
                    System.out.print("Balance = ");
                    float amount = sc.nextFloat();
                    if(name.length()<=50 && BankAccountNumber.length() ==13 && BankAccountPassword.length()==4 && amount<=1000000){
                        bk.setBankAccountNumber(BankAccountNumber);
                        bk.setName(name);
                        bk.setBankAccountPassword(BankAccountPassword);
                        bk.setAmount(amount);
                        ab.add(bk);
                    }else{
                        System.out.println("Wrong");
                        System.exit(0);
                    }

                }
                while(true){
                    System.out.println("");

                    System.out.println("ATM ComputerThanyaburiBank");
                    System.out.println("Account ID :");
                    String BankNumber = sc.next();
                    System.out.print("Password : ");
                    String BackPassword = sc.next();
                    for (int j = 0; j < ab.size(); j++) {
                        if (BankNumber.equals(ab.get(j).getBankAccountNumber()) && BackPassword.equals(ab.get(j).getBankAccountPassword())) {
                            System.out.println("Menu Service");
                            System.out.println("1.Account Balance");
                            System.out.println("2.Withdrawal");
                            System.out.println("3.Exit");
                            System.out.println("Choose :");
                            int choose = sc.nextInt();
                            switch(choose){
                                case 1 :
                                    System.out.println("Balance : " + ab.get(j).getAmount());
                                break;
                                case 2 :
                                    System.out.println("Enter amount to withdraw");
                                    float balance = sc.nextFloat();
                                    if(balance <= ab.get(j).getAmount()){
                                        ab.get(j).setAmount(ab.get(j).getAmount());
                                        System.out.println("Balance : " + ab.get(j).getAmount());
                                    }else{
                                        System.out.println("Your Account don't have enough money");
                                    }
                                    break;
                                    case 3 :
                                        System.out.println("Thankyou for your service");
                                    break;
                                    default:
                                        System.out.println("");
                                        System.out.println("Please Enter number 1-3");
                                        break;

                            }


                        }
                    }

                }
            
        }
    }
}
