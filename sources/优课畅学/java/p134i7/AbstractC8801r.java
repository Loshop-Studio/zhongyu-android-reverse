package p134i7;

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
import kotlin.jvm.internal.AbstractC9117e;
import kotlin.jvm.internal.AbstractC9118f;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p077d8.C8321f;
import p101f8.AbstractC8476n;
import p101f8.InterfaceC8469g;
import p113g8.AbstractC8676o;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p311y7.InterfaceC10668a;

/* renamed from: i7.r */
/* loaded from: classes5.dex */
public abstract class AbstractC8801r extends AbstractC8797p {

    /* renamed from: i7.r$a */
    public static final class a implements Iterable, InterfaceC10668a {

        /* renamed from: a */
        public final /* synthetic */ Object[] f16475a;

        public a(Object[] objArr) {
            this.f16475a = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC9117e.m16110a(this.f16475a);
        }
    }

    /* renamed from: i7.r$b */
    public static final class b implements Iterable, InterfaceC10668a {

        /* renamed from: a */
        public final /* synthetic */ int[] f16476a;

        public b(int[] iArr) {
            this.f16476a = iArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC9118f.m16113c(this.f16476a);
        }
    }

    /* renamed from: i7.r$c */
    public static final class c implements Iterable, InterfaceC10668a {

        /* renamed from: a */
        public final /* synthetic */ long[] f16477a;

        public c(long[] jArr) {
            this.f16477a = jArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC9118f.m16114d(this.f16477a);
        }
    }

    /* renamed from: i7.r$d */
    public static final class d implements Iterable, InterfaceC10668a {

        /* renamed from: a */
        public final /* synthetic */ float[] f16478a;

        public d(float[] fArr) {
            this.f16478a = fArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC9118f.m16112b(this.f16478a);
        }
    }

    /* renamed from: i7.r$e */
    public static final class e implements Iterable, InterfaceC10668a {

        /* renamed from: a */
        public final /* synthetic */ double[] f16479a;

        public e(double[] dArr) {
            this.f16479a = dArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC9118f.m16111a(this.f16479a);
        }
    }

    /* renamed from: i7.r$f */
    public static final class f implements InterfaceC8469g {

        /* renamed from: a */
        public final /* synthetic */ Object[] f16480a;

        public f(Object[] objArr) {
            this.f16480a = objArr;
        }

        @Override // p101f8.InterfaceC8469g
        public Iterator iterator() {
            return AbstractC9117e.m16110a(this.f16480a);
        }
    }

    /* renamed from: A0 */
    public static int m14666A0(long[] jArr) {
        AbstractC9133u.m16133g(jArr, "<this>");
        return jArr.length - 1;
    }

    /* renamed from: A1 */
    public static List m14667A1(Object[] objArr) {
        AbstractC9133u.m16133g(objArr, "<this>");
        return new ArrayList(AbstractC8809v.m14766i(objArr, false, 1, null));
    }

    /* renamed from: B0 */
    public static int m14668B0(Object[] objArr) {
        AbstractC9133u.m16133g(objArr, "<this>");
        return objArr.length - 1;
    }

