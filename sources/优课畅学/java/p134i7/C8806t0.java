package p134i7;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC9133u;
import p311y7.InterfaceC10668a;

/* renamed from: i7.t0 */
/* loaded from: classes5.dex */
public class C8806t0 extends AbstractC8773d {

    /* renamed from: a */
    public final List f16484a;

    /* renamed from: i7.t0$a */
    public static final class a implements ListIterator, InterfaceC10668a {

        /* renamed from: a */
        public final ListIterator f16485a;

        public a(int i10) {
            this.f16485a = C8806t0.this.f16484a.listIterator(AbstractC8770b0.m14505Y(C8806t0.this, i10));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f16485a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f16485a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f16485a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return AbstractC8770b0.m14504X(C8806t0.this, this.f16485a.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f16485a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return AbstractC8770b0.m14504X(C8806t0.this, this.f16485a.nextIndex());
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

    public C8806t0(List delegate) {
        AbstractC9133u.m16133g(delegate, "delegate");
        this.f16484a = delegate;
    }

    @Override // p134i7.AbstractC8773d, java.util.List
    public Object get(int i10) {
        return this.f16484a.get(AbstractC8770b0.m14503W(this, i10));
    }

    @Override // p134i7.AbstractC8773d, p134i7.AbstractC8769b
    public int getSize() {
        return this.f16484a.size();
    }

    @Override // p134i7.AbstractC8773d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // p134i7.AbstractC8773d, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p134i7.AbstractC8773d, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }
}
