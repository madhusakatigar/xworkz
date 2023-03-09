public class Returntype {
    public static void main(String[] args) {
        int intValue = getInt();
        System.out.println("getInt returned: " + intValue);
        
        double doubleValue = getDouble();
        System.out.println("getDouble returned: " + doubleValue);
        
        boolean booleanValue = getBoolean();
        System.out.println("getBoolean returned: " + booleanValue);
        
        String stringValue = getString();
        System.out.println("getString returned: " + stringValue);
        
        char charValue = getChar();
        System.out.println("getChar returned: " + charValue);
        
        byte byteValue = getByte();
        System.out.println("getByte returned: " + byteValue);
        
        short shortValue = getShort();
        System.out.println("getShort returned: " + shortValue);
        
        long longValue = getLong();
        System.out.println("getLong returned: " + longValue);
        
        float floatValue = getFloat();
        System.out.println("getFloat returned: " + floatValue);
    }
    
    public static int getInt() {
        return 42;
    }
    
    public static double getDouble() {
        return 3.14159;
    }
    
    public static boolean getBoolean() {
        return true;
    }
    
    public static String getString() {
        return "Hello, world!";
    }
    
    public static char getChar() {
        return 'A';
    }
    
    public static byte getByte() {
        return 127;
    }
    
    public static short getShort() {
        return 32767;
    }
    
    public static long getLong() {
        return 1234567890L;
    }
    
    public static float getFloat() {
        return 3.14f;
    }
}