    /* renamed from: B1 */
    public static final List m14669B1(boolean[] zArr) {
        AbstractC9133u.m16133g(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    /* renamed from: C0 */
    public static Integer m14670C0(int[] iArr, int i10) {
        AbstractC9133u.m16133g(iArr, "<this>");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    /* renamed from: C1 */
    public static final Set m14671C1(int[] iArr) {
        AbstractC9133u.m16133g(iArr, "<this>");
        return (Set) m14724o1(iArr, new LinkedHashSet(AbstractC8798p0.m14663e(iArr.length)));
    }

    /* renamed from: D0 */
    public static Object m14672D0(Object[] objArr, int i10) {
        AbstractC9133u.m16133g(objArr, "<this>");
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }

    /* renamed from: D1 */
    public static Set m14673D1(Object[] objArr) {
        AbstractC9133u.m16133g(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) m14726p1(objArr, new LinkedHashSet(AbstractC8798p0.m14663e(objArr.length))) : AbstractC8810v0.m14784d(objArr[0]) : AbstractC8812w0.m14788f();
    }

    /* renamed from: E0 */
    public static final int m14674E0(byte[] bArr, byte b10) {
        AbstractC9133u.m16133g(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: E1 */
    public static Iterable m14675E1(final Object[] objArr) {
        AbstractC9133u.m16133g(objArr, "<this>");
        return new C8788k0(new InterfaceC10559a() { // from class: i7.q
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return AbstractC8801r.m14677F1(objArr);
            }
        });
    }

    /* renamed from: F0 */
    public static int m14676F0(int[] iArr, int i10) {
        AbstractC9133u.m16133g(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: F1 */
    public static final Iterator m14677F1(Object[] objArr) {
        return AbstractC9117e.m16110a(objArr);
    }

    /* renamed from: G0 */
    public static final int m14678G0(long[] jArr, long j10) {
        AbstractC9133u.m16133g(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: H0 */
    public static int m14679H0(Object[] objArr, Object obj) {
        AbstractC9133u.m16133g(objArr, "<this>");
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
            if (AbstractC9133u.m16128b(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: I0 */
    public static final int m14680I0(short[] sArr, short s10) {
        AbstractC9133u.m16133g(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: J0 */
    public static final Appendable m14681J0(byte[] bArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC10570l interfaceC10570l) throws IOException {
        AbstractC9133u.m16133g(bArr, "<this>");
        AbstractC9133u.m16133g(buffer, "buffer");
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        AbstractC9133u.m16133g(postfix, "postfix");
        AbstractC9133u.m16133g(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (interfaceC10570l != null) {
                buffer.append((CharSequence) interfaceC10570l.invoke(Byte.valueOf(b10)));
            } else {
                buffer.append(String.valueOf((int) b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: K0 */
    public static final Appendable m14682K0(Object[] objArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC10570l interfaceC10570l) throws IOException {
        AbstractC9133u.m16133g(objArr, "<this>");
        AbstractC9133u.m16133g(buffer, "buffer");
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        AbstractC9133u.m16133g(postfix, "postfix");
        AbstractC9133u.m16133g(truncated, "truncated");
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
            AbstractC8676o.m14073a(buffer, obj, interfaceC10570l);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: L0 */
    public static final String m14683L0(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC10570l interfaceC10570l) {
        AbstractC9133u.m16133g(bArr, "<this>");
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        AbstractC9133u.m16133g(postfix, "postfix");
        AbstractC9133u.m16133g(truncated, "truncated");
        return ((StringBuilder) m14681J0(bArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC10570l)).toString();
    }

    /* renamed from: M0 */
    public static final String m14684M0(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC10570l interfaceC10570l) {
        AbstractC9133u.m16133g(objArr, "<this>");
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        AbstractC9133u.m16133g(postfix, "postfix");
        AbstractC9133u.m16133g(truncated, "truncated");
        return ((StringBuilder) m14682K0(objArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC10570l)).toString();
    }

    /* renamed from: N0 */
    public static /* synthetic */ String m14685N0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC10570l interfaceC10570l, int i11, Object obj) {
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
            interfaceC10570l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        return m14683L0(bArr, charSequence, charSequence2, charSequence3, i10, charSequence5, interfaceC10570l2);
    }

    /* renamed from: O0 */
    public static /* synthetic */ String m14686O0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC10570l interfaceC10570l, int i11, Object obj) {
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
            interfaceC10570l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        return m14684M0(objArr, charSequence, charSequence2, charSequence3, i10, charSequence5, interfaceC10570l2);
    }

    /* renamed from: P0 */
    public static Object m14687P0(Object[] objArr) {
        AbstractC9133u.m16133g(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[m14668B0(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: Q0 */
    public static int m14688Q0(Object[] objArr, Object obj) {
        AbstractC9133u.m16133g(objArr, "<this>");
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
                    if (AbstractC9133u.m16128b(obj, objArr[length2])) {
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

    /* renamed from: R0 */
    public static Object m14689R0(Object[] objArr) {
        AbstractC9133u.m16133g(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[objArr.length - 1];
    }

    /* renamed from: S0 */
    public static Float m14690S0(float[] fArr) {
        AbstractC9133u.m16133g(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMax = fArr[0];
        int iM14743y0 = m14743y0(fArr);
        int i10 = 1;
        if (1 <= iM14743y0) {
            while (true) {
                fMax = Math.max(fMax, fArr[i10]);
                if (i10 == iM14743y0) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fMax);
    }

    /* renamed from: T0 */
    public static Integer m14691T0(int[] iArr) {
        AbstractC9133u.m16133g(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int iM14745z0 = m14745z0(iArr);
        int i11 = 1;
        if (1 <= iM14745z0) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 < i12) {
                    i10 = i12;
                }
                if (i11 == iM14745z0) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    /* renamed from: U0 */
    public static int m14692U0(int[] iArr) {
        AbstractC9133u.m16133g(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int iM14745z0 = m14745z0(iArr);
        int i11 = 1;
        if (1 <= iM14745z0) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 < i12) {
                    i10 = i12;
                }
                if (i11 == iM14745z0) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: V0 */
    public static Float m14693V0(float[] fArr) {
        AbstractC9133u.m16133g(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMin = fArr[0];
        int iM14743y0 = m14743y0(fArr);
        int i10 = 1;
        if (1 <= iM14743y0) {
            while (true) {
                fMin = Math.min(fMin, fArr[i10]);
                if (i10 == iM14743y0) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fMin);
    }

    /* renamed from: W0 */
    public static Integer m14694W0(int[] iArr) {
        AbstractC9133u.m16133g(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int iM14745z0 = m14745z0(iArr);
        int i11 = 1;
        if (1 <= iM14745z0) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 > i12) {
                    i10 = i12;
                }
                if (i11 == iM14745z0) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    /* renamed from: X0 */
    public static int m14695X0(int[] iArr) {
        AbstractC9133u.m16133g(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int iM14745z0 = m14745z0(iArr);
        int i11 = 1;
        if (1 <= iM14745z0) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 > i12) {
                    i10 = i12;
                }
                if (i11 == iM14745z0) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: Y0 */
    public static final void m14696Y0(double[] dArr, int i10, int i11) {
        AbstractC9133u.m16133g(dArr, "<this>");
        AbstractC8773d.Companion.m14514d(i10, i11, dArr.length);
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

    /* renamed from: Z0 */
    public static final void m14697Z0(float[] fArr, int i10, int i11) {
        AbstractC9133u.m16133g(fArr, "<this>");
        AbstractC8773d.Companion.m14514d(i10, i11, fArr.length);
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

    /* renamed from: a1 */
    public static final void m14698a1(int[] iArr, int i10, int i11) {
        AbstractC9133u.m16133g(iArr, "<this>");
        AbstractC8773d.Companion.m14514d(i10, i11, iArr.length);
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

    /* renamed from: b1 */
    public static final void m14699b1(long[] jArr, int i10, int i11) {
        AbstractC9133u.m16133g(jArr, "<this>");
        AbstractC8773d.Companion.m14514d(i10, i11, jArr.length);
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

    /* renamed from: c1 */
    public static char m14700c1(char[] cArr) {
        AbstractC9133u.m16133g(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* renamed from: d1 */
    public static Object m14702d1(Object[] objArr) {
        AbstractC9133u.m16133g(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    /* renamed from: e0 */
    public static Iterable m14703e0(double[] dArr) {
        AbstractC9133u.m16133g(dArr, "<this>");
        return dArr.length == 0 ? AbstractC8809v.m14771n() : new e(dArr);
    }

    /* renamed from: e1 */
    public static List m14704e1(Object[] objArr, C8321f indices) {
        AbstractC9133u.m16133g(objArr, "<this>");
        AbstractC9133u.m16133g(indices, "indices");
        return indices.isEmpty() ? AbstractC8809v.m14771n() : AbstractC8797p.m14640g(AbstractC8797p.m14658y(objArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    /* renamed from: f0 */
    public static Iterable m14705f0(float[] fArr) {
        AbstractC9133u.m16133g(fArr, "<this>");
        return fArr.length == 0 ? AbstractC8809v.m14771n() : new d(fArr);
    }

    /* renamed from: f1 */
    public static byte[] m14706f1(byte[] bArr, C8321f indices) {
        AbstractC9133u.m16133g(bArr, "<this>");
        AbstractC9133u.m16133g(indices, "indices");
        return indices.isEmpty() ? new byte[0] : AbstractC8797p.m14656w(bArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    /* renamed from: g0 */
    public static Iterable m14707g0(int[] iArr) {
        AbstractC9133u.m16133g(iArr, "<this>");
        return iArr.length == 0 ? AbstractC8809v.m14771n() : new b(iArr);
    }

    /* renamed from: g1 */
    public static void m14708g1(double[] dArr, int i10, int i11) {
        AbstractC9133u.m16133g(dArr, "<this>");
        AbstractC8797p.m14627Q(dArr, i10, i11);
        m14696Y0(dArr, i10, i11);
    }

    /* renamed from: h0 */
    public static Iterable m14709h0(long[] jArr) {
        AbstractC9133u.m16133g(jArr, "<this>");
        return jArr.length == 0 ? AbstractC8809v.m14771n() : new c(jArr);
    }

    /* renamed from: h1 */
    public static void m14710h1(float[] fArr, int i10, int i11) {
        AbstractC9133u.m16133g(fArr, "<this>");
        AbstractC8797p.m14628R(fArr, i10, i11);
        m14697Z0(fArr, i10, i11);
    }

    /* renamed from: i0 */
    public static Iterable m14711i0(Object[] objArr) {
        AbstractC9133u.m16133g(objArr, "<this>");
        return objArr.length == 0 ? AbstractC8809v.m14771n() : new a(objArr);
    }

    /* renamed from: i1 */
    public static void m14712i1(int[] iArr, int i10, int i11) {
        AbstractC9133u.m16133g(iArr, "<this>");
        AbstractC8797p.m14630T(iArr, i10, i11);
        m14698a1(iArr, i10, i11);
    }

    /* renamed from: j0 */
    public static InterfaceC8469g m14713j0(Object[] objArr) {
        AbstractC9133u.m16133g(objArr, "<this>");
        return objArr.length == 0 ? AbstractC8476n.m13832g() : new f(objArr);
    }

    /* renamed from: j1 */
    public static void m14714j1(long[] jArr, int i10, int i11) {
        AbstractC9133u.m16133g(jArr, "<this>");
        AbstractC8797p.m14631U(jArr, i10, i11);
        m14699b1(jArr, i10, i11);
    }

    /* renamed from: k0 */
    public static boolean m14715k0(byte[] bArr, byte b10) {
        AbstractC9133u.m16133g(bArr, "<this>");
        return m14674E0(bArr, b10) >= 0;
    }

    /* renamed from: k1 */
    public static final Object[] m14716k1(Object[] objArr, Comparator comparator) {
        AbstractC9133u.m16133g(objArr, "<this>");
        AbstractC9133u.m16133g(comparator, "comparator");
        if (objArr.length == 0) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
        AbstractC8797p.m14633W(objArrCopyOf, comparator);
        return objArrCopyOf;
    }

    /* renamed from: l0 */
    public static boolean m14717l0(int[] iArr, int i10) {
        AbstractC9133u.m16133g(iArr, "<this>");
        return m14676F0(iArr, i10) >= 0;
    }

    /* renamed from: l1 */
    public static List m14718l1(Object[] objArr, Comparator comparator) {
        AbstractC9133u.m16133g(objArr, "<this>");
        AbstractC9133u.m16133g(comparator, "comparator");
        return AbstractC8797p.m14640g(m14716k1(objArr, comparator));
    }

    /* renamed from: m0 */
    public static boolean m14719m0(long[] jArr, long j10) {
        AbstractC9133u.m16133g(jArr, "<this>");
        return m14678G0(jArr, j10) >= 0;
    }

    /* renamed from: m1 */
    public static int m14720m1(int[] iArr) {
        AbstractC9133u.m16133g(iArr, "<this>");
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }

    /* renamed from: n0 */
    public static boolean m14721n0(Object[] objArr, Object obj) {
        AbstractC9133u.m16133g(objArr, "<this>");
        return m14679H0(objArr, obj) >= 0;
    }

    /* renamed from: n1 */
    public static final List m14722n1(Object[] objArr, int i10) {
        AbstractC9133u.m16133g(objArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return AbstractC8809v.m14771n();
        }
        int length = objArr.length;
        if (i10 >= length) {
            return m14736u1(objArr);
        }
        if (i10 == 1) {
            return AbstractC8807u.m14755e(objArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(objArr[i11]);
        }
        return arrayList;
    }

    /* renamed from: o0 */
    public static boolean m14723o0(short[] sArr, short s10) {
        AbstractC9133u.m16133g(sArr, "<this>");
        return m14680I0(sArr, s10) >= 0;
    }

    /* renamed from: o1 */
    public static final Collection m14724o1(int[] iArr, Collection destination) {
        AbstractC9133u.m16133g(iArr, "<this>");
        AbstractC9133u.m16133g(destination, "destination");
        for (int i10 : iArr) {
            destination.add(Integer.valueOf(i10));
        }
        return destination;
    }

    /* renamed from: p0 */
    public static List m14725p0(int[] iArr) {
        AbstractC9133u.m16133g(iArr, "<this>");
        return AbstractC8778f0.m14544U0(m14671C1(iArr));
    }

    /* renamed from: p1 */
    public static final Collection m14726p1(Object[] objArr, Collection destination) {
        AbstractC9133u.m16133g(objArr, "<this>");
        AbstractC9133u.m16133g(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    /* renamed from: q0 */
    public static List m14727q0(Object[] objArr, int i10) {
        AbstractC9133u.m16133g(objArr, "<this>");
        if (i10 >= 0) {
            return m14722n1(objArr, AbstractC8323h.m13510e(objArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    /* renamed from: q1 */
    public static List m14728q1(double[] dArr) {
        AbstractC9133u.m16133g(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? m14740w1(dArr) : AbstractC8807u.m14755e(Double.valueOf(dArr[0])) : AbstractC8809v.m14771n();
    }

    /* renamed from: r0 */
    public static List m14729r0(Object[] objArr) {
        AbstractC9133u.m16133g(objArr, "<this>");
        return (List) m14731s0(objArr, new ArrayList());
    }

    /* renamed from: r1 */
    public static List m14730r1(float[] fArr) {
        AbstractC9133u.m16133g(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? m14742x1(fArr) : AbstractC8807u.m14755e(Float.valueOf(fArr[0])) : AbstractC8809v.m14771n();
    }

    /* renamed from: s0 */
    public static final Collection m14731s0(Object[] objArr, Collection destination) {
        AbstractC9133u.m16133g(objArr, "<this>");
        AbstractC9133u.m16133g(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    /* renamed from: s1 */
    public static List m14732s1(int[] iArr) {
        AbstractC9133u.m16133g(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? m14744y1(iArr) : AbstractC8807u.m14755e(Integer.valueOf(iArr[0])) : AbstractC8809v.m14771n();
    }

    /* renamed from: t0 */
    public static int m14733t0(int[] iArr) {
        AbstractC9133u.m16133g(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: t1 */
    public static List m14734t1(long[] jArr) {
        AbstractC9133u.m16133g(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? m14746z1(jArr) : AbstractC8807u.m14755e(Long.valueOf(jArr[0])) : AbstractC8809v.m14771n();
    }

    /* renamed from: u0 */
    public static Object m14735u0(Object[] objArr) {
        AbstractC9133u.m16133g(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: u1 */
    public static List m14736u1(Object[] objArr) {
        AbstractC9133u.m16133g(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? m14667A1(objArr) : AbstractC8807u.m14755e(objArr[0]) : AbstractC8809v.m14771n();
    }

    /* renamed from: v0 */
    public static Object m14737v0(Object[] objArr) {
        AbstractC9133u.m16133g(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* renamed from: v1 */
    public static List m14738v1(boolean[] zArr) {
        AbstractC9133u.m16133g(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? m14669B1(zArr) : AbstractC8807u.m14755e(Boolean.valueOf(zArr[0])) : AbstractC8809v.m14771n();
    }

    /* renamed from: w0 */
    public static C8321f m14739w0(int[] iArr) {
        AbstractC9133u.m16133g(iArr, "<this>");
        return new C8321f(0, m14745z0(iArr));
    }

    /* renamed from: w1 */
    public static final List m14740w1(double[] dArr) {
        AbstractC9133u.m16133g(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    /* renamed from: x0 */
    public static C8321f m14741x0(Object[] objArr) {
        AbstractC9133u.m16133g(objArr, "<this>");
        return new C8321f(0, m14668B0(objArr));
    }

    /* renamed from: x1 */
    public static final List m14742x1(float[] fArr) {
        AbstractC9133u.m16133g(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    /* renamed from: y0 */
    public static int m14743y0(float[] fArr) {
        AbstractC9133u.m16133g(fArr, "<this>");
        return fArr.length - 1;
    }

    /* renamed from: y1 */
    public static List m14744y1(int[] iArr) {
        AbstractC9133u.m16133g(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    /* renamed from: z0 */
    public static int m14745z0(int[] iArr) {
        AbstractC9133u.m16133g(iArr, "<this>");
        return iArr.length - 1;
    }

    /* renamed from: z1 */
    public static final List m14746z1(long[] jArr) {
        AbstractC9133u.m16133g(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }
}
