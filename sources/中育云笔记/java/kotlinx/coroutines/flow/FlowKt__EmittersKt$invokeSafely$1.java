package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", m26211f = "Emitters.kt", m26212l = {212}, m26213m = "invokeSafely$FlowKt__EmittersKt")
/* loaded from: classes6.dex */
public final class FlowKt__EmittersKt$invokeSafely$1<T> extends ContinuationImpl {

    /* renamed from: c */
    public Object f23687c;

    /* renamed from: d */
    public /* synthetic */ Object f23688d;

    /* renamed from: e */
    public int f23689e;

    public FlowKt__EmittersKt$invokeSafely$1(InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23688d = obj;
        this.f23689e |= Integer.MIN_VALUE;
        return FlowKt__EmittersKt.m20784c(null, null, null, this);
    }
}
