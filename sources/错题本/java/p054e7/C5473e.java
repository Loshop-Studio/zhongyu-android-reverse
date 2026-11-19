package p054e7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlinx.coroutines.AbstractC5893e0;
import kotlinx.coroutines.AbstractC5987o0;
import kotlinx.coroutines.AbstractC5988o1;
import kotlinx.coroutines.AbstractC5995r;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5989p;
import kotlinx.coroutines.DispatchException;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p083i6.InterfaceC5682b;

/* renamed from: e7.e */
/* loaded from: classes4.dex */
public final class C5473e extends AbstractC5893e0 implements InterfaceC5682b, InterfaceC5631c {

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8449h = AtomicReferenceFieldUpdater.newUpdater(C5473e.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d */
    public final AbstractC5995r f8450d;

    /* renamed from: e */
    public final InterfaceC5631c f8451e;

    /* renamed from: f */
    public Object f8452f;

    /* renamed from: g */
    public final Object f8453g;

    public C5473e(AbstractC5995r abstractC5995r, InterfaceC5631c interfaceC5631c) {
        super(-1);
        this.f8450d = abstractC5995r;
        this.f8451e = interfaceC5631c;
        this.f8452f = AbstractC5469a.f8439b;
        this.f8453g = AbstractC5469a.m4837m(interfaceC5631c.getContext());
    }

    @Override // p083i6.InterfaceC5682b
    public final InterfaceC5682b getCallerFrame() {
        InterfaceC5631c interfaceC5631c = this.f8451e;
        if (interfaceC5631c instanceof InterfaceC5682b) {
            return (InterfaceC5682b) interfaceC5631c;
        }
        return null;
    }

    @Override // p075h6.InterfaceC5631c
    public final InterfaceC5636h getContext() {
        return this.f8451e.getContext();
    }

    @Override // kotlinx.coroutines.AbstractC5893e0
    /* renamed from: j */
    public final Object mo4844j() {
        Object obj = this.f8452f;
        this.f8452f = AbstractC5469a.f8439b;
        return obj;
    }

    @Override // p075h6.InterfaceC5631c
    public final void resumeWith(Object obj) throws DispatchException {
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(obj);
        Object c5989p = thM13959exceptionOrNullimpl == null ? obj : new C5989p(false, thM13959exceptionOrNullimpl);
        InterfaceC5631c interfaceC5631c = this.f8451e;
        InterfaceC5636h context = interfaceC5631c.getContext();
        AbstractC5995r abstractC5995r = this.f8450d;
        if (AbstractC5469a.m4834j(abstractC5995r, context)) {
            this.f8452f = c5989p;
            this.f9341c = 0;
            AbstractC5469a.m4833i(abstractC5995r, interfaceC5631c.getContext(), this);
            return;
        }
        AbstractC5987o0 abstractC5987o0M5608a = AbstractC5988o1.m5608a();
        if (abstractC5987o0M5608a.f9481a >= 4294967296L) {
            this.f8452f = c5989p;
            this.f9341c = 0;
            abstractC5987o0M5608a.m5604k(this);
            return;
        }
        abstractC5987o0M5608a.m5605m(true);
        try {
            InterfaceC5636h context2 = interfaceC5631c.getContext();
            Object objM4838n = AbstractC5469a.m4838n(context2, this.f8453g);
            try {
                interfaceC5631c.resumeWith(obj);
                while (abstractC5987o0M5608a.m5606o()) {
                }
            } finally {
                AbstractC5469a.m4831g(context2, objM4838n);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f8450d + ", " + AbstractC6014x.m5623C(this.f8451e) + ']';
    }

    @Override // kotlinx.coroutines.AbstractC5893e0
    /* renamed from: e */
    public final InterfaceC5631c mo4843e() {
        return this;
    }
}
