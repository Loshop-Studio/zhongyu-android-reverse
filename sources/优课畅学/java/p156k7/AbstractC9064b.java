package p156k7;

import java.util.Arrays;
import p123h7.C8728h;
import p123h7.C8730j;
import p123h7.C8732l;
import p123h7.C8735o;
import p134i7.AbstractC8778f0;

/* renamed from: k7.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9064b extends AbstractC9063a {
    /* renamed from: a */
    public static boolean m15865a(short[] sArr, short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    /* renamed from: b */
    public static boolean m15866b(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    /* renamed from: c */
    public static boolean m15867c(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    /* renamed from: d */
    public static boolean m15868d(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    /* renamed from: e */
    public static String m15869e(byte[] bArr) {
        String strM14576v0;
        return (bArr == null || (strM14576v0 = AbstractC8778f0.m14576v0(C8728h.m14237a(bArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strM14576v0;
    }

    /* renamed from: f */
    public static String m15870f(int[] iArr) {
        String strM14576v0;
        return (iArr == null || (strM14576v0 = AbstractC8778f0.m14576v0(C8730j.m14260a(iArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strM14576v0;
    }

    /* renamed from: g */
    public static String m15871g(short[] sArr) {
        String strM14576v0;
        return (sArr == null || (strM14576v0 = AbstractC8778f0.m14576v0(C8735o.m14307a(sArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strM14576v0;
    }

    /* renamed from: h */
    public static String m15872h(long[] jArr) {
        String strM14576v0;
        return (jArr == null || (strM14576v0 = AbstractC8778f0.m14576v0(C8732l.m14284a(jArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strM14576v0;
    }
}
