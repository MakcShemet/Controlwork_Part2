import java.util.List;

public class Toys {

    private int id;
    private String name;
    private int countToys;
    private int weight;
    private List<Toys> prizeToys;

    public Toys(int id, String name, int countToys, int weight) {
        this.id = id;
        this.name = name;
        this.countToys = countToys;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCountToys() {
        return countToys;
    }

    public void setCountToys(int countToys) {
        this.countToys = countToys;
    }   

    public int getWeight() {
        return weight;
    }

    public List<Toys> getPrizeToys() {
        return prizeToys;
    } 
 
    @Override
    public String toString() {
        return "ID: " + id + "; " +
                "Наименование: " + name + "; " +
                "Количество: " + countToys;
    }
}