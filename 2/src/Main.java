import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(1,"Biologia"));
        items.add(new Item(2,"Chemia"));
        items.add(new Item(3,"Fizyka"));
        items.add(new Item(4,"WF"));
        items.add(new Item(5,"Matematyka"));
        items.add(new Item(6,"Historia"));

        for(int i = 0; i < items.size(); i ++){
            items.get(i).show();
        }

        HashMap<Integer, String> mapa = new HashMap<>();

        for(Item item : items){
            mapa.put(item.id, item.name);
        }

        for(Map.Entry<Integer, String> item : mapa.entrySet()){
            System.out.println(item.getKey() + " " + item.getValue()e);
        }

    }
}
