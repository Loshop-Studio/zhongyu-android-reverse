package kotlinx.coroutines.flow;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.selects.SelectImplementation;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p365ud.InterfaceC11397l;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p394wd.AbstractC11737l;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", m26211f = "Delay.kt", m26212l = {412}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements InterfaceC9545q {

    /* renamed from: c */
    public Object f23651c;

    /* renamed from: d */
    public Object f23652d;

    /* renamed from: e */
    public int f23653e;

    /* renamed from: f */
    public /* synthetic */ Object f23654f;

    /* renamed from: g */
    public /* synthetic */ Object f23655g;

    /* renamed from: h */
    public final /* synthetic */ long f23656h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC11594c f23657i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2(long j10, InterfaceC11594c interfaceC11594c, InterfaceC11588c interfaceC11588c) {
        super(3, interfaceC11588c);
        this.f23656h = j10;
        this.f23657i = interfaceC11594c;
    }

    @Override // p181hd.InterfaceC9545q
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.f23656h, this.f23657i, interfaceC11588c);
        flowKt__DelayKt$sample$2.f23654f = interfaceC11122i0;
        flowKt__DelayKt$sample$2.f23655g = interfaceC11595d;
        return flowKt__DelayKt$sample$2.invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC11397l interfaceC11397l;
        InterfaceC11397l interfaceC11397lM25530A;
        Ref$ObjectRef ref$ObjectRef;
        InterfaceC11595d interfaceC11595d;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f23653e;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.f23654f;
            InterfaceC11595d interfaceC11595d2 = (InterfaceC11595d) this.f23655g;
            InterfaceC11397l interfaceC11397lM20716d = ProduceKt.m20716d(interfaceC11122i0, null, -1, new FlowKt__DelayKt$sample$2$values$1(this.f23657i, null), 1, null);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            interfaceC11397l = interfaceC11397lM20716d;
            interfaceC11397lM25530A = AbstractC11596e.m25530A(interfaceC11122i0, this.f23656h);
            ref$ObjectRef = ref$ObjectRef2;
            interfaceC11595d = interfaceC11595d2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC11397lM25530A = (InterfaceC11397l) this.f23652d;
            ref$ObjectRef = (Ref$ObjectRef) this.f23651c;
            interfaceC11397l = (InterfaceC11397l) this.f23655g;
            interfaceC11595d = (InterfaceC11595d) this.f23654f;
            AbstractC9924b.m20071b(obj);
        }
        while (ref$ObjectRef.f23402c != AbstractC11737l.f27898c) {
            SelectImplementation selectImplementation = new SelectImplementation(getContext());
            selectImplementation.mo280c(interfaceC11397l.mo20638i(), new FlowKt__DelayKt$sample$2$1$1(ref$ObjectRef, interfaceC11397lM25530A, null));
            selectImplementation.mo280c(interfaceC11397lM25530A.mo20635h(), new FlowKt__DelayKt$sample$2$1$2(ref$ObjectRef, interfaceC11595d, null));
            this.f23654f = interfaceC11595d;
            this.f23655g = interfaceC11397l;
            this.f23651c = ref$ObjectRef;
            this.f23652d = interfaceC11397lM25530A;
            this.f23653e = 1;
            if (selectImplementation.m20983o(this) == objM25952f) {
                return objM25952f;
            }
        }
        return C10786q.f26013a;
    }
}
