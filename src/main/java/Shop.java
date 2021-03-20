public class Shop {

    private User user;

    public Shop(String item) {
    }

    public Shop() {

    }

    public String setActiveUser(User user){
        this.user = user;
        return "user update successful";
    }
    public double getUserBalance(){
        return user.getBalance();
    }





}
