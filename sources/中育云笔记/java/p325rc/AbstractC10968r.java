package p325rc;

import id.InterfaceC9624a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9963e;
import kotlin.jvm.internal.AbstractC9964f;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p265nd.C10405j;
import p296pd.AbstractC10666n;
import p296pd.InterfaceC10659g;
import p310qd.AbstractC10808o;

/* renamed from: rc.r */
/* loaded from: classes6.dex */
public abstract class AbstractC10968r extends AbstractC10964p {

    /* renamed from: rc.r$a */
    public static final class a implements Iterable, InterfaceC9624a {

        /* renamed from: c */
        public final /* synthetic */ Object[] f26469c;

        public a(Object[] objArr) {
            this.f26469c = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC9963e.m20268a(this.f26469c);
        }
    }

    /* renamed from: rc.r$b */
    public static final class b implements Iterable, InterfaceC9624a {

        /* renamed from: c */
        public final /* synthetic */ int[] f26470c;

        public b(int[] iArr) {
            this.f26470c = iArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC9964f.m20271c(this.f26470c);
        }
    }

    /* renamed from: rc.r$c */
    public static final class c implements Iterable, InterfaceC9624a {

        /* renamed from: c */
        public final /* synthetic */ long[] f26471c;

        public c(long[] jArr) {
            this.f26471c = jArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC9964f.m20272d(this.f26471c);
        }
    }

    /* renamed from: rc.r$d */
    public static final class d implements Iterable, InterfaceC9624a {

        /* renamed from: c */
        public final /* synthetic */ float[] f26472c;

        public d(float[] fArr) {
            this.f26472c = fArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC9964f.m20270b(this.f26472c);
        }
    }

    /* renamed from: rc.r$e */
    public static final class e implements Iterable, InterfaceC9624a {

        /* renamed from: c */
        public final /* synthetic */ double[] f26473c;

        public e(double[] dArr) {
            this.f26473c = dArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC9964f.m20269a(this.f26473c);
        }
    }

    /* renamed from: rc.r$f */
    public static final class f implements InterfaceC10659g {

        /* renamed from: a */
        public final /* synthetic */ Object[] f26474a;

        public f(Object[] objArr) {
            this.f26474a = objArr;
        }

        @Override // p296pd.InterfaceC10659g
        public Iterator iterator() {
            return AbstractC9963e.m20268a(this.f26474a);
        }
    }

    /* renamed from: A0 */
    public static int m24041A0(Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<this>");
        return objArr.length - 1;
    }

    /* renamed from: A1 */
    public static final Iterator m24042A1(Object[] objArr) {
        return AbstractC9963e.m20268a(objArr);
    }

