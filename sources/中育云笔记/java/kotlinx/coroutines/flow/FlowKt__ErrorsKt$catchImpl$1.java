package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p379vd.AbstractC11596e;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", m26211f = "Errors.kt", m26212l = {152}, m26213m = "catchImpl")
/* loaded from: classes6.dex */
public final class FlowKt__ErrorsKt$catchImpl$1<T> extends ContinuationImpl {

    /* renamed from: c */
    public Object f23700c;

    /* renamed from: d */
    public /* synthetic */ Object f23701d;

    /* renamed from: e */
    public int f23702e;

    public FlowKt__ErrorsKt$catchImpl$1(InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23701d = obj;
        this.f23702e |= Integer.MIN_VALUE;
        return AbstractC11596e.m25556f(null, null, this);
    }
}
