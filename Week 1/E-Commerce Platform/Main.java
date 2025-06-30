import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Chair", "Furniture"),
            new Product(3, "Pen", "Stationery"),
            new Product(4, "Mobile", "Electronics"),
            new Product(5, "Desk", "Furniture")
        };

        Product foundLinear = SearchAlgorithms.linearSearch(products, "Pen");
        System.out.println("Linear Search Result: " + (foundLinear != null ? foundLinear : "Not found"));

        Arrays.sort(products, (a, b) -> a.productName.compareToIgnoreCase(b.productName));
        Product foundBinary = SearchAlgorithms.binarySearch(products, "Pen");
        System.out.println("Binary Search Result: " + (foundBinary != null ? foundBinary : "Not found"));
    }
}
