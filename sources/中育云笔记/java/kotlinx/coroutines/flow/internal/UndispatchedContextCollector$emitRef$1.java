package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", m26211f = "ChannelFlow.kt", m26212l = {208}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class UndispatchedContextCollector$emitRef$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f23973c;

    /* renamed from: d */
    public /* synthetic */ Object f23974d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC11595d f23975e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UndispatchedContextCollector$emitRef$1(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f23975e = interfaceC11595d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.f23975e, interfaceC11588c);
        undispatchedContextCollector$emitRef$1.f23974d = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f23973c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            Object obj2 = this.f23974d;
            InterfaceC11595d interfaceC11595d = this.f23975e;
            this.f23973c = 1;
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
    public final Object invoke(Object obj, InterfaceC11588c interfaceC11588c) {
        return ((UndispatchedContextCollector$emitRef$1) create(obj, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
