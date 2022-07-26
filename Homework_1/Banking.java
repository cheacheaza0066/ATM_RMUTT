package Homework_1;

public class Banking {
    private String name, BankAccountNumber, BankAccountPassword;
    private float amount;

    public void setName(String name){
        this.name = name;
    }
    public void setBankAccountNumber(String BankAccountNumber){
        this.BankAccountNumber = BankAccountNumber;
    }
    public void setBankAccountPassword(String BankAccountPassword){
        this.BankAccountPassword = BankAccountPassword;
    }
    public void setAmount(float amount){
        this.amount = amount;
    }

    public String getName(){
        return name;
    }
    public String getBankAccountNumber(){
        return BankAccountNumber;
    }
    public String getBankAccountPassword(){
        return BankAccountPassword;
    }
    public float getAmount(){
        return amount;
    }




}
