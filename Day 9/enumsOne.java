enum Status
{
    Running, Failed, Pending, Success;
}

public class enumsOne 
{
    public static void main(String[] args) 
    {
        Status stat = Status.Running;
        System.out.println(stat);
        stat = Status.Pending;
        System.out.println(stat);
        // stat = Status.NoIdea;

        System.out.println(stat.ordinal());

        Status statsAll[] = Status.values();
        System.out.println(statsAll[0]);
        for(Status stats : statsAll)
        {
            System.out.println(stats.ordinal() + " : " + stats);
        }

        switch (stat) 
        {
            case Running:
                System.out.println("All Good");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            default:
                System.out.println("Success, Great!!!");
                break;
        }
    }
}
