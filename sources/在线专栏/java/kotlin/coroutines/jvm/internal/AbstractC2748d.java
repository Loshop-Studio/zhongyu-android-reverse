package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3013e;
import p142q2.InterfaceC3015g;

/* renamed from: kotlin.coroutines.jvm.internal.d */
/* loaded from: classes.dex */
public abstract class AbstractC2748d extends AbstractC2745a {

    @Nullable
    private final InterfaceC3015g _context;

    @Nullable
    private transient InterfaceC3012d<Object> intercepted;

    public AbstractC2748d(@Nullable InterfaceC3012d<Object> interfaceC3012d, @Nullable InterfaceC3015g interfaceC3015g) {
        super(interfaceC3012d);
        this._context = interfaceC3015g;
    }

    @Override // p142q2.InterfaceC3012d
    @NotNull
    public InterfaceC3015g getContext() {
        InterfaceC3015g interfaceC3015g = this._context;
        C2769l.m9239c(interfaceC3015g);
        return interfaceC3015g;
    }

    @NotNull
    public final InterfaceC3012d<Object> intercepted() {
        InterfaceC3012d<Object> interfaceC3012dMo8548d = this.intercepted;
        if (interfaceC3012dMo8548d == null) {
            InterfaceC3013e interfaceC3013e = (InterfaceC3013e) getContext().get(InterfaceC3013e.f11675R);
            interfaceC3012dMo8548d = interfaceC3013e == null ? this : interfaceC3013e.mo8548d(this);
            this.intercepted = interfaceC3012dMo8548d;
        }
        return interfaceC3012dMo8548d;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
    protected void releaseIntercepted() {
        InterfaceC3012d<?> interfaceC3012d = this.intercepted;
        if (interfaceC3012d != null && interfaceC3012d != this) {
            InterfaceC3015g.b bVar = getContext().get(InterfaceC3013e.f11675R);
            C2769l.m9239c(bVar);
            ((InterfaceC3013e) bVar).mo8549t(interfaceC3012d);
        }
        this.intercepted = C2747c.f10710a;
    }

    public AbstractC2748d(@Nullable InterfaceC3012d<Object> interfaceC3012d) {
        this(interfaceC3012d, interfaceC3012d == null ? null : interfaceC3012d.getContext());
    }
}
