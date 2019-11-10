public class Validator {
    private Validator() {

    }

    public static void validateNonNegativeMoneyAmount(double money) {
        if (money < 0) {
            throw new IllegalArgumentException
                    ("Money cannot be negative");
        }
    }

    public static void validateNonEmptyString(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }
}

