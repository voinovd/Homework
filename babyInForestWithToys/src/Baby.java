import java.util.ArrayList;
import java.util.List;

/**
 * Created by Haharin on 22.11.2017.
 */
public abstract class Baby {
    private String name;
    private int age;

    protected abstract void walk();
    public void walkInForest(){
        walk();
        System.out.println(" in forest");
    }
    public List<Toy> getToMe(){
        List<Toy> toyList = new ArrayList<Toy>();
        for (Toy toy : Toy.getToyList()) {
            if(isColor(toy)){
                toyList.add(toy);
            }
        }
        return toyList;
    }

    protected abstract boolean isColor(Toy toy);

    ;
}
