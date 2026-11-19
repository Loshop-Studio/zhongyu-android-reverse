package okio;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

@Metadata(m7879d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0000\u001a\u0016\u0010\b\u001a\u00020\u0007*\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\n"}, m7880d2 = {"BASE64", "", "getBASE64", "()[B", "BASE64_URL_SAFE", "getBASE64_URL_SAFE", "decodeBase64ToArray", "", "encodeBase64", "map", "okio"}, m7881k = 2, m7882mv = {2, 1, 0}, m7884xi = 48)
@JvmName(name = "-Base64")
/* renamed from: okio.-Base64, reason: invalid class name */
/* loaded from: classes4.dex */
public final class Base64 {
    private static final byte[] BASE64;
    private static final byte[] BASE64_URL_SAFE;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        BASE64 = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData();
        BASE64_URL_SAFE = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData();
    }

    public static final byte[] decodeBase64ToArray(String str) {
        int i6;
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i7 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i7];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt2 = str.charAt(i11);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i6 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i6 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i6 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i6 = 62;
            } else if (cCharAt2 == '/' || cCharAt2 == '_') {
                i6 = 63;
            } else {
                if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i9 = (i9 << 6) | i6;
            i8++;
            if (i8 % 4 == 0) {
                bArr[i10] = (byte) (i9 >> 16);
                int i12 = i10 + 2;
                bArr[i10 + 1] = (byte) (i9 >> 8);
                i10 += 3;
                bArr[i12] = (byte) i9;
            }
        }
        int i13 = i8 % 4;
        if (i13 == 1) {
            return null;
        }
        if (i13 == 2) {
            bArr[i10] = (byte) ((i9 << 12) >> 16);
            i10++;
        } else if (i13 == 3) {
            int i14 = i9 << 6;
            int i15 = i10 + 1;
            bArr[i10] = (byte) (i14 >> 16);
            i10 += 2;
            bArr[i15] = (byte) (i14 >> 8);
        }
        if (i10 == i7) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static final String encodeBase64(byte[] bArr, byte[] map) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            byte b7 = bArr[i6];
            int i8 = i6 + 2;
            byte b8 = bArr[i6 + 1];
            i6 += 3;
            byte b9 = bArr[i8];
            bArr2[i7] = map[(b7 & UByte.MAX_VALUE) >> 2];
            bArr2[i7 + 1] = map[((b7 & 3) << 4) | ((b8 & UByte.MAX_VALUE) >> 4)];
            int i9 = i7 + 3;
            bArr2[i7 + 2] = map[((b8 & 15) << 2) | ((b9 & UByte.MAX_VALUE) >> 6)];
            i7 += 4;
            bArr2[i9] = map[b9 & Utf8.REPLACEMENT_BYTE];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b10 = bArr[i6];
            bArr2[i7] = map[(b10 & UByte.MAX_VALUE) >> 2];
            bArr2[i7 + 1] = map[(b10 & 3) << 4];
            bArr2[i7 + 2] = kotlin.p094io.encoding.Base64.padSymbol;
            bArr2[i7 + 3] = kotlin.p094io.encoding.Base64.padSymbol;
        } else if (length2 == 2) {
            int i10 = i6 + 1;
            byte b11 = bArr[i6];
            byte b12 = bArr[i10];
            bArr2[i7] = map[(b11 & UByte.MAX_VALUE) >> 2];
            bArr2[i7 + 1] = map[((b11 & 3) << 4) | ((b12 & UByte.MAX_VALUE) >> 4)];
            bArr2[i7 + 2] = map[(b12 & 15) << 2];
            bArr2[i7 + 3] = kotlin.p094io.encoding.Base64.padSymbol;
        }
        return _JvmPlatformKt.toUtf8String(bArr2);
    }

    public static /* synthetic */ String encodeBase64$default(byte[] bArr, byte[] bArr2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            bArr2 = BASE64;
        }
        return encodeBase64(bArr, bArr2);
    }

    public static final byte[] getBASE64() {
        return BASE64;
    }

    public static final byte[] getBASE64_URL_SAFE() {
        return BASE64_URL_SAFE;
    }
}
