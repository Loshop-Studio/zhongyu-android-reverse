package p325rc;

import id.InterfaceC9624a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: rc.u0 */
/* loaded from: classes6.dex */
public final class C10975u0 extends AbstractC10948h {

    /* renamed from: c */
    public final List f26478c;

    /* renamed from: rc.u0$a */
    public static final class a implements ListIterator, InterfaceC9624a {

        /* renamed from: c */
        public final ListIterator f26479c;

        public a(int i10) {
            this.f26479c = C10975u0.this.f26478c.listIterator(AbstractC10939c0.m23884Z(C10975u0.this, i10));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f26479c.add(obj);
            this.f26479c.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f26479c.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f26479c.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f26479c.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return AbstractC10939c0.m23883Y(C10975u0.this, this.f26479c.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f26479c.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return AbstractC10939c0.m23883Y(C10975u0.this, this.f26479c.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f26479c.remove();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f26479c.set(obj);
        }
    }

    public C10975u0(List delegate) {
        AbstractC9979u.m20294g(delegate, "delegate");
        this.f26478c = delegate;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        this.f26478c.add(AbstractC10939c0.m23884Z(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f26478c.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        return this.f26478c.get(AbstractC10939c0.m23882X(this, i10));
    }

    @Override // p325rc.AbstractC10948h
    public int getSize() {
        return this.f26478c.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p325rc.AbstractC10948h
    public Object removeAt(int i10) {
        return this.f26478c.remove(AbstractC10939c0.m23882X(this, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        return this.f26478c.set(AbstractC10939c0.m23882X(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }
}
