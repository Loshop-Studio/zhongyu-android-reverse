package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class Utf8 {
    private static Utf8 DEFAULT;

    public static class DecodeUtil {
        public static void handleFourBytes(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i6) {
            if (isNotTrailingByte(b8) || (((b7 << 28) + (b8 + 112)) >> 30) != 0 || isNotTrailingByte(b9) || isNotTrailingByte(b10)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            int iTrailingByteValue = ((b7 & 7) << 18) | (trailingByteValue(b8) << 12) | (trailingByteValue(b9) << 6) | trailingByteValue(b10);
            cArr[i6] = highSurrogate(iTrailingByteValue);
            cArr[i6 + 1] = lowSurrogate(iTrailingByteValue);
        }

        public static void handleOneByte(byte b7, char[] cArr, int i6) {
            cArr[i6] = (char) b7;
        }

        public static void handleThreeBytes(byte b7, byte b8, byte b9, char[] cArr, int i6) {
            if (isNotTrailingByte(b8) || ((b7 == -32 && b8 < -96) || ((b7 == -19 && b8 >= -96) || isNotTrailingByte(b9)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i6] = (char) (((b7 & 15) << 12) | (trailingByteValue(b8) << 6) | trailingByteValue(b9));
        }

        public static void handleTwoBytes(byte b7, byte b8, char[] cArr, int i6) {
            if (b7 < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (isNotTrailingByte(b8)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i6] = (char) (((b7 & 31) << 6) | trailingByteValue(b8));
        }

        private static char highSurrogate(int i6) {
            return (char) ((i6 >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        private static boolean isNotTrailingByte(byte b7) {
            return b7 > -65;
        }

        public static boolean isOneByte(byte b7) {
            return b7 >= 0;
        }

        public static boolean isThreeBytes(byte b7) {
            return b7 < -16;
        }

        public static boolean isTwoBytes(byte b7) {
            return b7 < -32;
        }

        private static char lowSurrogate(int i6) {
            return (char) ((i6 & 1023) + okio.Utf8.LOG_SURROGATE_HEADER);
        }

        private static int trailingByteValue(byte b7) {
            return b7 & okio.Utf8.REPLACEMENT_BYTE;
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i6, int i7) {
            super("Unpaired surrogate at index " + i6 + " of " + i7);
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

    public abstract String decodeUtf8(ByteBuffer byteBuffer, int i6, int i7);

    public abstract void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int encodedLength(CharSequence charSequence);
}
