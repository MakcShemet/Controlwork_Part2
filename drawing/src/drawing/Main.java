import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {

        Toys toy1 = new Toys(0, "Кукла", 6, 20);
        Toys toy2 = new Toys(1, "Машинка", 9,60);
        Toys toy3 = new Toys(2, "Мягкая игрушка", 3, 30);
        Toys toy4 = new Toys(3, "Конструктор", 7, 20);

        List<Toys> toys = new ArrayList<Toys>();
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);

        ToysStore toyStore = new ToysStore(toys);
        toyStore.saveToyForDrawing();

        System.out.println(toys); 

    }
}
