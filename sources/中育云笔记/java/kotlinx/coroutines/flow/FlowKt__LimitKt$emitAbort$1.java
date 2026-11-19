package kotlinx.coroutines.flow;

import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m26211f = "Limit.kt", m26212l = {PatchStatus.CODE_LOAD_UNDEFINED}, m26213m = "emitAbort$FlowKt__LimitKt")
/* loaded from: classes6.dex */
public final class FlowKt__LimitKt$emitAbort$1<T> extends ContinuationImpl {

    /* renamed from: c */
    public Object f23746c;

    /* renamed from: d */
    public /* synthetic */ Object f23747d;

    /* renamed from: e */
    public int f23748e;

    public FlowKt__LimitKt$emitAbort$1(InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23747d = obj;
        this.f23748e |= Integer.MIN_VALUE;
        return FlowKt__LimitKt.m20794d(null, null, null, this);
    }
}
