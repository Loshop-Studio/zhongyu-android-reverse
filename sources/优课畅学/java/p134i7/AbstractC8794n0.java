package p134i7;

import java.util.Iterator;
import p311y7.InterfaceC10668a;

/* renamed from: i7.n0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8794n0 implements Iterator, InterfaceC10668a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }
}
