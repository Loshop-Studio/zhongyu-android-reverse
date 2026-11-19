package androidx.emoji2.text.flatbuffer;

import androidx.collection.AbstractC0584a;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class Utf8 {
    private static Utf8 DEFAULT;

    public static class DecodeUtil {
        public static void handleFourBytes(byte b6, byte b9, byte b10, byte b11, char[] cArr, int i) throws IllegalArgumentException {
            if (!isNotTrailingByte(b9)) {
                if ((((b9 + 112) + (b6 << 28)) >> 30) == 0 && !isNotTrailingByte(b10) && !isNotTrailingByte(b11)) {
                    int iTrailingByteValue = ((b6 & 7) << 18) | (trailingByteValue(b9) << 12) | (trailingByteValue(b10) << 6) | trailingByteValue(b11);
                    cArr[i] = highSurrogate(iTrailingByteValue);
                    cArr[i + 1] = lowSurrogate(iTrailingByteValue);
                    return;
                }
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        public static void handleOneByte(byte b6, char[] cArr, int i) {
            cArr[i] = (char) b6;
        }

        public static void handleThreeBytes(byte b6, byte b9, byte b10, char[] cArr, int i) throws IllegalArgumentException {
            if (isNotTrailingByte(b9) || ((b6 == -32 && b9 < -96) || ((b6 == -19 && b9 >= -96) || isNotTrailingByte(b10)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i] = (char) (((b6 & 15) << 12) | (trailingByteValue(b9) << 6) | trailingByteValue(b10));
        }

        public static void handleTwoBytes(byte b6, byte b9, char[] cArr, int i) throws IllegalArgumentException {
            if (b6 < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (isNotTrailingByte(b9)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i] = (char) (((b6 & 31) << 6) | trailingByteValue(b9));
        }

        private static char highSurrogate(int i) {
            return (char) ((i >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        private static boolean isNotTrailingByte(byte b6) {
            return b6 > -65;
        }

        public static boolean isOneByte(byte b6) {
            return b6 >= 0;
        }

        public static boolean isThreeBytes(byte b6) {
            return b6 < -16;
        }

        public static boolean isTwoBytes(byte b6) {
            return b6 < -32;
        }

        private static char lowSurrogate(int i) {
            return (char) ((i & 1023) + okio.Utf8.LOG_SURROGATE_HEADER);
        }

        private static int trailingByteValue(byte b6) {
            return b6 & okio.Utf8.REPLACEMENT_BYTE;
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i8) {
            super(AbstractC0584a.m912m(i, i8, "Unpaired surrogate at index ", " of "));
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

    public abstract String decodeUtf8(ByteBuffer byteBuffer, int i, int i8);

    public abstract void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int encodedLength(CharSequence charSequence);
}
