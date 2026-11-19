package kotlinx.coroutines.flow;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p394wd.AbstractC11737l;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", m26211f = "Delay.kt", m26212l = {293}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class FlowKt__DelayKt$sample$2$1$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f23662c;

    /* renamed from: d */
    public final /* synthetic */ Ref$ObjectRef f23663d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC11595d f23664e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$2(Ref$ObjectRef ref$ObjectRef, InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f23663d = ref$ObjectRef;
        this.f23664e = interfaceC11595d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FlowKt__DelayKt$sample$2$1$2(this.f23663d, this.f23664e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f23662c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            Ref$ObjectRef ref$ObjectRef = this.f23663d;
            Object obj2 = ref$ObjectRef.f23402c;
            if (obj2 == null) {
                return C10786q.f26013a;
            }
            ref$ObjectRef.f23402c = null;
            InterfaceC11595d interfaceC11595d = this.f23664e;
            if (obj2 == AbstractC11737l.f27896a) {
                obj2 = null;
            }
            this.f23662c = 1;
            if (interfaceC11595d.emit(obj2, this) == objM25952f) {
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
    public final Object invoke(C10786q c10786q, InterfaceC11588c interfaceC11588c) {
        return ((FlowKt__DelayKt$sample$2$1$2) create(c10786q, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
