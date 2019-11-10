import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Product> products;
    private double money;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        Validator.validateNonEmptyString(name);
        this.name = name;
    }

    private void setMoney(double money) {
        Validator.validateNonNegativeMoneyAmount(money);
        this.money = money;
    }

    public String getName() {
        return name;
    }
    public  void buyProduct(Product product){
        double cost = product.getCost();
        if (this.money >= cost){
            this.money -= cost;
            this.products.add(product);
        }else {
            throw new IllegalStateException(
                   String.format("%s can`t affodr %s",
                    this.getName(),product.getName()));
        }
    }
}
