package p134i7;

import java.util.AbstractSet;
import java.util.Set;
import p311y7.InterfaceC10673f;

/* renamed from: i7.j */
/* loaded from: classes5.dex */
public abstract class AbstractC8785j extends AbstractSet implements Set, InterfaceC10673f {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(Object obj);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
