package p101f8;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: f8.a */
/* loaded from: classes5.dex */
public final class C8463a implements InterfaceC8469g {

    /* renamed from: a */
    public final AtomicReference f16051a;

    public C8463a(InterfaceC8469g sequence) {
        AbstractC9133u.m16133g(sequence, "sequence");
        this.f16051a = new AtomicReference(sequence);
    }

    @Override // p101f8.InterfaceC8469g
    public Iterator iterator() {
        InterfaceC8469g interfaceC8469g = (InterfaceC8469g) this.f16051a.getAndSet(null);
        if (interfaceC8469g != null) {
            return interfaceC8469g.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
