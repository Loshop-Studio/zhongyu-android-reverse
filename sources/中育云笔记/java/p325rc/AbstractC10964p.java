package p325rc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: rc.p */
/* loaded from: classes6.dex */
public abstract class AbstractC10964p extends AbstractC10962o {
    /* renamed from: A */
    public static void m23986A(long[] jArr, long j10, int i10, int i11) {
        AbstractC9979u.m20294g(jArr, "<this>");
        Arrays.fill(jArr, i10, i11, j10);
    }

    /* renamed from: B */
    public static void m23987B(Object[] objArr, Object obj, int i10, int i11) {
        AbstractC9979u.m20294g(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, obj);
    }

    /* renamed from: C */
    public static final void m23988C(boolean[] zArr, boolean z10, int i10, int i11) {
        AbstractC9979u.m20294g(zArr, "<this>");
        Arrays.fill(zArr, i10, i11, z10);
    }

    /* renamed from: D */
    public static /* synthetic */ void m23989D(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        m24033z(iArr, i10, i11, i12);
    }

    /* renamed from: E */
    public static /* synthetic */ void m23990E(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        m23986A(jArr, j10, i10, i11);
    }

    /* renamed from: F */
    public static /* synthetic */ void m23991F(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        m23987B(objArr, obj, i10, i11);
    }

