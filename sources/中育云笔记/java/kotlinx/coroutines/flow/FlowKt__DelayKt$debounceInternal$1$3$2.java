package kotlinx.coroutines.flow;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.C10002c;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p394wd.AbstractC11737l;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", m26211f = "Delay.kt", m26212l = {236}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f23636c;

    /* renamed from: d */
    public int f23637d;

    /* renamed from: e */
    public /* synthetic */ Object f23638e;

    /* renamed from: f */
    public final /* synthetic */ Ref$ObjectRef f23639f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC11595d f23640g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(Ref$ObjectRef ref$ObjectRef, InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f23639f = ref$ObjectRef;
        this.f23640g = interfaceC11595d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.f23639f, this.f23640g, interfaceC11588c);
        flowKt__DelayKt$debounceInternal$1$3$2.f23638e = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    /* renamed from: g */
    public final Object m20779g(Object obj, InterfaceC11588c interfaceC11588c) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(C10002c.m20724b(obj), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // p181hd.InterfaceC9544p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m20779g(((C10002c) obj).m20734l(), (InterfaceC11588c) obj2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f23637d;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            Object objM20734l = ((C10002c) this.f23638e).m20734l();
            ref$ObjectRef = this.f23639f;
            boolean z10 = objM20734l instanceof C10002c.c;
            if (!z10) {
                ref$ObjectRef.f23402c = objM20734l;
            }
            InterfaceC11595d interfaceC11595d = this.f23640g;
            if (z10) {
                Throwable thM20727e = C10002c.m20727e(objM20734l);
                if (thM20727e != null) {
                    throw thM20727e;
                }
                Object obj2 = ref$ObjectRef.f23402c;
                if (obj2 != null) {
                    if (obj2 == AbstractC11737l.f27896a) {
                        obj2 = null;
                    }
                    this.f23638e = objM20734l;
                    this.f23636c = ref$ObjectRef;
                    this.f23637d = 1;
                    if (interfaceC11595d.emit(obj2, this) == objM25952f) {
                        return objM25952f;
                    }
                    ref$ObjectRef2 = ref$ObjectRef;
                }
                ref$ObjectRef.f23402c = AbstractC11737l.f27898c;
            }
            return C10786q.f26013a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ref$ObjectRef2 = (Ref$ObjectRef) this.f23636c;
        AbstractC9924b.m20071b(obj);
        ref$ObjectRef = ref$ObjectRef2;
        ref$ObjectRef.f23402c = AbstractC11737l.f27898c;
        return C10786q.f26013a;
    }
}
