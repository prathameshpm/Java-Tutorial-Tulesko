class Human {
    private int age;
    private String name;
    
    public Human() {
        System.out.println("In Default Constructor");
        age = 22;
        name = "Prathamesh";
    }

    public Human(String name) {
        this.age = 24;
        this.name = name;
    }

    public Human(int age, String name) {
        System.out.println("In Parameterized Constructor");
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class parameterizedConstructors {
    public static void main(String[] args) {
        Human obj1 = new Human();
        Human obj2 = new Human(25, "Prathamesh M");
        Human obj3 = new Human("PPM");
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        obj1.setName("Prathamesh Mahamulkar");
        obj1.setAge(30);
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());
        System.out.println(obj3.getName() + " : " + obj3.getAge());
    }
}
