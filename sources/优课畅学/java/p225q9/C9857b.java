package p225q9;

import kotlin.jvm.internal.AbstractC9133u;
import okio.ByteString;
import p113g8.AbstractC8687z;
import p147j9.AbstractC9041k;

/* renamed from: q9.b */
/* loaded from: classes5.dex */
public final class C9857b {

    /* renamed from: a */
    public static final C9857b f19671a = new C9857b();

    /* renamed from: b */
    public static final ByteString f19672b = ByteString.Companion.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c */
    public static final String[] f19673c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d */
    public static final String[] f19674d = new String[64];

    /* renamed from: e */
    public static final String[] f19675e;

    static {
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            AbstractC9133u.m16132f(binaryString, "toBinaryString(...)");
            strArr[i10] = AbstractC8687z.m14100H(AbstractC9041k.m15780j("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f19675e = strArr;
        String[] strArr2 = f19674d;
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
            String[] strArr3 = f19674d;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            strArr3[i15 | 8] = strArr3[i14] + '|' + strArr3[i13] + "|PADDED";
        }
        int length = f19674d.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f19674d;
            if (strArr4[i16] == null) {
                strArr4[i16] = f19675e[i16];
            }
        }
    }

    /* renamed from: a */
    public final String m18376a(int i10, int i11) {
        String str;
        if (i11 == 0) {
            return "";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f19675e[i11];
            }
            if (i10 != 7 && i10 != 8) {
                String[] strArr = f19674d;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    AbstractC9133u.m16130d(str);
                } else {
                    str = f19675e[i11];
                }
                String str2 = str;
                return (i10 != 5 || (i11 & 4) == 0) ? (i10 != 0 || (i11 & 32) == 0) ? str2 : AbstractC8687z.m14101I(str2, "PRIORITY", "COMPRESSED", false, 4, null) : AbstractC8687z.m14101I(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f19675e[i11];
    }

    /* renamed from: b */
    public final String m18377b(int i10) {
        String[] strArr = f19673c;
        return i10 < strArr.length ? strArr[i10] : AbstractC9041k.m15780j("0x%02x", Integer.valueOf(i10));
    }

    /* renamed from: c */
    public final String m18378c(boolean z10, int i10, int i11, int i12, int i13) {
        return AbstractC9041k.m15780j("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), m18377b(i12), m18376a(i12, i13));
    }

    /* renamed from: d */
    public final String m18379d(boolean z10, int i10, int i11, long j10) {
        return AbstractC9041k.m15780j("%s 0x%08x %5d %-13s %d", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), m18377b(8), Long.valueOf(j10));
    }
}
