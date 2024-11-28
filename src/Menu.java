import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Menu {
    private List<String> items;

    public Menu(List<String> items) {
        this.items = items;
    }

    public Iterator<String> getIterator() {
        return items.iterator();
    }
}

class MenuDemo {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Маргарита", "Пепперони", "Четыре сыра");
        Menu menu = new Menu(items);
        Iterator<String> iterator = menu.getIterator();

        while (iterator.hasNext()) {
            System.out.println("Пункт меню: " + iterator.next());
        }
    }
}
