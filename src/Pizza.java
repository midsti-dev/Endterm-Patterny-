abstract class Pizza {
    abstract void prepare();
}

class MargheritaPizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("Приготовление пиццы Маргарита");
    }
}

class PepperoniPizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("Приготовление пиццы Пепперони");
    }
}

class PizzaFactory {
    public static Pizza createPizza(String pizzaType) {
        if (pizzaType.equalsIgnoreCase("Маргарита")) {
            return new MargheritaPizza();
        } else if (pizzaType.equalsIgnoreCase("Пепперони")) {
            return new PepperoniPizza();
        } else {
            throw new IllegalArgumentException("Неизвестный тип пиццы");
        }
    }
}
