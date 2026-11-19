package p325rc;

import id.InterfaceC9624a;
import java.util.Iterator;

/* renamed from: rc.u */
/* loaded from: classes6.dex */
public abstract class AbstractC10974u implements Iterator, InterfaceC9624a {
    /* renamed from: a */
    public abstract char mo21723a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(mo21723a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
