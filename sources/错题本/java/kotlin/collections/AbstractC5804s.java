package kotlin.collections;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p160s6.InterfaceC6560a;

/* renamed from: kotlin.collections.s */
/* loaded from: classes2.dex */
public abstract class AbstractC5804s implements Iterator, InterfaceC6560a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Boolean.valueOf(nextBoolean());
    }

    public abstract boolean nextBoolean();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    @NotNull
    public final Boolean next() {
        return Boolean.valueOf(nextBoolean());
    }
}
