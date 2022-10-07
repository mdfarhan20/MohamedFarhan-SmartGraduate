class base {
    String method() {
        return "WOW";
    }
}

class derived {
    public void used() {
        base z=new base();
        System.out.println("base says, "+z.method());
    }
}

public class CompileThis {
    public static void main(String[] args) {
        derived obj = new derived();
        obj.used();
    }
}