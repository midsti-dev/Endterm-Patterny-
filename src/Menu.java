import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Menu {
    private List<String> pizzas;

    public Menu(List<String> newItems) {
        this.pizzas = newItems;
    }

    public Iterator<String> getIterator() {
        return pizzas.iterator();
    }
}




interface MenuIterator {
    

}
