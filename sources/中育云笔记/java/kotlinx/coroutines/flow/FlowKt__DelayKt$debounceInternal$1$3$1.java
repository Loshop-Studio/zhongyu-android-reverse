package kotlinx.coroutines.flow;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p394wd.AbstractC11737l;
import p409xc.InterfaceC11829d;
import p410xd.C11839c0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", m26211f = "Delay.kt", m26212l = {226}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class FlowKt__DelayKt$debounceInternal$1$3$1 extends SuspendLambda implements InterfaceC9540l {

    /* renamed from: c */
    public int f23633c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC11595d f23634d;

    /* renamed from: e */
    public final /* synthetic */ Ref$ObjectRef f23635e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$1(InterfaceC11595d interfaceC11595d, Ref$ObjectRef ref$ObjectRef, InterfaceC11588c interfaceC11588c) {
        super(1, interfaceC11588c);
        this.f23634d = interfaceC11595d;
        this.f23635e = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(this.f23634d, this.f23635e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f23633c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11595d interfaceC11595d = this.f23634d;
            C11839c0 c11839c0 = AbstractC11737l.f27896a;
            Object obj2 = this.f23635e.f23402c;
            if (obj2 == c11839c0) {
                obj2 = null;
            }
            this.f23633c = 1;
            if (interfaceC11595d.emit(obj2, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        this.f23635e.f23402c = null;
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9540l
    public final Object invoke(InterfaceC11588c interfaceC11588c) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
