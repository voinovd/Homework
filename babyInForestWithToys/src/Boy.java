import java.util.ArrayList;
import java.util.List;

/**
 * Created by Haharin on 22.11.2017.
 */
public class Boy extends Baby {
    @Override
    protected void walk() {
        System.out.print("Boy walk");
    }

    @Override
    protected boolean isColor(Toy toy) {
        return toy.getColor().equals("Синий");
    }


}
