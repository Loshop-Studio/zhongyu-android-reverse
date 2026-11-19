package p325rc;

import id.InterfaceC9624a;
import java.util.Iterator;

/* renamed from: rc.h0 */
/* loaded from: classes6.dex */
public abstract class AbstractC10949h0 implements Iterator, InterfaceC9624a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Double.valueOf(nextDouble());
    }

    public abstract double nextDouble();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
