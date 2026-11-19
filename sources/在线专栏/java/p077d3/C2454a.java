package p077d3;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* renamed from: d3.a */
/* loaded from: classes.dex */
public final class C2454a<T> implements InterfaceC2457d<T> {

    /* renamed from: a */
    @NotNull
    private final AtomicReference<InterfaceC2457d<T>> f10032a;

    public C2454a(@NotNull InterfaceC2457d<? extends T> sequence) {
        C2769l.m9241e(sequence, "sequence");
        this.f10032a = new AtomicReference<>(sequence);
    }

    @Override // p077d3.InterfaceC2457d
    @NotNull
    public Iterator<T> iterator() {
        InterfaceC2457d<T> andSet = this.f10032a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
