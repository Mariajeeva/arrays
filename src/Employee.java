//illustrating inheritance in java
public class Employee {
    private String name;
    private int id;

    public void display() {
        System.out.println("name is " + name);
        System.out.println("id is " + id);
    }

    public void getnameandid(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

