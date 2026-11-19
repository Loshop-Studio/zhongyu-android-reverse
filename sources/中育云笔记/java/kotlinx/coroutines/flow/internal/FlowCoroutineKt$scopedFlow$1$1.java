package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", m26211f = "FlowCoroutine.kt", m26212l = {47}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class FlowCoroutineKt$scopedFlow$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f23959c;

    /* renamed from: d */
    public /* synthetic */ Object f23960d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC9545q f23961e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC11595d f23962f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowCoroutineKt$scopedFlow$1$1(InterfaceC9545q interfaceC9545q, InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f23961e = interfaceC9545q;
        this.f23962f = interfaceC11595d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.f23961e, this.f23962f, interfaceC11588c);
        flowCoroutineKt$scopedFlow$1$1.f23960d = obj;
        return flowCoroutineKt$scopedFlow$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f23959c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.f23960d;
            InterfaceC9545q interfaceC9545q = this.f23961e;
            InterfaceC11595d interfaceC11595d = this.f23962f;
            this.f23959c = 1;
            if (interfaceC9545q.invoke(interfaceC11122i0, interfaceC11595d, this) == objM25952f) {
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
        return ((FlowCoroutineKt$scopedFlow$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
