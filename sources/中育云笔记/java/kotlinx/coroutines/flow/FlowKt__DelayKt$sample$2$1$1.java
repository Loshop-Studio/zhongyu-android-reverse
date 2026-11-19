package kotlinx.coroutines.flow;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.C10002c;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p365ud.InterfaceC11397l;
import p393wc.AbstractC11725a;
import p394wd.AbstractC11737l;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", m26211f = "Delay.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f23658c;

    /* renamed from: d */
    public /* synthetic */ Object f23659d;

    /* renamed from: e */
    public final /* synthetic */ Ref$ObjectRef f23660e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC11397l f23661f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(Ref$ObjectRef ref$ObjectRef, InterfaceC11397l interfaceC11397l, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f23660e = ref$ObjectRef;
        this.f23661f = interfaceC11397l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.f23660e, this.f23661f, interfaceC11588c);
        flowKt__DelayKt$sample$2$1$1.f23659d = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    /* renamed from: g */
    public final Object m20781g(Object obj, InterfaceC11588c interfaceC11588c) {
        return ((FlowKt__DelayKt$sample$2$1$1) create(C10002c.m20724b(obj), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // p181hd.InterfaceC9544p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m20781g(((C10002c) obj).m20734l(), (InterfaceC11588c) obj2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f23658c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        Object objM20734l = ((C10002c) this.f23659d).m20734l();
        Ref$ObjectRef ref$ObjectRef = this.f23660e;
        boolean z10 = objM20734l instanceof C10002c.c;
        if (!z10) {
            ref$ObjectRef.f23402c = objM20734l;
        }
        InterfaceC11397l interfaceC11397l = this.f23661f;
        if (z10) {
            Throwable thM20727e = C10002c.m20727e(objM20734l);
            if (thM20727e != null) {
                throw thM20727e;
            }
            interfaceC11397l.cancel(new ChildCancelledException());
            ref$ObjectRef.f23402c = AbstractC11737l.f27898c;
        }
        return C10786q.f26013a;
    }
}
