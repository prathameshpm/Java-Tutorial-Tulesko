class Human {
    private int age = 22;
    private String name = "Prathamesh";

    public int getAge() {
        return age;
    }

    public void setAge(int x) {
        age = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String x) {
        name = x;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Human obj1 = new Human();
        // obj1.age = 22;
        // obj1.name = "Prathamesh";

        // System.out.println(obj1.name);
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        obj1.setAge(30);
        obj1.setName("Prathamesh Mahamulkar");
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}
