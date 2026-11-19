package tc;

import java.util.Arrays;
import p309qc.C10778i;
import p309qc.C10780k;
import p309qc.C10782m;
import p309qc.C10785p;
import p325rc.AbstractC10947g0;

/* renamed from: tc.b */
/* loaded from: classes6.dex */
public abstract class AbstractC11269b extends AbstractC11268a {
    /* renamed from: a */
    public static boolean m25191a(short[] sArr, short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    /* renamed from: b */
    public static boolean m25192b(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    /* renamed from: c */
    public static boolean m25193c(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    /* renamed from: d */
    public static boolean m25194d(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    /* renamed from: e */
    public static String m25195e(byte[] bArr) {
        String strM23954w0;
        return (bArr == null || (strM23954w0 = AbstractC10947g0.m23954w0(C10778i.m22982a(bArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strM23954w0;
    }

    /* renamed from: f */
    public static String m25196f(int[] iArr) {
        String strM23954w0;
        return (iArr == null || (strM23954w0 = AbstractC10947g0.m23954w0(C10780k.m23005a(iArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strM23954w0;
    }

    /* renamed from: g */
    public static String m25197g(short[] sArr) {
        String strM23954w0;
        return (sArr == null || (strM23954w0 = AbstractC10947g0.m23954w0(C10785p.m23052a(sArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strM23954w0;
    }

    /* renamed from: h */
    public static String m25198h(long[] jArr) {
        String strM23954w0;
        return (jArr == null || (strM23954w0 = AbstractC10947g0.m23954w0(C10782m.m23029a(jArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strM23954w0;
    }
}
