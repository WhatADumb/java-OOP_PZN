package firmansyah.java.data;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void sampleThis(){
        System.out.println(this);
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public String toString(){
        return "Product Name: " + this.name + ", Product Price: " + this.price;
    }

    public boolean equals(Object o){
        if(o == this) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Product product = (Product)o;

        if(this.price != product.price) return false;
        return this.name != null ? this.name.equals(product.name) : product.name == null;
    }

    public int hashCode(){
        int result = this.name != null ? this.name.hashCode() : 0;
        result = 31 * result + this.price;
        return result;
    }
}
