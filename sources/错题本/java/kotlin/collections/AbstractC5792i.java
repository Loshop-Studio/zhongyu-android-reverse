package kotlin.collections;

import java.util.AbstractCollection;
import java.util.Collection;
import p160s6.InterfaceC6561b;

/* renamed from: kotlin.collections.i */
/* loaded from: classes2.dex */
public abstract class AbstractC5792i extends AbstractCollection implements Collection, InterfaceC6561b {
    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
