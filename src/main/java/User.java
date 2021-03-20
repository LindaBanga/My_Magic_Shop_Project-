public class User {

    public String userName;
private double balance;
public String name;
public String magicField;


public User(String userName, double balance, String name, String magicField){
    this.userName = userName;
    this.balance = balance;
    this.name = name;
    this.magicField = magicField;

}
public double getBalance(){
    return balance;
}
public void setBalance(double balance){
    this.balance = balance;

}

}
