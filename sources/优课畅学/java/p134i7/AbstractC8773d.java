package p134i7;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p311y7.InterfaceC10668a;

/* renamed from: i7.d */
/* loaded from: classes5.dex */
public abstract class AbstractC8773d extends AbstractC8769b implements List, InterfaceC10668a {
    public static final a Companion = new a(null);
    private static final int maxArraySize = 2147483639;

    /* renamed from: i7.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final void m14511a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i10 + " > endIndex: " + i11);
        }

        /* renamed from: b */
        public final void m14512b(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        /* renamed from: c */
        public final void m14513c(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        /* renamed from: d */
        public final void m14514d(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
        }

        /* renamed from: e */
        public final int m14515e(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - AbstractC8773d.maxArraySize <= 0) {
                return i12;
            }
            if (i11 > AbstractC8773d.maxArraySize) {
                return Integer.MAX_VALUE;
            }
            return AbstractC8773d.maxArraySize;
        }

        /* renamed from: f */
        public final boolean m14516f(Collection c10, Collection other) {
            AbstractC9133u.m16133g(c10, "c");
            AbstractC9133u.m16133g(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            Iterator it = other.iterator();
            Iterator it2 = c10.iterator();
            while (it2.hasNext()) {
                if (!AbstractC9133u.m16128b(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: g */
        public final int m14517g(Collection c10) {
            AbstractC9133u.m16133g(c10, "c");
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

    /* renamed from: i7.d$b */
    public class b implements Iterator, InterfaceC10668a {

        /* renamed from: a */
        public int f16451a;

        public b() {
        }

        /* renamed from: a */
        public final int m14518a() {
            return this.f16451a;
        }

        /* renamed from: b */
        public final void m14519b(int i10) {
            this.f16451a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16451a < AbstractC8773d.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC8773d abstractC8773d = AbstractC8773d.this;
            int i10 = this.f16451a;
            this.f16451a = i10 + 1;
            return abstractC8773d.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: i7.d$c */
    public class c extends b implements ListIterator, InterfaceC10668a {
        public c(int i10) {
            super();
            AbstractC8773d.Companion.m14513c(i10, AbstractC8773d.this.size());
            m14519b(i10);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return m14518a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return m14518a();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC8773d abstractC8773d = AbstractC8773d.this;
            m14519b(m14518a() - 1);
            return abstractC8773d.get(m14518a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return m14518a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: i7.d$d */
    public static final class d extends AbstractC8773d implements RandomAccess {

        /* renamed from: a */
        public final AbstractC8773d f16454a;

        /* renamed from: b */
        public final int f16455b;

        /* renamed from: c */
        public int f16456c;

        public d(AbstractC8773d list, int i10, int i11) {
            AbstractC9133u.m16133g(list, "list");
            this.f16454a = list;
            this.f16455b = i10;
            AbstractC8773d.Companion.m14514d(i10, i11, list.size());
            this.f16456c = i11 - i10;
        }

        @Override // p134i7.AbstractC8773d, java.util.List
        public Object get(int i10) {
            AbstractC8773d.Companion.m14512b(i10, this.f16456c);
            return this.f16454a.get(this.f16455b + i10);
        }

        @Override // p134i7.AbstractC8773d, p134i7.AbstractC8769b
        public int getSize() {
            return this.f16456c;
        }

        @Override // p134i7.AbstractC8773d, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        public List subList(int i10, int i11) {
            AbstractC8773d.Companion.m14514d(i10, i11, this.f16456c);
            AbstractC8773d abstractC8773d = this.f16454a;
            int i12 = this.f16455b;
            return new d(abstractC8773d, i10 + i12, i12 + i11);
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
            return Companion.m14516f(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i10);

    @Override // p134i7.AbstractC8769b
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.m14517g(this);
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (AbstractC9133u.m16128b(it.next(), obj)) {
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
            if (AbstractC9133u.m16128b(listIterator.previous(), obj)) {
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
