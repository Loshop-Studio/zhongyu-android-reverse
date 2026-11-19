package okio;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5830k;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0000\u001a\u0016\u0010\b\u001a\u00020\u0007*\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\n"}, m5110d2 = {"BASE64", "", "getBASE64", "()[B", "BASE64_URL_SAFE", "getBASE64_URL_SAFE", "decodeBase64ToArray", "", "encodeBase64", "map", "okio"}, m5111k = 2, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "-Base64")
/* renamed from: okio.-Base64, reason: invalid class name */
/* loaded from: classes4.dex */
public final class Base64 {

    @NotNull
    private static final byte[] BASE64;

    @NotNull
    private static final byte[] BASE64_URL_SAFE;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        BASE64 = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData();
        BASE64_URL_SAFE = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData();
    }

    @Nullable
    public static final byte[] decodeBase64ToArray(@NotNull String str) {
        int i;
        char cCharAt;
        AbstractC5830k.m5330g(str, "<this>");
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i8 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i8];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt2 = str.charAt(i12);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i = 62;
            } else if (cCharAt2 == '/' || cCharAt2 == '_') {
                i = 63;
            } else {
                if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i10 = (i10 << 6) | i;
            i9++;
            if (i9 % 4 == 0) {
                bArr[i11] = (byte) (i10 >> 16);
                int i13 = i11 + 2;
                bArr[i11 + 1] = (byte) (i10 >> 8);
                i11 += 3;
                bArr[i13] = (byte) i10;
            }
        }
        int i14 = i9 % 4;
        if (i14 == 1) {
            return null;
        }
        if (i14 == 2) {
            bArr[i11] = (byte) ((i10 << 12) >> 16);
            i11++;
        } else if (i14 == 3) {
            int i15 = i10 << 6;
            int i16 = i11 + 1;
            bArr[i11] = (byte) (i15 >> 16);
            i11 += 2;
            bArr[i16] = (byte) (i15 >> 8);
        }
        if (i11 == i8) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i11);
        AbstractC5830k.m5329f(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @NotNull
    public static final String encodeBase64(@NotNull byte[] bArr, @NotNull byte[] map) {
        AbstractC5830k.m5330g(bArr, "<this>");
        AbstractC5830k.m5330g(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i8 = 0;
        while (i < length) {
            byte b6 = bArr[i];
            int i9 = i + 2;
            byte b9 = bArr[i + 1];
            i += 3;
            byte b10 = bArr[i9];
            bArr2[i8] = map[(b6 & 255) >> 2];
            bArr2[i8 + 1] = map[((b6 & 3) << 4) | ((b9 & 255) >> 4)];
            int i10 = i8 + 3;
            bArr2[i8 + 2] = map[((b9 & 15) << 2) | ((b10 & 255) >> 6)];
            i8 += 4;
            bArr2[i10] = map[b10 & Utf8.REPLACEMENT_BYTE];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b11 = bArr[i];
            bArr2[i8] = map[(b11 & 255) >> 2];
            bArr2[i8 + 1] = map[(b11 & 3) << 4];
            bArr2[i8 + 2] = 61;
            bArr2[i8 + 3] = 61;
        } else if (length2 == 2) {
            int i11 = i + 1;
            byte b12 = bArr[i];
            byte b13 = bArr[i11];
            bArr2[i8] = map[(b12 & 255) >> 2];
            bArr2[i8 + 1] = map[((b12 & 3) << 4) | ((b13 & 255) >> 4)];
            bArr2[i8 + 2] = map[(b13 & 15) << 2];
            bArr2[i8 + 3] = 61;
        }
        return _JvmPlatformKt.toUtf8String(bArr2);
    }

    public static /* synthetic */ String encodeBase64$default(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
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
