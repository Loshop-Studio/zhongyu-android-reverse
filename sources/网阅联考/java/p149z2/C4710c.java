package p149z2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.ByteString;
import p121s2.AbstractC4550b;

/* renamed from: z2.c */
/* loaded from: classes2.dex */
public final class C4710c {

    /* renamed from: d */
    public static final String[] f6101d;

    /* renamed from: e */
    public static final C4710c f6102e = new C4710c();

    /* renamed from: a */
    public static final ByteString f6098a = ByteString.INSTANCE.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    public static final String[] f6099b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    public static final String[] f6100c = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i4 = 0; i4 < 256; i4++) {
            String binaryString = Integer.toBinaryString(i4);
            Intrinsics.checkNotNullExpressionValue(binaryString, "Integer.toBinaryString(it)");
            strArr[i4] = StringsKt__StringsJVMKt.replace$default(AbstractC4550b.m6235q("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f6101d = strArr;
        String[] strArr2 = f6100c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i5 = iArr[0];
        strArr2[i5 | 8] = Intrinsics.stringPlus(strArr2[i5], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = iArr2[i6];
            int i8 = iArr[0];
            String[] strArr3 = f6100c;
            int i9 = i8 | i7;
            strArr3[i9] = strArr3[i8] + "|" + strArr3[i7];
            strArr3[i9 | 8] = strArr3[i8] + "|" + strArr3[i7] + "|PADDED";
        }
        int length = f6100c.length;
        for (int i10 = 0; i10 < length; i10++) {
            String[] strArr4 = f6100c;
            if (strArr4[i10] == null) {
                strArr4[i10] = f6101d[i10];
            }
        }
    }

    /* renamed from: a */
    public final String m6740a(int i4, int i5) {
        String str;
        if (i5 == 0) {
            return "";
        }
        if (i4 != 2 && i4 != 3) {
            if (i4 == 4 || i4 == 6) {
                return i5 == 1 ? "ACK" : f6101d[i5];
            }
            if (i4 != 7 && i4 != 8) {
                String[] strArr = f6100c;
                if (i5 < strArr.length) {
                    str = strArr[i5];
                    Intrinsics.checkNotNull(str);
                } else {
                    str = f6101d[i5];
                }
                String str2 = str;
                return (i4 != 5 || (i5 & 4) == 0) ? (i4 != 0 || (i5 & 32) == 0) ? str2 : StringsKt__StringsJVMKt.replace$default(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null) : StringsKt__StringsJVMKt.replace$default(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
            }
        }
        return f6101d[i5];
    }

    /* renamed from: b */
    public final String m6741b(int i4) {
        String[] strArr = f6099b;
        return i4 < strArr.length ? strArr[i4] : AbstractC4550b.m6235q("0x%02x", Integer.valueOf(i4));
    }

    /* renamed from: c */
    public final String m6742c(boolean z3, int i4, int i5, int i6, int i7) {
        return AbstractC4550b.m6235q("%s 0x%08x %5d %-13s %s", z3 ? "<<" : ">>", Integer.valueOf(i4), Integer.valueOf(i5), m6741b(i6), m6740a(i6, i7));
    }
}
