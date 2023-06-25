import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ToysStore {
     private List<Toys> toys;

    public ToysStore(List<Toys> toys) {
        this.toys = toys;
    }
    
    public Toys getToyForPrize() {
        DrawingToys random = new DrawingToys();
        Toys toy = random.selectOnWeight(toys);
        int countToys = toy.getCountToys();
        countToys -= 1;
            toy.setCountToys(countToys);
        return toy;
    }

    public void saveToyForDrawing() {
        Toys toy = getToyForPrize();
        String line = toy.toString();
        try(FileWriter writer = new FileWriter("Controlwork/drawing/src/drawing/PrizeToys.txt", true))
        { 
            writer.write(line);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
