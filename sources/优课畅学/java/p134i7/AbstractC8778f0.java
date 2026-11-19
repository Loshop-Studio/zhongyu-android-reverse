package p134i7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.collections.SlidingWindowKt;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p077d8.C8321f;
import p101f8.InterfaceC8469g;
import p113g8.AbstractC8676o;
import p123h7.AbstractC8726f;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* renamed from: i7.f0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8778f0 extends AbstractC8772c0 {

    /* renamed from: i7.f0$a */
    public static final class a implements InterfaceC8469g {

        /* renamed from: a */
        public final /* synthetic */ Iterable f16460a;

        public a(Iterable iterable) {
            this.f16460a = iterable;
        }

        @Override // p101f8.InterfaceC8469g
        public Iterator iterator() {
            return this.f16460a.iterator();
        }
    }

    /* renamed from: A0 */
    public static Float m14524A0(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* renamed from: B0 */
    public static Comparable m14525B0(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* renamed from: C0 */
    public static Float m14526C0(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* renamed from: D0 */
    public static List m14527D0(Iterable iterable, Iterable elements) {
        AbstractC9133u.m16133g(iterable, "<this>");
        AbstractC9133u.m16133g(elements, "elements");
        Collection collectionM14483E = AbstractC8768a0.m14483E(elements);
        if (collectionM14483E.isEmpty()) {
            return m14544U0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionM14483E.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: E0 */
    public static List m14528E0(Iterable iterable, Object obj) {
        AbstractC9133u.m16133g(iterable, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(iterable, 10));
        boolean z10 = false;
        for (Object obj2 : iterable) {
            boolean z11 = true;
            if (!z10 && AbstractC9133u.m16128b(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* renamed from: F0 */
    public static List m14529F0(Collection collection, Iterable elements) {
        AbstractC9133u.m16133g(collection, "<this>");
        AbstractC9133u.m16133g(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC8768a0.m14481C(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* renamed from: G0 */
    public static List m14530G0(Collection collection, Object obj) {
        AbstractC9133u.m16133g(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: H0 */
    public static List m14531H0(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m14544U0(iterable);
        }
        List listM14546W0 = m14546W0(iterable);
        AbstractC8772c0.m14510Z(listM14546W0);
        return listM14546W0;
    }

    /* renamed from: I0 */
    public static Object m14532I0(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        if (iterable instanceof List) {
            return m14533J0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    /* renamed from: J0 */
    public static Object m14533J0(List list) {
        AbstractC9133u.m16133g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    /* renamed from: K0 */
    public static List m14534K0(List list, C8321f indices) {
        AbstractC9133u.m16133g(list, "<this>");
        AbstractC9133u.m16133g(indices, "indices");
        return indices.isEmpty() ? AbstractC8809v.m14771n() : m14544U0(list.subList(indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    /* renamed from: L0 */
    public static List m14535L0(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listM14546W0 = m14546W0(iterable);
            AbstractC8816z.m14796z(listM14546W0);
            return listM14546W0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m14544U0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        AbstractC8797p.m14632V((Comparable[]) array);
        return AbstractC8797p.m14640g(array);
    }

    /* renamed from: M0 */
    public static List m14536M0(Iterable iterable, Comparator comparator) {
        AbstractC9133u.m16133g(iterable, "<this>");
        AbstractC9133u.m16133g(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listM14546W0 = m14546W0(iterable);
            AbstractC8816z.m14795A(listM14546W0, comparator);
            return listM14546W0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m14544U0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC8797p.m14633W(array, comparator);
        return AbstractC8797p.m14640g(array);
    }

    /* renamed from: N0 */
    public static List m14537N0(Iterable iterable, int i10) {
        AbstractC9133u.m16133g(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return AbstractC8809v.m14771n();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return m14544U0(iterable);
            }
            if (i10 == 1) {
                return AbstractC8807u.m14755e(m14565k0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return AbstractC8809v.m14777t(arrayList);
    }

    /* renamed from: O0 */
    public static boolean[] m14538O0(Collection collection) {
        AbstractC9133u.m16133g(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = ((Boolean) it.next()).booleanValue();
            i10++;
        }
        return zArr;
    }

    /* renamed from: P0 */
    public static Collection m14539P0(Iterable iterable, Collection destination) {
        AbstractC9133u.m16133g(iterable, "<this>");
        AbstractC9133u.m16133g(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    /* renamed from: Q0 */
    public static double[] m14540Q0(Collection collection) {
        AbstractC9133u.m16133g(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            dArr[i10] = ((Number) it.next()).doubleValue();
            i10++;
        }
        return dArr;
    }

    /* renamed from: R0 */
    public static float[] m14541R0(Collection collection) {
        AbstractC9133u.m16133g(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = ((Number) it.next()).floatValue();
            i10++;
        }
        return fArr;
    }

    /* renamed from: S0 */
    public static HashSet m14542S0(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        return (HashSet) m14539P0(iterable, new HashSet(AbstractC8798p0.m14663e(AbstractC8811w.m14786x(iterable, 12))));
    }

    /* renamed from: T0 */
    public static int[] m14543T0(Collection collection) {
        AbstractC9133u.m16133g(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    /* renamed from: U0 */
    public static List m14544U0(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC8809v.m14777t(m14546W0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC8809v.m14771n();
        }
        if (size != 1) {
            return m14547X0(collection);
        }
        return AbstractC8807u.m14755e(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* renamed from: V0 */
    public static long[] m14545V0(Collection collection) {
        AbstractC9133u.m16133g(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = ((Number) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    /* renamed from: W0 */
    public static final List m14546W0(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        return iterable instanceof Collection ? m14547X0((Collection) iterable) : (List) m14539P0(iterable, new ArrayList());
    }

    /* renamed from: X0 */
    public static List m14547X0(Collection collection) {
        AbstractC9133u.m16133g(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: Y0 */
    public static Set m14548Y0(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) m14539P0(iterable, new LinkedHashSet());
    }

    /* renamed from: Z0 */
    public static Set m14549Z0(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC8812w0.m14790h((Set) m14539P0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC8812w0.m14788f();
        }
        if (size != 1) {
            return (Set) m14539P0(iterable, new LinkedHashSet(AbstractC8798p0.m14663e(collection.size())));
        }
        return AbstractC8810v0.m14784d(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* renamed from: a1 */
    public static final List m14551a1(Iterable iterable, int i10, int i11, boolean z10, InterfaceC10570l transform) {
        AbstractC9133u.m16133g(iterable, "<this>");
        AbstractC9133u.m16133g(transform, "transform");
        SlidingWindowKt.m15941a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itM15942b = SlidingWindowKt.m15942b(iterable.iterator(), i10, i11, z10, true);
            while (itM15942b.hasNext()) {
                arrayList.add(transform.invoke((List) itM15942b.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i12 = 0;
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        C8804s0 c8804s0 = new C8804s0(list);
        while (i12 >= 0 && i12 < size) {
            int iM13513h = AbstractC8323h.m13513h(i10, size - i12);
            if (!z10 && iM13513h < i10) {
                return arrayList2;
            }
            c8804s0.m14749c(i12, iM13513h + i12);
            arrayList2.add(transform.invoke(c8804s0));
            i12 += i11;
        }
        return arrayList2;
    }

    /* renamed from: b1 */
    public static /* synthetic */ List m14553b1(Iterable iterable, int i10, int i11, boolean z10, InterfaceC10570l interfaceC10570l, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return m14551a1(iterable, i10, i11, z10, interfaceC10570l);
    }

    /* renamed from: c0 */
    public static InterfaceC8469g m14554c0(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        return new a(iterable);
    }

    /* renamed from: c1 */
    public static Iterable m14555c1(final Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        return new C8788k0(new InterfaceC10559a() { // from class: i7.e0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return AbstractC8778f0.m14557d1(iterable);
            }
        });
    }

    /* renamed from: d0 */
    public static boolean m14556d0(Iterable iterable, Object obj) {
        AbstractC9133u.m16133g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : m14570p0(iterable, obj) >= 0;
    }

    /* renamed from: d1 */
    public static final Iterator m14557d1(Iterable iterable) {
        return iterable.iterator();
    }

    /* renamed from: e0 */
    public static int m14558e0(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                AbstractC8809v.m14779v();
            }
        }
        return i10;
    }

    /* renamed from: e1 */
    public static List m14559e1(Iterable iterable, Iterable other) {
        AbstractC9133u.m16133g(iterable, "<this>");
        AbstractC9133u.m16133g(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC8811w.m14786x(iterable, 10), AbstractC8811w.m14786x(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(AbstractC8726f.m14230a(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: f0 */
    public static List m14560f0(Iterable iterable, int i10) {
        ArrayList arrayList;
        AbstractC9133u.m16133g(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return m14544U0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return AbstractC8809v.m14771n();
            }
            if (size == 1) {
                return AbstractC8807u.m14755e(m14577w0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i10 < size2) {
                        arrayList.add(list.get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (Object obj : iterable) {
            if (i11 >= i10) {
                arrayList.add(obj);
            } else {
                i11++;
            }
        }
        return AbstractC8809v.m14777t(arrayList);
    }

    /* renamed from: g0 */
    public static List m14561g0(List list, int i10) {
        AbstractC9133u.m16133g(list, "<this>");
        if (i10 >= 0) {
            return m14537N0(list, AbstractC8323h.m13510e(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    /* renamed from: h0 */
    public static Object m14562h0(Iterable iterable, final int i10) {
        AbstractC9133u.m16133g(iterable, "<this>");
        return iterable instanceof List ? ((List) iterable).get(i10) : m14564j0(iterable, i10, new InterfaceC10570l() { // from class: i7.d0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return AbstractC8778f0.m14563i0(i10, ((Integer) obj).intValue());
            }
        });
    }

    /* renamed from: i0 */
    public static final Object m14563i0(int i10, int i11) {
        throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i10 + '.');
    }

    /* renamed from: j0 */
    public static final Object m14564j0(Iterable iterable, int i10, InterfaceC10570l defaultValue) {
        AbstractC9133u.m16133g(iterable, "<this>");
        AbstractC9133u.m16133g(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i10 < 0 || i10 >= list.size()) ? defaultValue.invoke(Integer.valueOf(i10)) : list.get(i10);
        }
        if (i10 < 0) {
            return defaultValue.invoke(Integer.valueOf(i10));
        }
        int i11 = 0;
        for (Object obj : iterable) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return obj;
            }
            i11 = i12;
        }
        return defaultValue.invoke(Integer.valueOf(i10));
    }

    /* renamed from: k0 */
    public static final Object m14565k0(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        if (iterable instanceof List) {
            return m14566l0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: l0 */
    public static Object m14566l0(List list) {
        AbstractC9133u.m16133g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* renamed from: m0 */
    public static Object m14567m0(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* renamed from: n0 */
    public static Object m14568n0(List list) {
        AbstractC9133u.m16133g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: o0 */
    public static Object m14569o0(List list, int i10) {
        AbstractC9133u.m16133g(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    /* renamed from: p0 */
    public static final int m14570p0(Iterable iterable, Object obj) {
        AbstractC9133u.m16133g(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i10 = 0;
        for (Object obj2 : iterable) {
            if (i10 < 0) {
                AbstractC8809v.m14780w();
            }
            if (AbstractC9133u.m16128b(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: q0 */
    public static int m14571q0(List list, Object obj) {
        AbstractC9133u.m16133g(list, "<this>");
        return list.indexOf(obj);
    }

    /* renamed from: r0 */
    public static Set m14572r0(Iterable iterable, Iterable other) {
        AbstractC9133u.m16133g(iterable, "<this>");
        AbstractC9133u.m16133g(other, "other");
        Set setM14548Y0 = m14548Y0(iterable);
        AbstractC8768a0.m14496R(setM14548Y0, other);
        return setM14548Y0;
    }

    /* renamed from: s0 */
    public static final Appendable m14573s0(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC10570l interfaceC10570l) throws IOException {
        AbstractC9133u.m16133g(iterable, "<this>");
        AbstractC9133u.m16133g(buffer, "buffer");
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        AbstractC9133u.m16133g(postfix, "postfix");
        AbstractC9133u.m16133g(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : iterable) {
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

    /* renamed from: u0 */
    public static final String m14575u0(Iterable iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC10570l interfaceC10570l) {
        AbstractC9133u.m16133g(iterable, "<this>");
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        AbstractC9133u.m16133g(postfix, "postfix");
        AbstractC9133u.m16133g(truncated, "truncated");
        return ((StringBuilder) m14573s0(iterable, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC10570l)).toString();
    }

    /* renamed from: v0 */
    public static /* synthetic */ String m14576v0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC10570l interfaceC10570l, int i11, Object obj) {
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
        return m14575u0(iterable, charSequence, charSequence2, charSequence3, i10, charSequence5, interfaceC10570l2);
    }

    /* renamed from: w0 */
    public static final Object m14577w0(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        if (iterable instanceof List) {
            return m14578x0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* renamed from: x0 */
    public static Object m14578x0(List list) {
        AbstractC9133u.m16133g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC8809v.m14773p(list));
    }

    /* renamed from: y0 */
    public static Object m14579y0(List list) {
        AbstractC9133u.m16133g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: z0 */
    public static Comparable m14580z0(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }
}
