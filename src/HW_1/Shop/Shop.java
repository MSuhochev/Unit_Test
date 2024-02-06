package HW_1.Shop;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        // Допишите реализацию метода самостоятельно
        Collections.sort(products, Comparator.comparing(Product::getCost));
        return products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        // Допишите реализацию метода самостоятельно
        if (products == null || products.isEmpty()) {
            return null; // Возвращаем null, если список продуктов пуст
        }

        // Ищем самый дорогой продукт с помощью итерации по списку
        Product mostExpensiveProduct = products.get(0);
        for (Product product : products) {
            if (product.getCost() > mostExpensiveProduct.getCost()) {
                mostExpensiveProduct = product;
            }
        }
        return mostExpensiveProduct;
    }

}