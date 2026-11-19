package kotlin.collections;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5835p;
import p152r6.InterfaceC6471c;
import p160s6.InterfaceC6560a;
import p160s6.InterfaceC6561b;
import p214z6.AbstractC6833k;
import p214z6.InterfaceC6830h;

/* renamed from: kotlin.collections.y */
/* loaded from: classes2.dex */
public abstract class AbstractC5810y extends AbstractC5809x {
    /* renamed from: R */
    public static void m5290R(PersistentCollection.Builder builder, InterfaceC6830h elements) {
        AbstractC5830k.m5330g(builder, "<this>");
        AbstractC5830k.m5330g(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            builder.add(it.next());
        }
    }

    /* renamed from: S */
    public static void m5291S(Iterable elements, Collection collection) {
        AbstractC5830k.m5330g(collection, "<this>");
        AbstractC5830k.m5330g(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    /* renamed from: T */
    public static void m5292T(Collection collection, Object[] elements) {
        AbstractC5830k.m5330g(collection, "<this>");
        AbstractC5830k.m5330g(elements, "elements");
        collection.addAll(AbstractC5802q.m5208u(elements));
    }

    /* renamed from: U */
    public static final boolean m5293U(Iterable iterable, InterfaceC6471c interfaceC6471c, boolean z8) {
        Iterator it = iterable.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC6471c.invoke(it.next())).booleanValue() == z8) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    /* renamed from: V */
    public static void m5294V(Iterable elements, Collection collection) {
        AbstractC5830k.m5330g(collection, "<this>");
        AbstractC5830k.m5330g(elements, "elements");
        collection.removeAll(elements instanceof Collection ? (Collection) elements : AbstractC5805t.m5217D0(elements));
    }

    /* renamed from: W */
    public static void m5295W(Iterable iterable, InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(iterable, "<this>");
        AbstractC5830k.m5330g(predicate, "predicate");
        m5293U(iterable, predicate, true);
    }

    /* renamed from: X */
    public static void m5296X(Collection collection, InterfaceC6830h elements) {
        AbstractC5830k.m5330g(collection, "<this>");
        AbstractC5830k.m5330g(elements, "elements");
        List listM6499z = AbstractC6833k.m6499z(elements);
        if (listM6499z.isEmpty()) {
            return;
        }
        collection.removeAll(listM6499z);
    }

    /* renamed from: Y */
    public static void m5297Y(Collection collection, Object[] elements) {
        AbstractC5830k.m5330g(collection, "<this>");
        AbstractC5830k.m5330g(elements, "elements");
        if (elements.length == 0) {
            return;
        }
        collection.removeAll(AbstractC5802q.m5208u(elements));
    }

    /* renamed from: Z */
    public static void m5298Z(List list, InterfaceC6471c predicate) {
        int iM5282u;
        AbstractC5830k.m5330g(list, "<this>");
        AbstractC5830k.m5330g(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            if (!(list instanceof InterfaceC6560a) || (list instanceof InterfaceC6561b)) {
                m5293U(list, predicate, true);
                return;
            } else {
                AbstractC5835p.m5359h(list, "kotlin.collections.MutableIterable");
                throw null;
            }
        }
        int iM5282u2 = AbstractC5806u.m5282u(list);
        int i = 0;
        if (iM5282u2 >= 0) {
            int i8 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                    if (i8 != i) {
                        list.set(i8, obj);
                    }
                    i8++;
                }
                if (i == iM5282u2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i8;
        }
        if (i >= list.size() || i > (iM5282u = AbstractC5806u.m5282u(list))) {
            return;
        }
        while (true) {
            list.remove(iM5282u);
            if (iM5282u == i) {
                return;
            } else {
                iM5282u--;
            }
        }
    }

    /* renamed from: a0 */
    public static Object m5299a0(List list) {
        AbstractC5830k.m5330g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    /* renamed from: b0 */
    public static Object m5300b0(List list) {
        AbstractC5830k.m5330g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(AbstractC5806u.m5282u(list));
    }
}
