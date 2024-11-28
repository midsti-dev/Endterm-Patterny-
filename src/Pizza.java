abstract class Pizza {
    abstract void prepare();
}

class MargheritaPizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("������������� ����� ���������");
    }
}

class PepperoniPizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("������������� ����� ���������");
    }
}

class PizzaFactory {
    public static Pizza createPizza(String pizzaType) {
        if (pizzaType.equalsIgnoreCase("���������")) {
            return new MargheritaPizza();
        } else if (pizzaType.equalsIgnoreCase("���������")) {
            return new PepperoniPizza();
        } else {
            throw new IllegalArgumentException("����������� ��� �����");
        }
    }
}
