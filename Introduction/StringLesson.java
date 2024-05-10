package Introduction;

public class StringLesson {
    public static void main (String args[]){
        //StringBuilder and StringBuffer
        //Implements the CharSequence interface for String-related operations

        char ch2 = '\'';
        char esc = '\n';
        String name = "Gael";
        System.out.println(esc);

        /* Remember, when you create a string literal, 
        the JVM (Java virtual machine) checks for the
        presence of that string in something called the “string constant pool.” If that string exists in
        the pool, then Java simply returns a reference to the pooled instance; otherwise, a new string
        instance is created (and it’s also placed in the pool). (p. 30)
        */

        //String.equalsIgnoreCase(String) (p.31)

        //Substring
        String sub = "ae";
        System.out.println(name.indexOf(sub)); // >= 0 if substring, else

        String first = name.substring(0, 1);
        String rest = name.substring(1);

        System.out.println("First: " + first + " Rest: " + rest);

    }
}
