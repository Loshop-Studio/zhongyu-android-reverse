package kotlinx.coroutines.selects;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9116d0;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.DelayKt;
import p123h7.C8736p;
import p224q8.C9848d;
import p224q8.InterfaceC9847c;
import p224q8.InterfaceC9854j;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public final class OnTimeout {

    /* renamed from: a */
    public final long f18130a;

    /* renamed from: kotlinx.coroutines.selects.OnTimeout$a */
    public static final class RunnableC9219a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9854j f18131a;

        /* renamed from: b */
        public final /* synthetic */ OnTimeout f18132b;

        public RunnableC9219a(InterfaceC9854j interfaceC9854j, OnTimeout onTimeout) {
            this.f18131a = interfaceC9854j;
            this.f18132b = onTimeout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f18131a.mo16843f(this.f18132b, C8736p.f16368a);
        }
    }

    public OnTimeout(long j10) {
        this.f18130a = j10;
    }

    /* renamed from: b */
    public final InterfaceC9847c m16829b() {
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.f18133a;
        AbstractC9133u.m16131e(onTimeout$selectClause$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new C9848d(this, (InterfaceC10575q) AbstractC9116d0.m16096e(onTimeout$selectClause$1, 3), null, 4, null);
    }

    /* renamed from: c */
    public final void m16830c(InterfaceC9854j interfaceC9854j, Object obj) {
        if (this.f18130a <= 0) {
            interfaceC9854j.mo16842e(C8736p.f16368a);
            return;
        }
        RunnableC9219a runnableC9219a = new RunnableC9219a(interfaceC9854j, this);
        AbstractC9133u.m16131e(interfaceC9854j, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        InterfaceC9100d context = interfaceC9854j.getContext();
        interfaceC9854j.mo16844g(DelayKt.m16228c(context).mo16335f(this.f18130a, runnableC9219a, context));
    }
}
