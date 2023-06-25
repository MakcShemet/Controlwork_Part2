import java.util.List;

public class DrawingToys {
     public Toys selectOnWeight(List<Toys> toys) {
        int completeWeight = 0;
        for (Toys toy : toys)
            completeWeight += toy.getWeight();
        double r = Math.random() * completeWeight;
        System.out.println(r);
        int countWeight = 0;
        for (Toys toy : toys) {
            countWeight += toy.getWeight();
            if (countWeight >= r)
                return toy;
        }
        throw new RuntimeException("Should never be shown.");
    }
}
