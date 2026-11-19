package kotlin.collections;

import android.support.v4.media.AbstractC0037f;
import coil3.network.AbstractC3315g;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.InterfaceC5428d;
import p152r6.InterfaceC6471c;
import p185v7.AbstractC6675d;
import p185v7.AbstractC6683l;
import p200x6.C6756f;

/* renamed from: kotlin.collections.t */
/* loaded from: classes2.dex */
public abstract class AbstractC5805t extends AbstractC5810y {
    /* renamed from: A0 */
    public static final void m5214A0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC5830k.m5330g(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* renamed from: B0 */
    public static float[] m5215B0(List list) {
        AbstractC5830k.m5330g(list, "<this>");
        float[] fArr = new float[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    /* renamed from: C0 */
    public static int[] m5216C0(List list) {
        AbstractC5830k.m5330g(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: D0 */
    public static List m5217D0(Iterable iterable) {
        AbstractC5830k.m5330g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC5806u.m5248B(m5219F0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyList.INSTANCE;
        }
        if (size != 1) {
            return m5218E0(collection);
        }
        return AbstractC5806u.m5286y(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* renamed from: E0 */
    public static ArrayList m5218E0(Collection collection) {
        AbstractC5830k.m5330g(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: F0 */
    public static final List m5219F0(Iterable iterable) {
        AbstractC5830k.m5330g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m5218E0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m5214A0(iterable, arrayList);
        return arrayList;
    }

    /* renamed from: G0 */
    public static Set m5220G0(Iterable iterable) {
        AbstractC5830k.m5330g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m5214A0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: H0 */
    public static Set m5221H0(Iterable iterable) {
        AbstractC5830k.m5330g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            m5214A0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : AbstractC6675d.m6354t(linkedHashSet.iterator().next()) : EmptySet.INSTANCE;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return EmptySet.INSTANCE;
        }
        if (size2 == 1) {
            return AbstractC6675d.m6354t(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(AbstractC5785e0.m5149C(collection.size()));
        m5214A0(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I0 */
    public static void m5222I0(TreeSet treeSet, InterfaceC6471c interfaceC6471c) {
        if ((treeSet instanceof RandomAccess) && (treeSet instanceof List)) {
            int size = ((List) treeSet).size();
            new ArrayList(size + (size % 1 == 0 ? 0 : 1));
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator iterator = treeSet.iterator();
        AbstractC5830k.m5330g(iterator, "iterator");
        Iterator itM6376p = !iterator.hasNext() ? C5811z.f9199a : AbstractC6683l.m6376p(new SlidingWindowKt$windowedIterator$1(2, 1, iterator, true, false, null));
        while (itM6376p.hasNext()) {
            arrayList.add(interfaceC6471c.invoke((List) itM6376p.next()));
        }
    }

    /* renamed from: c0 */
    public static C5803r m5223c0(Iterable iterable) {
        AbstractC5830k.m5330g(iterable, "<this>");
        return new C5803r(iterable, 1);
    }

    /* renamed from: d0 */
    public static boolean m5224d0(Iterable iterable, Object obj) {
        AbstractC5830k.m5330g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : m5231k0(iterable, obj) >= 0;
    }

    /* renamed from: e0 */
    public static List m5225e0(Iterable iterable, int i) {
        ArrayList arrayList;
        Object objM5235o0;
        AbstractC5830k.m5330g(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m82g(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return m5217D0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return EmptyList.INSTANCE;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    objM5235o0 = m5235o0((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    objM5235o0 = next;
                }
                return AbstractC5806u.m5286y(objM5235o0);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i8 = 0;
        for (Object obj : iterable) {
            if (i8 >= i) {
                arrayList.add(obj);
            } else {
                i8++;
            }
        }
        return AbstractC5806u.m5248B(arrayList);
    }

    /* renamed from: f0 */
    public static List m5226f0(List list) {
        AbstractC5830k.m5330g(list, "<this>");
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return m5245y0(size, list);
    }

    /* renamed from: g0 */
    public static Object m5227g0(Iterable iterable) {
        AbstractC5830k.m5330g(iterable, "<this>");
        if (iterable instanceof List) {
            return m5228h0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: h0 */
    public static Object m5228h0(List list) {
        AbstractC5830k.m5330g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* renamed from: i0 */
    public static Object m5229i0(List list) {
        AbstractC5830k.m5330g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: j0 */
    public static Object m5230j0(int i, List list) {
        AbstractC5830k.m5330g(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: k0 */
    public static int m5231k0(Iterable iterable, Object obj) {
        AbstractC5830k.m5330g(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            if (AbstractC5830k.m5325b(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: l0 */
    public static final void m5232l0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC6471c interfaceC6471c) {
        AbstractC5830k.m5330g(iterable, "<this>");
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            AbstractC3315g.m2235c(sb, obj, interfaceC6471c);
        }
        sb.append(charSequence3);
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m5233m0(List list, StringBuilder sb, String str, InterfaceC6471c interfaceC6471c, int i) {
        if ((i & 64) != 0) {
            interfaceC6471c = null;
        }
        m5232l0(list, sb, str, "", "", "...", interfaceC6471c);
    }

    /* renamed from: n0 */
    public static String m5234n0(Iterable iterable, CharSequence charSequence, String str, String str2, InterfaceC6471c interfaceC6471c, int i) {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence separator = charSequence;
        String prefix = (i & 2) != 0 ? "" : str;
        String str3 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            interfaceC6471c = null;
        }
        AbstractC5830k.m5330g(iterable, "<this>");
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        StringBuilder sb = new StringBuilder();
        m5232l0(iterable, sb, separator, prefix, str3, "...", interfaceC6471c);
        return sb.toString();
    }

    /* renamed from: o0 */
    public static Object m5235o0(List list) {
        AbstractC5830k.m5330g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC5806u.m5282u(list));
    }

    /* renamed from: p0 */
    public static Object m5236p0(List list) {
        AbstractC5830k.m5330g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: q0 */
    public static Comparable m5237q0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
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

    /* renamed from: r0 */
    public static ArrayList m5238r0(List list, InterfaceC5428d interfaceC5428d) {
        AbstractC5830k.m5330g(list, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(list, 10));
        boolean z8 = false;
        for (Object obj : list) {
            boolean z9 = true;
            if (!z8 && AbstractC5830k.m5325b(obj, interfaceC5428d)) {
                z8 = true;
                z9 = false;
            }
            if (z9) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: s0 */
    public static ArrayList m5239s0(Collection collection, Object obj) {
        AbstractC5830k.m5330g(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: t0 */
    public static ArrayList m5240t0(Collection collection, List elements) {
        AbstractC5830k.m5330g(collection, "<this>");
        AbstractC5830k.m5330g(elements, "elements");
        ArrayList arrayList = new ArrayList(elements.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(elements);
        return arrayList;
    }

    /* renamed from: u0 */
    public static List m5241u0(Iterable iterable) {
        AbstractC5830k.m5330g(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m5217D0(iterable);
        }
        List listM5219F0 = m5219F0(iterable);
        Collections.reverse(listM5219F0);
        return listM5219F0;
    }

    /* renamed from: v0 */
    public static Object m5242v0(List list) {
        AbstractC5830k.m5330g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    /* renamed from: w0 */
    public static List m5243w0(List list, C6756f indices) {
        AbstractC5830k.m5330g(list, "<this>");
        AbstractC5830k.m5330g(indices, "indices");
        return indices.isEmpty() ? EmptyList.INSTANCE : m5217D0(list.subList(indices.f11420a, indices.f11421b + 1));
    }

    /* renamed from: x0 */
    public static List m5244x0(List list, Comparator comparator) {
        AbstractC5830k.m5330g(list, "<this>");
        if (list.size() <= 1) {
            return m5217D0(list);
        }
        Object[] array = list.toArray(new Object[0]);
        AbstractC5830k.m5330g(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return AbstractC5802q.m5208u(array);
    }

    /* renamed from: y0 */
    public static List m5245y0(int i, List list) {
        AbstractC5830k.m5330g(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m82g(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return EmptyList.INSTANCE;
        }
        if (i >= list.size()) {
            return m5217D0(list);
        }
        if (i == 1) {
            return AbstractC5806u.m5286y(m5227g0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i8++;
            if (i8 == i) {
                break;
            }
        }
        return AbstractC5806u.m5248B(arrayList);
    }

    /* renamed from: z0 */
    public static boolean[] m5246z0(List list) {
        AbstractC5830k.m5330g(list, "<this>");
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }
}
