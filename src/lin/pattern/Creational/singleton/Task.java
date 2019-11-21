package lin.pattern.Creational.singleton;

public class Task {
    private static Task tm = null;
    public static Task getInstance()
    {
        if (tm == null)
        {
            tm = new Task();
        }
        return tm;
    }
}
