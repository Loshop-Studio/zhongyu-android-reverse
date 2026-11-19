package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.InterfaceC9099c;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import p179m7.InterfaceC9324c;
import p201o7.C9537b;

/* loaded from: classes5.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final InterfaceC9100d _context;
    private transient InterfaceC9324c<Object> intercepted;

    public ContinuationImpl(InterfaceC9324c interfaceC9324c, InterfaceC9100d interfaceC9100d) {
        super(interfaceC9324c);
        this._context = interfaceC9100d;
    }

    @Override // p179m7.InterfaceC9324c
    public InterfaceC9100d getContext() {
        InterfaceC9100d interfaceC9100d = this._context;
        AbstractC9133u.m16130d(interfaceC9100d);
        return interfaceC9100d;
    }

    public final InterfaceC9324c<Object> intercepted() {
        InterfaceC9324c interfaceC9324cInterceptContinuation = this.intercepted;
        if (interfaceC9324cInterceptContinuation == null) {
            InterfaceC9099c interfaceC9099c = (InterfaceC9099c) getContext().get(InterfaceC9099c.f17441b0);
            if (interfaceC9099c == null || (interfaceC9324cInterceptContinuation = interfaceC9099c.interceptContinuation(this)) == null) {
                interfaceC9324cInterceptContinuation = this;
            }
            this.intercepted = interfaceC9324cInterceptContinuation;
        }
        return interfaceC9324cInterceptContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        InterfaceC9324c<Object> interfaceC9324c = this.intercepted;
        if (interfaceC9324c != null && interfaceC9324c != this) {
            InterfaceC9100d.b bVar = getContext().get(InterfaceC9099c.f17441b0);
            AbstractC9133u.m16130d(bVar);
            ((InterfaceC9099c) bVar).releaseInterceptedContinuation(interfaceC9324c);
        }
        this.intercepted = C9537b.f18901a;
    }

    public ContinuationImpl(InterfaceC9324c interfaceC9324c) {
        this(interfaceC9324c, interfaceC9324c != null ? interfaceC9324c.getContext() : null);
    }
}
