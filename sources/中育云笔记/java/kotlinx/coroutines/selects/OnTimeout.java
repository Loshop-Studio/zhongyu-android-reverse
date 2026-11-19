package kotlinx.coroutines.selects;

import ae.C0109e;
import ae.InterfaceC0108d;
import ae.InterfaceC0115k;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.selects.OnTimeout;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public final class OnTimeout {

    /* renamed from: a */
    public final long f24012a;

    public OnTimeout(long j10) {
        this.f24012a = j10;
    }

    /* renamed from: e */
    public static final void m20967e(InterfaceC0115k interfaceC0115k, OnTimeout onTimeout) {
        interfaceC0115k.mo287d(onTimeout, C10786q.f26013a);
    }

    /* renamed from: c */
    public final InterfaceC0108d m20968c() {
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.f24013c;
        AbstractC9979u.m20292e(onTimeout$selectClause$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new C0109e(this, (InterfaceC9545q) AbstractC9962d0.m20254e(onTimeout$selectClause$1, 3), null, 4, null);
    }

    /* renamed from: d */
    public final void m20969d(final InterfaceC0115k interfaceC0115k, Object obj) {
        if (this.f24012a <= 0) {
            interfaceC0115k.mo286b(C10786q.f26013a);
            return;
        }
        Runnable runnable = new Runnable() { // from class: ae.a
            @Override // java.lang.Runnable
            public final void run() {
                OnTimeout.m20967e(interfaceC0115k, this);
            }
        };
        AbstractC9979u.m20292e(interfaceC0115k, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        SelectImplementation selectImplementation = (SelectImplementation) interfaceC0115k;
        InterfaceC9945d context = selectImplementation.getContext();
        selectImplementation.m20982n(DelayKt.m20377c(context).mo24710c(this.f24012a, runnable, context));
    }
}
