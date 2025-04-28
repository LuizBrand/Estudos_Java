package NivelAvancado;

public class Ninja {
    private String name;
    private String village;
    private int age;

    public Ninja(String name, String village, int age) {
        this.name = name;
        this.village = village;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "name='" + name + '\'' +
                ", village='" + village + '\'' +
                ", age=" + age +
                '}';
    }
}
