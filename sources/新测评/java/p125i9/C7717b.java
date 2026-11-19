package p125i9;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.ByteString;
import p028b9.AbstractC5070d;

/* renamed from: i9.b */
/* loaded from: classes5.dex */
public final class C7717b {

    /* renamed from: a */
    public static final C7717b f13099a = new C7717b();

    /* renamed from: b */
    public static final ByteString f13100b = ByteString.INSTANCE.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c */
    public static final String[] f13101c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d */
    public static final String[] f13102d = new String[64];

    /* renamed from: e */
    public static final String[] f13103e;

    static {
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            strArr[i10] = StringsKt.replace$default(AbstractC5070d.m2655t("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f13103e = strArr;
        String[] strArr2 = f13102d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = strArr2[i11] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f13102d;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            strArr3[i15 | 8] = strArr3[i14] + '|' + strArr3[i13] + "|PADDED";
        }
        int length = f13102d.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f13102d;
            if (strArr4[i16] == null) {
                strArr4[i16] = f13103e[i16];
            }
        }
    }

    /* renamed from: a */
    public final String m12893a(int i10, int i11) {
        String str;
        if (i11 == 0) {
            return "";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f13103e[i11];
            }
            if (i10 != 7 && i10 != 8) {
                String[] strArr = f13102d;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    Intrinsics.checkNotNull(str);
                } else {
                    str = f13103e[i11];
                }
                String str2 = str;
                return (i10 != 5 || (i11 & 4) == 0) ? (i10 != 0 || (i11 & 32) == 0) ? str2 : StringsKt.replace$default(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null) : StringsKt.replace$default(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
            }
        }
        return f13103e[i11];
    }

    /* renamed from: b */
    public final String m12894b(int i10) {
        String[] strArr = f13101c;
        return i10 < strArr.length ? strArr[i10] : AbstractC5070d.m2655t("0x%02x", Integer.valueOf(i10));
    }

    /* renamed from: c */
    public final String m12895c(boolean z9, int i10, int i11, int i12, int i13) {
        return AbstractC5070d.m2655t("%s 0x%08x %5d %-13s %s", z9 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), m12894b(i12), m12893a(i12, i13));
    }
}
