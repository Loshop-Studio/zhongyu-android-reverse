package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p175y2.InterfaceC3498a;

/* renamed from: kotlin.collections.b */
/* loaded from: classes.dex */
public abstract class AbstractC2713b<E> extends AbstractC2711a<E> implements List<E> {

    @NotNull
    public static final a Companion = new a(null);

    /* renamed from: kotlin.collections.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C2764g c2764g) {
            this();
        }

        /* renamed from: a */
        public final void m9043a(int i4, int i5) {
            if (i4 < 0 || i4 >= i5) {
                throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i5);
            }
        }

        /* renamed from: b */
        public final void m9044b(int i4, int i5) {
            if (i4 < 0 || i4 > i5) {
                throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i5);
            }
        }

        /* renamed from: c */
        public final void m9045c(int i4, int i5, int i6) {
            if (i4 < 0 || i5 > i6) {
                throw new IndexOutOfBoundsException("fromIndex: " + i4 + ", toIndex: " + i5 + ", size: " + i6);
            }
            if (i4 <= i5) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i4 + " > toIndex: " + i5);
        }

        /* renamed from: d */
        public final boolean m9046d(@NotNull Collection<?> c4, @NotNull Collection<?> other) {
            C2769l.m9241e(c4, "c");
            C2769l.m9241e(other, "other");
            if (c4.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c4.iterator();
            while (it2.hasNext()) {
                if (!C2769l.m9237a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public final int m9047e(@NotNull Collection<?> c4) {
            C2769l.m9241e(c4, "c");
            Iterator<?> it = c4.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next == null ? 0 : next.hashCode());
            }
            return iHashCode;
        }
    }

    /* renamed from: kotlin.collections.b$b */
    private class b implements Iterator<E>, InterfaceC3498a {

        /* renamed from: a */
        private int f10697a;

        /* renamed from: b */
        final /* synthetic */ AbstractC2713b<E> f10698b;

        public b(AbstractC2713b this$0) {
            C2769l.m9241e(this$0, "this$0");
            this.f10698b = this$0;
        }

        /* renamed from: a */
        protected final int m9048a() {
            return this.f10697a;
        }

        /* renamed from: b */
        protected final void m9049b(int i4) {
            this.f10697a = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10697a < this.f10698b.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC2713b<E> abstractC2713b = this.f10698b;
            int i4 = this.f10697a;
            this.f10697a = i4 + 1;
            return abstractC2713b.get(i4);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.b$c */
    private class c extends AbstractC2713b<E>.b implements ListIterator<E> {

        /* renamed from: c */
        final /* synthetic */ AbstractC2713b<E> f10699c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC2713b this$0, int i4) {
            super(this$0);
            C2769l.m9241e(this$0, "this$0");
            this.f10699c = this$0;
            AbstractC2713b.Companion.m9044b(i4, this$0.size());
            m9049b(i4);
        }

        @Override // java.util.ListIterator
        public void add(E e4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return m9048a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return m9048a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC2713b<E> abstractC2713b = this.f10699c;
            m9049b(m9048a() - 1);
            return abstractC2713b.get(m9048a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return m9048a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.b$d */
    private static final class d<E> extends AbstractC2713b<E> implements RandomAccess {

        /* renamed from: a */
        @NotNull
        private final AbstractC2713b<E> f10700a;

        /* renamed from: b */
        private final int f10701b;

        /* renamed from: c */
        private int f10702c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull AbstractC2713b<? extends E> list, int i4, int i5) {
            C2769l.m9241e(list, "list");
            this.f10700a = list;
            this.f10701b = i4;
            AbstractC2713b.Companion.m9045c(i4, i5, list.size());
            this.f10702c = i5 - i4;
        }

        @Override // kotlin.collections.AbstractC2713b, java.util.List
        public E get(int i4) {
            AbstractC2713b.Companion.m9043a(i4, this.f10702c);
            return this.f10700a.get(this.f10701b + i4);
        }

        @Override // kotlin.collections.AbstractC2713b, kotlin.collections.AbstractC2711a
        public int getSize() {
            return this.f10702c;
        }
    }

    protected AbstractC2713b() {
    }

    @Override // java.util.List
    public void add(int i4, E e4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i4, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.m9046d(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i4);

    @Override // kotlin.collections.AbstractC2711a
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.m9047e(this);
    }

    @Override // java.util.List
    public int indexOf(E e4) {
        Iterator<E> it = iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (C2769l.m9237a(it.next(), e4)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC2711a, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<E> iterator() {
        return new b(this);
    }

    @Override // java.util.List
    public int lastIndexOf(E e4) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C2769l.m9237a(listIterator.previous(), e4)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return new c(this, 0);
    }

    @Override // java.util.List
    public E remove(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i4, E e4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<E> subList(int i4, int i5) {
        return new d(this, i4, i5);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i4) {
        return new c(this, i4);
    }
}
