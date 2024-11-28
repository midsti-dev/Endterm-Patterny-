public class Main {
    public static void main(String[] args) throws AdminAuthenticationException {
        
        Pizza pizza1 = PizzaFactory.createPizza("Маргарита");
        Pizza pizza2 = PizzaFactory.createPizza("Пепперони");

        
        Order order = new OrderBuilder()
            .addPizza(pizza1)
            .addPizza(pizza2)
            .setDeliveryType("Доставка на дом")
            .build();

        order.showOrder();

        
        Admin admin = Admin.getInstance();
        admin.manageMenu();
    }
}
