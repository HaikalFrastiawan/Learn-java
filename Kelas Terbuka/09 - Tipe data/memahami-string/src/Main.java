
public class Main {
    public static void main(String[] args) {
            // ====================================================================
        // // integer (satuan) - Demonstrating the 'int' primitive type (32-bit)
        // ====================================================================

        int i = 10;

        System.out.println("=====INTEGER=====");
        // Print the value of i + 1. The original image shows a calculation here.
        System.out.println("Nilai integer i = " + (i + 1));
        // Prints the maximum value for a 32-bit signed integer.
        System.out.println("Nilai max = " + Integer.MAX_VALUE);
        // Prints the minimum value for a 32-bit signed integer.
        System.out.println("Nilai min = " + Integer.MIN_VALUE);
        // Prints the size in bytes (4 bytes for int).
        System.out.println("Besar integer = " + Integer.BYTES + " bytes");
        // Prints the size in bits (32 bits for int).
        System.out.println("Besar integer = " + Integer.SIZE + " bit");


        System.out.println(); // Add a blank line for separation

        // ====================================================================
        // // byte (satuan) - Demonstrating the 'byte' primitive type (8-bit)
        // ====================================================================

        byte b = 10;

        System.out.println("=====BYTE=====");
        // Print the stored value of b.
        System.out.println("nilai byte b = " + b);
        // Prints the maximum value for an 8-bit signed byte (127).
        System.out.println("Nilai max = " + Byte.MAX_VALUE);
        // Prints the minimum value for an 8-bit signed byte (-128).
        System.out.println("Nilai min = " + Byte.MIN_VALUE);
        // Prints the size in bytes (1 byte for byte).
        System.out.println("Besar byte = " + Byte.BYTES + " bytes");
        // Prints the size in bits (8 bits for byte).
        System.out.println("Besar byte = " + Byte.SIZE + " bit");

        short s = 10;

        System.out.println("=====SHORT=====");
        // Print the stored value of s.
        System.out.println("nilai short s = " + s);
        // Prints the maximum value for a 16-bit signed short.
        System.out.println("Nilai max = " + Short.MAX_VALUE);
        // Prints the minimum value for a 16-bit signed short.
        System.out.println("Nilai min = " + Short.MIN_VALUE);
        // Prints the size in bytes (2 bytes for short).
        System.out.println("Besar short = " + Short.BYTES + " bytes");
        // Prints the size in bits (16 bits for short).
        System.out.println("Besar short = " + Short.SIZE + " bit");


        System.out.println(); // Add a blank line for separation

        // ====================================================================
        // // long (satuan) - Demonstrating the 'long' primitive type (64-bit)
        // ====================================================================

        long l = 10L; // 'L' suffix denotes a long literal

        System.out.println("=====LONG=====");
        // Print the stored value of l.
        System.out.println("nilai long l = " + l);
        // Prints the maximum value for a 64-bit signed long.
        System.out.println("Nilai max = " + Long.MAX_VALUE);
        // Prints the minimum value for a 64-bit signed long.
        System.out.println("Nilai min = " + Long.MIN_VALUE);
        // Prints the size in bytes (8 bytes for long).
        System.out.println("Besar long = " + Long.BYTES + " bytes");
        // Prints the size in bits (64 bits for long).
        System.out.println("Besar long = " + Long.SIZE + " bit");


        System.out.println(); // Add a blank line for separation

        // ====================================================================
        // // double (koma, bilangan real) - Demonstrating 'double' (64-bit floating point)
        // ====================================================================

        double d = -10.5d; // 'd' suffix is optional but good practice

        System.out.println("=====DOUBLE=====");
        // Print the stored value of d.
        System.out.println("nilai double d = " + d);
        // Prints the maximum value for a double.
        System.out.println("Nilai max = " + Double.MAX_VALUE);
        // Prints the minimum value for a double.
        System.out.println("Nilai min = " + Double.MIN_VALUE);
        // Prints the size in bytes (8 bytes for double).
        System.out.println("Besar double = " + Double.BYTES + " bytes");
        // Prints the size in bits (64 bits for double).
        System.out.println("Besar double = " + Double.SIZE + " bit");


        System.out.println(); // Add a blank line for separation

        // ====================================================================
        // // float (koma, bilangan real) - Demonstrating 'float' (32-bit floating point)
        // ====================================================================

        float f = -10.5f; // 'f' suffix is MANDATORY for float literals

        System.out.println("=====FLOAT=====");
        // Print the stored value of f.
        System.out.println("nilai float f = " + f);
        // Prints the maximum value for a float.
        System.out.println("Nilai max = " + Float.MAX_VALUE);
        // Prints the minimum value for a float.
        System.out.println("Nilai min = " + Float.MIN_VALUE);
        // Prints the size in bytes (4 bytes for float).
        System.out.println("Besar float = " + Float.BYTES + " bytes");
        // Prints the size in bits (32 bits for float).
        System.out.println("Besar float = " + Float.SIZE + " bit");
 
        

    }
}