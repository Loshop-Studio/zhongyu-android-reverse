package p325rc;

import id.InterfaceC9624a;
import java.util.Iterator;

/* renamed from: rc.j0 */
/* loaded from: classes6.dex */
public abstract class AbstractC10953j0 implements Iterator, InterfaceC9624a {
    /* renamed from: a */
    public abstract float mo20245a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Float.valueOf(mo20245a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
