package p325rc;

import id.InterfaceC9624a;
import java.util.Iterator;

/* renamed from: rc.o0 */
/* loaded from: classes6.dex */
public abstract class AbstractC10963o0 implements Iterator, InterfaceC9624a {
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
