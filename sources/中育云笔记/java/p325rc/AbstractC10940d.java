package p325rc;

import id.InterfaceC9624a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: rc.d */
/* loaded from: classes6.dex */
public abstract class AbstractC10940d extends AbstractC10936b implements List, InterfaceC9624a {
    public static final a Companion = new a(null);
    private static final int maxArraySize = 2147483639;

    /* renamed from: rc.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final void m23885a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i10 + " > endIndex: " + i11);
        }

        /* renamed from: b */
        public final void m23886b(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        /* renamed from: c */
        public final void m23887c(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        /* renamed from: d */
        public final void m23888d(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
        }

        /* renamed from: e */
        public final int m23889e(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - AbstractC10940d.maxArraySize <= 0) {
                return i12;
            }
            if (i11 > AbstractC10940d.maxArraySize) {
                return Integer.MAX_VALUE;
            }
            return AbstractC10940d.maxArraySize;
        }

        /* renamed from: f */
        public final boolean m23890f(Collection c10, Collection other) {
            AbstractC9979u.m20294g(c10, "c");
            AbstractC9979u.m20294g(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            Iterator it = other.iterator();
            Iterator it2 = c10.iterator();
            while (it2.hasNext()) {
                if (!AbstractC9979u.m20289b(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: g */
        public final int m23891g(Collection c10) {
            AbstractC9979u.m20294g(c10, "c");
            Iterator it = c10.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        public a() {
        }
    }

    /* renamed from: rc.d$b */
    public class b implements Iterator, InterfaceC9624a {

        /* renamed from: c */
        public int f26445c;

        public b() {
        }

        /* renamed from: a */
        public final int m23892a() {
            return this.f26445c;
        }

        /* renamed from: b */
        public final void m23893b(int i10) {
            this.f26445c = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26445c < AbstractC10940d.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC10940d abstractC10940d = AbstractC10940d.this;
            int i10 = this.f26445c;
            this.f26445c = i10 + 1;
            return abstractC10940d.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: rc.d$c */
    public class c extends b implements ListIterator, InterfaceC9624a {
        public c(int i10) {
            super();
            AbstractC10940d.Companion.m23887c(i10, AbstractC10940d.this.size());
            m23893b(i10);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return m23892a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return m23892a();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC10940d abstractC10940d = AbstractC10940d.this;
            m23893b(m23892a() - 1);
            return abstractC10940d.get(m23892a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return m23892a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: rc.d$d */
    public static final class d extends AbstractC10940d implements RandomAccess {

        /* renamed from: c */
        public final AbstractC10940d f26448c;

        /* renamed from: d */
        public final int f26449d;

        /* renamed from: e */
        public int f26450e;

        public d(AbstractC10940d list, int i10, int i11) {
            AbstractC9979u.m20294g(list, "list");
            this.f26448c = list;
            this.f26449d = i10;
            AbstractC10940d.Companion.m23888d(i10, i11, list.size());
            this.f26450e = i11 - i10;
        }

        @Override // p325rc.AbstractC10940d, java.util.List
        public Object get(int i10) {
            AbstractC10940d.Companion.m23886b(i10, this.f26450e);
            return this.f26448c.get(this.f26449d + i10);
        }

        @Override // p325rc.AbstractC10940d, p325rc.AbstractC10936b
        public int getSize() {
            return this.f26450e;
        }

        @Override // p325rc.AbstractC10940d, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        public List subList(int i10, int i11) {
            AbstractC10940d.Companion.m23888d(i10, i11, this.f26450e);
            AbstractC10940d abstractC10940d = this.f26448c;
            int i12 = this.f26449d;
            return new d(abstractC10940d, i10 + i12, i12 + i11);
        }
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.m23890f(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i10);

    @Override // p325rc.AbstractC10936b
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.m23891g(this);
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (AbstractC9979u.m20289b(it.next(), obj)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<Object> iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (AbstractC9979u.m20289b(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<Object> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<Object> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }

    public ListIterator<Object> listIterator(int i10) {
        return new c(i10);
    }
}
