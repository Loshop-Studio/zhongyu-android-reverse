package p325rc;

import id.InterfaceC9624a;
import java.util.Iterator;

/* renamed from: rc.t */
/* loaded from: classes6.dex */
public abstract class AbstractC10972t implements Iterator, InterfaceC9624a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Boolean.valueOf(nextBoolean());
    }

    public abstract boolean nextBoolean();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final Boolean next() {
        return Boolean.valueOf(nextBoolean());
    }
}
