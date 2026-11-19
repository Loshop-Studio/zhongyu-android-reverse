package coil3;

import coil3.intercept.RealInterceptorChain;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p212k.InterfaceC9756j;
import p309qc.C10786q;
import p380w.C11627g;
import p393wc.AbstractC11725a;
import p396x.C11749e;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.RealImageLoader$execute$result$1", m26211f = "RealImageLoader.kt", m26212l = {142}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RealImageLoader$execute$result$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f3567c;

    /* renamed from: d */
    public final /* synthetic */ C11627g f3568d;

    /* renamed from: e */
    public final /* synthetic */ RealImageLoader f3569e;

    /* renamed from: f */
    public final /* synthetic */ C11749e f3570f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC5453b f3571g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC9756j f3572h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$result$1(C11627g c11627g, RealImageLoader realImageLoader, C11749e c11749e, AbstractC5453b abstractC5453b, InterfaceC9756j interfaceC9756j, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f3568d = c11627g;
        this.f3569e = realImageLoader;
        this.f3570f = c11749e;
        this.f3571g = abstractC5453b;
        this.f3572h = interfaceC9756j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new RealImageLoader$execute$result$1(this.f3568d, this.f3569e, this.f3570f, this.f3571g, this.f3572h, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f3567c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.f3568d, this.f3569e.mo2979d().m3000g(), 0, this.f3568d, this.f3570f, this.f3571g, this.f3572h != null);
        this.f3567c = 1;
        Object objM3191g = realInterceptorChain.m3191g(this);
        return objM3191g == objM25952f ? objM25952f : objM3191g;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((RealImageLoader$execute$result$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
