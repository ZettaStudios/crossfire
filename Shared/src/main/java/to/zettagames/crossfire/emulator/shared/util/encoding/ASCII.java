package to.zettagames.crossfire.emulator.shared.util.encoding;

import lombok.AllArgsConstructor;

import java.util.Comparator;

@AllArgsConstructor
public class ASCII implements Comparator<String> {

    public static final ASCII insensitiveASCIIComparator = new ASCII(true);
    public static final ASCII identityASCIIComparator = new ASCII(false);

    public boolean insensitive;

    public static String String(final byte[] bytes) {
        if (bytes == null) return null;

        final char[] c = new char[bytes.length];
        for (int i = bytes.length - 1; i >= 0; i--)
            c[i] = (char) bytes[i];

        return new String(c);
    }

    public static String String(final byte[] bytes, final int offset, final int length) {
        int l = Math.min(length, bytes.length - offset);

        final char[] c = new char[l];
        for (int i = 0; i < l; ++i) {
            if (bytes[i + offset] < 0) throw new IllegalArgumentException();
            c[i] = (char) bytes[i + offset];
        }

        return new String(c);
    }

    public static byte[] getBytes(final String s) {
        assert s != null;
        //assert s.length() < 3 || s.charAt(2) != '@';
        int count = s.length();

        final byte[] b = new byte[count];
        for (int i = 0; i < count; i++)
            b[i] = (byte) s.charAt(i);

        return b;
    }

    public static byte[] getBytes(final String s, final int beginIndex, final int endIndex) {
        assert s != null;
        //assert s.length() < 3 || s.charAt(2) != '@';
        int count = endIndex - beginIndex;

        final byte[] b = new byte[count];
        for (int i = 0; i < count; i++)
            b[i] = (byte) s.charAt(i + beginIndex);

        return b;
    }

    @Override
    public Object clone() {
        return this; // because we do not have any class variables that changes
    }

    @Override
    public int compare(String s0, String s1) {
        if (s0 == null && s1 == null) return 0;
        if (s0 == null) return -1;
        if (s1 == null) return 1;

        int i = 0;
        int l0 = s0.length(), l1 = s1.length();
        int lm = Math.min(l0, l1);
        char c0, c1;

        while (i < lm) {
            c0 = s0.charAt(i);
            c1 = s1.charAt(i);
            if (this.insensitive && c0 >= 'A' && c0 <= 'Z') c0 = (char) ((byte) c0 + 32);
            if (this.insensitive && c1 >= 'A' && c1 <= 'Z') c1 = (char) ((byte) c1 + 32);
            if (c0 > c1) return 1;
            if (c1 > c0) return -1;
            i++;
        }

        return Integer.compare(l0, l1);
    }

    public boolean equals(String s0, String s1) {
        if (s0 == null && s1 == null) return true;
        if (s0 == null) return false;
        if (s1 == null) return false;

        int i = 0;
        int l0 = s0.length(), l1 = s1.length();
        int lm = Math.min(l0, l1);
        char c0, c1;

        while (i < lm) {
            c0 = s0.charAt(i);
            c1 = s1.charAt(i);
            if (this.insensitive && c0 >= 'A' && c0 <= 'Z') c0 = (char) ((byte) c0 + 32);
            if (this.insensitive && c1 >= 'A' && c1 <= 'Z') c1 = (char) ((byte) c1 + 32);
            if (c0 != c1) return false;
            i++;
        }

        return l0 == l1;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj == this);
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this);
    }

}
