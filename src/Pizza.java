abstract class Pizza {
    public abstract String getName();
    abstract void ShowPizzaState();
}

class MargheritaPizza extends Pizza {
    private static final String name = "Маргарита";
    private String DopIng;

    public MargheritaPizza() {
        this.DopIng = "";
    }

    public MargheritaPizza(String newDopIng) {
        this.DopIng = newDopIng;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    void ShowPizzaState() {
        System.out.println("Приготовление пиццы " + getName());
        System.out.println("Дополнительные ингредиенты: " + (DopIng.isEmpty() ? "Нет дополнительных ингредиентов" : DopIng));
    }
}

class PepperoniPizza extends Pizza {
    private static final String name = "Пепперони";
    private String DopIng;

    public PepperoniPizza() {
        this.DopIng = "";
    }

    public PepperoniPizza(String newDopIng) {
        this.DopIng = newDopIng;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    void ShowPizzaState() {
        System.out.println("Приготовление пиццы " + getName());
        System.out.println("Дополнительные ингредиенты: " + (DopIng.isEmpty() ? "Нет дополнительных ингредиентов" : DopIng));
    }
}

class FourSeasonsPizza extends Pizza {
    private static final String name = "Четыре сезона";
    private String DopIng;

    public FourSeasonsPizza() {
        this.DopIng = "";
    }

    public FourSeasonsPizza(String newDopIng) {
        this.DopIng = newDopIng;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    void ShowPizzaState() {
        System.out.println("Приготовление пиццы " + getName());
        System.out.println("Дополнительные ингредиенты: " + (DopIng.isEmpty() ? "Нет дополнительных ингредиентов" : DopIng));
    }
}

class CaesarPizza extends Pizza {
    private static final String name = "Цезарь";
    private String DopIng;

    public CaesarPizza() {
        this.DopIng = "";
    }

    public CaesarPizza(String newDopIng) {
        this.DopIng = newDopIng;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    void ShowPizzaState() {
        System.out.println("Приготовление пиццы " + getName());
        System.out.println("Дополнительные ингредиенты: " + (DopIng.isEmpty() ? "Нет дополнительных ингредиентов" : DopIng));
    }
}

class FourCheesePizza extends Pizza {
    private static final String name = "Четыре сыра";
    private String DopIng;

    public FourCheesePizza() {
        this.DopIng = "";
    }

    public FourCheesePizza(String newDopIng) {
        this.DopIng = newDopIng;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    void ShowPizzaState() {
        System.out.println("Приготовление пиццы " + getName());
        System.out.println("Дополнительные ингредиенты: " + (DopIng.isEmpty() ? "Нет дополнительных ингредиентов" : DopIng));
    }
}

class PizzaFactory {
    public static Pizza createPizza(String pizzaType) {
        if (pizzaType.equalsIgnoreCase("Маргарита")) {
            return new MargheritaPizza();
        } else if (pizzaType.equalsIgnoreCase("Пепперони")) {
            return new PepperoniPizza();
        } else if (pizzaType.equalsIgnoreCase("Четыре сезона")) {
            return new FourSeasonsPizza();
        } else if (pizzaType.equalsIgnoreCase("Цезарь")) {
            return new CaesarPizza();
        } else if (pizzaType.equalsIgnoreCase("Четыре сыра")) {
            return new FourCheesePizza();
        } else {
            throw new IllegalArgumentException("Неизвестный тип пиццы");
        }
    }

    public static Pizza createPizzaWithDopIng(String pizzaType, String newDopIng) {
        if (pizzaType.equalsIgnoreCase("Маргарита")) {
            return new MargheritaPizza(newDopIng);
        } else if (pizzaType.equalsIgnoreCase("Пепперони")) {
            return new PepperoniPizza(newDopIng);
        } else if (pizzaType.equalsIgnoreCase("Четыре сезона")) {
            return new FourSeasonsPizza(newDopIng);
        } else if (pizzaType.equalsIgnoreCase("Цезарь")) {
            return new CaesarPizza(newDopIng);
        } else if (pizzaType.equalsIgnoreCase("Четыре сыра")) {
            return new FourCheesePizza(newDopIng);
        } else {
            throw new IllegalArgumentException("Неизвестный тип пиццы");
        }
    }


}
