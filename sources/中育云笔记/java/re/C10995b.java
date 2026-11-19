package re;

import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9979u;
import okio.ByteString;
import p310qd.AbstractC10819z;

/* renamed from: re.b */
/* loaded from: classes6.dex */
public final class C10995b {

    /* renamed from: a */
    public static final C10995b f26511a = new C10995b();

    /* renamed from: b */
    public static final ByteString f26512b = ByteString.Companion.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c */
    public static final String[] f26513c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d */
    public static final String[] f26514d = new String[64];

    /* renamed from: e */
    public static final String[] f26515e;

    static {
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            AbstractC9979u.m20293f(binaryString, "toBinaryString(it)");
            strArr[i10] = AbstractC10819z.m23237J(AbstractC9920d.m20038t("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f26515e = strArr;
        String[] strArr2 = f26514d;
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
            String[] strArr3 = f26514d;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            strArr3[i15 | 8] = strArr3[i14] + '|' + strArr3[i13] + "|PADDED";
        }
        int length = f26514d.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f26514d;
            if (strArr4[i16] == null) {
                strArr4[i16] = f26515e[i16];
            }
        }
    }

    /* renamed from: a */
    public final String m24247a(int i10, int i11) {
        String str;
        if (i11 == 0) {
            return "";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f26515e[i11];
            }
            if (i10 != 7 && i10 != 8) {
                String[] strArr = f26514d;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    AbstractC9979u.m20291d(str);
                } else {
                    str = f26515e[i11];
                }
                String str2 = str;
                return (i10 != 5 || (i11 & 4) == 0) ? (i10 != 0 || (i11 & 32) == 0) ? str2 : AbstractC10819z.m23238K(str2, "PRIORITY", "COMPRESSED", false, 4, null) : AbstractC10819z.m23238K(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f26515e[i11];
    }

    /* renamed from: b */
    public final String m24248b(int i10) {
        String[] strArr = f26513c;
        return i10 < strArr.length ? strArr[i10] : AbstractC9920d.m20038t("0x%02x", Integer.valueOf(i10));
    }

    /* renamed from: c */
    public final String m24249c(boolean z10, int i10, int i11, int i12, int i13) {
        return AbstractC9920d.m20038t("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), m24248b(i12), m24247a(i12, i13));
    }
}
