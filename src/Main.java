public class Main {
    public static void main(String[] args) {
        // Использование фабрики
        Pizza pizza1 = PizzaFactory.createPizza("Маргарита");
        Pizza pizza2 = PizzaFactory.createPizza("Пепперони");

        // Создание заказа с помощью строителя
        Order order = new OrderBuilder()
            .addPizza(pizza1)
            .addPizza(pizza2)
            .setDeliveryType("Доставка на дом")
            .build();

        order.showOrder();

        // Получение экземпляра администратора
        Admin admin = Admin.getInstance();
        admin.manageMenu();
    }
}
