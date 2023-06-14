package firmansyah.java.app;

import firmansyah.java.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();
        category.setId("Lester101");
        category.setExpensive(true);
        category.setId(null);

        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
