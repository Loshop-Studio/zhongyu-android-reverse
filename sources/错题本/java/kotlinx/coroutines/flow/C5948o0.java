package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.internal.AbstractC5919a;
import kotlinx.coroutines.flow.internal.AbstractC5920b;
import kotlinx.coroutines.flow.internal.AbstractC5921c;
import p075h6.InterfaceC5631c;

/* renamed from: kotlinx.coroutines.flow.o0 */
/* loaded from: classes4.dex */
public final class C5948o0 extends AbstractC5921c {

    /* renamed from: a */
    public final AtomicReference f9431a = new AtomicReference(null);

    @Override // kotlinx.coroutines.flow.internal.AbstractC5921c
    /* renamed from: a */
    public final boolean mo5543a(AbstractC5919a abstractC5919a) {
        AtomicReference atomicReference = this.f9431a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(AbstractC5914h.f9376c);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5921c
    /* renamed from: b */
    public final InterfaceC5631c[] mo5544b(AbstractC5919a abstractC5919a) {
        this.f9431a.set(null);
        return AbstractC5920b.f9387a;
    }
}
