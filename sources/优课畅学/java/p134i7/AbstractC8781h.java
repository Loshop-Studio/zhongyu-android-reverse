package p134i7;

import java.util.AbstractList;
import java.util.List;
import p311y7.InterfaceC10671d;

/* renamed from: i7.h */
/* loaded from: classes5.dex */
public abstract class AbstractC8781h extends AbstractList implements List, InterfaceC10671d {
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
