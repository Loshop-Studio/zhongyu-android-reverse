package kotlinx.coroutines;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", m26211f = "Interruptible.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class InterruptibleKt$runInterruptible$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f23486c;

    /* renamed from: d */
    public /* synthetic */ Object f23487d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC9529a f23488e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterruptibleKt$runInterruptible$2(InterfaceC9529a interfaceC9529a, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f23488e = interfaceC9529a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(this.f23488e, interfaceC11588c);
        interruptibleKt$runInterruptible$2.f23487d = obj;
        return interruptibleKt$runInterruptible$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f23486c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        return InterruptibleKt.m20382d(((InterfaceC11122i0) this.f23487d).getCoroutineContext(), this.f23488e);
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((InterruptibleKt$runInterruptible$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
