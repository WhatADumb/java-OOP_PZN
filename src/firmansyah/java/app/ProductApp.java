package firmansyah.java.app;

import firmansyah.java.data.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Huawei", 1_000_000);
        System.out.println(product.getName());
        System.out.println(product.getPrice());

        System.out.println(product);

        Product product2 = new Product("Huawei", 1_000_000);
        System.out.println(product.equals(product2));
        product.sampleThis();
        System.out.println(product.getClass());
        System.out.println(product.hashCode() == product2.hashCode());
        System.out.println(product.hashCode());
        System.out.println(product2.hashCode());
    }
}
