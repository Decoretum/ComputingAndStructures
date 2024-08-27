public class Setup{
    public static void main (String args[]){
        /*
         * 
         * java.version is a system property that exists in every JVM. 
         * There are two possible formats for it:
            Java 8 or lower: 1.6.0_23, 1.7.0, 1.7.0_80, 1.8.0_211
            Java 9 or higher: 9.0.1, 11.0.4, 12, 12.0.1
         * 
         */
        String javaVersion = System.getProperty("java.version");
        System.out.println(javaVersion);
        System.out.println("Accessed by Gael someplace else hehe!");

    }
}