package p325rc;

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
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p265nd.C10405j;
import p296pd.InterfaceC10659g;
import p309qc.AbstractC10776g;
import p310qd.AbstractC10808o;
import p364uc.AbstractC11382b;

/* renamed from: rc.g0 */
/* loaded from: classes6.dex */
public abstract class AbstractC10947g0 extends AbstractC10941d0 {

    /* renamed from: rc.g0$a */
    public static final class a implements InterfaceC10659g {

        /* renamed from: a */
        public final /* synthetic */ Iterable f26454a;

        public a(Iterable iterable) {
            this.f26454a = iterable;
        }

        @Override // p296pd.InterfaceC10659g
        public Iterator iterator() {
            return this.f26454a.iterator();
        }
    }

    /* renamed from: A0 */
    public static Comparable m23899A0(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
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

    /* renamed from: B0 */
    public static Float m23900B0(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
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

    /* renamed from: C0 */
    public static Comparable m23901C0(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
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

    /* renamed from: D0 */
    public static Float m23902D0(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
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

    /* renamed from: E0 */
    public static Object m23903E0(Iterable iterable, Comparator comparator) {
        AbstractC9979u.m20294g(iterable, "<this>");
        AbstractC9979u.m20294g(comparator, "comparator");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    /* renamed from: F0 */
    public static List m23904F0(Iterable iterable, Iterable elements) {
        AbstractC9979u.m20294g(iterable, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
        Collection collectionM23860E = AbstractC10937b0.m23860E(elements);
        if (collectionM23860E.isEmpty()) {
            return m23922X0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionM23860E.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: G0 */
    public static List m23905G0(Iterable iterable, Object obj) {
        AbstractC9979u.m20294g(iterable, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(iterable, 10));
        boolean z10 = false;
        for (Object obj2 : iterable) {
            boolean z11 = true;
            if (!z10 && AbstractC9979u.m20289b(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* renamed from: H0 */
    public static List m23906H0(Collection collection, Iterable elements) {
        AbstractC9979u.m20294g(collection, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC10937b0.m23857B(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* renamed from: I0 */
    public static List m23907I0(Collection collection, Object obj) {
        AbstractC9979u.m20294g(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: J0 */
    public static List m23908J0(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m23922X0(iterable);
        }
        List listM23924Z0 = m23924Z0(iterable);
        AbstractC10941d0.m23894a0(listM23924Z0);
        return listM23924Z0;
    }

    /* renamed from: K0 */
    public static Object m23909K0(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
        if (iterable instanceof List) {
            return m23910L0((List) iterable);
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

    /* renamed from: L0 */
    public static Object m23910L0(List list) {
        AbstractC9979u.m20294g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    /* renamed from: M0 */
    public static List m23911M0(List list, C10405j indices) {
        AbstractC9979u.m20294g(list, "<this>");
        AbstractC9979u.m20294g(indices, "indices");
        return indices.isEmpty() ? AbstractC10978w.m24136n() : m23922X0(list.subList(indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    /* renamed from: N0 */
    public static List m23912N0(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listM23924Z0 = m23924Z0(iterable);
            AbstractC10935a0.m23854z(listM23924Z0);
            return listM23924Z0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m23922X0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        AbstractC10964p.m24006U((Comparable[]) array);
        return AbstractC10964p.m24014g(array);
    }

    /* renamed from: O0 */
    public static List m23913O0(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
        return m23914P0(iterable, AbstractC11382b.m25333g());
    }

    /* renamed from: P0 */
    public static List m23914P0(Iterable iterable, Comparator comparator) {
        AbstractC9979u.m20294g(iterable, "<this>");
        AbstractC9979u.m20294g(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listM23924Z0 = m23924Z0(iterable);
            AbstractC10935a0.m23853A(listM23924Z0, comparator);
            return listM23924Z0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m23922X0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC10964p.m24007V(array, comparator);
        return AbstractC10964p.m24014g(array);
    }

    /* renamed from: Q0 */
    public static List m23915Q0(Iterable iterable, int i10) {
        AbstractC9979u.m20294g(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return AbstractC10978w.m24136n();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return m23922X0(iterable);
            }
            if (i10 == 1) {
                return AbstractC10976v.m24126e(m23943l0(iterable));
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
        return AbstractC10978w.m24142t(arrayList);
    }

    /* renamed from: R0 */
    public static boolean[] m23916R0(Collection collection) {
        AbstractC9979u.m20294g(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = ((Boolean) it.next()).booleanValue();
            i10++;
        }
        return zArr;
    }

    /* renamed from: S0 */
    public static final Collection m23917S0(Iterable iterable, Collection destination) {
        AbstractC9979u.m20294g(iterable, "<this>");
        AbstractC9979u.m20294g(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    /* renamed from: T0 */
    public static double[] m23918T0(Collection collection) {
        AbstractC9979u.m20294g(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            dArr[i10] = ((Number) it.next()).doubleValue();
            i10++;
        }
        return dArr;
    }

    /* renamed from: U0 */
    public static float[] m23919U0(Collection collection) {
        AbstractC9979u.m20294g(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = ((Number) it.next()).floatValue();
            i10++;
        }
        return fArr;
    }

    /* renamed from: V0 */
    public static HashSet m23920V0(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
        return (HashSet) m23917S0(iterable, new HashSet(AbstractC10967q0.m24038e(AbstractC10980x.m24153x(iterable, 12))));
    }

    /* renamed from: W0 */
    public static int[] m23921W0(Collection collection) {
        AbstractC9979u.m20294g(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    /* renamed from: X0 */
    public static List m23922X0(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC10978w.m24142t(m23924Z0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC10978w.m24136n();
        }
        if (size != 1) {
            return m23925a1(collection);
        }
        return AbstractC10976v.m24126e(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* renamed from: Y0 */
    public static long[] m23923Y0(Collection collection) {
        AbstractC9979u.m20294g(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = ((Number) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    /* renamed from: Z0 */
    public static final List m23924Z0(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
        return iterable instanceof Collection ? m23925a1((Collection) iterable) : (List) m23917S0(iterable, new ArrayList());
    }

    /* renamed from: a1 */
    public static List m23925a1(Collection collection) {
        AbstractC9979u.m20294g(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: b1 */
    public static Set m23927b1(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) m23917S0(iterable, new LinkedHashSet());
    }

    /* renamed from: c1 */
    public static Set m23929c1(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC10983y0.m24163i((Set) m23917S0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC10983y0.m24160f();
        }
        if (size != 1) {
            return (Set) m23917S0(iterable, new LinkedHashSet(AbstractC10967q0.m24038e(collection.size())));
        }
        return AbstractC10981x0.m24158d(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* renamed from: d0 */
    public static InterfaceC10659g m23930d0(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
        return new a(iterable);
    }

    /* renamed from: d1 */
    public static final List m23931d1(Iterable iterable, int i10, int i11, boolean z10, InterfaceC9540l transform) {
        AbstractC9979u.m20294g(iterable, "<this>");
        AbstractC9979u.m20294g(transform, "transform");
        SlidingWindowKt.m20086a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itM20087b = SlidingWindowKt.m20087b(iterable.iterator(), i10, i11, z10, true);
            while (itM20087b.hasNext()) {
                arrayList.add(transform.invoke((List) itM20087b.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i12 = 0;
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        C10973t0 c10973t0 = new C10973t0(list);
        while (i12 >= 0 && i12 < size) {
            int iM21756i = AbstractC10410o.m21756i(i10, size - i12);
            if (!z10 && iM21756i < i10) {
                return arrayList2;
            }
            c10973t0.m24120d(i12, iM21756i + i12);
            arrayList2.add(transform.invoke(c10973t0));
            i12 += i11;
        }
        return arrayList2;
    }

    /* renamed from: e0 */
    public static boolean m23932e0(Iterable iterable, Object obj) {
        AbstractC9979u.m20294g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : m23948q0(iterable, obj) >= 0;
    }

    /* renamed from: e1 */
    public static /* synthetic */ List m23933e1(Iterable iterable, int i10, int i11, boolean z10, InterfaceC9540l interfaceC9540l, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return m23931d1(iterable, i10, i11, z10, interfaceC9540l);
    }

    /* renamed from: f0 */
    public static int m23934f0(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                AbstractC10978w.m24144v();
            }
        }
        return i10;
    }

    /* renamed from: f1 */
    public static Iterable m23935f1(final Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
        return new C10957l0(new InterfaceC9529a() { // from class: rc.e0
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return AbstractC10947g0.m23937g1(iterable);
            }
        });
    }

    /* renamed from: g0 */
    public static List m23936g0(Iterable iterable, int i10) {
        ArrayList arrayList;
        AbstractC9979u.m20294g(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return m23922X0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return AbstractC10978w.m24136n();
            }
            if (size == 1) {
                return AbstractC10976v.m24126e(m23955x0(iterable));
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
        return AbstractC10978w.m24142t(arrayList);
    }

    /* renamed from: g1 */
    public static final Iterator m23937g1(Iterable iterable) {
        return iterable.iterator();
    }

    /* renamed from: h0 */
    public static List m23938h0(List list, int i10) {
        AbstractC9979u.m20294g(list, "<this>");
        if (i10 >= 0) {
            return m23915Q0(list, AbstractC10410o.m21752e(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    /* renamed from: h1 */
    public static List m23939h1(Iterable iterable, Iterable other) {
        AbstractC9979u.m20294g(iterable, "<this>");
        AbstractC9979u.m20294g(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC10980x.m24153x(iterable, 10), AbstractC10980x.m24153x(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(AbstractC10776g.m22975a(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: i0 */
    public static Object m23940i0(Iterable iterable, final int i10) {
        AbstractC9979u.m20294g(iterable, "<this>");
        return iterable instanceof List ? ((List) iterable).get(i10) : m23942k0(iterable, i10, new InterfaceC9540l() { // from class: rc.f0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return AbstractC10947g0.m23941j0(i10, ((Integer) obj).intValue());
            }
        });
    }

    /* renamed from: j0 */
    public static final Object m23941j0(int i10, int i11) {
        throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i10 + '.');
    }

    /* renamed from: k0 */
    public static final Object m23942k0(Iterable iterable, int i10, InterfaceC9540l defaultValue) {
        AbstractC9979u.m20294g(iterable, "<this>");
        AbstractC9979u.m20294g(defaultValue, "defaultValue");
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

    /* renamed from: l0 */
    public static Object m23943l0(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
        if (iterable instanceof List) {
            return m23944m0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: m0 */
    public static Object m23944m0(List list) {
        AbstractC9979u.m20294g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* renamed from: n0 */
    public static Object m23945n0(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
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

    /* renamed from: o0 */
    public static Object m23946o0(List list) {
        AbstractC9979u.m20294g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: p0 */
    public static Object m23947p0(List list, int i10) {
        AbstractC9979u.m20294g(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    /* renamed from: q0 */
    public static int m23948q0(Iterable iterable, Object obj) {
        AbstractC9979u.m20294g(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i10 = 0;
        for (Object obj2 : iterable) {
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            if (AbstractC9979u.m20289b(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: r0 */
    public static int m23949r0(List list, Object obj) {
        AbstractC9979u.m20294g(list, "<this>");
        return list.indexOf(obj);
    }

    /* renamed from: s0 */
    public static Set m23950s0(Iterable iterable, Iterable other) {
        AbstractC9979u.m20294g(iterable, "<this>");
        AbstractC9979u.m20294g(other, "other");
        Set setM23927b1 = m23927b1(iterable);
        AbstractC10937b0.m23873R(setM23927b1, other);
        return setM23927b1;
    }

    /* renamed from: t0 */
    public static final Appendable m23951t0(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9540l interfaceC9540l) throws IOException {
        AbstractC9979u.m20294g(iterable, "<this>");
        AbstractC9979u.m20294g(buffer, "buffer");
        AbstractC9979u.m20294g(separator, "separator");
        AbstractC9979u.m20294g(prefix, "prefix");
        AbstractC9979u.m20294g(postfix, "postfix");
        AbstractC9979u.m20294g(truncated, "truncated");
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
            AbstractC10808o.m23208a(buffer, obj, interfaceC9540l);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: v0 */
    public static final String m23953v0(Iterable iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9540l interfaceC9540l) {
        AbstractC9979u.m20294g(iterable, "<this>");
        AbstractC9979u.m20294g(separator, "separator");
        AbstractC9979u.m20294g(prefix, "prefix");
        AbstractC9979u.m20294g(postfix, "postfix");
        AbstractC9979u.m20294g(truncated, "truncated");
        return ((StringBuilder) m23951t0(iterable, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC9540l)).toString();
    }

    /* renamed from: w0 */
    public static /* synthetic */ String m23954w0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
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
        return m23953v0(iterable, charSequence, charSequence2, charSequence3, i10, charSequence5, interfaceC9540l2);
    }

    /* renamed from: x0 */
    public static final Object m23955x0(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
        if (iterable instanceof List) {
            return m23956y0((List) iterable);
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

    /* renamed from: y0 */
    public static Object m23956y0(List list) {
        AbstractC9979u.m20294g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC10978w.m24138p(list));
    }

    /* renamed from: z0 */
    public static Object m23957z0(List list) {
        AbstractC9979u.m20294g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }
}
