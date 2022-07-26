package Homeworl_2;
import java.util.*;
public class Account extends Person implements Atm {
    private float Balance;
    private String loginId,loginPassword; 

    public void setLoginId(String loginId){
        this.loginId = loginId;
    }
    public void setLoginPassword(String loginPassword){
        this.loginPassword = loginPassword;

    }public void setBalance(Float Balance){
        this.Balance = Balance;
    }

    public String getLoginId(){
        return loginId;
    }
    public String getLoginPassword(){
        return loginPassword;
    }
    public float getBalance(){
        return Balance;
    }

    public Account(String loginId,String loginPassword,float Balance,String Fullname,String citizen,String gender){
        this.loginId = loginId;
        this.loginPassword=loginPassword;
        this.Balance = Balance;
        setFullname(Fullname);
        setCitizen(citizen);
        setGender(gender);
       
        
    }
    public void Checkable(){
        System.out.println("Your Balance is = " + this.Balance);
    }
    
    public void Withdrawable(){
    System.out.print("Enter your Withdraw Amount : ");
    Scanner input=new Scanner(System.in);
        float withdraw =input.nextFloat();
        if(withdraw>this.Balance){
            System.out.println("Your Balance is not enough");
        }
        else{
            this.Balance -= withdraw;
            System.out.println("Your Balance is ="+ this.Balance);
        }
    }

    public void Depositeable(){
        System.out.print("Enter your Deposite Amount:");
        Scanner input=new Scanner(System.in);
            if(this.Balance>1000000){
    
                System.out.println("Your Balance is too much");
                System.out.println("Your Balance is over 1000000");
            }else{
                float deposite = input.nextFloat();
                this.Balance+=deposite;
                System.out.println("Your Balance is:" + this.Balance);
            } 
        }

        public float Transferable(){
            System.out.print("Enter your Transfer Amount:");
            Scanner input=new Scanner(System.in);
                float transfer=input.nextFloat();
           
                if((transfer+this.Balance)>1000000){
                    System.out.println("Fail transfer!Your Balance is over 1000000");
                }
                else{
                    this.Balance-=transfer;
                    System.out.println("Your Balance is" + this.Balance);
                }
                return transfer;
            }



}
