package okio.internal;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import okio.Base64;
import okio.Buffer;
import okio.SegmentedByteString;
import okio._JvmPlatformKt;
import p113g8.AbstractC8687z;
import p134i7.AbstractC8797p;

/* renamed from: okio.internal.-ByteString, reason: invalid class name */
/* loaded from: classes5.dex */
public final class ByteString {
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x010f, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x01af, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0065, code lost:
    
        r6 = p123h7.C8736p.f16368a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00a0, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int codePointIndexToCharIndex(byte[] r18, int r19) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.ByteString.codePointIndexToCharIndex(byte[], int):int");
    }

    public static final String commonBase64(okio.ByteString byteString) {
        AbstractC9133u.m16133g(byteString, "<this>");
        return Base64.encodeBase64$default(byteString.getData$okio(), null, 1, null);
    }

    public static final String commonBase64Url(okio.ByteString byteString) {
        AbstractC9133u.m16133g(byteString, "<this>");
        return Base64.encodeBase64(byteString.getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(okio.ByteString byteString, okio.ByteString other) {
        AbstractC9133u.m16133g(byteString, "<this>");
        AbstractC9133u.m16133g(other, "other");
        int size = byteString.size();
        int size2 = other.size();
        int iMin = Math.min(size, size2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = byteString.getByte(i10) & 255;
            int i12 = other.getByte(i10) & 255;
            if (i11 != i12) {
                return i11 < i12 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final void commonCopyInto(okio.ByteString byteString, int i10, byte[] target, int i11, int i12) {
        AbstractC9133u.m16133g(byteString, "<this>");
        AbstractC9133u.m16133g(target, "target");
        AbstractC8797p.m14643j(byteString.getData$okio(), target, i11, i10, i12 + i10);
    }

    public static final okio.ByteString commonDecodeBase64(String str) {
        AbstractC9133u.m16133g(str, "<this>");
        byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
        if (bArrDecodeBase64ToArray != null) {
            return new okio.ByteString(bArrDecodeBase64ToArray);
        }
        return null;
    }

    public static final okio.ByteString commonEncodeUtf8(String str) {
        AbstractC9133u.m16133g(str, "<this>");
        okio.ByteString byteString = new okio.ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final boolean commonEndsWith(okio.ByteString byteString, okio.ByteString suffix) {
        AbstractC9133u.m16133g(byteString, "<this>");
        AbstractC9133u.m16133g(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.size(), suffix, 0, suffix.size());
    }

    public static final boolean commonEquals(okio.ByteString byteString, Object obj) {
        AbstractC9133u.m16133g(byteString, "<this>");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof okio.ByteString) {
            okio.ByteString byteString2 = (okio.ByteString) obj;
            if (byteString2.size() == byteString.getData$okio().length && byteString2.rangeEquals(0, byteString.getData$okio(), 0, byteString.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(okio.ByteString byteString, int i10) {
        AbstractC9133u.m16133g(byteString, "<this>");
        return byteString.getData$okio()[i10];
    }

    public static final int commonGetSize(okio.ByteString byteString) {
        AbstractC9133u.m16133g(byteString, "<this>");
        return byteString.getData$okio().length;
    }

    public static final int commonHashCode(okio.ByteString byteString) {
        AbstractC9133u.m16133g(byteString, "<this>");
        int hashCode$okio = byteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(byteString.getData$okio());
        byteString.setHashCode$okio(iHashCode);
        return iHashCode;
    }

    public static final String commonHex(okio.ByteString byteString) {
        AbstractC9133u.m16133g(byteString, "<this>");
        char[] cArr = new char[byteString.getData$okio().length * 2];
        int i10 = 0;
        for (byte b10 : byteString.getData$okio()) {
            int i11 = i10 + 1;
            cArr[i10] = getHEX_DIGIT_CHARS()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = getHEX_DIGIT_CHARS()[b10 & 15];
        }
        return AbstractC8687z.m14106u(cArr);
    }

    public static final int commonIndexOf(okio.ByteString byteString, byte[] other, int i10) {
        AbstractC9133u.m16133g(byteString, "<this>");
        AbstractC9133u.m16133g(other, "other");
        int length = byteString.getData$okio().length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public static final byte[] commonInternalArray(okio.ByteString byteString) {
        AbstractC9133u.m16133g(byteString, "<this>");
        return byteString.getData$okio();
    }

    public static final int commonLastIndexOf(okio.ByteString byteString, okio.ByteString other, int i10) {
        AbstractC9133u.m16133g(byteString, "<this>");
        AbstractC9133u.m16133g(other, "other");
        return byteString.lastIndexOf(other.internalArray$okio(), i10);
    }

    public static final okio.ByteString commonOf(byte[] data) {
        AbstractC9133u.m16133g(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        AbstractC9133u.m16132f(bArrCopyOf, "copyOf(...)");
        return new okio.ByteString(bArrCopyOf);
    }

    public static final boolean commonRangeEquals(okio.ByteString byteString, int i10, okio.ByteString other, int i11, int i12) {
        AbstractC9133u.m16133g(byteString, "<this>");
        AbstractC9133u.m16133g(other, "other");
        return other.rangeEquals(i11, byteString.getData$okio(), i10, i12);
    }

    public static final boolean commonStartsWith(okio.ByteString byteString, okio.ByteString prefix) {
        AbstractC9133u.m16133g(byteString, "<this>");
        AbstractC9133u.m16133g(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.size());
    }

    public static final okio.ByteString commonSubstring(okio.ByteString byteString, int i10, int i11) {
        AbstractC9133u.m16133g(byteString, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iResolveDefaultParameter <= byteString.getData$okio().length) {
            if (iResolveDefaultParameter - i10 >= 0) {
                return (i10 == 0 && iResolveDefaultParameter == byteString.getData$okio().length) ? byteString : new okio.ByteString(AbstractC8797p.m14656w(byteString.getData$okio(), i10, iResolveDefaultParameter));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + byteString.getData$okio().length + ')').toString());
    }

    public static final okio.ByteString commonToAsciiLowercase(okio.ByteString byteString) {
        AbstractC9133u.m16133g(byteString, "<this>");
        for (int i10 = 0; i10 < byteString.getData$okio().length; i10++) {
            byte b10 = byteString.getData$okio()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] data$okio = byteString.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                AbstractC9133u.m16132f(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    public static final okio.ByteString commonToAsciiUppercase(okio.ByteString byteString) {
        AbstractC9133u.m16133g(byteString, "<this>");
        for (int i10 = 0; i10 < byteString.getData$okio().length; i10++) {
            byte b10 = byteString.getData$okio()[i10];
            if (b10 >= 97 && b10 <= 122) {
                byte[] data$okio = byteString.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                AbstractC9133u.m16132f(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 - 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 97 && b11 <= 122) {
                        bArrCopyOf[i11] = (byte) (b11 - 32);
                    }
                }
                return new okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    public static final byte[] commonToByteArray(okio.ByteString byteString) {
        AbstractC9133u.m16133g(byteString, "<this>");
        byte[] data$okio = byteString.getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        AbstractC9133u.m16132f(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static final okio.ByteString commonToByteString(byte[] bArr, int i10, int i11) {
        AbstractC9133u.m16133g(bArr, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i11);
        SegmentedByteString.checkOffsetAndCount(bArr.length, i10, iResolveDefaultParameter);
        return new okio.ByteString(AbstractC8797p.m14656w(bArr, i10, iResolveDefaultParameter + i10));
    }

    public static final String commonToString(okio.ByteString byteString) {
        okio.ByteString byteString2 = byteString;
        AbstractC9133u.m16133g(byteString2, "<this>");
        if (byteString2.getData$okio().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = codePointIndexToCharIndex(byteString2.getData$okio(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = byteString2.utf8();
            String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
            AbstractC9133u.m16132f(strSubstring, "substring(...)");
            String strM14101I = AbstractC8687z.m14101I(AbstractC8687z.m14101I(AbstractC8687z.m14101I(strSubstring, "\\", "\\\\", false, 4, null), SignParameters.NEW_LINE, "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iCodePointIndexToCharIndex >= strUtf8.length()) {
                return "[text=" + strM14101I + ']';
            }
            return "[size=" + byteString2.getData$okio().length + " text=" + strM14101I + "…]";
        }
        if (byteString2.getData$okio().length <= 64) {
            return "[hex=" + byteString2.hex() + ']';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[size=");
        sb.append(byteString2.getData$okio().length);
        sb.append(" hex=");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString2, 64);
        if (iResolveDefaultParameter > byteString2.getData$okio().length) {
            throw new IllegalArgumentException(("endIndex > length(" + byteString2.getData$okio().length + ')').toString());
        }
        if (iResolveDefaultParameter < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (iResolveDefaultParameter != byteString2.getData$okio().length) {
            byteString2 = new okio.ByteString(AbstractC8797p.m14656w(byteString2.getData$okio(), 0, iResolveDefaultParameter));
        }
        sb.append(byteString2.hex());
        sb.append("…]");
        return sb.toString();
    }

    public static final String commonUtf8(okio.ByteString byteString) {
        AbstractC9133u.m16133g(byteString, "<this>");
        String utf8$okio = byteString.getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(byteString.internalArray$okio());
        byteString.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final void commonWrite(okio.ByteString byteString, Buffer buffer, int i10, int i11) {
        AbstractC9133u.m16133g(byteString, "<this>");
        AbstractC9133u.m16133g(buffer, "buffer");
        buffer.write(byteString.getData$okio(), i10, i11);
    }

    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static final boolean commonEndsWith(okio.ByteString byteString, byte[] suffix) {
        AbstractC9133u.m16133g(byteString, "<this>");
        AbstractC9133u.m16133g(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.length, suffix, 0, suffix.length);
    }

    public static final int commonLastIndexOf(okio.ByteString byteString, byte[] other, int i10) {
        AbstractC9133u.m16133g(byteString, "<this>");
        AbstractC9133u.m16133g(other, "other");
        for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(byteString, i10), byteString.getData$okio().length - other.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public static final boolean commonRangeEquals(okio.ByteString byteString, int i10, byte[] other, int i11, int i12) {
        AbstractC9133u.m16133g(byteString, "<this>");
        AbstractC9133u.m16133g(other, "other");
        return i10 >= 0 && i10 <= byteString.getData$okio().length - i12 && i11 >= 0 && i11 <= other.length - i12 && SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), i10, other, i11, i12);
    }

    public static final boolean commonStartsWith(okio.ByteString byteString, byte[] prefix) {
        AbstractC9133u.m16133g(byteString, "<this>");
        AbstractC9133u.m16133g(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.length);
    }
}
