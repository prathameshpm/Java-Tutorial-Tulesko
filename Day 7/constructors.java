class Human {
    private int age;
    private String name;
    
    public Human() {
        System.out.println("In Constructor");
        age = 22;
        name = "Prathamesh";
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

public class constructors {
    public static void main(String[] args) {
        Human obj1 = new Human();
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        obj1.setName("Prathamesh Mahamulkar");
        obj1.setAge(30);
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}
