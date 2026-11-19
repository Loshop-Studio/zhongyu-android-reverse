package p325rc;

import id.InterfaceC9624a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: rc.v0 */
/* loaded from: classes6.dex */
public class C10977v0 extends AbstractC10940d {

    /* renamed from: c */
    public final List f26481c;

    /* renamed from: rc.v0$a */
    public static final class a implements ListIterator, InterfaceC9624a {

        /* renamed from: c */
        public final ListIterator f26482c;

        public a(int i10) {
            this.f26482c = C10977v0.this.f26481c.listIterator(AbstractC10939c0.m23884Z(C10977v0.this, i10));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f26482c.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f26482c.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f26482c.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return AbstractC10939c0.m23883Y(C10977v0.this, this.f26482c.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f26482c.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return AbstractC10939c0.m23883Y(C10977v0.this, this.f26482c.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C10977v0(List delegate) {
        AbstractC9979u.m20294g(delegate, "delegate");
        this.f26481c = delegate;
    }

    @Override // p325rc.AbstractC10940d, java.util.List
    public Object get(int i10) {
        return this.f26481c.get(AbstractC10939c0.m23882X(this, i10));
    }

    @Override // p325rc.AbstractC10940d, p325rc.AbstractC10936b
    public int getSize() {
        return this.f26481c.size();
    }

    @Override // p325rc.AbstractC10940d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // p325rc.AbstractC10940d, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p325rc.AbstractC10940d, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }
}
