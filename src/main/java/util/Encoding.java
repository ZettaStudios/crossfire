package util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Encoding {
    public static String getString(byte[] data) {
        try {
            return new BufferedReader(new InputStreamReader(new ByteArrayInputStream(data),StandardCharsets.US_ASCII)).readLine();
        } catch (IOException e) {
            return "";
        }
    }
    public static String getString(byte[] data, int start, int limit) {
        return getString(data).substring(start, (start+limit));
    }
}
