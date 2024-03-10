class Romeo {
    String gender;
    int age;
}

class Juliet {
    String gender;
    int age;
    @Override
    public String toString() {
        return "Juliet [gender=" + gender + ", age=" + age + "]";
    }

    /* public String toString() {
        return "I am a true lover";
    } */
    
}

class Jism {
    String gender;
    int age;
}

class Soul 
{
    String gender;
    int age;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
        result = prime * result + age;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Soul other = (Soul) obj;
        if (gender == null) {
            if (other.gender != null)
                return false;
        } else if (!gender.equals(other.gender))
            return false;
        if (age != other.age)
            return false;
        return true;
    }

    /* public boolean equals(Soul other) 
    {
        if (this.gender.equals(other.gender) && (this.age == other.age))
            return true;
        else
            return false;
    } */
    
}

public class objectToString {
    public static void main(String[] args) {
        Romeo lover1 = new Romeo();
        lover1.gender = "Male";
        lover1.age = 30;

        System.out.println(lover1);

        Juliet lover2 = new Juliet();
        lover2.gender = "Female";
        lover2.age = 22;

        System.out.println(lover2);

        System.out.println("-----------------------------");

        Jism lover1Jism = new Jism();
        lover1Jism.gender = "Neutral";
        lover1Jism.age = 999;

        Jism lover2Jism = new Jism();
        lover2Jism.gender = "Neutral";
        lover2Jism.age = 999;

        boolean result1 = lover1Jism == lover2Jism;
        System.out.println(result1);

        boolean result2 = lover1Jism.equals(lover2Jism);
        System.out.println(result2);
        
        System.out.println("-----------------------------");

        Soul lover1Soul = new Soul();
        lover1Soul.gender = "Neutral";
        lover1Soul.age = 999;

        Soul lover2Soul = new Soul();
        lover2Soul.gender = "Neutral";
        lover2Soul.age = 999;

        boolean result3 = lover1Soul == lover2Soul;
        System.out.println(result3);

        boolean result4 = lover1Soul.equals(lover2Soul);
        System.out.println(result4);
    }
}
