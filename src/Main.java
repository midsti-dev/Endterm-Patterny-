public class Main {
    public static void main(String[] args) throws AdminAuthenticationException {
        
        Pizza pizza1 = PizzaFactory.createPizza("���������");
        Pizza pizza2 = PizzaFactory.createPizza("���������");

        
        Order order = new OrderBuilder()
            .addPizza(pizza1)
            .addPizza(pizza2)
            .setDeliveryType("�������� �� ���")
            .build();

        order.showOrder();

        
        Admin admin = Admin.getInstance();
        admin.manageMenu();
    }
}
