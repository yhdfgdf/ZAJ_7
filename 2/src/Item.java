public class Item {
    int id;
    String name;

    public Item(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void show(){
        System.out.println(name);
    }

}
