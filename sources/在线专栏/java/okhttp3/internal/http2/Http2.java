package okhttp3.internal.http2;

import kotlin.jvm.internal.C2769l;
import okhttp3.internal.Util;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p082e3.C2495u;

/* loaded from: classes.dex */
public final class Http2 {
    private static final String[] BINARY;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;
    public static final Http2 INSTANCE = new Http2();

    @NotNull
    public static final ByteString CONNECTION_PREFACE = ByteString.Companion.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] FLAGS = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i4 = 0; i4 < 256; i4++) {
            String binaryString = Integer.toBinaryString(i4);
            C2769l.m9240d(binaryString, "Integer.toBinaryString(it)");
            strArr[i4] = C2495u.m8352x(Util.format("%8s", binaryString), ' ', '0', false, 4, null);
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i5 = 0; i5 < 1; i5++) {
            int i6 = iArr[i5];
            String[] strArr3 = FLAGS;
            strArr3[i6 | 8] = C2769l.m9248l(strArr3[i6], "|PADDED");
        }
        String[] strArr4 = FLAGS;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i7 = 0; i7 < 3; i7++) {
            int i8 = iArr2[i7];
            for (int i9 = 0; i9 < 1; i9++) {
                int i10 = iArr[i9];
                String[] strArr5 = FLAGS;
                int i11 = i10 | i8;
                strArr5[i11] = strArr5[i10] + "|" + strArr5[i8];
                strArr5[i11 | 8] = strArr5[i10] + "|" + strArr5[i8] + "|PADDED";
            }
        }
        int length = FLAGS.length;
        for (int i12 = 0; i12 < length; i12++) {
            String[] strArr6 = FLAGS;
            if (strArr6[i12] == null) {
                strArr6[i12] = BINARY[i12];
            }
        }
    }

    private Http2() {
    }

    @NotNull
    public final String formatFlags(int i4, int i5) {
        String str;
        if (i5 == 0) {
            return "";
        }
        if (i4 != 2 && i4 != 3) {
            if (i4 == 4 || i4 == 6) {
                return i5 == 1 ? "ACK" : BINARY[i5];
            }
            if (i4 != 7 && i4 != 8) {
                String[] strArr = FLAGS;
                if (i5 < strArr.length) {
                    str = strArr[i5];
                    C2769l.m9239c(str);
                } else {
                    str = BINARY[i5];
                }
                String str2 = str;
                return (i4 != 5 || (i5 & 4) == 0) ? (i4 != 0 || (i5 & 32) == 0) ? str2 : C2495u.m8353y(str2, "PRIORITY", "COMPRESSED", false, 4, null) : C2495u.m8353y(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return BINARY[i5];
    }

    @NotNull
    public final String formattedType$okhttp(int i4) {
        String[] strArr = FRAME_NAMES;
        return i4 < strArr.length ? strArr[i4] : Util.format("0x%02x", Integer.valueOf(i4));
    }

    @NotNull
    public final String frameLog(boolean z3, int i4, int i5, int i6, int i7) {
        return Util.format("%s 0x%08x %5d %-13s %s", z3 ? "<<" : ">>", Integer.valueOf(i4), Integer.valueOf(i5), formattedType$okhttp(i6), formatFlags(i6, i7));
    }
}
