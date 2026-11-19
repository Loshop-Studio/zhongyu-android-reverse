package kotlinx.coroutines.flow.internal;

import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8680s;
import p123h7.C8736p;
import p135i8.AbstractC8823b1;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p180m8.C9333f;
import p180m8.C9337j;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p201o7.InterfaceC9538c;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public final class SafeCollector<T> extends ContinuationImpl implements InterfaceC9267d, InterfaceC9538c {

    /* renamed from: a */
    public final InterfaceC9267d f18051a;

    /* renamed from: b */
    public final InterfaceC9100d f18052b;

    /* renamed from: c */
    public final int f18053c;

    /* renamed from: d */
    public InterfaceC9100d f18054d;

    /* renamed from: e */
    public InterfaceC9324c f18055e;

    public SafeCollector(InterfaceC9267d interfaceC9267d, InterfaceC9100d interfaceC9100d) {
        super(C9337j.f18392a, EmptyCoroutineContext.f17438a);
        this.f18051a = interfaceC9267d;
        this.f18052b = interfaceC9100d;
        this.f18053c = ((Number) interfaceC9100d.fold(0, new InterfaceC10574p() { // from class: kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1
            /* renamed from: a */
            public final Integer m16712a(int i10, InterfaceC9100d.b bVar) {
                return Integer.valueOf(i10 + 1);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m16712a(((Number) obj).intValue(), (InterfaceC9100d.b) obj2);
            }
        })).intValue();
    }

    /* renamed from: c */
    public final void m16709c(InterfaceC9100d interfaceC9100d, InterfaceC9100d interfaceC9100d2, Object obj) {
        if (interfaceC9100d2 instanceof C9333f) {
            m16711k((C9333f) interfaceC9100d2, obj);
        }
        SafeCollector_commonKt.m16715a(this, interfaceC9100d);
    }

    /* renamed from: d */
    public final Object m16710d(InterfaceC9324c interfaceC9324c, Object obj) {
        InterfaceC9100d context = interfaceC9324c.getContext();
        AbstractC8823b1.m14814j(context);
        InterfaceC9100d interfaceC9100d = this.f18054d;
        if (interfaceC9100d != context) {
            m16709c(context, interfaceC9100d, obj);
            this.f18054d = context;
        }
        this.f18055e = interfaceC9324c;
        InterfaceC10575q interfaceC10575q = SafeCollectorKt.f18057a;
        InterfaceC9267d interfaceC9267d = this.f18051a;
        AbstractC9133u.m16131e(interfaceC9267d, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        AbstractC9133u.m16131e(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = interfaceC10575q.invoke(interfaceC9267d, obj, this);
        if (!AbstractC9133u.m16128b(objInvoke, AbstractC9434a.m17291f())) {
            this.f18055e = null;
        }
        return objInvoke;
    }

    @Override // p169l8.InterfaceC9267d
    public Object emit(Object obj, InterfaceC9324c interfaceC9324c) {
        try {
            Object objM16710d = m16710d(interfaceC9324c, obj);
            if (objM16710d == AbstractC9434a.m17291f()) {
                AbstractC9541f.m17811c(interfaceC9324c);
            }
            return objM16710d == AbstractC9434a.m17291f() ? objM16710d : C8736p.f16368a;
        } catch (Throwable th) {
            this.f18054d = new C9333f(th, interfaceC9324c.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, p201o7.InterfaceC9538c
    public InterfaceC9538c getCallerFrame() {
        InterfaceC9324c interfaceC9324c = this.f18055e;
        if (interfaceC9324c instanceof InterfaceC9538c) {
            return (InterfaceC9538c) interfaceC9324c;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, p179m7.InterfaceC9324c
    public InterfaceC9100d getContext() {
        InterfaceC9100d interfaceC9100d = this.f18054d;
        return interfaceC9100d == null ? EmptyCoroutineContext.f17438a : interfaceC9100d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object obj) {
        Throwable thM15911d = Result.m15911d(obj);
        if (thM15911d != null) {
            this.f18054d = new C9333f(thM15911d, getContext());
        }
        InterfaceC9324c interfaceC9324c = this.f18055e;
        if (interfaceC9324c != null) {
            interfaceC9324c.resumeWith(obj);
        }
        return AbstractC9434a.m17291f();
    }

    /* renamed from: k */
    public final void m16711k(C9333f c9333f, Object obj) {
        throw new IllegalStateException(AbstractC8680s.m14086n("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + c9333f.f18390a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
