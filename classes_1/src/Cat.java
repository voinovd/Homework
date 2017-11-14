public class Cat {

    private String name;
    private int age;

    void Cat( String name ) {
        this.name=name;
    }

    void Cat (String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eatFish() {

    }

    protected void eat() {

    }

}