package coil3.request;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.request.ViewTargetRequestManager$dispose$1", m26211f = "ViewTargetRequestManager.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ViewTargetRequestManager$dispose$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f3904c;

    /* renamed from: d */
    public final /* synthetic */ ViewTargetRequestManager f3905d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewTargetRequestManager$dispose$1(ViewTargetRequestManager viewTargetRequestManager, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f3905d = viewTargetRequestManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ViewTargetRequestManager$dispose$1(this.f3905d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f3904c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        this.f3905d.m3276c(null);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ViewTargetRequestManager$dispose$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
