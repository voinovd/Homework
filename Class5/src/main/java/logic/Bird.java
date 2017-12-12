package logic;

public class Bird implements Flyable {
    @Override
    public void canFly() {
        System.out.println("Bird can fly. Really?");
    }
    void eatWorms(){
    }
}
