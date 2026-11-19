package p325rc;

import id.InterfaceC9624a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: rc.m0 */
/* loaded from: classes6.dex */
public final class C10959m0 implements Iterator, InterfaceC9624a {

    /* renamed from: c */
    public final Iterator f26466c;

    /* renamed from: d */
    public int f26467d;

    public C10959m0(Iterator iterator) {
        AbstractC9979u.m20294g(iterator, "iterator");
        this.f26466c = iterator;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C10955k0 next() {
        int i10 = this.f26467d;
        this.f26467d = i10 + 1;
        if (i10 < 0) {
            AbstractC10978w.m24145w();
        }
        return new C10955k0(i10, this.f26466c.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26466c.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
