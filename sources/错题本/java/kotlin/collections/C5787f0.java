package kotlin.collections;

import android.support.v4.media.AbstractC0037f;
import java.util.List;
import java.util.ListIterator;
import p160s6.InterfaceC6560a;
import p200x6.C6756f;

/* renamed from: kotlin.collections.f0 */
/* loaded from: classes2.dex */
public final class C5787f0 implements ListIterator, InterfaceC6560a {

    /* renamed from: a */
    public final ListIterator f9181a;

    /* renamed from: b */
    public final /* synthetic */ C5789g0 f9182b;

    public C5787f0(C5789g0 c5789g0, int i) {
        this.f9182b = c5789g0;
        List list = c5789g0.f9183a;
        if (i >= 0 && i <= c5789g0.size()) {
            this.f9181a = list.listIterator(c5789g0.size() - i);
            return;
        }
        StringBuilder sbM94s = AbstractC0037f.m94s(i, "Position index ", " must be in range [");
        sbM94s.append(new C6756f(0, c5789g0.size(), 1));
        sbM94s.append("].");
        throw new IndexOutOfBoundsException(sbM94s.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f9181a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9181a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f9181a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return AbstractC5806u.m5282u(this.f9182b) - this.f9181a.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f9181a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return AbstractC5806u.m5282u(this.f9182b) - this.f9181a.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
