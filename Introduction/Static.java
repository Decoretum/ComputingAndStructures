package Introduction;

public class Static {
    static int x = 2;
    static String rule = "";
    static void show()
    {
        System.out.println("HI");
    }

    /* 
    A static block (also called a static initialization block) is a set of instructions that is invoked
    once when a Java class is loaded into memory. A static block is used for initialization before
    object construction
    */

    static 
    {
        rule = "No fucking fighting";
    }

    public static void main (String args[])
    {
        System.out.println(rule);
    }
}
