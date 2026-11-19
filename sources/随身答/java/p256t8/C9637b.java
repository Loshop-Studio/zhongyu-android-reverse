package p256t8;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.ByteString;
import p182m8.AbstractC9045d;

/* renamed from: t8.b */
/* loaded from: classes5.dex */
public final class C9637b {

    /* renamed from: a */
    public static final C9637b f16929a = new C9637b();

    /* renamed from: b */
    public static final ByteString f16930b = ByteString.INSTANCE.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c */
    public static final String[] f16931c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d */
    public static final String[] f16932d = new String[64];

    /* renamed from: e */
    public static final String[] f16933e;

    static {
        String[] strArr = new String[256];
        for (int i9 = 0; i9 < 256; i9++) {
            String binaryString = Integer.toBinaryString(i9);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            strArr[i9] = StringsKt.replace$default(AbstractC9045d.m14504t("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f16933e = strArr;
        String[] strArr2 = f16932d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i10 = iArr[0];
        strArr2[i10 | 8] = strArr2[i10] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            int i13 = iArr[0];
            String[] strArr3 = f16932d;
            int i14 = i13 | i12;
            strArr3[i14] = strArr3[i13] + '|' + strArr3[i12];
            strArr3[i14 | 8] = strArr3[i13] + '|' + strArr3[i12] + "|PADDED";
        }
        int length = f16932d.length;
        for (int i15 = 0; i15 < length; i15++) {
            String[] strArr4 = f16932d;
            if (strArr4[i15] == null) {
                strArr4[i15] = f16933e[i15];
            }
        }
    }

    /* renamed from: a */
    public final String m15912a(int i9, int i10) {
        String str;
        if (i10 == 0) {
            return "";
        }
        if (i9 != 2 && i9 != 3) {
            if (i9 == 4 || i9 == 6) {
                return i10 == 1 ? "ACK" : f16933e[i10];
            }
            if (i9 != 7 && i9 != 8) {
                String[] strArr = f16932d;
                if (i10 < strArr.length) {
                    str = strArr[i10];
                    Intrinsics.checkNotNull(str);
                } else {
                    str = f16933e[i10];
                }
                String str2 = str;
                return (i9 != 5 || (i10 & 4) == 0) ? (i9 != 0 || (i10 & 32) == 0) ? str2 : StringsKt.replace$default(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null) : StringsKt.replace$default(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
            }
        }
        return f16933e[i10];
    }

    /* renamed from: b */
    public final String m15913b(int i9) {
        String[] strArr = f16931c;
        return i9 < strArr.length ? strArr[i9] : AbstractC9045d.m14504t("0x%02x", Integer.valueOf(i9));
    }

    /* renamed from: c */
    public final String m15914c(boolean z9, int i9, int i10, int i11, int i12) {
        return AbstractC9045d.m14504t("%s 0x%08x %5d %-13s %s", z9 ? "<<" : ">>", Integer.valueOf(i9), Integer.valueOf(i10), m15913b(i11), m15912a(i11, i12));
    }
}
