package p134i7;

import java.util.Iterator;
import p311y7.InterfaceC10668a;

/* renamed from: i7.g0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8780g0 implements Iterator, InterfaceC10668a {
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
