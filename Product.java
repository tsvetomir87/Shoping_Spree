public class Product {
    private  String name;
    private  double cost;


    public Product(String name, double money){
        this.setName(name);
        this.setCost(cost);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        Validator.validateNonEmptyString(name);
    this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        Validator.validateNonNegativeMoneyAmount(cost);
        this.cost = cost;
    }
}
