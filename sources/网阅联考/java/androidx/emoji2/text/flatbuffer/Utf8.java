package androidx.emoji2.text.flatbuffer;

import com.umeng.analytics.pro.C3376bw;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class Utf8 {
    private static Utf8 DEFAULT;

    public static class DecodeUtil {
        public static void handleFourBytes(byte b4, byte b5, byte b6, byte b7, char[] cArr, int i4) throws IllegalArgumentException {
            if (isNotTrailingByte(b5) || (((b4 << 28) + (b5 + 112)) >> 30) != 0 || isNotTrailingByte(b6) || isNotTrailingByte(b7)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            int iTrailingByteValue = ((b4 & 7) << 18) | (trailingByteValue(b5) << 12) | (trailingByteValue(b6) << 6) | trailingByteValue(b7);
            cArr[i4] = highSurrogate(iTrailingByteValue);
            cArr[i4 + 1] = lowSurrogate(iTrailingByteValue);
        }

        public static void handleOneByte(byte b4, char[] cArr, int i4) {
            cArr[i4] = (char) b4;
        }

        public static void handleThreeBytes(byte b4, byte b5, byte b6, char[] cArr, int i4) throws IllegalArgumentException {
            if (isNotTrailingByte(b5) || ((b4 == -32 && b5 < -96) || ((b4 == -19 && b5 >= -96) || isNotTrailingByte(b6)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i4] = (char) (((b4 & C3376bw.f1946m) << 12) | (trailingByteValue(b5) << 6) | trailingByteValue(b6));
        }

        public static void handleTwoBytes(byte b4, byte b5, char[] cArr, int i4) throws IllegalArgumentException {
            if (b4 < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (isNotTrailingByte(b5)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i4] = (char) (((b4 & 31) << 6) | trailingByteValue(b5));
        }

        private static char highSurrogate(int i4) {
            return (char) ((i4 >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        private static boolean isNotTrailingByte(byte b4) {
            return b4 > -65;
        }

        public static boolean isOneByte(byte b4) {
            return b4 >= 0;
        }

        public static boolean isThreeBytes(byte b4) {
            return b4 < -16;
        }

        public static boolean isTwoBytes(byte b4) {
            return b4 < -32;
        }

        private static char lowSurrogate(int i4) {
            return (char) ((i4 & 1023) + okio.Utf8.LOG_SURROGATE_HEADER);
        }

        private static int trailingByteValue(byte b4) {
            return b4 & okio.Utf8.REPLACEMENT_BYTE;
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i4, int i5) {
            super("Unpaired surrogate at index " + i4 + " of " + i5);
        }
    }

    public static Utf8 getDefault() {
        if (DEFAULT == null) {
            DEFAULT = new Utf8Safe();
        }
        return DEFAULT;
    }

    public static void setDefault(Utf8 utf8) {
        DEFAULT = utf8;
    }

    public abstract String decodeUtf8(ByteBuffer byteBuffer, int i4, int i5);

    public abstract void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int encodedLength(CharSequence charSequence);
}
