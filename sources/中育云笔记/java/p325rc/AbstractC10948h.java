package p325rc;

import id.InterfaceC9627d;
import java.util.AbstractList;
import java.util.List;

/* renamed from: rc.h */
/* loaded from: classes6.dex */
public abstract class AbstractC10948h extends AbstractList implements List, InterfaceC9627d {
    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return removeAt(i10);
    }

    public abstract Object removeAt(int i10);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
