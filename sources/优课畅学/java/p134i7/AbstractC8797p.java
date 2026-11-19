package p134i7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: i7.p */
/* loaded from: classes5.dex */
public abstract class AbstractC8797p extends AbstractC8795o {
    /* renamed from: A */
    public static void m14611A(int[] iArr, int i10, int i11, int i12) {
        AbstractC9133u.m16133g(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    /* renamed from: B */
    public static void m14612B(long[] jArr, long j10, int i10, int i11) {
        AbstractC9133u.m16133g(jArr, "<this>");
        Arrays.fill(jArr, i10, i11, j10);
    }

    /* renamed from: C */
    public static void m14613C(Object[] objArr, Object obj, int i10, int i11) {
        AbstractC9133u.m16133g(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, obj);
    }

    /* renamed from: D */
    public static final void m14614D(boolean[] zArr, boolean z10, int i10, int i11) {
        AbstractC9133u.m16133g(zArr, "<this>");
        Arrays.fill(zArr, i10, i11, z10);
    }

    /* renamed from: E */
    public static /* synthetic */ void m14615E(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        m14611A(iArr, i10, i11, i12);
    }

    /* renamed from: F */
    public static /* synthetic */ void m14616F(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        m14612B(jArr, j10, i10, i11);
    }

    /* renamed from: G */
    public static /* synthetic */ void m14617G(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        m14613C(objArr, obj, i10, i11);
    }

    /* renamed from: H */
    public static /* synthetic */ void m14618H(boolean[] zArr, boolean z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = zArr.length;
        }
        m14614D(zArr, z10, i10, i11);
    }

    /* renamed from: I */
    public static double[] m14619I(double[] dArr, double[] elements) {
        AbstractC9133u.m16133g(dArr, "<this>");
        AbstractC9133u.m16133g(elements, "elements");
        int length = dArr.length;
        int length2 = elements.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(elements, 0, dArrCopyOf, length, length2);
        AbstractC9133u.m16130d(dArrCopyOf);
        return dArrCopyOf;
    }

    /* renamed from: J */
    public static float[] m14620J(float[] fArr, float[] elements) {
        AbstractC9133u.m16133g(fArr, "<this>");
        AbstractC9133u.m16133g(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, fArrCopyOf, length, length2);
        AbstractC9133u.m16130d(fArrCopyOf);
        return fArrCopyOf;
    }

    /* renamed from: K */
    public static int[] m14621K(int[] iArr, int i10) {
        AbstractC9133u.m16133g(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i10;
        AbstractC9133u.m16130d(iArrCopyOf);
        return iArrCopyOf;
    }

    /* renamed from: L */
    public static int[] m14622L(int[] iArr, int[] elements) {
        AbstractC9133u.m16133g(iArr, "<this>");
        AbstractC9133u.m16133g(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        AbstractC9133u.m16130d(iArrCopyOf);
        return iArrCopyOf;
    }

    /* renamed from: M */
    public static long[] m14623M(long[] jArr, long[] elements) {
        AbstractC9133u.m16133g(jArr, "<this>");
        AbstractC9133u.m16133g(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, jArrCopyOf, length, length2);
        AbstractC9133u.m16130d(jArrCopyOf);
        return jArrCopyOf;
    }

    /* renamed from: N */
    public static Object[] m14624N(Object[] objArr, Object obj) {
        AbstractC9133u.m16133g(objArr, "<this>");
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        AbstractC9133u.m16130d(objArrCopyOf);
        return objArrCopyOf;
    }

    /* renamed from: O */
    public static Object[] m14625O(Object[] objArr, Object[] elements) {
        AbstractC9133u.m16133g(objArr, "<this>");
        AbstractC9133u.m16133g(elements, "elements");
        int length = objArr.length;
        int length2 = elements.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(elements, 0, objArrCopyOf, length, length2);
        AbstractC9133u.m16130d(objArrCopyOf);
        return objArrCopyOf;
    }

    /* renamed from: P */
    public static boolean[] m14626P(boolean[] zArr, boolean[] elements) {
        AbstractC9133u.m16133g(zArr, "<this>");
        AbstractC9133u.m16133g(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, zArrCopyOf, length, length2);
        AbstractC9133u.m16130d(zArrCopyOf);
        return zArrCopyOf;
    }

    /* renamed from: Q */
    public static void m14627Q(double[] dArr, int i10, int i11) {
        AbstractC9133u.m16133g(dArr, "<this>");
        Arrays.sort(dArr, i10, i11);
    }

    /* renamed from: R */
    public static void m14628R(float[] fArr, int i10, int i11) {
        AbstractC9133u.m16133g(fArr, "<this>");
        Arrays.sort(fArr, i10, i11);
    }

    /* renamed from: S */
    public static void m14629S(int[] iArr) {
        AbstractC9133u.m16133g(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    /* renamed from: T */
    public static void m14630T(int[] iArr, int i10, int i11) {
        AbstractC9133u.m16133g(iArr, "<this>");
        Arrays.sort(iArr, i10, i11);
    }

    /* renamed from: U */
    public static void m14631U(long[] jArr, int i10, int i11) {
        AbstractC9133u.m16133g(jArr, "<this>");
        Arrays.sort(jArr, i10, i11);
    }

    /* renamed from: V */
    public static final void m14632V(Object[] objArr) {
        AbstractC9133u.m16133g(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    /* renamed from: W */
    public static final void m14633W(Object[] objArr, Comparator comparator) {
        AbstractC9133u.m16133g(objArr, "<this>");
        AbstractC9133u.m16133g(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    /* renamed from: X */
    public static void m14634X(Object[] objArr, Comparator comparator, int i10, int i11) {
        AbstractC9133u.m16133g(objArr, "<this>");
        AbstractC9133u.m16133g(comparator, "comparator");
        Arrays.sort(objArr, i10, i11, comparator);
    }

    /* renamed from: Y */
    public static Boolean[] m14635Y(boolean[] zArr) {
        AbstractC9133u.m16133g(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    /* renamed from: Z */
    public static Double[] m14636Z(double[] dArr) {
        AbstractC9133u.m16133g(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    /* renamed from: a0 */
    public static Float[] m14637a0(float[] fArr) {
        AbstractC9133u.m16133g(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    /* renamed from: b0 */
    public static Integer[] m14638b0(int[] iArr) {
        AbstractC9133u.m16133g(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    /* renamed from: c0 */
    public static Long[] m14639c0(long[] jArr) {
        AbstractC9133u.m16133g(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    /* renamed from: g */
    public static List m14640g(Object[] objArr) {
        AbstractC9133u.m16133g(objArr, "<this>");
        List listM14748a = AbstractC8803s.m14748a(objArr);
        AbstractC9133u.m16132f(listM14748a, "asList(...)");
        return listM14748a;
    }

    /* renamed from: h */
    public static final int m14641h(float[] fArr, float f10, int i10, int i11) {
        AbstractC9133u.m16133g(fArr, "<this>");
        return Arrays.binarySearch(fArr, i10, i11, f10);
    }

    /* renamed from: i */
    public static /* synthetic */ int m14642i(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        return m14641h(fArr, f10, i10, i11);
    }

    /* renamed from: j */
    public static byte[] m14643j(byte[] bArr, byte[] destination, int i10, int i11, int i12) {
        AbstractC9133u.m16133g(bArr, "<this>");
        AbstractC9133u.m16133g(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    /* renamed from: k */
    public static char[] m14644k(char[] cArr, char[] destination, int i10, int i11, int i12) {
        AbstractC9133u.m16133g(cArr, "<this>");
        AbstractC9133u.m16133g(destination, "destination");
        System.arraycopy(cArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    /* renamed from: l */
    public static double[] m14645l(double[] dArr, double[] destination, int i10, int i11, int i12) {
        AbstractC9133u.m16133g(dArr, "<this>");
        AbstractC9133u.m16133g(destination, "destination");
        System.arraycopy(dArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    /* renamed from: m */
    public static float[] m14646m(float[] fArr, float[] destination, int i10, int i11, int i12) {
        AbstractC9133u.m16133g(fArr, "<this>");
        AbstractC9133u.m16133g(destination, "destination");
        System.arraycopy(fArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    /* renamed from: n */
    public static int[] m14647n(int[] iArr, int[] destination, int i10, int i11, int i12) {
        AbstractC9133u.m16133g(iArr, "<this>");
        AbstractC9133u.m16133g(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    /* renamed from: o */
    public static long[] m14648o(long[] jArr, long[] destination, int i10, int i11, int i12) {
        AbstractC9133u.m16133g(jArr, "<this>");
        AbstractC9133u.m16133g(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    /* renamed from: p */
    public static Object[] m14649p(Object[] objArr, Object[] destination, int i10, int i11, int i12) {
        AbstractC9133u.m16133g(objArr, "<this>");
        AbstractC9133u.m16133g(destination, "destination");
        System.arraycopy(objArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    /* renamed from: q */
    public static /* synthetic */ byte[] m14650q(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return m14643j(bArr, bArr2, i10, i11, i12);
    }

    /* renamed from: r */
    public static /* synthetic */ double[] m14651r(double[] dArr, double[] dArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = dArr.length;
        }
        return m14645l(dArr, dArr2, i10, i11, i12);
    }

    /* renamed from: s */
    public static /* synthetic */ float[] m14652s(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return m14646m(fArr, fArr2, i10, i11, i12);
    }

    /* renamed from: t */
    public static /* synthetic */ int[] m14653t(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return m14647n(iArr, iArr2, i10, i11, i12);
    }

    /* renamed from: u */
    public static /* synthetic */ long[] m14654u(long[] jArr, long[] jArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = jArr.length;
        }
        return m14648o(jArr, jArr2, i10, i11, i12);
    }

    /* renamed from: v */
    public static /* synthetic */ Object[] m14655v(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return m14649p(objArr, objArr2, i10, i11, i12);
    }

    /* renamed from: w */
    public static byte[] m14656w(byte[] bArr, int i10, int i11) {
        AbstractC9133u.m16133g(bArr, "<this>");
        AbstractC8793n.m14606c(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        AbstractC9133u.m16132f(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    /* renamed from: x */
    public static float[] m14657x(float[] fArr, int i10, int i11) {
        AbstractC9133u.m16133g(fArr, "<this>");
        AbstractC8793n.m14606c(i11, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i10, i11);
        AbstractC9133u.m16132f(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    /* renamed from: y */
    public static Object[] m14658y(Object[] objArr, int i10, int i11) {
        AbstractC9133u.m16133g(objArr, "<this>");
        AbstractC8793n.m14606c(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        AbstractC9133u.m16132f(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    /* renamed from: z */
    public static void m14659z(byte[] bArr, byte b10, int i10, int i11) {
        AbstractC9133u.m16133g(bArr, "<this>");
        Arrays.fill(bArr, i10, i11, b10);
    }
}
