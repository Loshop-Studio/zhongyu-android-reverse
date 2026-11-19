package kotlinx.coroutines.flow.internal;

import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.flow.internal.SafeCollector;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p310qd.AbstractC10812s;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p394wd.AbstractC11740o;
import p394wd.C11731f;
import p394wd.C11735j;
import p409xc.AbstractC11831f;
import p409xc.InterfaceC11828c;
import sd.AbstractC11147o1;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public final class SafeCollector<T> extends ContinuationImpl implements InterfaceC11595d, InterfaceC11828c {

    /* renamed from: c */
    public final InterfaceC11595d f23963c;

    /* renamed from: d */
    public final InterfaceC9945d f23964d;

    /* renamed from: e */
    public final int f23965e;

    /* renamed from: f */
    public InterfaceC9945d f23966f;

    /* renamed from: g */
    public InterfaceC11588c f23967g;

    public SafeCollector(InterfaceC11595d interfaceC11595d, InterfaceC9945d interfaceC9945d) {
        super(C11735j.f27893c, EmptyCoroutineContext.f23351c);
        this.f23963c = interfaceC11595d;
        this.f23964d = interfaceC9945d;
        this.f23965e = ((Number) interfaceC9945d.fold(0, new InterfaceC9544p() { // from class: wd.m
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(SafeCollector.m20894n(((Integer) obj).intValue(), (InterfaceC9945d.b) obj2));
            }
        })).intValue();
    }

    /* renamed from: n */
    public static final int m20894n(int i10, InterfaceC9945d.b bVar) {
        return i10 + 1;
    }

    @Override // p379vd.InterfaceC11595d
    public Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
        try {
            Object objM20896p = m20896p(interfaceC11588c, obj);
            if (objM20896p == AbstractC11725a.m25952f()) {
                AbstractC11831f.m26221c(interfaceC11588c);
            }
            return objM20896p == AbstractC11725a.m25952f() ? objM20896p : C10786q.f26013a;
        } catch (Throwable th) {
            this.f23966f = new C11731f(th, interfaceC11588c.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, p409xc.InterfaceC11828c
    public InterfaceC11828c getCallerFrame() {
        InterfaceC11588c interfaceC11588c = this.f23967g;
        if (interfaceC11588c instanceof InterfaceC11828c) {
            return (InterfaceC11828c) interfaceC11588c;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, vc.InterfaceC11588c
    public InterfaceC9945d getContext() {
        InterfaceC9945d interfaceC9945d = this.f23966f;
        return interfaceC9945d == null ? EmptyCoroutineContext.f23351c : interfaceC9945d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object obj) {
        Throwable thM20056e = Result.m20056e(obj);
        if (thM20056e != null) {
            this.f23966f = new C11731f(thM20056e, getContext());
        }
        InterfaceC11588c interfaceC11588c = this.f23967g;
        if (interfaceC11588c != null) {
            interfaceC11588c.resumeWith(obj);
        }
        return AbstractC11725a.m25952f();
    }

    /* renamed from: m */
    public final void m20895m(InterfaceC9945d interfaceC9945d, InterfaceC9945d interfaceC9945d2, Object obj) {
        if (interfaceC9945d2 instanceof C11731f) {
            m20897t((C11731f) interfaceC9945d2, obj);
        }
        AbstractC11740o.m25967b(this, interfaceC9945d);
    }

    /* renamed from: p */
    public final Object m20896p(InterfaceC11588c interfaceC11588c, Object obj) {
        InterfaceC9945d context = interfaceC11588c.getContext();
        AbstractC11147o1.m24775i(context);
        InterfaceC9945d interfaceC9945d = this.f23966f;
        if (interfaceC9945d != context) {
            m20895m(context, interfaceC9945d, obj);
            this.f23966f = context;
        }
        this.f23967g = interfaceC11588c;
        InterfaceC9545q interfaceC9545q = SafeCollectorKt.f23968a;
        InterfaceC11595d interfaceC11595d = this.f23963c;
        AbstractC9979u.m20292e(interfaceC11595d, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        AbstractC9979u.m20292e(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = interfaceC9545q.invoke(interfaceC11595d, obj, this);
        if (!AbstractC9979u.m20289b(objInvoke, AbstractC11725a.m25952f())) {
            this.f23967g = null;
        }
        return objInvoke;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    /* renamed from: t */
    public final void m20897t(C11731f c11731f, Object obj) {
        throw new IllegalStateException(AbstractC10812s.m23221n("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + c11731f.f27892d + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }
}
