package p116n5;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.ByteString;
import p065g5.AbstractC6427k;

/* renamed from: n5.b */
/* loaded from: classes4.dex */
public final class C7468b {

    /* renamed from: a */
    public static final C7468b f9577a = new C7468b();

    /* renamed from: b */
    public static final ByteString f9578b = ByteString.INSTANCE.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c */
    public static final String[] f9579c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d */
    public static final String[] f9580d = new String[64];

    /* renamed from: e */
    public static final String[] f9581e;

    static {
        String[] strArr = new String[256];
        for (int i6 = 0; i6 < 256; i6++) {
            String binaryString = Integer.toBinaryString(i6);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(...)");
            strArr[i6] = StringsKt.replace$default(AbstractC6427k.m7022j("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f9581e = strArr;
        String[] strArr2 = f9580d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i7 = iArr[0];
        strArr2[i7 | 8] = strArr2[i7] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i8 = 0; i8 < 3; i8++) {
            int i9 = iArr2[i8];
            int i10 = iArr[0];
            String[] strArr3 = f9580d;
            int i11 = i10 | i9;
            strArr3[i11] = strArr3[i10] + '|' + strArr3[i9];
            strArr3[i11 | 8] = strArr3[i10] + '|' + strArr3[i9] + "|PADDED";
        }
        int length = f9580d.length;
        for (int i12 = 0; i12 < length; i12++) {
            String[] strArr4 = f9580d;
            if (strArr4[i12] == null) {
                strArr4[i12] = f9581e[i12];
            }
        }
    }

    /* renamed from: a */
    public final String m8543a(int i6, int i7) {
        String str;
        if (i7 == 0) {
            return "";
        }
        if (i6 != 2 && i6 != 3) {
            if (i6 == 4 || i6 == 6) {
                return i7 == 1 ? "ACK" : f9581e[i7];
            }
            if (i6 != 7 && i6 != 8) {
                String[] strArr = f9580d;
                if (i7 < strArr.length) {
                    str = strArr[i7];
                    Intrinsics.checkNotNull(str);
                } else {
                    str = f9581e[i7];
                }
                String str2 = str;
                return (i6 != 5 || (i7 & 4) == 0) ? (i6 != 0 || (i7 & 32) == 0) ? str2 : StringsKt.replace$default(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null) : StringsKt.replace$default(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
            }
        }
        return f9581e[i7];
    }

    /* renamed from: b */
    public final String m8544b(int i6) {
        String[] strArr = f9579c;
        return i6 < strArr.length ? strArr[i6] : AbstractC6427k.m7022j("0x%02x", Integer.valueOf(i6));
    }

    /* renamed from: c */
    public final String m8545c(boolean z6, int i6, int i7, int i8, int i9) {
        return AbstractC6427k.m7022j("%s 0x%08x %5d %-13s %s", z6 ? "<<" : ">>", Integer.valueOf(i6), Integer.valueOf(i7), m8544b(i8), m8543a(i8, i9));
    }

    /* renamed from: d */
    public final String m8546d(boolean z6, int i6, int i7, long j6) {
        return AbstractC6427k.m7022j("%s 0x%08x %5d %-13s %d", z6 ? "<<" : ">>", Integer.valueOf(i6), Integer.valueOf(i7), m8544b(8), Long.valueOf(j6));
    }
}
