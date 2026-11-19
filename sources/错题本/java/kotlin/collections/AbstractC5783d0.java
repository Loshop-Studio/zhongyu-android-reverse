package kotlin.collections;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p160s6.InterfaceC6560a;

/* renamed from: kotlin.collections.d0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5783d0 implements Iterator, InterfaceC6560a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    @NotNull
    public final Long next() {
        return Long.valueOf(nextLong());
    }
}
