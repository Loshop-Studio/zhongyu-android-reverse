package p214z6;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: z6.a */
/* loaded from: classes2.dex */
public final class C6823a implements InterfaceC6830h {

    /* renamed from: a */
    public final AtomicReference f11561a;

    public C6823a(InterfaceC6830h interfaceC6830h) {
        this.f11561a = new AtomicReference(interfaceC6830h);
    }

    @Override // p214z6.InterfaceC6830h
    public final Iterator iterator() {
        InterfaceC6830h interfaceC6830h = (InterfaceC6830h) this.f11561a.getAndSet(null);
        if (interfaceC6830h != null) {
            return interfaceC6830h.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
