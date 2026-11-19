package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.InterfaceC9944c;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import p409xc.C11827b;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final InterfaceC9945d _context;
    private transient InterfaceC11588c<Object> intercepted;

    public ContinuationImpl(InterfaceC11588c interfaceC11588c, InterfaceC9945d interfaceC9945d) {
        super(interfaceC11588c);
        this._context = interfaceC9945d;
    }

    @Override // vc.InterfaceC11588c
    public InterfaceC9945d getContext() {
        InterfaceC9945d interfaceC9945d = this._context;
        AbstractC9979u.m20291d(interfaceC9945d);
        return interfaceC9945d;
    }

    public final InterfaceC11588c<Object> intercepted() {
        InterfaceC11588c interfaceC11588cInterceptContinuation = this.intercepted;
        if (interfaceC11588cInterceptContinuation == null) {
            InterfaceC9944c interfaceC9944c = (InterfaceC9944c) getContext().get(InterfaceC9944c.f23354a0);
            if (interfaceC9944c == null || (interfaceC11588cInterceptContinuation = interfaceC9944c.interceptContinuation(this)) == null) {
                interfaceC11588cInterceptContinuation = this;
            }
            this.intercepted = interfaceC11588cInterceptContinuation;
        }
        return interfaceC11588cInterceptContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        InterfaceC11588c<Object> interfaceC11588c = this.intercepted;
        if (interfaceC11588c != null && interfaceC11588c != this) {
            InterfaceC9945d.b bVar = getContext().get(InterfaceC9944c.f23354a0);
            AbstractC9979u.m20291d(bVar);
            ((InterfaceC9944c) bVar).releaseInterceptedContinuation(interfaceC11588c);
        }
        this.intercepted = C11827b.f28068c;
    }

    public ContinuationImpl(InterfaceC11588c interfaceC11588c) {
        this(interfaceC11588c, interfaceC11588c != null ? interfaceC11588c.getContext() : null);
    }
}
