package p168e.p169q.p173f;

import io.github.inflationx.calligraphy3.BuildConfig;
import p160d.p162f.p164b.C1011d;
import p160d.p167i.C1020a;
import p168e.p169q.C1045b;
import p178f.C1078b;

/* renamed from: e.q.f.a */
/* loaded from: classes.dex */
public final class C1051a {

    /* renamed from: a */
    public static final String[] f5605a;

    /* renamed from: b */
    public static final String[] f5606b;

    static {
        C1078b c1078b = C1078b.f5648f;
        C1011d.m2809e("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n", "$this$encodeUtf8");
        C1011d.m2809e("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n", "$this$asUtf8ToByteArray");
        byte[] bytes = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n".getBytes(C1020a.f5495a);
        C1011d.m2808d(bytes, "(this as java.lang.String).getBytes(charset)");
        new C1078b(bytes).f5650c = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
        f5605a = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            C1011d.m2808d(binaryString, "Integer.toBinaryString(it)");
            String strM2838a = C1045b.m2838a("%8s", binaryString);
            C1011d.m2809e(strM2838a, "$this$replace");
            String strReplace = strM2838a.replace(' ', '0');
            C1011d.m2808d(strReplace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            strArr[i] = strReplace;
        }
        f5606b = strArr;
        String[] strArr2 = f5605a;
        strArr2[0] = BuildConfig.FLAVOR;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 < 1; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = f5605a;
            strArr3[i3 | 8] = C1011d.m2814j(strArr3[i3], "|PADDED");
        }
        String[] strArr4 = f5605a;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 < 1; i6++) {
                int i7 = iArr[i6];
                String[] strArr5 = f5605a;
                int i8 = i7 | i5;
                strArr5[i8] = strArr5[i7] + "|" + strArr5[i5];
                strArr5[i8 | 8] = strArr5[i7] + "|" + strArr5[i5] + "|PADDED";
            }
        }
        int length = f5605a.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr6 = f5605a;
            if (strArr6[i9] == null) {
                strArr6[i9] = f5606b[i9];
            }
        }
    }
}
