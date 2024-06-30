import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(1,"Biologia"));
        items.add(new Item(2,"Chemia"));
        items.add(new Item(3,"Fizyka"));
        items.add(new Item(4,"WF"));
        items.add(new Item(5,"Matematyka"));
        items.add(new Item(6,"Historia"));
        items.add(new Item(7,"Sztuka"));
        items.add(new Item(8,"Filozofia"));
        items.add(new Item(9,"Analiza matematyczna"));
        items.add(new Item(10,"Bazy danych"));

        HashMap<Integer, String> mapa = new HashMap<>();

        for(Item item: items.subList(0,5)){
            mapa.put(item.id, item.name);
        }

        for(Map.Entry<Integer, String> item : mapa.entrySet()){
            System.out.println(item.getKey() + " " + item.getValue());
        }

    }
}