import java.util.*;

public class Main {

    public static void main(String[] args) {
	Girl girl = new Girl();
	Boy boy = new Boy();
	girl.walkInForest();
	boy.walkInForest();
	List<Toy> toys = new ArrayList<Toy>();
	toys.add(new Toy("Лошадка", "Синий"));
	toys.add(new Toy("Слоник", "Жёлтый"));
	toys.add(new Toy("Совочек", "Синий"));
	toys.add(new Toy("Ведёрко", "Синий"));
	toys.add(new Toy("Панама", "Жёлтый"));
	System.out.println(Arrays.toString(boy.getToMe().toArray()));
	System.out.println(Arrays.toString(girl.getToMe().toArray()));
    }
}