    /* renamed from: B0 */
    public static Integer m24043B0(int[] iArr, int i10) {
        AbstractC9979u.m20294g(iArr, "<this>");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    /* renamed from: C0 */
    public static Object m24044C0(Object[] objArr, int i10) {
        AbstractC9979u.m20294g(objArr, "<this>");
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }

    /* renamed from: D0 */
    public static final int m24045D0(byte[] bArr, byte b10) {
        AbstractC9979u.m20294g(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: E0 */
    public static int m24046E0(int[] iArr, int i10) {
        AbstractC9979u.m20294g(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: F0 */
    public static final int m24047F0(long[] jArr, long j10) {
        AbstractC9979u.m20294g(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: G0 */
    public static int m24048G0(Object[] objArr, Object obj) {
        AbstractC9979u.m20294g(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (AbstractC9979u.m20289b(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: H0 */
    public static final int m24049H0(short[] sArr, short s10) {
        AbstractC9979u.m20294g(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: I0 */
    public static final Appendable m24050I0(Object[] objArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9540l interfaceC9540l) throws IOException {
        AbstractC9979u.m20294g(objArr, "<this>");
        AbstractC9979u.m20294g(buffer, "buffer");
        AbstractC9979u.m20294g(separator, "separator");
        AbstractC9979u.m20294g(prefix, "prefix");
        AbstractC9979u.m20294g(postfix, "postfix");
        AbstractC9979u.m20294g(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            AbstractC10808o.m23208a(buffer, obj, interfaceC9540l);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: J0 */
    public static final String m24051J0(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9540l interfaceC9540l) {
        AbstractC9979u.m20294g(objArr, "<this>");
        AbstractC9979u.m20294g(separator, "separator");
        AbstractC9979u.m20294g(prefix, "prefix");
        AbstractC9979u.m20294g(postfix, "postfix");
        AbstractC9979u.m20294g(truncated, "truncated");
        return ((StringBuilder) m24050I0(objArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC9540l)).toString();
    }

    /* renamed from: K0 */
    public static /* synthetic */ String m24052K0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            interfaceC9540l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC9540l interfaceC9540l2 = interfaceC9540l;
        return m24051J0(objArr, charSequence, charSequence2, charSequence3, i10, charSequence5, interfaceC9540l2);
    }

    /* renamed from: L0 */
    public static Object m24053L0(Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[m24041A0(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: M0 */
    public static int m24054M0(Object[] objArr, Object obj) {
        AbstractC9979u.m20294g(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (AbstractC9979u.m20289b(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    /* renamed from: N0 */
    public static Object m24055N0(Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[objArr.length - 1];
    }

    /* renamed from: O0 */
    public static Float m24056O0(float[] fArr) {
        AbstractC9979u.m20294g(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMax = fArr[0];
        int iM24112x0 = m24112x0(fArr);
        int i10 = 1;
        if (1 <= iM24112x0) {
            while (true) {
                fMax = Math.max(fMax, fArr[i10]);
                if (i10 == iM24112x0) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fMax);
    }

    /* renamed from: P0 */
    public static Integer m24057P0(int[] iArr) {
        AbstractC9979u.m20294g(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int iM24114y0 = m24114y0(iArr);
        int i11 = 1;
        if (1 <= iM24114y0) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 < i12) {
                    i10 = i12;
                }
                if (i11 == iM24114y0) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    /* renamed from: Q0 */
    public static int m24058Q0(int[] iArr) {
        AbstractC9979u.m20294g(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int iM24114y0 = m24114y0(iArr);
        int i11 = 1;
        if (1 <= iM24114y0) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 < i12) {
                    i10 = i12;
                }
                if (i11 == iM24114y0) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: R0 */
    public static Float m24059R0(float[] fArr) {
        AbstractC9979u.m20294g(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMin = fArr[0];
        int iM24112x0 = m24112x0(fArr);
        int i10 = 1;
        if (1 <= iM24112x0) {
            while (true) {
                fMin = Math.min(fMin, fArr[i10]);
                if (i10 == iM24112x0) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fMin);
    }

    /* renamed from: S0 */
    public static Integer m24060S0(int[] iArr) {
        AbstractC9979u.m20294g(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int iM24114y0 = m24114y0(iArr);
        int i11 = 1;
        if (1 <= iM24114y0) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 > i12) {
                    i10 = i12;
                }
                if (i11 == iM24114y0) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    /* renamed from: T0 */
    public static int m24061T0(int[] iArr) {
        AbstractC9979u.m20294g(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int iM24114y0 = m24114y0(iArr);
        int i11 = 1;
        if (1 <= iM24114y0) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 > i12) {
                    i10 = i12;
                }
                if (i11 == iM24114y0) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: U0 */
    public static final void m24062U0(double[] dArr, int i10, int i11) {
        AbstractC9979u.m20294g(dArr, "<this>");
        AbstractC10940d.Companion.m23888d(i10, i11, dArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            double d10 = dArr[i10];
            dArr[i10] = dArr[i13];
            dArr[i13] = d10;
            i13--;
            i10++;
        }
    }

    /* renamed from: V0 */
    public static final void m24063V0(float[] fArr, int i10, int i11) {
        AbstractC9979u.m20294g(fArr, "<this>");
        AbstractC10940d.Companion.m23888d(i10, i11, fArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            float f10 = fArr[i10];
            fArr[i10] = fArr[i13];
            fArr[i13] = f10;
            i13--;
            i10++;
        }
    }

    /* renamed from: W0 */
    public static final void m24064W0(int[] iArr, int i10, int i11) {
        AbstractC9979u.m20294g(iArr, "<this>");
        AbstractC10940d.Companion.m23888d(i10, i11, iArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            int i14 = iArr[i10];
            iArr[i10] = iArr[i13];
            iArr[i13] = i14;
            i13--;
            i10++;
        }
    }

    /* renamed from: X0 */
    public static final void m24065X0(long[] jArr, int i10, int i11) {
        AbstractC9979u.m20294g(jArr, "<this>");
        AbstractC10940d.Companion.m23888d(i10, i11, jArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            long j10 = jArr[i10];
            jArr[i10] = jArr[i13];
            jArr[i13] = j10;
            i13--;
            i10++;
        }
    }

    /* renamed from: Y0 */
    public static char m24066Y0(char[] cArr) {
        AbstractC9979u.m20294g(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* renamed from: Z0 */
    public static Object m24067Z0(Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    /* renamed from: a1 */
    public static List m24068a1(Object[] objArr, C10405j indices) {
        AbstractC9979u.m20294g(objArr, "<this>");
        AbstractC9979u.m20294g(indices, "indices");
        return indices.isEmpty() ? AbstractC10978w.m24136n() : AbstractC10964p.m24014g(AbstractC10964p.m24032y(objArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    /* renamed from: b1 */
    public static void m24069b1(double[] dArr, int i10, int i11) {
        AbstractC9979u.m20294g(dArr, "<this>");
        AbstractC10964p.m24001P(dArr, i10, i11);
        m24062U0(dArr, i10, i11);
    }

    /* renamed from: c1 */
    public static void m24071c1(float[] fArr, int i10, int i11) {
        AbstractC9979u.m20294g(fArr, "<this>");
        AbstractC10964p.m24002Q(fArr, i10, i11);
        m24063V0(fArr, i10, i11);
    }

    /* renamed from: d0 */
    public static Iterable m24072d0(double[] dArr) {
        AbstractC9979u.m20294g(dArr, "<this>");
        return dArr.length == 0 ? AbstractC10978w.m24136n() : new e(dArr);
    }

    /* renamed from: d1 */
    public static void m24073d1(int[] iArr, int i10, int i11) {
        AbstractC9979u.m20294g(iArr, "<this>");
        AbstractC10964p.m24004S(iArr, i10, i11);
        m24064W0(iArr, i10, i11);
    }

    /* renamed from: e0 */
    public static Iterable m24074e0(float[] fArr) {
        AbstractC9979u.m20294g(fArr, "<this>");
        return fArr.length == 0 ? AbstractC10978w.m24136n() : new d(fArr);
    }

    /* renamed from: e1 */
    public static void m24075e1(long[] jArr, int i10, int i11) {
        AbstractC9979u.m20294g(jArr, "<this>");
        AbstractC10964p.m24005T(jArr, i10, i11);
        m24065X0(jArr, i10, i11);
    }

    /* renamed from: f0 */
    public static Iterable m24076f0(int[] iArr) {
        AbstractC9979u.m20294g(iArr, "<this>");
        return iArr.length == 0 ? AbstractC10978w.m24136n() : new b(iArr);
    }

    /* renamed from: f1 */
    public static final Object[] m24077f1(Object[] objArr, Comparator comparator) {
        AbstractC9979u.m20294g(objArr, "<this>");
        AbstractC9979u.m20294g(comparator, "comparator");
        if (objArr.length == 0) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
        AbstractC10964p.m24007V(objArrCopyOf, comparator);
        return objArrCopyOf;
    }

    /* renamed from: g0 */
    public static Iterable m24078g0(long[] jArr) {
        AbstractC9979u.m20294g(jArr, "<this>");
        return jArr.length == 0 ? AbstractC10978w.m24136n() : new c(jArr);
    }

    /* renamed from: g1 */
    public static List m24079g1(Object[] objArr, Comparator comparator) {
        AbstractC9979u.m20294g(objArr, "<this>");
        AbstractC9979u.m20294g(comparator, "comparator");
        return AbstractC10964p.m24014g(m24077f1(objArr, comparator));
    }

    /* renamed from: h0 */
    public static Iterable m24080h0(Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<this>");
        return objArr.length == 0 ? AbstractC10978w.m24136n() : new a(objArr);
    }

    /* renamed from: h1 */
    public static int m24081h1(int[] iArr) {
        AbstractC9979u.m20294g(iArr, "<this>");
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }

    /* renamed from: i0 */
    public static InterfaceC10659g m24082i0(Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<this>");
        return objArr.length == 0 ? AbstractC10666n.m22563g() : new f(objArr);
    }

    /* renamed from: i1 */
    public static final List m24083i1(Object[] objArr, int i10) {
        AbstractC9979u.m20294g(objArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return AbstractC10978w.m24136n();
        }
        int length = objArr.length;
        if (i10 >= length) {
            return m24097p1(objArr);
        }
        if (i10 == 1) {
            return AbstractC10976v.m24126e(objArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(objArr[i11]);
        }
        return arrayList;
    }

    /* renamed from: j0 */
    public static boolean m24084j0(byte[] bArr, byte b10) {
        AbstractC9979u.m20294g(bArr, "<this>");
        return m24045D0(bArr, b10) >= 0;
    }

    /* renamed from: j1 */
    public static final Collection m24085j1(int[] iArr, Collection destination) {
        AbstractC9979u.m20294g(iArr, "<this>");
        AbstractC9979u.m20294g(destination, "destination");
        for (int i10 : iArr) {
            destination.add(Integer.valueOf(i10));
        }
        return destination;
    }

    /* renamed from: k0 */
    public static boolean m24086k0(int[] iArr, int i10) {
        AbstractC9979u.m20294g(iArr, "<this>");
        return m24046E0(iArr, i10) >= 0;
    }

    /* renamed from: k1 */
    public static final Collection m24087k1(Object[] objArr, Collection destination) {
        AbstractC9979u.m20294g(objArr, "<this>");
        AbstractC9979u.m20294g(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    /* renamed from: l0 */
    public static boolean m24088l0(long[] jArr, long j10) {
        AbstractC9979u.m20294g(jArr, "<this>");
        return m24047F0(jArr, j10) >= 0;
    }

    /* renamed from: l1 */
    public static List m24089l1(double[] dArr) {
        AbstractC9979u.m20294g(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? m24101r1(dArr) : AbstractC10976v.m24126e(Double.valueOf(dArr[0])) : AbstractC10978w.m24136n();
    }

    /* renamed from: m0 */
    public static boolean m24090m0(Object[] objArr, Object obj) {
        AbstractC9979u.m20294g(objArr, "<this>");
        return m24048G0(objArr, obj) >= 0;
    }

    /* renamed from: m1 */
    public static List m24091m1(float[] fArr) {
        AbstractC9979u.m20294g(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? m24103s1(fArr) : AbstractC10976v.m24126e(Float.valueOf(fArr[0])) : AbstractC10978w.m24136n();
    }

    /* renamed from: n0 */
    public static boolean m24092n0(short[] sArr, short s10) {
        AbstractC9979u.m20294g(sArr, "<this>");
        return m24049H0(sArr, s10) >= 0;
    }

    /* renamed from: n1 */
    public static List m24093n1(int[] iArr) {
        AbstractC9979u.m20294g(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? m24105t1(iArr) : AbstractC10976v.m24126e(Integer.valueOf(iArr[0])) : AbstractC10978w.m24136n();
    }

    /* renamed from: o0 */
    public static List m24094o0(int[] iArr) {
        AbstractC9979u.m20294g(iArr, "<this>");
        return AbstractC10947g0.m23922X0(m24113x1(iArr));
    }

    /* renamed from: o1 */
    public static List m24095o1(long[] jArr) {
        AbstractC9979u.m20294g(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? m24107u1(jArr) : AbstractC10976v.m24126e(Long.valueOf(jArr[0])) : AbstractC10978w.m24136n();
    }

    /* renamed from: p0 */
    public static List m24096p0(Object[] objArr, int i10) {
        AbstractC9979u.m20294g(objArr, "<this>");
        if (i10 >= 0) {
            return m24083i1(objArr, AbstractC10410o.m21752e(objArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    /* renamed from: p1 */
    public static List m24097p1(Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? m24109v1(objArr) : AbstractC10976v.m24126e(objArr[0]) : AbstractC10978w.m24136n();
    }

    /* renamed from: q0 */
    public static List m24098q0(Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<this>");
        return (List) m24100r0(objArr, new ArrayList());
    }

    /* renamed from: q1 */
    public static List m24099q1(boolean[] zArr) {
        AbstractC9979u.m20294g(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? m24111w1(zArr) : AbstractC10976v.m24126e(Boolean.valueOf(zArr[0])) : AbstractC10978w.m24136n();
    }

    /* renamed from: r0 */
    public static final Collection m24100r0(Object[] objArr, Collection destination) {
        AbstractC9979u.m20294g(objArr, "<this>");
        AbstractC9979u.m20294g(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    /* renamed from: r1 */
    public static final List m24101r1(double[] dArr) {
        AbstractC9979u.m20294g(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    /* renamed from: s0 */
    public static int m24102s0(int[] iArr) {
        AbstractC9979u.m20294g(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: s1 */
    public static final List m24103s1(float[] fArr) {
        AbstractC9979u.m20294g(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    /* renamed from: t0 */
    public static Object m24104t0(Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: t1 */
    public static List m24105t1(int[] iArr) {
        AbstractC9979u.m20294g(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    /* renamed from: u0 */
    public static Object m24106u0(Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* renamed from: u1 */
    public static final List m24107u1(long[] jArr) {
        AbstractC9979u.m20294g(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    /* renamed from: v0 */
    public static C10405j m24108v0(int[] iArr) {
        AbstractC9979u.m20294g(iArr, "<this>");
        return new C10405j(0, m24114y0(iArr));
    }

    /* renamed from: v1 */
    public static List m24109v1(Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<this>");
        return new ArrayList(AbstractC10978w.m24131i(objArr, false, 1, null));
    }

    /* renamed from: w0 */
    public static C10405j m24110w0(Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<this>");
        return new C10405j(0, m24041A0(objArr));
    }

    /* renamed from: w1 */
    public static final List m24111w1(boolean[] zArr) {
        AbstractC9979u.m20294g(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    /* renamed from: x0 */
    public static int m24112x0(float[] fArr) {
        AbstractC9979u.m20294g(fArr, "<this>");
        return fArr.length - 1;
    }

    /* renamed from: x1 */
    public static final Set m24113x1(int[] iArr) {
        AbstractC9979u.m20294g(iArr, "<this>");
        return (Set) m24085j1(iArr, new LinkedHashSet(AbstractC10967q0.m24038e(iArr.length)));
    }

    /* renamed from: y0 */
    public static int m24114y0(int[] iArr) {
        AbstractC9979u.m20294g(iArr, "<this>");
        return iArr.length - 1;
    }

    /* renamed from: y1 */
    public static Set m24115y1(Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) m24087k1(objArr, new LinkedHashSet(AbstractC10967q0.m24038e(objArr.length))) : AbstractC10981x0.m24158d(objArr[0]) : AbstractC10983y0.m24160f();
    }

    /* renamed from: z0 */
    public static int m24116z0(long[] jArr) {
        AbstractC9979u.m20294g(jArr, "<this>");
        return jArr.length - 1;
    }

    /* renamed from: z1 */
    public static Iterable m24117z1(final Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<this>");
        return new C10957l0(new InterfaceC9529a() { // from class: rc.q
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return AbstractC10968r.m24042A1(objArr);
            }
        });
    }
}
