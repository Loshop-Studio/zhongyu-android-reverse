package coil3;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p380w.C11627g;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.RealImageLoader$enqueue$job$1", m26211f = "RealImageLoader.kt", m26212l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RealImageLoader$enqueue$job$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f3553c;

    /* renamed from: d */
    public final /* synthetic */ RealImageLoader f3554d;

    /* renamed from: e */
    public final /* synthetic */ C11627g f3555e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$enqueue$job$1(RealImageLoader realImageLoader, C11627g c11627g, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f3554d = realImageLoader;
        this.f3555e = c11627g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new RealImageLoader$enqueue$job$1(this.f3554d, this.f3555e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f3553c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        RealImageLoader realImageLoader = this.f3554d;
        C11627g c11627g = this.f3555e;
        this.f3553c = 1;
        Object objM2981g = realImageLoader.m2981g(c11627g, 0, this);
        return objM2981g == objM25952f ? objM25952f : objM2981g;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((RealImageLoader$enqueue$job$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
