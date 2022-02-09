package lab02;
/* Josh Parker
    Lab 02
    1-19-22
 */
public class Lab02 {
    public static void main(String[] args) {
        System.out.println("Lab02 start:");
        byte byte4 =4;      // one byte of storage used
        short short4 =4;    // two bytes of storage used
        int int4 =4;        // four bytes of storage used
        long long4 =4;      // eight bytes of storage used
        float float4 =4;    // four bytes of storage used
        double double4 =4;  // eight bytes of storage used

        System.out.println("byte: " + byte4);
        System.out.println("short: " + short4);
        System.out.println("int: " + int4);
        System.out.println("long: " + long4);
        System.out.println("float: " + float4);
        System.out.println("double: " + double4);

        String a = "Hello";
        String s = " ";
        String b = "World";
        String e = "!";
        String message = a + s + b + e; System.out.println(message);

        System.out.println("Lab02 end - Bye.");
    }
}
