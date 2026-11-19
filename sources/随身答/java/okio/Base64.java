package okio;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

@Metadata(m13412d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0000\u001a\u0016\u0010\b\u001a\u00020\u0007*\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\n"}, m13413d2 = {"BASE64", "", "getBASE64", "()[B", "BASE64_URL_SAFE", "getBASE64_URL_SAFE", "decodeBase64ToArray", "", "encodeBase64", "map", "okio"}, m13414k = 2, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "-Base64")
/* renamed from: okio.-Base64, reason: invalid class name */
/* loaded from: classes5.dex */
public final class Base64 {
    private static final byte[] BASE64;
    private static final byte[] BASE64_URL_SAFE;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        BASE64 = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData();
        BASE64_URL_SAFE = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData();
    }

    public static final byte[] decodeBase64ToArray(String str) {
        int i9;
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i10 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt2 = str.charAt(i14);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i9 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i9 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i9 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i9 = 62;
            } else if (cCharAt2 == '/' || cCharAt2 == '_') {
                i9 = 63;
            } else {
                if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i12 = (i12 << 6) | i9;
            i11++;
            if (i11 % 4 == 0) {
                bArr[i13] = (byte) (i12 >> 16);
                int i15 = i13 + 2;
                bArr[i13 + 1] = (byte) (i12 >> 8);
                i13 += 3;
                bArr[i15] = (byte) i12;
            }
        }
        int i16 = i11 % 4;
        if (i16 == 1) {
            return null;
        }
        if (i16 == 2) {
            bArr[i13] = (byte) ((i12 << 12) >> 16);
            i13++;
        } else if (i16 == 3) {
            int i17 = i12 << 6;
            int i18 = i13 + 1;
            bArr[i13] = (byte) (i17 >> 16);
            i13 += 2;
            bArr[i18] = (byte) (i17 >> 8);
        }
        if (i13 == i10) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i13);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static final String encodeBase64(byte[] bArr, byte[] map) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            byte b10 = bArr[i9];
            int i11 = i9 + 2;
            byte b11 = bArr[i9 + 1];
            i9 += 3;
            byte b12 = bArr[i11];
            bArr2[i10] = map[(b10 & UByte.MAX_VALUE) >> 2];
            bArr2[i10 + 1] = map[((b10 & 3) << 4) | ((b11 & UByte.MAX_VALUE) >> 4)];
            int i12 = i10 + 3;
            bArr2[i10 + 2] = map[((b11 & 15) << 2) | ((b12 & UByte.MAX_VALUE) >> 6)];
            i10 += 4;
            bArr2[i12] = map[b12 & Utf8.REPLACEMENT_BYTE];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i9];
            bArr2[i10] = map[(b13 & UByte.MAX_VALUE) >> 2];
            bArr2[i10 + 1] = map[(b13 & 3) << 4];
            bArr2[i10 + 2] = kotlin.p161io.encoding.Base64.padSymbol;
            bArr2[i10 + 3] = kotlin.p161io.encoding.Base64.padSymbol;
        } else if (length2 == 2) {
            int i13 = i9 + 1;
            byte b14 = bArr[i9];
            byte b15 = bArr[i13];
            bArr2[i10] = map[(b14 & UByte.MAX_VALUE) >> 2];
            bArr2[i10 + 1] = map[((b14 & 3) << 4) | ((b15 & UByte.MAX_VALUE) >> 4)];
            bArr2[i10 + 2] = map[(b15 & 15) << 2];
            bArr2[i10 + 3] = kotlin.p161io.encoding.Base64.padSymbol;
        }
        return _JvmPlatformKt.toUtf8String(bArr2);
    }

    public static /* synthetic */ String encodeBase64$default(byte[] bArr, byte[] bArr2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
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
