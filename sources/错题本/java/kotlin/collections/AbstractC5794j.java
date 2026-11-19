package kotlin.collections;

import java.util.AbstractList;
import java.util.List;
import p160s6.InterfaceC6562c;

/* renamed from: kotlin.collections.j */
/* loaded from: classes2.dex */
public abstract class AbstractC5794j extends AbstractList implements List, InterfaceC6562c {
    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return removeAt(i);
    }

    public abstract Object removeAt(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
