package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p379vd.AbstractC11596e;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m26211f = "Reduce.kt", m26212l = {179}, m26213m = "first")
/* loaded from: classes6.dex */
public final class FlowKt__ReduceKt$first$3<T> extends ContinuationImpl {

    /* renamed from: c */
    public Object f23781c;

    /* renamed from: d */
    public Object f23782d;

    /* renamed from: e */
    public /* synthetic */ Object f23783e;

    /* renamed from: f */
    public int f23784f;

    public FlowKt__ReduceKt$first$3(InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23783e = obj;
        this.f23784f |= Integer.MIN_VALUE;
        return AbstractC11596e.m25573w(null, null, this);
    }
}
