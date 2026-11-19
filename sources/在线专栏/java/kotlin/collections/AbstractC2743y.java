package kotlin.collections;

import java.util.Iterator;
import p175y2.InterfaceC3498a;

/* renamed from: kotlin.collections.y */
/* loaded from: classes.dex */
public abstract class AbstractC2743y implements Iterator<Integer>, InterfaceC3498a {
    /* renamed from: a */
    public abstract int mo4807a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(mo4807a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
