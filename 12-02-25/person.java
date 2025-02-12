public class person { // 12-02-25
    private String name;
    private int age;

    public person() {
        name = "sami";
        age = 20;
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] arge) {
        person p1 = new person();
        p1.name = "opu";
        p1.age = 22;
        System.out.println(p1.age);
        System.out.println(p1.name);
        person p2 = new person();
        System.out.println(p2.name);
        System.out.println(p2.age);
        person p3 = new person("rafi", 22);
        System.out.println(p3.name + " " + p3.age);

    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getage() {
        return this.age;
    }

    public void setage(int age) {
        this.age = age;
    }
}