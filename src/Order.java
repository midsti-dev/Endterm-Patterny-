import java.util.ArrayList;
import java.util.List;

class Order {
    private List<Pizza> pizzas = new ArrayList<>();
    private String deliveryType;

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public void showOrder() {
        System.out.println("ваш заказ:");
        for (Pizza pizza : pizzas) {
            pizza.prepare();
        }
        System.out.println("тип доставки: " + deliveryType);
    }
}

class OrderBuilder {
    private Order order;

    public OrderBuilder() {
        order = new Order();
    }

    public OrderBuilder addPizza(Pizza pizza) {
        order.addPizza(pizza);
        return this;
    }

    public OrderBuilder setDeliveryType(String deliveryType) {
        order.setDeliveryType(deliveryType);
        return this;
    }

    public Order build() {
        return order;
    }
}
