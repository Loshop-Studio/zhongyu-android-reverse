package kotlin.collections;

import java.util.AbstractSet;
import java.util.Set;
import p160s6.InterfaceC6565f;

/* renamed from: kotlin.collections.l */
/* loaded from: classes2.dex */
public abstract class AbstractC5797l extends AbstractSet implements Set, InterfaceC6565f {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(Object obj);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
