package p134i7;

import java.util.Iterator;
import p311y7.InterfaceC10668a;

/* renamed from: i7.t */
/* loaded from: classes5.dex */
public abstract class AbstractC8805t implements Iterator, InterfaceC10668a {
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
