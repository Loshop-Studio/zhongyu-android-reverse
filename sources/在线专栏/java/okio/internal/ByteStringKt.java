package okio.internal;

import com.umeng.analytics.pro.C1892bw;
import java.util.Arrays;
import java.util.Objects;
import kotlin.collections.C2723g;
import kotlin.jvm.internal.C2769l;
import okio.Base64;
import okio.Buffer;
import okio.ByteString;
import okio.Platform;
import okio.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p082e3.C2495u;

/* loaded from: classes.dex */
public final class ByteStringKt {

    @NotNull
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0068, code lost:
    
        return -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int codePointIndexToCharIndex(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.ByteStringKt.codePointIndexToCharIndex(byte[], int):int");
    }

    @NotNull
    public static final String commonBase64(@NotNull ByteString commonBase64) {
        C2769l.m9241e(commonBase64, "$this$commonBase64");
        return Base64.encodeBase64$default(commonBase64.getData$okio(), null, 1, null);
    }

    @NotNull
    public static final String commonBase64Url(@NotNull ByteString commonBase64Url) {
        C2769l.m9241e(commonBase64Url, "$this$commonBase64Url");
        return Base64.encodeBase64(commonBase64Url.getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(@NotNull ByteString commonCompareTo, @NotNull ByteString other) {
        C2769l.m9241e(commonCompareTo, "$this$commonCompareTo");
        C2769l.m9241e(other, "other");
        int size = commonCompareTo.size();
        int size2 = other.size();
        int iMin = Math.min(size, size2);
        for (int i4 = 0; i4 < iMin; i4++) {
            int i5 = commonCompareTo.getByte(i4) & 255;
            int i6 = other.getByte(i4) & 255;
            if (i5 != i6) {
                return i5 < i6 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    @Nullable
    public static final ByteString commonDecodeBase64(@NotNull String commonDecodeBase64) {
        C2769l.m9241e(commonDecodeBase64, "$this$commonDecodeBase64");
        byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(commonDecodeBase64);
        if (bArrDecodeBase64ToArray != null) {
            return new ByteString(bArrDecodeBase64ToArray);
        }
        return null;
    }

    @NotNull
    public static final ByteString commonDecodeHex(@NotNull String commonDecodeHex) {
        C2769l.m9241e(commonDecodeHex, "$this$commonDecodeHex");
        if (!(commonDecodeHex.length() % 2 == 0)) {
            throw new IllegalArgumentException(("Unexpected hex string: " + commonDecodeHex).toString());
        }
        int length = commonDecodeHex.length() / 2;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i4 * 2;
            bArr[i4] = (byte) ((decodeHexDigit(commonDecodeHex.charAt(i5)) << 4) + decodeHexDigit(commonDecodeHex.charAt(i5 + 1)));
        }
        return new ByteString(bArr);
    }

    @NotNull
    public static final ByteString commonEncodeUtf8(@NotNull String commonEncodeUtf8) {
        C2769l.m9241e(commonEncodeUtf8, "$this$commonEncodeUtf8");
        ByteString byteString = new ByteString(Platform.asUtf8ToByteArray(commonEncodeUtf8));
        byteString.setUtf8$okio(commonEncodeUtf8);
        return byteString;
    }

    public static final boolean commonEndsWith(@NotNull ByteString commonEndsWith, @NotNull ByteString suffix) {
        C2769l.m9241e(commonEndsWith, "$this$commonEndsWith");
        C2769l.m9241e(suffix, "suffix");
        return commonEndsWith.rangeEquals(commonEndsWith.size() - suffix.size(), suffix, 0, suffix.size());
    }

    public static final boolean commonEquals(@NotNull ByteString commonEquals, @Nullable Object obj) {
        C2769l.m9241e(commonEquals, "$this$commonEquals");
        if (obj == commonEquals) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == commonEquals.getData$okio().length && byteString.rangeEquals(0, commonEquals.getData$okio(), 0, commonEquals.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(@NotNull ByteString commonGetByte, int i4) {
        C2769l.m9241e(commonGetByte, "$this$commonGetByte");
        return commonGetByte.getData$okio()[i4];
    }

    public static final int commonGetSize(@NotNull ByteString commonGetSize) {
        C2769l.m9241e(commonGetSize, "$this$commonGetSize");
        return commonGetSize.getData$okio().length;
    }

    public static final int commonHashCode(@NotNull ByteString commonHashCode) {
        C2769l.m9241e(commonHashCode, "$this$commonHashCode");
        int hashCode$okio = commonHashCode.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(commonHashCode.getData$okio());
        commonHashCode.setHashCode$okio(iHashCode);
        return iHashCode;
    }

    @NotNull
    public static final String commonHex(@NotNull ByteString commonHex) {
        C2769l.m9241e(commonHex, "$this$commonHex");
        char[] cArr = new char[commonHex.getData$okio().length * 2];
        int i4 = 0;
        for (byte b4 : commonHex.getData$okio()) {
            int i5 = i4 + 1;
            cArr[i4] = getHEX_DIGIT_CHARS()[(b4 >> 4) & 15];
            i4 = i5 + 1;
            cArr[i5] = getHEX_DIGIT_CHARS()[b4 & C1892bw.f8538m];
        }
        return new String(cArr);
    }

    public static final int commonIndexOf(@NotNull ByteString commonIndexOf, @NotNull byte[] other, int i4) {
        C2769l.m9241e(commonIndexOf, "$this$commonIndexOf");
        C2769l.m9241e(other, "other");
        int length = commonIndexOf.getData$okio().length - other.length;
        int iMax = Math.max(i4, 0);
        if (iMax > length) {
            return -1;
        }
        while (!Util.arrayRangeEquals(commonIndexOf.getData$okio(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    @NotNull
    public static final byte[] commonInternalArray(@NotNull ByteString commonInternalArray) {
        C2769l.m9241e(commonInternalArray, "$this$commonInternalArray");
        return commonInternalArray.getData$okio();
    }

    public static final int commonLastIndexOf(@NotNull ByteString commonLastIndexOf, @NotNull ByteString other, int i4) {
        C2769l.m9241e(commonLastIndexOf, "$this$commonLastIndexOf");
        C2769l.m9241e(other, "other");
        return commonLastIndexOf.lastIndexOf(other.internalArray$okio(), i4);
    }

    @NotNull
    public static final ByteString commonOf(@NotNull byte[] data) {
        C2769l.m9241e(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        C2769l.m9240d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return new ByteString(bArrCopyOf);
    }

    public static final boolean commonRangeEquals(@NotNull ByteString commonRangeEquals, int i4, @NotNull ByteString other, int i5, int i6) {
        C2769l.m9241e(commonRangeEquals, "$this$commonRangeEquals");
        C2769l.m9241e(other, "other");
        return other.rangeEquals(i5, commonRangeEquals.getData$okio(), i4, i6);
    }

    public static final boolean commonStartsWith(@NotNull ByteString commonStartsWith, @NotNull ByteString prefix) {
        C2769l.m9241e(commonStartsWith, "$this$commonStartsWith");
        C2769l.m9241e(prefix, "prefix");
        return commonStartsWith.rangeEquals(0, prefix, 0, prefix.size());
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull ByteString commonSubstring, int i4, int i5) {
        C2769l.m9241e(commonSubstring, "$this$commonSubstring");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (i5 <= commonSubstring.getData$okio().length) {
            if (i5 - i4 >= 0) {
                return (i4 == 0 && i5 == commonSubstring.getData$okio().length) ? commonSubstring : new ByteString(C2723g.m9085g(commonSubstring.getData$okio(), i4, i5));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException(("endIndex > length(" + commonSubstring.getData$okio().length + ')').toString());
    }

    @NotNull
    public static final ByteString commonToAsciiLowercase(@NotNull ByteString commonToAsciiLowercase) {
        byte b4;
        C2769l.m9241e(commonToAsciiLowercase, "$this$commonToAsciiLowercase");
        for (int i4 = 0; i4 < commonToAsciiLowercase.getData$okio().length; i4++) {
            byte b5 = commonToAsciiLowercase.getData$okio()[i4];
            byte b6 = (byte) 65;
            if (b5 >= b6 && b5 <= (b4 = (byte) 90)) {
                byte[] data$okio = commonToAsciiLowercase.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                C2769l.m9240d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i4] = (byte) (b5 + 32);
                for (int i5 = i4 + 1; i5 < bArrCopyOf.length; i5++) {
                    byte b7 = bArrCopyOf[i5];
                    if (b7 >= b6 && b7 <= b4) {
                        bArrCopyOf[i5] = (byte) (b7 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return commonToAsciiLowercase;
    }

    @NotNull
    public static final ByteString commonToAsciiUppercase(@NotNull ByteString commonToAsciiUppercase) {
        byte b4;
        C2769l.m9241e(commonToAsciiUppercase, "$this$commonToAsciiUppercase");
        for (int i4 = 0; i4 < commonToAsciiUppercase.getData$okio().length; i4++) {
            byte b5 = commonToAsciiUppercase.getData$okio()[i4];
            byte b6 = (byte) 97;
            if (b5 >= b6 && b5 <= (b4 = (byte) 122)) {
                byte[] data$okio = commonToAsciiUppercase.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                C2769l.m9240d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i4] = (byte) (b5 - 32);
                for (int i5 = i4 + 1; i5 < bArrCopyOf.length; i5++) {
                    byte b7 = bArrCopyOf[i5];
                    if (b7 >= b6 && b7 <= b4) {
                        bArrCopyOf[i5] = (byte) (b7 - 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return commonToAsciiUppercase;
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull ByteString commonToByteArray) {
        C2769l.m9241e(commonToByteArray, "$this$commonToByteArray");
        byte[] data$okio = commonToByteArray.getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        C2769l.m9240d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return bArrCopyOf;
    }

    @NotNull
    public static final ByteString commonToByteString(@NotNull byte[] commonToByteString, int i4, int i5) {
        C2769l.m9241e(commonToByteString, "$this$commonToByteString");
        Util.checkOffsetAndCount(commonToByteString.length, i4, i5);
        return new ByteString(C2723g.m9085g(commonToByteString, i4, i5 + i4));
    }

    @NotNull
    public static final String commonToString(@NotNull ByteString byteString) {
        ByteString commonToString = byteString;
        C2769l.m9241e(commonToString, "$this$commonToString");
        if (byteString.getData$okio().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData$okio(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = byteString.utf8();
            Objects.requireNonNull(strUtf8, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
            C2769l.m9240d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String strM8353y = C2495u.m8353y(C2495u.m8353y(C2495u.m8353y(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iCodePointIndexToCharIndex >= strUtf8.length()) {
                return "[text=" + strM8353y + ']';
            }
            return "[size=" + byteString.getData$okio().length + " text=" + strM8353y + "…]";
        }
        if (byteString.getData$okio().length <= 64) {
            return "[hex=" + byteString.hex() + ']';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[size=");
        sb.append(byteString.getData$okio().length);
        sb.append(" hex=");
        if (64 <= byteString.getData$okio().length) {
            if (64 != byteString.getData$okio().length) {
                commonToString = new ByteString(C2723g.m9085g(byteString.getData$okio(), 0, 64));
            }
            sb.append(commonToString.hex());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + byteString.getData$okio().length + ')').toString());
    }

    @NotNull
    public static final String commonUtf8(@NotNull ByteString commonUtf8) {
        C2769l.m9241e(commonUtf8, "$this$commonUtf8");
        String utf8$okio = commonUtf8.getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = Platform.toUtf8String(commonUtf8.internalArray$okio());
        commonUtf8.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final void commonWrite(@NotNull ByteString commonWrite, @NotNull Buffer buffer, int i4, int i5) {
        C2769l.m9241e(commonWrite, "$this$commonWrite");
        C2769l.m9241e(buffer, "buffer");
        buffer.write(commonWrite.getData$okio(), i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int decodeHexDigit(char c4) {
        if ('0' <= c4 && '9' >= c4) {
            return c4 - '0';
        }
        char c5 = 'a';
        if ('a' > c4 || 'f' < c4) {
            c5 = 'A';
            if ('A' > c4 || 'F' < c4) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c4);
            }
        }
        return (c4 - c5) + 10;
    }

    @NotNull
    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static final boolean commonEndsWith(@NotNull ByteString commonEndsWith, @NotNull byte[] suffix) {
        C2769l.m9241e(commonEndsWith, "$this$commonEndsWith");
        C2769l.m9241e(suffix, "suffix");
        return commonEndsWith.rangeEquals(commonEndsWith.size() - suffix.length, suffix, 0, suffix.length);
    }

    public static final int commonLastIndexOf(@NotNull ByteString commonLastIndexOf, @NotNull byte[] other, int i4) {
        C2769l.m9241e(commonLastIndexOf, "$this$commonLastIndexOf");
        C2769l.m9241e(other, "other");
        for (int iMin = Math.min(i4, commonLastIndexOf.getData$okio().length - other.length); iMin >= 0; iMin--) {
            if (Util.arrayRangeEquals(commonLastIndexOf.getData$okio(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public static final boolean commonRangeEquals(@NotNull ByteString commonRangeEquals, int i4, @NotNull byte[] other, int i5, int i6) {
        C2769l.m9241e(commonRangeEquals, "$this$commonRangeEquals");
        C2769l.m9241e(other, "other");
        return i4 >= 0 && i4 <= commonRangeEquals.getData$okio().length - i6 && i5 >= 0 && i5 <= other.length - i6 && Util.arrayRangeEquals(commonRangeEquals.getData$okio(), i4, other, i5, i6);
    }

    public static final boolean commonStartsWith(@NotNull ByteString commonStartsWith, @NotNull byte[] prefix) {
        C2769l.m9241e(commonStartsWith, "$this$commonStartsWith");
        C2769l.m9241e(prefix, "prefix");
        return commonStartsWith.rangeEquals(0, prefix, 0, prefix.length);
    }
}
