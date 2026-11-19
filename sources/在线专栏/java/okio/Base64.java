package okio;

import com.umeng.analytics.pro.C1892bw;
import java.util.Arrays;
import kotlin.jvm.internal.C2769l;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: okio.-Base64, reason: invalid class name */
/* loaded from: classes.dex */
public final class Base64 {

    @NotNull
    private static final byte[] BASE64;

    @NotNull
    private static final byte[] BASE64_URL_SAFE;

    static {
        ByteString.Companion companion = ByteString.Companion;
        BASE64 = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
        BASE64_URL_SAFE = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();
    }

    @Nullable
    public static final byte[] decodeBase64ToArray(@NotNull String decodeBase64ToArray) {
        int i4;
        char cCharAt;
        C2769l.m9241e(decodeBase64ToArray, "$this$decodeBase64ToArray");
        int length = decodeBase64ToArray.length();
        while (length > 0 && ((cCharAt = decodeBase64ToArray.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i5 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt2 = decodeBase64ToArray.charAt(i9);
            if ('A' <= cCharAt2 && 'Z' >= cCharAt2) {
                i4 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && 'z' >= cCharAt2) {
                i4 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && '9' >= cCharAt2) {
                i4 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i4 = 62;
            } else if (cCharAt2 == '/' || cCharAt2 == '_') {
                i4 = 63;
            } else {
                if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i7 = (i7 << 6) | i4;
            i6++;
            if (i6 % 4 == 0) {
                int i10 = i8 + 1;
                bArr[i8] = (byte) (i7 >> 16);
                int i11 = i10 + 1;
                bArr[i10] = (byte) (i7 >> 8);
                bArr[i11] = (byte) i7;
                i8 = i11 + 1;
            }
        }
        int i12 = i6 % 4;
        if (i12 == 1) {
            return null;
        }
        if (i12 == 2) {
            bArr[i8] = (byte) ((i7 << 12) >> 16);
            i8++;
        } else if (i12 == 3) {
            int i13 = i7 << 6;
            int i14 = i8 + 1;
            bArr[i8] = (byte) (i13 >> 16);
            i8 = i14 + 1;
            bArr[i14] = (byte) (i13 >> 8);
        }
        if (i8 == i5) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i8);
        C2769l.m9240d(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        return bArrCopyOf;
    }

    @NotNull
    public static final String encodeBase64(@NotNull byte[] encodeBase64, @NotNull byte[] map) {
        C2769l.m9241e(encodeBase64, "$this$encodeBase64");
        C2769l.m9241e(map, "map");
        byte[] bArr = new byte[((encodeBase64.length + 2) / 3) * 4];
        int length = encodeBase64.length - (encodeBase64.length % 3);
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = i4 + 1;
            byte b4 = encodeBase64[i4];
            int i7 = i6 + 1;
            byte b5 = encodeBase64[i6];
            int i8 = i7 + 1;
            byte b6 = encodeBase64[i7];
            int i9 = i5 + 1;
            bArr[i5] = map[(b4 & 255) >> 2];
            int i10 = i9 + 1;
            bArr[i9] = map[((b4 & 3) << 4) | ((b5 & 255) >> 4)];
            int i11 = i10 + 1;
            bArr[i10] = map[((b5 & C1892bw.f8538m) << 2) | ((b6 & 255) >> 6)];
            i5 = i11 + 1;
            bArr[i11] = map[b6 & Utf8.REPLACEMENT_BYTE];
            i4 = i8;
        }
        int length2 = encodeBase64.length - length;
        if (length2 == 1) {
            byte b7 = encodeBase64[i4];
            int i12 = i5 + 1;
            bArr[i5] = map[(b7 & 255) >> 2];
            int i13 = i12 + 1;
            bArr[i12] = map[(b7 & 3) << 4];
            byte b8 = (byte) 61;
            bArr[i13] = b8;
            bArr[i13 + 1] = b8;
        } else if (length2 == 2) {
            int i14 = i4 + 1;
            byte b9 = encodeBase64[i4];
            byte b10 = encodeBase64[i14];
            int i15 = i5 + 1;
            bArr[i5] = map[(b9 & 255) >> 2];
            int i16 = i15 + 1;
            bArr[i15] = map[((b9 & 3) << 4) | ((b10 & 255) >> 4)];
            bArr[i16] = map[(b10 & C1892bw.f8538m) << 2];
            bArr[i16 + 1] = (byte) 61;
        }
        return Platform.toUtf8String(bArr);
    }

    public static /* synthetic */ String encodeBase64$default(byte[] bArr, byte[] bArr2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bArr2 = BASE64;
        }
        return encodeBase64(bArr, bArr2);
    }

    @NotNull
    public static final byte[] getBASE64() {
        return BASE64;
    }

    @NotNull
    public static final byte[] getBASE64_URL_SAFE() {
        return BASE64_URL_SAFE;
    }
}
