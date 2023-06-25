import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {

        Toys toy1 = new Toys(1, "Кукла", 6, 20);
        Toys toy2 = new Toys(2, "Машинка", 9,40);
        Toys toy3 = new Toys(3, "Мягкая игрушка", 3, 30);
        Toys toy4 = new Toys(4, "Конструктор", 7, 20);
        Toys toy5 = new Toys(5, "Игра настольная", 5, 30);
        Toys toy6 = new Toys(6, "Робот", 10, 30);

        List<Toys> toys = new ArrayList<Toys>();
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);
        toys.add(toy5);
        toys.add(toy6);

        ToysStore toyStore = new ToysStore(toys);
        toyStore.saveToyForDrawing();

        for(Toys toy : toys) {
            System.out.println(toy);
        }
         

    }
}
