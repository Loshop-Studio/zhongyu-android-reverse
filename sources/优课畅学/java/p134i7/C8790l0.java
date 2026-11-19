package p134i7;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;
import p311y7.InterfaceC10668a;

/* renamed from: i7.l0 */
/* loaded from: classes5.dex */
public final class C8790l0 implements Iterator, InterfaceC10668a {

    /* renamed from: a */
    public final Iterator f16467a;

    /* renamed from: b */
    public int f16468b;

    public C8790l0(Iterator iterator) {
        AbstractC9133u.m16133g(iterator, "iterator");
        this.f16467a = iterator;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8786j0 next() {
        int i10 = this.f16468b;
        this.f16468b = i10 + 1;
        if (i10 < 0) {
            AbstractC8809v.m14780w();
        }
        return new C8786j0(i10, this.f16467a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16467a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
