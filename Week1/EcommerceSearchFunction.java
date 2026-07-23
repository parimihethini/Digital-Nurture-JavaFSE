package Week1;

class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class EcommerceSearchFunction {

    public static void linearSearch(Product products[], String name) {

        boolean found = false;

        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(name)) {
                System.out.println("Week1.Product Found");
                System.out.println("ID: " + products[i].productId);
                System.out.println("Name: " + products[i].productName);
                System.out.println("Category: " + products[i].category);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Week1.Product Not Found");
        }
    }

    public static void main(String[] args) {

        Product products[] = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories")
        };

        linearSearch(products, "Shoes");
    }
}