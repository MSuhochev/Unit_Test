package HW_1.Shop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import static org.assertj.core.api.Assertions.*;


public class ShopTest {
    public static void main(String[] args) {
        /*
        1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
        2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
        3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
        */

        Shop shop = new Shop();

        Product product1 = new Product();
        product1.setTitle("Apple");
        product1.setCost(50);

        Product product2 = new Product();
        product2.setTitle("Banana");
        product2.setCost(100);

        Product product3 = new Product();
        product3.setTitle("Lime");
        product3.setCost(75);

        // Добавляем продукты в магазин
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        shop.setProducts(products);

        // Получаем самый дорогой продукт
        Product mostExpensiveProduct = shop.getMostExpensiveProduct();

        // Проверяем, что метод getMostExpensiveProduct возвращает правильный продукт
        assertThat(mostExpensiveProduct).isEqualTo(product2);

        // Сортируем продукты по цене
        List<Product> sortedProducts = shop.sortProductsByPrice();

        // Проверяем, что продукты отсортированы по возрастанию цены
        assertThat(sortedProducts).isSortedAccordingTo(Comparator.comparing(Product::getCost));
    }
}
