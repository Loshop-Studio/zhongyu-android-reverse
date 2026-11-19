package kotlin.coroutines.jvm.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.C3016h;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3015g;

/* renamed from: kotlin.coroutines.jvm.internal.j */
/* loaded from: classes.dex */
public abstract class AbstractC2754j extends AbstractC2745a {
    public AbstractC2754j(@Nullable InterfaceC3012d<Object> interfaceC3012d) {
        super(interfaceC3012d);
        if (interfaceC3012d == null) {
            return;
        }
        if (!(interfaceC3012d.getContext() == C3016h.f11678a)) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // p142q2.InterfaceC3012d
    @NotNull
    public InterfaceC3015g getContext() {
        return C3016h.f11678a;
    }
}