    /* renamed from: G */
    public static /* synthetic */ void m23992G(boolean[] zArr, boolean z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = zArr.length;
        }
        m23988C(zArr, z10, i10, i11);
    }

    /* renamed from: H */
    public static double[] m23993H(double[] dArr, double[] elements) {
        AbstractC9979u.m20294g(dArr, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
        int length = dArr.length;
        int length2 = elements.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(elements, 0, dArrCopyOf, length, length2);
        AbstractC9979u.m20291d(dArrCopyOf);
        return dArrCopyOf;
    }

    /* renamed from: I */
    public static float[] m23994I(float[] fArr, float[] elements) {
        AbstractC9979u.m20294g(fArr, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, fArrCopyOf, length, length2);
        AbstractC9979u.m20291d(fArrCopyOf);
        return fArrCopyOf;
    }

    /* renamed from: J */
    public static int[] m23995J(int[] iArr, int i10) {
        AbstractC9979u.m20294g(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i10;
        AbstractC9979u.m20291d(iArrCopyOf);
        return iArrCopyOf;
    }

    /* renamed from: K */
    public static int[] m23996K(int[] iArr, int[] elements) {
        AbstractC9979u.m20294g(iArr, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        AbstractC9979u.m20291d(iArrCopyOf);
        return iArrCopyOf;
    }

    /* renamed from: L */
    public static long[] m23997L(long[] jArr, long[] elements) {
        AbstractC9979u.m20294g(jArr, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, jArrCopyOf, length, length2);
        AbstractC9979u.m20291d(jArrCopyOf);
        return jArrCopyOf;
    }

    /* renamed from: M */
    public static Object[] m23998M(Object[] objArr, Object obj) {
        AbstractC9979u.m20294g(objArr, "<this>");
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        AbstractC9979u.m20291d(objArrCopyOf);
        return objArrCopyOf;
    }

    /* renamed from: N */
    public static Object[] m23999N(Object[] objArr, Object[] elements) {
        AbstractC9979u.m20294g(objArr, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
        int length = objArr.length;
        int length2 = elements.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(elements, 0, objArrCopyOf, length, length2);
        AbstractC9979u.m20291d(objArrCopyOf);
        return objArrCopyOf;
    }

    /* renamed from: O */
    public static boolean[] m24000O(boolean[] zArr, boolean[] elements) {
        AbstractC9979u.m20294g(zArr, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, zArrCopyOf, length, length2);
        AbstractC9979u.m20291d(zArrCopyOf);
        return zArrCopyOf;
    }

    /* renamed from: P */
    public static void m24001P(double[] dArr, int i10, int i11) {
        AbstractC9979u.m20294g(dArr, "<this>");
        Arrays.sort(dArr, i10, i11);
    }

    /* renamed from: Q */
    public static void m24002Q(float[] fArr, int i10, int i11) {
        AbstractC9979u.m20294g(fArr, "<this>");
        Arrays.sort(fArr, i10, i11);
    }

    /* renamed from: R */
    public static void m24003R(int[] iArr) {
        AbstractC9979u.m20294g(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    /* renamed from: S */
    public static void m24004S(int[] iArr, int i10, int i11) {
        AbstractC9979u.m20294g(iArr, "<this>");
        Arrays.sort(iArr, i10, i11);
    }

    /* renamed from: T */
    public static void m24005T(long[] jArr, int i10, int i11) {
        AbstractC9979u.m20294g(jArr, "<this>");
        Arrays.sort(jArr, i10, i11);
    }

    /* renamed from: U */
    public static final void m24006U(Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    /* renamed from: V */
    public static final void m24007V(Object[] objArr, Comparator comparator) {
        AbstractC9979u.m20294g(objArr, "<this>");
        AbstractC9979u.m20294g(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    /* renamed from: W */
    public static void m24008W(Object[] objArr, Comparator comparator, int i10, int i11) {
        AbstractC9979u.m20294g(objArr, "<this>");
        AbstractC9979u.m20294g(comparator, "comparator");
        Arrays.sort(objArr, i10, i11, comparator);
    }

    /* renamed from: X */
    public static Boolean[] m24009X(boolean[] zArr) {
        AbstractC9979u.m20294g(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    /* renamed from: Y */
    public static Double[] m24010Y(double[] dArr) {
        AbstractC9979u.m20294g(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    /* renamed from: Z */
    public static Float[] m24011Z(float[] fArr) {
        AbstractC9979u.m20294g(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    /* renamed from: a0 */
    public static Integer[] m24012a0(int[] iArr) {
        AbstractC9979u.m20294g(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    /* renamed from: b0 */
    public static Long[] m24013b0(long[] jArr) {
        AbstractC9979u.m20294g(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    /* renamed from: g */
    public static List m24014g(Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<this>");
        List listM24118a = AbstractC10970s.m24118a(objArr);
        AbstractC9979u.m20293f(listM24118a, "asList(...)");
        return listM24118a;
    }

    /* renamed from: h */
    public static final int m24015h(float[] fArr, float f10, int i10, int i11) {
        AbstractC9979u.m20294g(fArr, "<this>");
        return Arrays.binarySearch(fArr, i10, i11, f10);
    }

    /* renamed from: i */
    public static /* synthetic */ int m24016i(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        return m24015h(fArr, f10, i10, i11);
    }

    /* renamed from: j */
    public static byte[] m24017j(byte[] bArr, byte[] destination, int i10, int i11, int i12) {
        AbstractC9979u.m20294g(bArr, "<this>");
        AbstractC9979u.m20294g(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    /* renamed from: k */
    public static char[] m24018k(char[] cArr, char[] destination, int i10, int i11, int i12) {
        AbstractC9979u.m20294g(cArr, "<this>");
        AbstractC9979u.m20294g(destination, "destination");
        System.arraycopy(cArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    /* renamed from: l */
    public static double[] m24019l(double[] dArr, double[] destination, int i10, int i11, int i12) {
        AbstractC9979u.m20294g(dArr, "<this>");
        AbstractC9979u.m20294g(destination, "destination");
        System.arraycopy(dArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    /* renamed from: m */
    public static float[] m24020m(float[] fArr, float[] destination, int i10, int i11, int i12) {
        AbstractC9979u.m20294g(fArr, "<this>");
        AbstractC9979u.m20294g(destination, "destination");
        System.arraycopy(fArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    /* renamed from: n */
    public static int[] m24021n(int[] iArr, int[] destination, int i10, int i11, int i12) {
        AbstractC9979u.m20294g(iArr, "<this>");
        AbstractC9979u.m20294g(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    /* renamed from: o */
    public static long[] m24022o(long[] jArr, long[] destination, int i10, int i11, int i12) {
        AbstractC9979u.m20294g(jArr, "<this>");
        AbstractC9979u.m20294g(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    /* renamed from: p */
    public static Object[] m24023p(Object[] objArr, Object[] destination, int i10, int i11, int i12) {
        AbstractC9979u.m20294g(objArr, "<this>");
        AbstractC9979u.m20294g(destination, "destination");
        System.arraycopy(objArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    /* renamed from: q */
    public static /* synthetic */ byte[] m24024q(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return m24017j(bArr, bArr2, i10, i11, i12);
    }

    /* renamed from: r */
    public static /* synthetic */ double[] m24025r(double[] dArr, double[] dArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = dArr.length;
        }
        return m24019l(dArr, dArr2, i10, i11, i12);
    }

    /* renamed from: s */
    public static /* synthetic */ float[] m24026s(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return m24020m(fArr, fArr2, i10, i11, i12);
    }

    /* renamed from: t */
    public static /* synthetic */ int[] m24027t(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return m24021n(iArr, iArr2, i10, i11, i12);
    }

    /* renamed from: u */
    public static /* synthetic */ long[] m24028u(long[] jArr, long[] jArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = jArr.length;
        }
        return m24022o(jArr, jArr2, i10, i11, i12);
    }

    /* renamed from: v */
    public static /* synthetic */ Object[] m24029v(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return m24023p(objArr, objArr2, i10, i11, i12);
    }

    /* renamed from: w */
    public static byte[] m24030w(byte[] bArr, int i10, int i11) {
        AbstractC9979u.m20294g(bArr, "<this>");
        AbstractC10960n.m23982c(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        AbstractC9979u.m20293f(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    /* renamed from: x */
    public static float[] m24031x(float[] fArr, int i10, int i11) {
        AbstractC9979u.m20294g(fArr, "<this>");
        AbstractC10960n.m23982c(i11, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i10, i11);
        AbstractC9979u.m20293f(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    /* renamed from: y */
    public static Object[] m24032y(Object[] objArr, int i10, int i11) {
        AbstractC9979u.m20294g(objArr, "<this>");
        AbstractC10960n.m23982c(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        AbstractC9979u.m20293f(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    /* renamed from: z */
    public static void m24033z(int[] iArr, int i10, int i11, int i12) {
        AbstractC9979u.m20294g(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }
}
