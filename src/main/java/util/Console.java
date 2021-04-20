package util;

public class Console {
    public static void Log(String information)
    {
        System.out.println(information);
    }

    public static void Log(String information, Exception e)
    {
        System.out.printf("%s | %s%n", information, e.getLocalizedMessage());
    }

    public static void PrintBytes(byte[] array, String name) {
        for (int k = 0; k < array.length; k++) {
            System.out.println(name + "[" + k + "] = " + "0x" +
                    UnicodeFormatter.byteToHex(array[k]));
        }
    }
}
