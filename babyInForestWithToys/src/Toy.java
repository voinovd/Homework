import java.util.ArrayList;
import java.util.List;

/**
 * Created by Haharin on 22.11.2017.
 */
public class Toy {
    private String name;
    private String color;
    private static List<Toy> toyList = new ArrayList<Toy>();

    public static List<Toy> getToyList() {
        return toyList;
    }

    public String getColor() {
        return color;
    }

    public Toy(String name, String color) {
        this.name = name;
        this.color = color;
        toyList.add(this);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
