package kotlinx.coroutines.flow;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", m26211f = "Collect.kt", m26212l = {46}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class FlowKt__CollectKt$launchIn$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f23624c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC11594c f23625d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__CollectKt$launchIn$1(InterfaceC11594c interfaceC11594c, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f23625d = interfaceC11594c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FlowKt__CollectKt$launchIn$1(this.f23625d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f23624c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11594c interfaceC11594c = this.f23625d;
            this.f23624c = 1;
            if (AbstractC11596e.m25558h(interfaceC11594c, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FlowKt__CollectKt$launchIn$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
