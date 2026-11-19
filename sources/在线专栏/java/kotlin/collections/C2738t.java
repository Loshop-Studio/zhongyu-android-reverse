package kotlin.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p014b3.C1037f;
import p077d3.InterfaceC2457d;
import p082e3.C2487m;
import p171x2.InterfaceC3470l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.collections.t */
/* loaded from: classes.dex */
public class C2738t extends C2737s {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: kotlin.collections.t$a */
    public static final class a<T> implements InterfaceC2457d<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f10705a;

        public a(Iterable iterable) {
            this.f10705a = iterable;
        }

        @Override // p077d3.InterfaceC2457d
        @NotNull
        public Iterator<T> iterator() {
            return this.f10705a.iterator();
        }
    }

    @NotNull
    /* renamed from: A */
    public static final <T> String m9153A(@NotNull Iterable<? extends T> iterable, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable InterfaceC3470l<? super T, ? extends CharSequence> interfaceC3470l) {
        C2769l.m9241e(iterable, "<this>");
        C2769l.m9241e(separator, "separator");
        C2769l.m9241e(prefix, "prefix");
        C2769l.m9241e(postfix, "postfix");
        C2769l.m9241e(truncated, "truncated");
        String string = ((StringBuilder) m9172y(iterable, new StringBuilder(), separator, prefix, postfix, i4, truncated, interfaceC3470l)).toString();
        C2769l.m9240d(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    /* renamed from: B */
    public static /* synthetic */ String m9154B(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, InterfaceC3470l interfaceC3470l, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i5 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i5 & 4) == 0 ? charSequence3 : "";
        int i6 = (i5 & 8) != 0 ? -1 : i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            interfaceC3470l = null;
        }
        return m9153A(iterable, charSequence, charSequence5, charSequence6, i6, charSequence7, interfaceC3470l);
    }

    /* renamed from: C */
    public static <T> T m9155C(@NotNull List<? extends T> list) {
        C2769l.m9241e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(C2730l.m9141h(list));
    }

    @Nullable
    /* renamed from: D */
    public static <T extends Comparable<? super T>> T m9156D(@NotNull Iterable<? extends T> iterable) {
        C2769l.m9241e(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @NotNull
    /* renamed from: E */
    public static <T> List<T> m9157E(@NotNull Collection<? extends T> collection, @NotNull Iterable<? extends T> elements) {
        C2769l.m9241e(collection, "<this>");
        C2769l.m9241e(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            C2735q.m9151r(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    @NotNull
    /* renamed from: F */
    public static <T> List<T> m9158F(@NotNull Collection<? extends T> collection, T t3) {
        C2769l.m9241e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t3);
        return arrayList;
    }

    /* renamed from: G */
    public static <T> T m9159G(@NotNull Iterable<? extends T> iterable) {
        C2769l.m9241e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m9160H((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    /* renamed from: H */
    public static final <T> T m9160H(@NotNull List<? extends T> list) {
        C2769l.m9241e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    @NotNull
    /* renamed from: I */
    public static final <T> List<T> m9161I(@NotNull Iterable<? extends T> iterable, int i4) {
        C2769l.m9241e(iterable, "<this>");
        int i5 = 0;
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        }
        if (i4 == 0) {
            return C2730l.m9139f();
        }
        if (iterable instanceof Collection) {
            if (i4 >= ((Collection) iterable).size()) {
                return m9163K(iterable);
            }
            if (i4 == 1) {
                return C2729k.m9135b(m9169v(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i4);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i5++;
            if (i5 == i4) {
                break;
            }
        }
        return C2730l.m9145l(arrayList);
    }

    @NotNull
    /* renamed from: J */
    public static final <T, C extends Collection<? super T>> C m9162J(@NotNull Iterable<? extends T> iterable, @NotNull C destination) {
        C2769l.m9241e(iterable, "<this>");
        C2769l.m9241e(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    @NotNull
    /* renamed from: K */
    public static <T> List<T> m9163K(@NotNull Iterable<? extends T> iterable) {
        C2769l.m9241e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C2730l.m9145l(m9164L(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C2730l.m9139f();
        }
        if (size != 1) {
            return m9165M(collection);
        }
        return C2729k.m9135b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    @NotNull
    /* renamed from: L */
    public static final <T> List<T> m9164L(@NotNull Iterable<? extends T> iterable) {
        C2769l.m9241e(iterable, "<this>");
        return iterable instanceof Collection ? m9165M((Collection) iterable) : (List) m9162J(iterable, new ArrayList());
    }

    @NotNull
    /* renamed from: M */
    public static <T> List<T> m9165M(@NotNull Collection<? extends T> collection) {
        C2769l.m9241e(collection, "<this>");
        return new ArrayList(collection);
    }

    @NotNull
    /* renamed from: N */
    public static <T> Set<T> m9166N(@NotNull Iterable<? extends T> iterable) {
        C2769l.m9241e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C2724g0.m9092c((Set) m9162J(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C2724g0.m9091b();
        }
        if (size != 1) {
            return (Set) m9162J(iterable, new LinkedHashSet(C2714b0.m9050a(collection.size())));
        }
        return C2722f0.m9079a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    @NotNull
    /* renamed from: t */
    public static <T> InterfaceC2457d<T> m9167t(@NotNull Iterable<? extends T> iterable) {
        C2769l.m9241e(iterable, "<this>");
        return new a(iterable);
    }

    @NotNull
    /* renamed from: u */
    public static <T> List<T> m9168u(@NotNull List<? extends T> list, int i4) {
        C2769l.m9241e(list, "<this>");
        if (i4 >= 0) {
            return m9161I(list, C1037f.m4821b(list.size() - i4, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    /* renamed from: v */
    public static final <T> T m9169v(@NotNull Iterable<? extends T> iterable) {
        C2769l.m9241e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m9170w((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: w */
    public static <T> T m9170w(@NotNull List<? extends T> list) {
        C2769l.m9241e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    @Nullable
    /* renamed from: x */
    public static <T> T m9171x(@NotNull List<? extends T> list) {
        C2769l.m9241e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @NotNull
    /* renamed from: y */
    public static final <T, A extends Appendable> A m9172y(@NotNull Iterable<? extends T> iterable, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable InterfaceC3470l<? super T, ? extends CharSequence> interfaceC3470l) throws IOException {
        C2769l.m9241e(iterable, "<this>");
        C2769l.m9241e(buffer, "buffer");
        C2769l.m9241e(separator, "separator");
        C2769l.m9241e(prefix, "prefix");
        C2769l.m9241e(postfix, "postfix");
        C2769l.m9241e(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (T t3 : iterable) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            C2487m.m8324a(buffer, t3, interfaceC3470l);
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }
}
