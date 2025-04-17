package NivelIntermedario.Desafio6;

public class Ninja {

    String name;
    int age;
    String village;

    public Ninja() {
    }

    public Ninja(String name, int age, String village) {
        this.name = name;
        this.age = age;
        this.village = village;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getVillage() {
        return village;
    }

    @Override
    public String toString() {
        return "Nome do Ninja: " + name + " - Idade do Ninja: " + age + " - Aldeia do ninja: " + village;
    }
}

