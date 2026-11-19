package p296pd;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: pd.a */
/* loaded from: classes6.dex */
public final class C10653a implements InterfaceC10659g {

    /* renamed from: a */
    public final AtomicReference f25679a;

    public C10653a(InterfaceC10659g sequence) {
        AbstractC9979u.m20294g(sequence, "sequence");
        this.f25679a = new AtomicReference(sequence);
    }

    @Override // p296pd.InterfaceC10659g
    public Iterator iterator() {
        InterfaceC10659g interfaceC10659g = (InterfaceC10659g) this.f25679a.getAndSet(null);
        if (interfaceC10659g != null) {
            return interfaceC10659g.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
