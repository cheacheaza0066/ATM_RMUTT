package Homeworl_2;

public class Manager extends Person{
    
    private String AdminLoginID,AdminLoginPassword;

    public String getAdminLoginID(){
        return AdminLoginID;
    }
    public void setAdminLoginID(String adminLoginID){
        this.AdminLoginID=adminLoginID;
    }
    public String getAdminLoginPassword(){
        return AdminLoginPassword;
    }
    public void setAdminLoginPassword(String adminLoginPassword){
       this.AdminLoginPassword=adminLoginPassword;
    }

    public Manager(String adminLoginID,String adminLoginPassword,String Fullname,String citizen,String gender){
       AdminLoginID=adminLoginID;
       AdminLoginPassword=adminLoginPassword;
        setGender(gender);
        setCitizen(citizen);
        setFullname(Fullname);
    }
}
