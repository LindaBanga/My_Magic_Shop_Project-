public class Product {
    public int amount;
    public String name;
    public float price;
    public Product(String name, float price, int amount){
       this.name = name;
       this.price = price;
       this.amount = amount;
    }
    public String getProductDetails(){
        return "Product name " + name + "price " + price +
                "\nWe have " + amount + " items in stock";
    }
}
