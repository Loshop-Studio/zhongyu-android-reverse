package p325rc;

import id.InterfaceC9629f;
import java.util.AbstractSet;
import java.util.Set;

/* renamed from: rc.j */
/* loaded from: classes6.dex */
public abstract class AbstractC10952j extends AbstractSet implements Set, InterfaceC9629f {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(Object obj);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
